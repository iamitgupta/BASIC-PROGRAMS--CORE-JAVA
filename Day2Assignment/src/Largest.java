
public class Largest {

	public static void main(String[] args) {
		int a=25,b=50,c=40,d;
		d=lar(a,b,c);
		System.out.println("Larger number is "+d);
		
	}
	static int lar(int a,int b,int c) {
		if(a>b && a>c) {
			return a; 
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}

}
