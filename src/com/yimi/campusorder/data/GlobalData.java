package com.yimi.campusorder.data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Flex.Zang 2013-8-4
 */
public class GlobalData implements Serializable {

	private static final long serialVersionUID = 1L;
	private static GlobalData g;

	private LocationData location;
	private List<RegionData> regionData;
	private List<ShopData> shopList;

	public static GlobalData getInstance() {
		if (g == null) {
			synchronized (GlobalData.class) {
				if (g == null) {
					g = new GlobalData();
				}
			}
		}
		return g;
	}

	public LocationData getLocation() {
		return location;
	}

	public void setLocation(LocationData location) {
		this.location = location;
	}

	public List<RegionData> getRegionData() {
		return regionData;
	}

	public void setRegionData(List<RegionData> regionData) {
		this.regionData = regionData;
	}

	public List<ShopData> getShopList() {
		return shopList;
	}

	public void setShopList(List<ShopData> shopList) {
		this.shopList = shopList;
	}
	
	public void saveData(){
		//TODO
	}
}
