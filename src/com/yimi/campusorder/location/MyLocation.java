package com.yimi.campusorder.location;

import com.yimi.campusorder.data.LocationData;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/**
 * @author Flex.Zang 2013-8-4
 */
public class MyLocation {
	private Context context;
	private LocationData locationData;

	public MyLocation(Context context) {
		this.context = context;
		locationData = new LocationData();
	}

	public LocationData getLocation() {
		LocationManager locationManager;
		String serviceName = Context.LOCATION_SERVICE;
		locationManager = (LocationManager) context
				.getSystemService(serviceName);
		// ���ҵ�������Ϣ
		Criteria criteria = new Criteria();
		criteria.setAccuracy(Criteria.ACCURACY_FINE); // �߾���
		criteria.setAltitudeRequired(false);
		criteria.setBearingRequired(false);
		criteria.setCostAllowed(true);
		criteria.setPowerRequirement(Criteria.POWER_LOW); // �͹���

		String provider = locationManager.getBestProvider(criteria, true); // ��ȡGPS��Ϣ
		Location location = locationManager.getLastKnownLocation(provider); // ͨ��GPS��ȡλ��
		locationData.setLatitude(Double.toString(location.getLatitude()));
		locationData.setLongitude(Double.toString(location.getLongitude()));
		// ���ü��������Զ����µ���Сʱ��Ϊ���N��(1��Ϊ1*1000������д��ҪΪ�˷���)����Сλ�Ʊ仯����N��
		locationManager.requestLocationUpdates(provider, 100 * 1000, 500,
				locationListener);
		return locationData;
	}

	private final LocationListener locationListener = new LocationListener() {
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onProviderEnabled(String provider) {

		}

		@Override
		public void onProviderDisabled(String provider) {
		}

		@Override
		public void onLocationChanged(Location location) {
		}
	};
}
