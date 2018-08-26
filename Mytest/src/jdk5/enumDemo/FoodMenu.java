package jdk5.enumDemo;

/**
 * @author LeeZhiXin
 * @date 2018��8��26�� ����10:16:06
 * @describe    �˵�ö�� 
 * appetizer(��θ��)��mainCourse(����)��dessert(����)��Coffee�ȣ�
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
