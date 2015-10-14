/**
 * 
 */
package domain;

import java.sql.Date;
/**
 * @Description 继承商品类的电子产品子类
 * @author ChengGang
 * @date 2015年10月14日 下午7:24:05
 */
public class ConsumerElectronics extends Commodity {
	// 功率
	private double power;
	// 电压
	private double voltage;
	// 电流
	private double current;
	/**
	 * 
	 * @return the power
	 */
	public double getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(double power) {
		this.power = power;
	}
	/**
	 * @return the voltage
	 */
	public double getVoltage() {
		return voltage;
	}
	/**
	 * @param power the voltage to set
	 */
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	/**
	 * @return the current
	 */
	public double getCurrent() {
		return current;
	}
	/**
	 * @param power the current to set
	 */
	public void setCurrent(double current) {
		this.current = current;
	}
	public  ConsumerElectronics() {
		
	}
	/**
	 * @param power
	 * @param voltage
	 * @param current
	 */
	public  ConsumerElectronics(
			double power,
			double voltage,
			double current) {
		super();
		this.power = power;
		this.voltage = voltage;
		this.current = current;	
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
	 * @param power
	 * @param voltage
	 * @param current
	 */
	public ConsumerElectronics(
			String name,
			double price,
			double bid,
			String iSN,
			String manuDate,
			double mass,
			String qgp,
			String brand,
			String remark,
			double power,
			double voltage,
			double current){
		super();
		this.power = power;
		this.voltage = voltage;
		this.current = current;	
		
	}
	
	
}
