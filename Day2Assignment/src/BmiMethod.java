
public class BmiMethod {

	public static void main(String[] args) {
		double bmi=bmi(81,1.8);
		System.out.println("Bmi is "+bmi);
	}
	static double bmi(double w, double h) {
		double bmir=w/(h*h);
		return bmir;
		}

}
