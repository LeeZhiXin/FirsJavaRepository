package jdk5.enumDemo;

/**
 * @author LeeZhiXin
 * @date 2018��8��26�� ����9:49:52
 * @describe    ö�ٶ���
 */
public class EnumDemo1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Day3.FIRST.main(null);
	}
	
}

//���涨��
enum Day1{
	MONDAY,TUSEDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

//��ӷ������Զ��幹�캯��
enum Day2{
	MONDAY("����һ"),
	TUSEDAY("���ڶ�"),
	WEDNESDAY("������"),
	THURSDAY("������"),
	FRIDAY("������"),
	SATURDAY("������"),
	SUNDAY("������");
	
	private String desc;
	//ע�⣺˽�л����캯��
	private Day2(String desc) {
		this.desc = desc;
	}
	
	//TODO ������⣺���ﶨ��������÷��������壬������Ҫ��ö�ٵĶ���̶���
	//������и�ֵ�����Ͳ��ܴﵽЧ����Ϊʲôû�б��뾯��֮���
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	 public static void main(String[] args){
        for (Day2 day:Day2.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.getDesc());
        }
	 }
}


//������󷽷�
enum Day3{
	FIRST {
		@Override
		public String getInfo() {
			return "first";
		}
	},
	SECOND {
		@Override
		public String getInfo() {
			return "second";
		}
	};
	
	public abstract String  getInfo();
	
	public static void main(String[] args){
        System.out.println("F:"+Day3.FIRST.getInfo());
        System.out.println("S:"+Day3.SECOND.getInfo());
        /**
         ������:
         F:FIRST TIME
         S:SECOND TIME
         */
    }
}