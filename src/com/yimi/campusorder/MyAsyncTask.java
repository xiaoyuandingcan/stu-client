package com.yimi.campusorder;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;

/**
 * @author Flex.Zang 2013-8-4
 */
public class MyAsyncTask extends AsyncTask<String, Integer, String> {
	private final String TAG = "MyAsyncTask";
	ProgressDialog pdialog;

	public MyAsyncTask(Context context) {
		pdialog = new ProgressDialog(context, 0);
	}

	@Override
	protected String doInBackground(String... params) {
		//TODO
		return null;
	}

	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		pdialog.dismiss();
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();

		pdialog.setButton("Cancel", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				pdialog.cancel();
			}
		});
		pdialog.setOnCancelListener(new DialogInterface.OnCancelListener() {

			@Override
			public void onCancel(DialogInterface dialog) {
				// TODO Auto-generated method stub
				pdialog.dismiss();
			}
		});
		pdialog.setCancelable(true);
		pdialog.setMax(100);
		pdialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		pdialog.show();
	}

	@Override
	protected void onProgressUpdate(Integer... values) {
		// TODO Auto-generated method stub
		super.onProgressUpdate(values);
		Log.d(TAG, "------progress:" + values[0]);
		pdialog.setProgress(values[0]);
	}

}
