package Parent;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

		parent.method1();
		parent.method2();

		child.method1(); // child calss에는 method1이 없지만 부모에서 상속받은 method1이 출력된다.
		child.method2();
		child.method3();

		System.out.println("==============================================");

		parent = child;
		parent.method1();
		parent.method2();
	}

}
