package com.destinym1225.cameraelf;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import net.youmi.android.AdManager;
import net.youmi.android.AdView;
import net.youmi.android.AdViewListener;

//import org.opencv.samples.tutorial0.SampleViewBase;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.ImageFormat;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements SurfaceHolder.Callback {

	
	private Camera mCamera = null;
	private SurfaceView mSurfaceview = null;
	private SurfaceHolder mSurfaceHolder = null;


	private PreviewCallback mJpegPreviewCallback;
	Button myButton;

	boolean recording;

	private String TAG;
	private boolean bIfPreview;
	// private byte[] mYuvBuffer;
	// private byte[] mYuvFrame;
	// private byte[] mYUV420SPSendBuffer;
	private String mPath = new String("/sdcard/cameraELF");
	private String mCurrentPath;

	private int mPicNumber;// 当前拍摄图片为第几张
	private int mSetNumber;// 设置拍摄张数

	// 0表示 自动抓拍
	// 1表示 手动拍摄
	// 2表示单一拍摄
	private int mShotType;

	private static final int TIMEOUT_MILLISEC = 1000;
	private static String taobaoaccount;
	private static TelephonyManager telephonyManager = null;
	private static String mBeginTime;
	private static SimpleDateFormat d = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");// 格式化时间

	// 程序退出标记

	public void createDir(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				// 按照指定的路径创建文件夹
				Log.i(TAG, "mkdir ");
				file.mkdirs();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				Log.d(TAG, "mkdir error");
			}
		}
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 修改的代码
		mBeginTime = d.format(new Date());

		// recording = false;
		telephonyManager = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);

		Intent intent = getIntent();
		taobaoaccount = intent.getStringExtra("taobaoaccount");
		this.setTitle(this.getTitle() + " 欢迎您，" + taobaoaccount);

		AdManager.init(MainActivity.this, "1c2913ff02b4aa86",
				"89359eaf30c337d5 ", 30, false);
		createDir(mPath);

		mShotType = 0;
		mSetNumber = 20;

		setContentView(R.layout.activity_main);

		// 初始化广告视图
		AdView adView = new AdView(this);

		FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
				FrameLayout.LayoutParams.FILL_PARENT,
				FrameLayout.LayoutParams.WRAP_CONTENT);
		adView.setAdViewListener(new AdViewListener()
		{

			@Override
			public void onAdViewSwitchedAd(AdView arg0) {
				// TODO Auto-generated method stub
				postHttpData();
				Log.i("adviewlistener", "click");
			}

			@Override
			public void onConnectFailed(AdView arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});

		// 设置广告出现的位置(悬浮于屏幕右下角)
		params.gravity = Gravity.BOTTOM | Gravity.RIGHT;

		// 将广告视图加入Activity中
		addContentView(adView, params);

		initSurfaceView();


		// 【获取视频预览帧的接口】
		mJpegPreviewCallback = new Camera.PreviewCallback() {
			FileOutputStream outStream = null;

			@Override
			public void onPreviewFrame(byte[] data, Camera camera) {
				// 传递进来的data,默认是YUV420SP的
				// TODO Auto-generated method stub
				try {
					if (mPicNumber < mSetNumber) {
						mPicNumber++;
						Log.i(TAG, "going into onPreviewFrame");

						YuvImage yuvimage = new YuvImage(data,
								ImageFormat.NV21, camera.getParameters()
										.getPreviewSize().width,
								camera.getParameters().getPreviewSize().height,
								null);
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						yuvimage.compressToJpeg(new Rect(0, 0, camera
								.getParameters().getPreviewSize().width, camera
								.getParameters().getPreviewSize().height), 80,
								baos);

						outStream = new FileOutputStream(mCurrentPath + "/"
								+ mPicNumber + ".jpg");
						outStream.write(baos.toByteArray());
						outStream.close();

					}
					if (mPicNumber == mSetNumber) {
						mPicNumber++;
						showDialog(MainActivity.this);

					}

				} catch (Exception e) {
					Log.v("System.out", e.toString());
				}// endtry
			}// endonPriview
		};

		myButton = (Button) findViewById(R.id.mybutton);
		myButton.setOnClickListener(myButtonOnClickListener);
	}

	// 显示基本的AlertDialog
	private void showDialog(Context context) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		// builder.setIcon(R.drawable.icon);
		builder.setTitle("是否查看图片");
		builder.setMessage("查看图片");
		builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				// setTitle("点击了对话框上的Button1");
				Intent intent = new Intent(MainActivity.this, ShowPicture.class);
				intent.putExtra("currentPath", mCurrentPath);
				intent.putExtra("setNumber", mSetNumber);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		builder.setNeutralButton("否", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				// setTitle("点击了对话框上的Button2");
			}
		});
		builder.show();
	}

	Button.OnClickListener myButtonOnClickListener = new Button.OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			Time t = new Time(System.currentTimeMillis());
			SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmmss");
			String str1 = date.format(t);
			mCurrentPath = mPath + "/pic" + str1;
			createDir(mCurrentPath);
			if (0 == mShotType) {
				// initCamera(true);
			}

		}
	};

	// InitSurfaceView
	@SuppressWarnings("deprecation")
	private void initSurfaceView() {
		mSurfaceview = (SurfaceView) this.findViewById(R.id.Surfaceview);
		mSurfaceHolder = mSurfaceview.getHolder(); // 绑定SurfaceView，取得SurfaceHolder对象
		mSurfaceHolder.addCallback(MainActivity.this); // SurfaceHolder加入回调接口
		mSurfaceHolder.setFixedSize(176, 144); // 预览大小設置
		mSurfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);// 設置顯示器類型，setType必须设置
	}

	/* 【SurfaceHolder.Callback 回调函数】 */
	@Override
	public void surfaceCreated(SurfaceHolder holder)
	// SurfaceView启动时/初次实例化，预览界面被创建时，该方法被调用。
	{
		// TODO Auto-generated method stub
		mCamera = Camera.open();// 开启摄像头（2.3版本后支持多摄像头,需传入参数）
		try {
			Log.i(TAG, "SurfaceHolder.Callback：surface Created");
			mCamera.setPreviewDisplay(mSurfaceHolder);// set the surface to be
														// used for live preview
			// mCamera.startPreview();
			bIfPreview = false;

		} catch (Exception ex) {
			if (null != mCamera) {
				mCamera.release();
				mCamera = null;
			}
			Log.i(TAG + "initCamera", ex.getMessage());
		}
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height)
	// 当SurfaceView/预览界面的格式和大小发生改变时，该方法被调用
	{
		// TODO Auto-generated method stub
		Log.i(TAG, "SurfaceHolder.Callback：Surface Changed");
		// initCamera();
		if (mSurfaceHolder.getSurface() == null) {
			// preview surface does not exist
			return;
		}

		// stop preview before making changes
		try {
			mCamera.stopPreview();
		} catch (Exception e) {
			// ignore: tried to stop a non-existent preview
		}

		initCamera(false);

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder)
	// SurfaceView销毁时，该方法被调用
	{
		// TODO Auto-generated method stub
		Log.i(TAG, "SurfaceHolder.Callback：Surface Destroyed");
		if (null != mCamera) {
			mCamera.setPreviewCallback(null); // ！！这个必须在前，不然退出出错
			mCamera.stopPreview();
			bIfPreview = false;
			mCamera.release();
			mCamera = null;
		}
	}

	/* 【2】【相机预览】 */
	private void initCamera(boolean isCaputer)// surfaceChanged中调用
	{
		Log.i(TAG, "going into initCamera");
		if (bIfPreview) {
			mCamera.stopPreview();// stopCamera();
		}
		if (null != mCamera) {
			try {
				/* Camera Service settings */
				Camera.Parameters parameters = mCamera.getParameters();
				// parameters.setFlashMode("off"); // 无闪光灯
				parameters.setPictureFormat(PixelFormat.JPEG); // Sets the image
																// format for
																// picture
																// 设定相片格式为JPEG，默认为NV21
				parameters.setPreviewFormat(PixelFormat.YCbCr_420_SP); // Sets
																		// the
																		// image
																		// format
																		// for
																		// preview
																		// picture，默认为NV21
				/*
				 * 【ImageFormat】JPEG/NV16(YCrCb format，used for
				 * Video)/NV21(YCrCb format，used for Image)/RGB_565/YUY2/YU12
				 */

				// 【调试】获取caera支持的PictrueSize，看看能否设置？？
				List<Size> pictureSizes = mCamera.getParameters()
						.getSupportedPictureSizes();
				List<Size> previewSizes = mCamera.getParameters()
						.getSupportedPreviewSizes();
				List<Integer> previewFormats = mCamera.getParameters()
						.getSupportedPreviewFormats();
				List<Integer> previewFrameRates = mCamera.getParameters()
						.getSupportedPreviewFrameRates();
				Log.i(TAG + "initCamera", "cyy support parameters is ");
				Size psize = null;
				for (int i = 0; i < pictureSizes.size(); i++) {
					psize = pictureSizes.get(i);
					Log.i(TAG + "initCamera", "PictrueSize,width: "
							+ psize.width + " height" + psize.height);
				}
				for (int i = 0; i < previewSizes.size(); i++) {
					psize = previewSizes.get(i);
					Log.i(TAG + "initCamera", "PreviewSize,width: "
							+ psize.width + " height" + psize.height);
				}
				Integer pf = null;
				for (int i = 0; i < previewFormats.size(); i++) {
					pf = previewFormats.get(i);
					Log.i(TAG + "initCamera", "previewformates:" + pf);
				}

				// 设置拍照和预览图片大小
				parameters.setPictureSize(640, 480); // 指定拍照图片的大小
				parameters.setPreviewSize(640, 480); // 指定preview的大小
				// 这两个属性 如果这两个属性设置的和真实手机的不一样时，就会报错

				// 横竖屏镜头自动调整
				if (this.getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
					parameters.set("orientation", "portrait"); //
					parameters.set("rotation", 90); // 镜头角度转90度（默认摄像头是横拍）
					mCamera.setDisplayOrientation(90); // 在2.2以上可以使用
				} else// 如果是横屏
				{
					parameters.set("orientation", "landscape"); //
					mCamera.setDisplayOrientation(0); // 在2.2以上可以使用
				}

				/* 视频流编码处理 */
				// 添加对视频流处理函数

				if (isCaputer) {
					mCamera.setPreviewCallback(mJpegPreviewCallback);
				}

				// 设定配置参数并开启预览
				mCamera.setParameters(parameters); // 将Camera.Parameters设定予Camera
				mCamera.startPreview(); // 打开预览画面
				bIfPreview = true;

				// 【调试】设置后的图片大小和预览大小以及帧率
				Camera.Size csize = mCamera.getParameters().getPreviewSize();
				// int previewHeight = csize.height; //
				// int mPreviewWidth = csize.width;
				Log.i(TAG + "initCamera", "after setting, previewSize:width: "
						+ csize.width + " height: " + csize.height);
				csize = mCamera.getParameters().getPictureSize();
				Log.i(TAG + "initCamera", "after setting, pictruesize:width: "
						+ csize.width + " height: " + csize.height);
				Log.i(TAG + "initCamera", "after setting, previewformate is "
						+ mCamera.getParameters().getPreviewFormat());
				Log.i(TAG + "initCamera", "after setting, previewframetate is "
						+ mCamera.getParameters().getPreviewFrameRate());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public String unescapeUnicode(String str) {
		StringBuffer b = new StringBuffer();
		Matcher m = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(str);
		while (m.find())
			b.append((char) Integer.parseInt(m.group(1), 16));
		return b.toString();
	}

	public static void postHttpData() {
		try {

			String nowtime = d.format(new Date());

			long durTime = (d.parse(nowtime).getTime() - d.parse(mBeginTime)
					.getTime()) / 1000; // 表示s
			JSONObject json = new JSONObject();
			json.put("taobaoaccount", taobaoaccount);
			json.put("phonenumber", telephonyManager.getLine1Number());
			json.put("adplatform", "youmi");
			json.put("durtime", durTime);
			json.put("clicktimes", 1);
			HttpParams httpParams = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(httpParams,
					TIMEOUT_MILLISEC);
			HttpConnectionParams.setSoTimeout(httpParams, TIMEOUT_MILLISEC);
			HttpClient client = new DefaultHttpClient();
			//
			// String url = "http://10.0.2.2:8080/sample1/webservice2.php?" +
			// "json={\"UserName\":1,\"FullName\":2}";
			String url = "http://mlkiller.vicp.cc/android/cameraelf/insert_clicktable.php";

			HttpPost request = new HttpPost(url);
			request.setEntity(new ByteArrayEntity(json.toString().getBytes(
					"UTF8")));
			request.setHeader("json", json.toString());
			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			// If the response does not enclose an entity, there is no need
			if (entity != null) {
				InputStream instream = entity.getContent();

				StringBuilder builder = new StringBuilder();

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(instream));

				for (String s = reader.readLine(); s != null; s = reader
						.readLine()) {

					builder.append(s);

				}
				// String result = builder.toString();

				// Log.i("Read from server",result);
				// Toast.makeText(this, result,
				// Toast.LENGTH_LONG).show();
			}
		} catch (Throwable t) {
			// Toast.makeText(MainActivity.this, "Request failed: " +
			// t.toString(),
			// Toast.LENGTH_LONG).show();
			// Log.i("Read from server", t.toString());
		}
	}

}
