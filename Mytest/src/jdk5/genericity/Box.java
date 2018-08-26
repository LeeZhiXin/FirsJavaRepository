package jdk5.genericity;

/**
 * @author LeeZhiXin
 * @date 2018��8��26�� ����5:23:50
 * @describe    �򵥵ķ����ඨ��
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
