/**
 * 
 */
package domain;

import java.sql.Date;

/**
 * @Description 商品基类
 * @author ChengGang
 * @date 2015年10月14日 下午7:25:03
 */
public class Commodity {
	// 货物名
	private String name;
	// 价格
	private double price;
	// 进价
	private double bid;
	// 条形码
	private String iSN;
	// 生产日期
	private String manuDate;
	// 质量
	private double mass;
	// 保质期
	private String qgp;
	// 品牌
	private String brand;
	// 注释
	private String remark;
	/** 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the bid
	 */
	public double getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(double bid) {
		this.bid = bid;
	}
	/**
	 * @return the iSN
	 */
	public String getiSN() {
		return iSN;
	}
	/**
	 * @param iSN the iSN to set
	 */
	public void setiSN(String iSN) {
		this.iSN = iSN;
	}
	/**
	 * @return the manuDate
	 */
	public String getManuDate() {
		return manuDate;
	}
	/**
	 * @param manuDate the manuDate to set
	 */
	
	public void setManuDate(String manuDate) {
		this.manuDate = manuDate;
	}
	/**
	 * @return the mass
	 */
	public double getMass() {
		return mass;
	}
	/**
	 * @param mass the mass to set
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	/**
	 * @return the qgp
	 */
	public String getQgp() {
		return qgp;
	}
	/**
	 * @param qgp the qgp to set
	 */
	public void setQgp(String qgp) {
		this.qgp = qgp;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param price
	 * @param bid
	 * @param iSN
	 * @param manuDate
	 * @param mass
	 * @param qgp
	 * @param brand
	 * @param remark
	 */
	public Commodity(String name,
			double price,
			double bid,
			String iSN,
			String manuDate,
			double mass,
			String qgp,
			String brand,
			String remark) {
		this.name = name;
		this.price = price;
		this.bid = bid;
		this.iSN = iSN;
		this.manuDate = manuDate;
		this.mass = mass;
		this.qgp = qgp;
		this.brand = brand;
		this.remark = remark;
		// TODO Auto-generated constructor stub
	}

}
