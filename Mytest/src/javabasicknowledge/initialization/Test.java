package javabasicknowledge.initialization;

/**
 * @author LeeZhiXin
 * @date 2018年8月31日 上午11:42:46
 * @describe   初始化过程学习
 * 
 *  类变量 的初始化会在 准备 阶段完成
 *  
 *  类初始化的5中情况：（对一个类的主动引用）
 *  	1.使用new关键字实例化对象，读取或设置一个类的 静态字段；
 *  	2.反射调用时，若该类未初始化，则会触发该类的初始化动作；
 *  	3.初始化一个类时，若其父类未初始化，则先出发父类的初始化动作；
 *  	4.虚拟机启动时初始化指定的包含main()方法的执行主类；
 *  	5.JDK1.7动态语言支持时，...（后续了解后补充完整）
 *  
 *  
 *  （对一个类的被动引用）
 *  	1.子类引用父类的静态字段，不会触发子类的初始化动作；
 *  	2.类数组定义定义不会触发该类的初始化动作（SonClass[] sonArr = new SonClass[10];不会触发SonClass的初始化动作）；
 *  	3.引用其他类的常量时，不会初始化那个类（常量的加载是在准备阶段已经完成的）
 *  
 */
public class Test {

	public static void main(String[] args) {

//		System.out.println(SonClass.strFather);
		//打印结果：
		//FatherClass init
		//father
		
//		System.out.println(SonClass.strSon);
		//打印结果：
		//FatherClass init
		//SonClass init
		//son

		System.out.println(FatherClass.constantFather);
		//打印结果：
		//Father
	
		
	}

}


class FatherClass{
	public static String strFather = "father";
	
	public static final String constantFather = "Father";//常量
	static {
		System.out.println("FatherClass init");
	}
}

class SonClass extends FatherClass{
	public static String strSon = "son";
	static {
		System.out.println("SonClass init");
	}
}
