package com.yimi.campusorder.util;

import com.google.gson.Gson;

/**
 * @author Flex.Zang 2013-8-4
 */
public class GsonTool {
	private static Gson gson;

	public static Gson getGsonTool() {
		if (gson == null) {
			gson = new Gson();
		}
		return gson;
	}
}
