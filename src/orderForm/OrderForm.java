/**
 * 
 */
package orderForm;

import domain.Order;

/**
 * 商品订单创建模块
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午7:51:15
 */
public abstract class OrderForm extends Order {
	/**
	 * 添加商品到订单
	 * 
	 * @return 成功还是失败
	 */
	public abstract boolean addItem();

	/**
	 * 添加商品到订单
	 * 
	 * @param isn
	 *            商品条形码
	 * @return 成功还是失败
	 */
	public abstract boolean addItem(String isn);

	/**
	 * 添加商品到订单
	 * 
	 * @param isn
	 *            商品条形码
	 * @param count
	 *            数量
	 * @return 成功还是失败
	 */
	public abstract boolean addItem(String isn, int count);

	/**
	 * 从订单中移除指定商品
	 * 
	 * @return 成功还是失败
	 */
	public abstract boolean removeItem();

	/**
	 * 从订单中移除一个指定商品
	 * 
	 * @param isn
	 *            商品条形码
	 * @return 成功还是失败
	 */
	public abstract boolean removeItem(String isn);

	/**
	 * 从订单中移除指定数量商品
	 * 
	 * @param isn
	 *            商品条形码
	 * @param count
	 *            数量
	 * @return 成功还是失败
	 */
	public abstract boolean removeItem(String isn, int count);

	/**
	 * 清空该订单
	 * 
	 * @return 成功还是失败
	 */
	public abstract boolean clearItem();

	/**
	 * 输出打印该订单
	 * 
	 * @return 成功还是失败
	 */
	public abstract boolean printOrder();

	/**
	 * 提交该订单
	 * 
	 * @return 成功还是失败
	 */
	public abstract boolean submit();

}
