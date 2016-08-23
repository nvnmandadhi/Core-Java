
public class BeerBottles {

	public static void main(String[] args) {

		int i=10;
		String s="Bottles";
		while(i>0){
			
			if(i==1){
						s="Bottle";
					}
			
			System.out.println(i+" "+s+" of beer on the wall, "+i+" "+s+" of beer");
			i--;
			
			if(i!=1){
				System.out.println("Take one and pass it around, "+i+" bottles of beer on the wall");
			}
			
			if(i==1){
				System.out.println("Take one and pass it around, "+i+" bottle of beer on the wall");
			}
			
			if(i==0){
				System.out.println("No more bottles of beer on the wall, no more beer");
				System.out.println("go to store and some more, 6 bottles of beer");
			}
		}
	}
}
	


