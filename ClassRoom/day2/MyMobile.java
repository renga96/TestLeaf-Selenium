package week1.day2;

public class MyMobile {

	int ramSize = 8;
	String colour = "RED";
	float screenSize = 6.5f;
	long mobileNumber = 9876543210L;
	short price = 16999;
	boolean touchScreen = true;
	char chargingType = 'C';

	public void makeCall() {
		System.out.println("makeCall is called");
	}

	public void sendMesssage() {
		System.out.println("sendMesssage is called");

	}

	private void payBills() {
		System.out.println("payBills is called");
	}

	public static void main(String[] args) {

		MyMobile moto = new MyMobile();
			
		System.out.println("Ram Size " + moto.ramSize);
		System.out.println("colour " + moto.colour);
		System.out.println("price " + moto.price);

		moto.payBills();
		moto.makeCall();
		moto.sendMesssage();
	}

}
