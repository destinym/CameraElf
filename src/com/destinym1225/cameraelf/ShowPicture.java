package com.destinym1225.cameraelf;

import java.io.File;

//import net.youmi.android.AdView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowPicture extends Activity{
	private Button myButtonSwitchImg;  
	private ImageView myImageView;  
	private TextView myTextView;  
	private String filename ;//= "/sdcard/cameraELF/pic20121216015808/1.jpg"; 
	private String filePath;
	private int number;
	private int mSetNumber;
	@Override  
	public void onCreate(Bundle savedInstanceState) {  
		super.onCreate(savedInstanceState);  
		//       setTitle("ImageView");  
		setContentView(R.layout.show_picture);  
		//初始化广告视图
//		AdView adView = new AdView(this);
		
		FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.FILL_PARENT, 
				FrameLayout.LayoutParams.WRAP_CONTENT);

		//设置广告出现的位置(悬浮于屏幕右下角)		 
		params.gravity=Gravity.BOTTOM|Gravity.RIGHT; 
		number = 1;
		myImageView = (ImageView) findViewById(R.id.img1);
		Intent intent = getIntent();
		filePath = intent.getStringExtra("currentPath");
		mSetNumber = intent.getIntExtra("setNumber", 0) ;
		filename = filePath + "/"+1 +".jpg";
		Bitmap bm = BitmapFactory.decodeFile(filename);  
		myImageView.setImageBitmap(bm);  
		myTextView = (TextView) findViewById(R.id.imgText); 
		myTextView.setText(filename);
		//       
		myButtonSwitchImg = (Button) findViewById(R.id.next);
		myButtonSwitchImg.setOnClickListener(new Button.OnClickListener() {  
			@Override  
			public void onClick(View v) {  
				File file = new File(filename);  
				if(file.exists()) {  
					number++;
					filename = filePath + "/"+number +".jpg";
					Bitmap bm = BitmapFactory.decodeFile(filename);  
					myImageView.setImageBitmap(bm);  
					myTextView.setText(filename); 
					if (number == mSetNumber)
					{
						number = 0;
					}
				} else {  
					myTextView.setText("File Not Found!");  
				}  
			}             
		});  
	}  


	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			// do something on back.
			Intent intent =new Intent(ShowPicture.this,MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent); 
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

}
