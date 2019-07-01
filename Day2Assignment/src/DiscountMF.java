
public class DiscountMF {
	public static void main(String[] args) {
		char gender='m';
		double price=5000;
		if(gender=='m' || gender=='M') {
			price=price-(price*5)/100;
		}
		else{
			price=price-(price*7.5)/100;

		}
		System.out.println("Final price is "+price);
		
	}

}
