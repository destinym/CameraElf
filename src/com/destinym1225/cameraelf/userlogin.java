package com.destinym1225.cameraelf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userlogin extends Activity
{

	private EditText m_editText;
	private Button   m_button;
	private SharedPreferences m_sharedPreferences;   
    private SharedPreferences.Editor m_editor; 
    
	public void onCreate(Bundle savedInstanceState) {  
		super.onCreate(savedInstanceState);
		//       setTitle("ImageView");  
		setContentView(R.layout.userlogin);

		m_editText = (EditText) findViewById(R.id.taobaoaccount);
		m_button = (Button) findViewById(R.id.login);
		
		m_sharedPreferences = this.getSharedPreferences("test",MODE_PRIVATE);  
        m_editor = m_sharedPreferences.edit(); 
        String currtaobaoaccount = m_sharedPreferences.getString("tabaoaccount", null); 
        m_editText.setText(currtaobaoaccount);

		m_button.setOnClickListener(new  Button.OnClickListener(){
			@Override  
			public void onClick(View v) {

				String taobaoaccount = m_editText.getText().toString();
				if (isEmail(taobaoaccount))
				{
					Intent intent =new Intent(userlogin.this,MainActivity.class);
					intent.putExtra("taobaoaccount", taobaoaccount);
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(intent); 
					m_editor.putString("tabaoaccount", taobaoaccount);
					m_editor.commit();
					Log.i("login", m_editText.getText().toString());
				}
				else
				{
					Toast.makeText(userlogin.this,"请输入邮箱格式的支付宝账号",Toast.LENGTH_LONG).show();
				}
			}

		});


	}

	public static boolean isEmail(String strEmail) 

	{ 

		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";

		Pattern p = Pattern.compile(str); 

		Matcher m = p.matcher(strEmail); 

		return m.matches(); 

	} 


	//显示基本的AlertDialog
	private void showDialogExit(Context context) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		//builder.setIcon(R.drawable.icon);
		builder.setTitle("是否要退出");
		//builder.setMessage("Message");
		builder.setPositiveButton("退出",
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				System.exit(0);
			}
		});
		builder.setNeutralButton("取消",
				new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {

			}
		});
		builder.show();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			// do something on back.
			showDialogExit(userlogin.this);
		}
		return super.onKeyDown(keyCode, event);
	}





}