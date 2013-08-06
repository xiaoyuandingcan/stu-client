package com.yimi.campusorder.getData;

import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.yimi.campusorder.data.GlobalData;
import com.yimi.campusorder.data.LocationData;
import com.yimi.campusorder.data.RegionData;
import com.yimi.campusorder.util.GsonTool;

/**
 * @author Flex.Zang 2013-8-4
 */
public class GetRegion {
	private final String url = "/getRegion";
	private LocationData location;
	private static GetRegion mRegion;
	private List<RegionData> regionData;

	private GetRegion(LocationData location) {
		this.location = location;
	}

	public static GetRegion getIntance(LocationData location) {
		if (mRegion == null) {
			mRegion = new GetRegion(location);
		}
		return mRegion;
	}

	public List<RegionData> getData() {
		// TODO
		String parms = url + "?longitude=" + location.getLongitude()
				+ "&latitude=" + location.getLatitude();
		// String data = HttpRequest.sendGetReq(parms);
		String data = "[{'id':'123','region_name':'南京信息工程大学','is_default':true,'coords':{'longitude':'104062157','latitude':'30658255'}}]";
		regionData = GsonTool.getGsonTool().fromJson(data,
				new TypeToken<List<RegionData>>() {
				}.getType());
		GlobalData.getInstance().setRegionData(regionData);
		return regionData;
	}
}
