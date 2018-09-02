package jdk5.annotation;

@FirstAnnotation
public class Test {
	
	public static void main(String[] args) {
		//Ä£ÄâAPT
		boolean isAnnotationPresent = Test.class.isAnnotationPresent(FirstAnnotation.class);
		if(isAnnotationPresent) {
			FirstAnnotation annotation = Test.class.getAnnotation(FirstAnnotation.class);
			System.out.println(annotation.id());
			System.out.println(annotation.msg());
		}
	}

}
