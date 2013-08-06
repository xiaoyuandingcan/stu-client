package com.yimi.campusorder.data;

import java.io.Serializable;

/**
 * @author Flex.Zang 2013-8-4
 */
public class RegionData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String region_name;
	private boolean is_default;
	private LocationData coords;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public LocationData getCoords() {
		return coords;
	}

	public void setCoords(LocationData coords) {
		this.coords = coords;
	}

}
