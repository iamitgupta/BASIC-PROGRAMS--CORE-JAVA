
public class DiscountSenior {

	public static void main(String[] args) {
		int age=75;
		double tp=500,dp=15,fare;
		if(age>=60) {
			fare=tp-(tp*dp)/100;
		}
		else {
			fare=tp;
		}
		System.out.println("Ticket price is "+fare);
	}

}
