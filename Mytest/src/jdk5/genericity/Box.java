package jdk5.genericity;

/**
 * @author LeeZhiXin
 * @date 2018年8月26日 下午5:23:50
 * @describe    简单的泛型类定义
 * @param <T>
 */
public class Box<K,V> {
	private K key;
	private V value;
	
	public Box () {}
	public Box(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	

	
}
