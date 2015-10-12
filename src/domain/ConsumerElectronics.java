/**
 * 
 */
package domain;

import java.sql.Date;
/**
 * @Description TODO
 * @author Administrator
 * @date 2015年10月11日 下午8:49:01
 */

public class ConsumerElectronics extends Commodity {
	// 功率
	double power;
	// 电压
	double voltage;
	// 电流
	double current;
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
