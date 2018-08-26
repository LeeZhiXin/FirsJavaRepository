package jdk5.genericity;

/**
 * @author LeeZhiXin
 * @date 2018年8月26日 下午5:21:22
 * @describe    JDK1.5 泛型
 */
public class GenericityTest {
	
	public static void main(String[] args) {
		test1();
	}
	
	
	private static void test1() {
		//简单泛型对象的生成
		Box<Integer,String> box1 = new Box<Integer,String>(1,"name");
		Box<Integer,String> box2 = new Box<Integer,String>(1,"value");
		
		//调用泛型方法
		boolean compareResult = compareBox(box1, box2);
		System.out.println(compareResult);
	}
	
	
	@SuppressWarnings("unused")
	private static void test2() {
		//List<?> list = new ArrayList<String>();
		//list.add("123");  编译无法通过，
		//无界通配符代表其接受任何的实际类型但这并不意味着任何的实际类型都可以作为其输入和输出
		
		//上界通配符  Box<? extend ClassName>
		//下界通配符  Box<? super ClassName>
		
		
	}
	
	//简单的泛型方法
	//只要在返回类型前面加上一个通配符声明
	private static <K,V> boolean compareBox(Box<K,V> first,Box<K,V> second) {
		return first.getKey().equals(second.getKey())
			 &&first.getValue().equals(second.getValue());
	}
	
	
	
}
