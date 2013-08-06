package com.yimi.campusorder.data;

import java.io.Serializable;

/**
 * @author Flex.Zang 2013-8-4
 */
public class ShopData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String address;
	private String introduction;
	private ImgData image;
	private LocationData coords;
	private Double rate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public ImgData getImage() {
		return image;
	}

	public void setImage(ImgData image) {
		this.image = image;
	}

	public LocationData getCoords() {
		return coords;
	}

	public void setCoords(LocationData coords) {
		this.coords = coords;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}
}
