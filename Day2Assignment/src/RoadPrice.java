
public class RoadPrice {

	public static void main(String[] args) {
		double price=300000,rt=18.2,ins=15.3,rp;
		double rtp=(price*rt)/100;
		double insp=(price*ins)/100;
		rp=rtp+insp+price;
		System.out.println(" Road tax is "+rtp+"\n Insurance is "+insp+"\n Total road price is "+rp);
	}

}
