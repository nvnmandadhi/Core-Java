package com.tutorial.switchstatement;

public class switchexample {
	
	
	public void holidayCounter(String month){
		
		String monthString;
		
		switch(month){
		
		case "January": monthString  = "January";
						System.out.println(monthString);
						
						
		case "Feb": monthString  = "Feb";
		
		
		
		case "March": monthString  = "March";
		
		case "April": monthString  = "April";
		
		
		default: monthString = "default";
		break;
		
		
		
		}
		
		System.out.println(monthString);
		
	}
	
	public Object getObject(){
		
		switchexample ex = new switchexample();
		return ex;
	}
	
	
	public static void main(String arg[]){
		
		switchexample ex = new switchexample();
		
		ex.holidayCounter("January");
	}

}



/***

Switch Statements :

These are used for flow conditions;

Switch statements will have a case ; and default condition 

Its not mandatory to have break in switch statement. Using break gives better control and avoid unnecessary bugs

*/