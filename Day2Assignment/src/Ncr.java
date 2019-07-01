
public class Ncr {

	public static void main(String[] args) {
		int nf,nrf,rf,ncr;
		int n=10,r=3;
		nf=fact(n);
		nrf=fact(n-r);
		rf=fact(r);
		ncr=nf/(nrf*rf);
		System.out.println("Ncr is "+ncr);
	}
	static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	

}
