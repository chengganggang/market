/**
 * 
 */
package associatorManagement;

import domain.Associator;
import domain.Order;

/**
 * 会员管理模块
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午7:47:45
 */
public interface AssociatorManagement {
	/**
	 * 增加积分
	 * 
	 * @param associator
	 *            会员
	 * @param order
	 *            订单
	 * @return 成功标识
	 */
	public boolean addScore(Associator associator, Order order);

	/**
	 * 增加积分
	 * 
	 * @param associatorId
	 *            会员id
	 * @param order
	 *            订单
	 * @return
	 */
	public boolean addScore(String associatorId, Order order);

	/**
	 * 增加积分
	 * 
	 * @param associator
	 *            会员
	 * @param prize
	 *            消费金额
	 * @return
	 */
	public boolean addScore(Associator associator, double prize);

	/**
	 * 增加积分
	 * 
	 * @param associatorId
	 *            会员id
	 * @param prize
	 *            消费金额
	 * @return
	 */
	public boolean addScore(String associatorId, double prize);

	/**
	 * 扣除积分
	 * 
	 * @param associator
	 * @param prize
	 *            扣除金额
	 * @return
	 */
	public boolean removeScore(Associator associator, double prize);

	/**
	 * 扣除积分
	 * 
	 * @param associatorId
	 *            会员id
	 * @param prize
	 *            扣除金额
	 * @return
	 */
	public boolean removeScore(String associatorId, double prize);

	/**
	 * 注册会员
	 * 
	 * @param associator
	 * @return
	 */
	public boolean registerAssociator(Associator associator);

	/**
	 * 删除会员
	 * 
	 * @param associator
	 * @return
	 */
	public boolean deleteAssociator(Associator associator);

	/**
	 * 根据id删除会员
	 * 
	 * @param associatorId
	 *            会员id
	 * @return
	 */
	public boolean deleteAssociator(String associatorId);

}
