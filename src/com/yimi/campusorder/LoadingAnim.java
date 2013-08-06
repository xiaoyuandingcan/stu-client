package com.yimi.campusorder;

import com.yimi.campusorder.data.GlobalData;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * @author Flex.Zang 2013-8-4
 */
public class LoadingAnim extends Activity {
	public static Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		context = getApplicationContext();
		
		GlobalData.getInstance().saveData();
		
		
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(LoadingAnim.this, MainActivity.class);
				startActivity(intent);
				LoadingAnim.this.finish();
			}
		}, 3000);
	}
}
