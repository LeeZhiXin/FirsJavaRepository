package jdk5.thread;

/**
 * @author LeeZhiXin
 * @date 2018年9月3日 下午11:01:25
 * @describe    产品工厂作为生产者
 */
public class ProductFactory implements Runnable{

	private Respository respository;
	
	@Override
	public void run() {
		
		
		
		
	}
	
	public ProductFactory(Respository res) {
		this.respository = res;
	}
}
