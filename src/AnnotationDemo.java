import java.util.ArrayList;

@FunctionalInterface
interface Abc {

	void show();
}

class A {

	public void show() {
		System.out.println("In A");
	}

	@Deprecated
	public void show1() {

	}
}

class B extends A {

	@Override
	@SuppressWarnings("unchecked")
	public void show() {
		System.out.println("In B");
		ArrayList list = new ArrayList<>();
	}

	@Override
	public void show1() {
		super.show1();
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {

	}
}
