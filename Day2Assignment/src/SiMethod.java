
public class SiMethod {

	public static void main(String[] args) {
		double p=1000,r=6.5,t=2,si;
		si=simpleIns(p,r,t);
		System.out.println("Simple insterest is "+si);
		

	}
	static double simpleIns(double p,double r,double t) {
		return (p*r*t)/100;
	}

}
