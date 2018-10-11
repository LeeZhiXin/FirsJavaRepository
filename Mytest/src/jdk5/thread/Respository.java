package jdk5.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeeZhiXin
 * @date 2018年9月3日 下午10:35:15
 * @describe    产品仓库类
 */
public class Respository {
	private static final int MAX_SIZE = 16;
	private static final int MIN_SIZE = 0;
	List<Product> list = new ArrayList<Product>();
	
	
	/**
	 * @author LeeZhiXin
	 * @date 2018年9月3日  下午10:43:57
	 * @describe    判断仓库是否已空
	 * @history   
	 * @return
	 */
	public boolean isEmpty() {
		return list.size()==MIN_SIZE;
	}
	
	/**
	 * @author LeeZhiXin
	 * @date 2018年9月3日  下午10:47:05
	 * @describe    判断仓库是否已满
	 * @history   
	 * @return
	 */
	public boolean isFull() {
		return list.size()==MAX_SIZE;
	}
	/**
	 * @author LeeZhiXin
	 * @date 2018年9月3日  下午10:47:22
	 * @describe    添加产品
	 * @history   
	 * @param product	产品对象
	 */
	public void addProduct(Product product) {
		if(!isFull()) list.add(product);
	}
	
	/**
	 * @author LeeZhiXin
	 * @date 2018年9月3日  下午10:55:42
	 * @describe    获取一个产品
	 * @history   
	 * @return
	 */
	public Product getProduct() {
		return isEmpty()?null:list.remove(0);
	}
}
