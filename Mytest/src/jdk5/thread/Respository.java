package jdk5.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeeZhiXin
 * @date 2018��9��3�� ����10:35:15
 * @describe    ��Ʒ�ֿ���
 */
public class Respository {
	private static final int MAX_SIZE = 16;
	private static final int MIN_SIZE = 0;
	List<Product> list = new ArrayList<Product>();
	
	
	/**
	 * @author LeeZhiXin
	 * @date 2018��9��3��  ����10:43:57
	 * @describe    �жϲֿ��Ƿ��ѿ�
	 * @history   
	 * @return
	 */
	public boolean isEmpty() {
		return list.size()==MIN_SIZE;
	}
	
	/**
	 * @author LeeZhiXin
	 * @date 2018��9��3��  ����10:47:05
	 * @describe    �жϲֿ��Ƿ�����
	 * @history   
	 * @return
	 */
	public boolean isFull() {
		return list.size()==MAX_SIZE;
	}
	/**
	 * @author LeeZhiXin
	 * @date 2018��9��3��  ����10:47:22
	 * @describe    ��Ӳ�Ʒ
	 * @history   
	 * @param product	��Ʒ����
	 */
	public void addProduct(Product product) {
		if(!isFull()) list.add(product);
	}
	
	/**
	 * @author LeeZhiXin
	 * @date 2018��9��3��  ����10:55:42
	 * @describe    ��ȡһ����Ʒ
	 * @history   
	 * @return
	 */
	public Product getProduct() {
		return isEmpty()?null:list.remove(0);
	}
}
