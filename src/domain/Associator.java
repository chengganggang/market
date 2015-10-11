/**
 * 
 */
package domain;

import java.sql.Date;

/**
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午7:11:01
 */
public class Associator extends Person {
//	积分数
	private double score;
//	身份证号码
	private String identityNum;

	/**
	 * 
	 */
	public Associator() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param score
	 * @param identityNum
	 */
	public Associator(double score, String identityNum) {
		super();
		this.score = score;
		this.identityNum = identityNum;
	}


	/**
	 * @param id
	 * @param name
	 * @param telphone
	 * @param birthday
	 * @param address
	 * @param inDate
	 * @param sex
	 * @param score
	 * @param identityNum
	 */
	public Associator(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex,double score, String identityNum) {
		super(id, name, telphone, birthday, address, inDate, sex);
		this.score = score;
		this.identityNum = identityNum;
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
	public Associator(String id, String name, String telphone, Date birthday,
			String address, Date inDate, String sex) {
		super(id, name, telphone, birthday, address, inDate, sex);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return the identityNum
	 */
	public String getIdentityNum() {
		return identityNum;
	}

	/**
	 * @param identityNum the identityNum to set
	 */
	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}

}
