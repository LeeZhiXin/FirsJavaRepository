package jdk5.genericity;

/**
 * @author LeeZhiXin
 * @date 2018��8��26�� ����5:21:22
 * @describe    JDK1.5 ����
 */
public class GenericityTest {
	
	public static void main(String[] args) {
		test1();
	}
	
	
	private static void test1() {
		//�򵥷��Ͷ��������
		Box<Integer,String> box1 = new Box<Integer,String>(1,"name");
		Box<Integer,String> box2 = new Box<Integer,String>(1,"value");
		
		//���÷��ͷ���
		boolean compareResult = compareBox(box1, box2);
		System.out.println(compareResult);
	}
	
	
	@SuppressWarnings("unused")
	private static void test2() {
		//List<?> list = new ArrayList<String>();
		//list.add("123");  �����޷�ͨ����
		//�޽�ͨ�������������κε�ʵ�����͵��Ⲣ����ζ���κε�ʵ�����Ͷ�������Ϊ����������
		
		//�Ͻ�ͨ���  Box<? extend ClassName>
		//�½�ͨ���  Box<? super ClassName>
		
		
	}
	
	//�򵥵ķ��ͷ���
	//ֻҪ�ڷ�������ǰ�����һ��ͨ�������
	private static <K,V> boolean compareBox(Box<K,V> first,Box<K,V> second) {
		return first.getKey().equals(second.getKey())
			 &&first.getValue().equals(second.getValue());
	}
	
	
	
}
