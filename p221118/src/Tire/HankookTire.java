package Tire;

public class HankookTire extends Tire {		//자식 클래스
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
	}

}
