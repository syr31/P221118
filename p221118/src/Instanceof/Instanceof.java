package Instanceof;

public class Instanceof {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

		if (parent instanceof Parent) {  // instanceof 타입 캐스팅이 가능한지 묻는 여부
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (parent instanceof Child) { // Parent = Child "불가능"
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (child instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (child instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
