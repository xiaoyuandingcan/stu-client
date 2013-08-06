package com.yimi.campusorder.data;

import java.io.Serializable;

/**
 * @author Flex.Zang 2013-8-4
 */
public class LocationData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String longitude;
	private String latitude;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
