package jdk5.enumDemo;

/**
 * @author LeeZhiXin
 * @date 2018年8月26日 下午10:16:06
 * @describe    菜单枚举 
 * appetizer(开胃菜)、mainCourse(主菜)、dessert(点心)、Coffee等，
 */
public enum FoodMenu {
	APPETIZER(Food.Appetizer.class),
	MAINCOURSE(Food.MainCourse.class),
	DESSERT(Food.Dessert.class),
	COFFEE(Food.Coffee.class);
	
	private Food[] values;
	
	private FoodMenu(Class<? extends Food> food) {
		values = food.getEnumConstants();
	}

	public Food[] getValues() {
		return values;
	}
	
}
