package com.yimi.campusorder.getData;

import java.util.List;

import com.google.gson.reflect.TypeToken;
import com.yimi.campusorder.data.GlobalData;
import com.yimi.campusorder.data.ShopData;
import com.yimi.campusorder.util.GsonTool;

/**
 * @author Flex.Zang 2013-8-4
 */
public class GetShopList {
	private final String url = "/getShopList?region_id=";
	private static GetShopList mShopList;
	private List<ShopData> shopListData;
	private String id;

	private GetShopList(String id) {
		this.id = id;
	}

	public static GetShopList getInstance(String id) {
		if (mShopList == null) {
			mShopList = new GetShopList(id);
		}
		return mShopList;
	}

	public List<ShopData> getData() {
		// TODO
		String parms = url + id;
		// String data = HttpRequest.sendGetReq(parms);
		String data = "[{'id': '1','name': 'Ê³ÌÃ1','address': 'Ò»ºÅ´°¿Ú','introduction': 'XXXXXXXXXXXXXXXXXXXXXXXX','image': {'id': '123','url': 'http://imageservice'},'coords': {'longitude': 104062157,'latitude': 30658255},'rate': 4.5}]";
		shopListData = GsonTool.getGsonTool().fromJson(data,
				new TypeToken<List<ShopData>>() {
				}.getType());
		GlobalData.getInstance().setShopList(shopListData);
		return shopListData;
	}
}
