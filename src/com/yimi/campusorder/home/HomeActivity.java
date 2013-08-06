package com.yimi.campusorder.home;

import java.util.ArrayList;
import java.util.List;

import com.yimi.campusorder.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * @author Flex.Zang 2013-8-4
 */
public class HomeActivity extends Activity implements OnClickListener {

	private Spinner mSpinner;
	private ArrayAdapter<String> adapter;
	private List<String> list = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		list.add("北京");
		list.add("上海海海海海海海海海");
		list.add("深圳 深圳 深圳 深圳 深圳 深圳 深圳 深圳");
		list.add("南京");
		list.add("重庆");
		mSpinner = (Spinner) findViewById(R.id.spinner_region);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
