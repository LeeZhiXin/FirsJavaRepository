package jdk5.thread;

/**
 * @author LeeZhiXin
 * @date 2018年9月3日 下午10:36:46
 * @describe    产品类
 */
public class Product {
	private String id;
	private String name;
	private int size;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
		public String toString() {
			return "id:"+this.id + "   name:"+this.name+"    size:"+this.size;
		}
}
