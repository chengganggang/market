/**
 * 
 */
package domain;

/**
 * @Description TODO 仓库管理类
 * @author Tianxin
 * @date 2015年10月11日 下午7:33:53
 */
public class Stock {
	// 商品
	private Commodity commodity;
	// 对应商品的数量
	private int count;

	/**
	 * 无参构造函数
	 */
	public Stock() {
		super();
	}

	/**
	 * @param commodity
	 * @param count
	 */
	public Stock(Commodity commodity, int count) {
		super();
		this.commodity = commodity;
		this.count = count;
	}

	/**
	 * @return the commodity
	 */
	public Commodity getCommodity() {
		return commodity;
	}

	/**
	 * @param commodity
	 *            the commodity to set
	 */
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

}
