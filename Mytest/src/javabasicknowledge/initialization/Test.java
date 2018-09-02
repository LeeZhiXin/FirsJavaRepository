package javabasicknowledge.initialization;

/**
 * @author LeeZhiXin
 * @date 2018��8��31�� ����11:42:46
 * @describe   ��ʼ������ѧϰ
 * 
 *  ����� �ĳ�ʼ������ ׼�� �׶����
 *  
 *  ���ʼ����5�����������һ������������ã�
 *  	1.ʹ��new�ؼ���ʵ�������󣬶�ȡ������һ����� ��̬�ֶΣ�
 *  	2.�������ʱ��������δ��ʼ������ᴥ������ĳ�ʼ��������
 *  	3.��ʼ��һ����ʱ�����丸��δ��ʼ�������ȳ�������ĳ�ʼ��������
 *  	4.���������ʱ��ʼ��ָ���İ���main()������ִ�����ࣻ
 *  	5.JDK1.7��̬����֧��ʱ��...�������˽�󲹳�������
 *  
 *  
 *  ����һ����ı������ã�
 *  	1.�������ø���ľ�̬�ֶΣ����ᴥ������ĳ�ʼ��������
 *  	2.�����鶨�嶨�岻�ᴥ������ĳ�ʼ��������SonClass[] sonArr = new SonClass[10];���ᴥ��SonClass�ĳ�ʼ����������
 *  	3.����������ĳ���ʱ�������ʼ���Ǹ��ࣨ�����ļ�������׼���׶��Ѿ���ɵģ�
 *  
 */
public class Test {

	public static void main(String[] args) {

//		System.out.println(SonClass.strFather);
		//��ӡ�����
		//FatherClass init
		//father
		
//		System.out.println(SonClass.strSon);
		//��ӡ�����
		//FatherClass init
		//SonClass init
		//son

		System.out.println(FatherClass.constantFather);
		//��ӡ�����
		//Father
	
		
	}

}


class FatherClass{
	public static String strFather = "father";
	
	public static final String constantFather = "Father";//����
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
