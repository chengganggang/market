/**
 * 
 */
package viewTransition;

/**
 * 视图切换模块，含有如登录登出等方法
 * 
 * @Description TODO
 * @author Tianxin
 * @date 2015年10月11日 下午7:54:26
 */
public interface ViewTransition {
	/**
	 * 检查登陆人员身份
	 * 
	 * @param username
	 * @param password
	 * @return 返回标识，0失败，1成功
	 */
	public int checkStatus(String username, String password);

	/**
	 * @param username
	 * @return 返回标识，0失败，1成功
	 */
	public int logout(String username);

}
