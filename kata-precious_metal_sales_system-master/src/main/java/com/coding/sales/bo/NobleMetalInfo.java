package com.coding.sales.bo;

import java.util.List;

/**
 * 贵金属信息
 * 
 * @author Administrator
 *
 */
public class NobleMetalInfo {

	String goodSaleName; // 商品名称
	String product; // 编号
	String unit; // 单位
	Double price; // 价格
	String fullReduction; // 满减
	String discount; // 折扣

	public String getGoodSaleName() {
		return goodSaleName;
	}

	public void setGoodSaleName(String goodSaleName) {
		this.goodSaleName = goodSaleName;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getFullReduction() {
		return fullReduction;
	}

	public void setFullReduction(String fullReduction) {
		this.fullReduction = fullReduction;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
