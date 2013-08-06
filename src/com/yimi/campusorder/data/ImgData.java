package com.yimi.campusorder.data;

import java.io.Serializable;

/**
 * @author Flex.Zang 2013-8-4
 */
public class ImgData implements Serializable{
	private static final long serialVersionUID = -1660123559987561103L;
	private String id;
	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
