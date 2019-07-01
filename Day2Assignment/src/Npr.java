
public class Npr {

	public static void main(String[] args) {
		int nf,nrf,npr;
		int n=10,r=3;
		nf=fact(n);
		nrf=fact(n-r);
		npr=nf/(nrf);
		System.out.println("Npr is "+npr);
	}
	static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}


}
