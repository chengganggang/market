package domain;

import java.sql.Date;

/**
 * 
 * @Description TODO 所有人员的基类
 * @author Tianxin
 * @date 2015年10月11日 下午6:55:26
 */

public class Person {
	private String id;
	private String name;
	private String telpheone;
	private Date birthday;
	private String address;
	private Date inDate;
	private String sex;
	/**
	 * 不含参数的构造方法
	 */
	public Person() {
		super();
	}
	/**
	 * 含参构造方法
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 */
	public Person(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.telpheone = telphone;
		this.birthday = birthday;
		this.address = address;
		this.inDate = inDate;
		this.sex = sex;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the telphone
	 */
	public String getTelphone() {
		return telpheone;
	}

	/**
	 * @param telphone
	 *            the telphone to set
	 */
	public void setTelphone(String telphone) {
		this.telpheone = telphone;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the inDate
	 */
	public Date getInDate() {
		return inDate;
	}

	/**
	 * @param inDate
	 *            the inDate to set
	 */
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
