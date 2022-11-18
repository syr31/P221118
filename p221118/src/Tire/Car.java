package Tire;

public class Car {
//	Tire frontleftTire = new Tire("앞왼쪽", 6);
//	Tire frontRightTire = new Tire("앞오른쪽", 2);
//	Tire backleftTire = new Tire("뒤왼쪽", 6);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);

//	int run() {
//		System.out.println("자동차가 달립니다.");
//		if (frontleftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if (frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if (backleftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if (backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
//		return 0;
//	}
//
//	void stop() {
//		System.out.println("자동차가 멈춥니다.");
//	}
//}
//	System.out.println("=============================");
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4),
	};


	int run() {
		System.out.println("자동차가 달립니다.");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return(i+1);
			}
	}
		return 0;				// return 값 '0'은 정상
	}
		
		void stop() {
			System.out.println("자동차가 멈춥니다.");
		}
	}