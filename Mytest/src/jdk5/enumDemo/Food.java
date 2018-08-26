package jdk5.enumDemo;

/**
 * @author LeeZhiXin
 * @date 2018��8��26�� ����10:12:31
 * @describe    ��ʱ�����ǿ�����Ҫ��һ�����ݽ��з��࣬
  * �������ʳ��˵��������ϣ����Щ�˵�������food���ͣ�
 * appetizer(��θ��)��mainCourse(����)��dessert(����)��Coffee�ȣ�
  * ÿ�ַ������ж��־���Ĳ�ʽ��ʳƷ����ʱ�������ýӿ�����֯
 */

//PS : ����ֵĽṹ
public interface Food {
	enum Appetizer implements Food {
	    SALAD, SOUP, SPRING_ROLLS;
	  }
	  enum MainCourse implements Food {
	    LASAGNE, BURRITO, PAD_THAI,
	    LENTILS, HUMMOUS, VINDALOO;
	  }
	  enum Dessert implements Food {
	    TIRAMISU, GELATO, BLACK_FOREST_CAKE,
	    FRUIT, CREME_CARAMEL;
	  }
	  enum Coffee implements Food {
	    BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
	    LATTE, CAPPUCCINO, TEA, HERB_TEA;
	  }
}
