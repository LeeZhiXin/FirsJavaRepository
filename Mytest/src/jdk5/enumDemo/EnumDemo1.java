package jdk5.enumDemo;

/**
 * @author LeeZhiXin
 * @date 2018年8月26日 下午9:49:52
 * @describe    枚举定义
 */
public class EnumDemo1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Day3.FIRST.main(null);
	}
	
}

//常规定义
enum Day1{
	MONDAY,TUSEDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

//添加方法与自定义构造函数
enum Day2{
	MONDAY("星期一"),
	TUSEDAY("星期二"),
	WEDNESDAY("星期三"),
	THURSDAY("星期四"),
	FRIDAY("星期五"),
	SATURDAY("星期六"),
	SUNDAY("星期天");
	
	private String desc;
	//注意：私有化构造函数
	private Day2(String desc) {
		this.desc = desc;
	}
	
	//TODO 个人理解：这里定义这个设置方法无意义，本来就要求枚举的对象固定，
	//对其进行赋值操作就不能达到效果，为什么没有编译警告之类的
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


//定义抽象方法
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
         输出结果:
         F:FIRST TIME
         S:SECOND TIME
         */
    }
}