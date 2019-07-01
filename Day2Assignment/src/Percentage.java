
public class Percentage {

	public static void main(String[] args) {
		int marks=256,outoff=300;
		double p=perc(marks,outoff);
		System.out.println("The percentage is "+p+"% of "+marks+" outoff "+outoff);
	}
	static double perc(int marks,int outoff) {
		return (marks*100)/outoff;
	}
}
