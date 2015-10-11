/**
 * 
 */
package operatorManagement;

import domain.Clerk;
import domain.Manager;
import domain.Person;
import domain.StockManager;

/**
 * 操作人员所有操作接口
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午7:44:38
 */
public interface OperatorManagement {
	/**
	 * 增加收银元
	 * 
	 * @param clerk
	 * @return
	 */
	public boolean addClerk(Clerk clerk);

	/**
	 * 新增管理员
	 * 
	 * @param manager
	 * @return
	 */
	public boolean addManagr(Manager manager);

	/**
	 * 新增库存管理员
	 * 
	 * @param stockManager
	 * @return
	 */
	public boolean addStockManager(StockManager stockManager);

	/**
	 * 更改用户信息
	 * 
	 * @param person
	 * @return
	 */
	public boolean changePersonInfo(Person person);

	/**
	 * 删除收银员
	 * 
	 * @param clerkId
	 *            收银员id
	 * @return
	 */
	public boolean removeClerk(String clerkId);

	/**
	 * 删除收银员
	 * 
	 * @param clerk
	 * @return
	 */
	public boolean removeClerk(Clerk clerk);

	/**
	 * 删除管理员
	 * 
	 * @param managerId
	 *            管理员id
	 * @return
	 */
	public boolean removeManager(String managerId);

	/**
	 * 删除管理员
	 * 
	 * @param manager
	 * @return
	 */
	public boolean removeManager(Manager manager);

	/**
	 * 删除库存管理员
	 * 
	 * @param managerId
	 *            库存管理员id
	 * @return
	 */
	public boolean removeStockManager(String managerId);

	/**
	 * 删除库存管理员
	 * 
	 * @param stockManager
	 * @return
	 */
	public boolean removeStockManager(StockManager stockManager);

}
