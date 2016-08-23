
public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;/*A variable need to be initialized, but, 
					I guess it's okay to not initialize an object*/
        x=new String();
        System.out.println(x);
        String y=new String();
        System.out.println(y);
        x="Hello";
        y=x;
        System.out.println(y);
        y=new String(x);
        System.out.println(y);

	}

}
