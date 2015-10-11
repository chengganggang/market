/**
 * 
 */
package domain;

import java.sql.Date;

/**
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午6:59:59
 */
public class Clerk extends Person {
	double salary;

	/**
	 * 
	 */
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 */
	public Clerk(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex) {
		super(id, name, telphone, birthday, address, inDate, sex);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param salary
	 */
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}
	/**
	 * 含有全部参数的构造方法
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 * @param salary
	 */
	public Clerk(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex,double salary) {
		super(id, name, telphone, birthday, address, inDate, sex);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
