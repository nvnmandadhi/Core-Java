package com.tutorial.langpackage;

public class ConversionBetweenDataTypes {

	public static void main(String[] args) {
	
		
		
		
		
		
		String planString = "a"+"b"+"c"+"d";
		
		
		StringBuilder build = new StringBuilder();
		build.append("a");
		build.append("b");
		build.append("c");
		build.append("d");
		
		
		System.out.println(build);
		
		StringBuffer buff = new StringBuffer();
		buff.append("a");
		
		buff.append("b");
		buff.append("c");
		buff.append("d");
		
		
		System.out.println( "using stringbuffer --> "+buff);
		
		System.out.println("build lenght -->"+build.length());
		System.out.println("build Capacity-->"+build.capacity());
		System.out.println("Capacity -->"+buff.capacity());
		System.out.println("length -->"+buff.length());
				

	}

}
/*

* String : Is an object  to represent alphabets
* 
* String is Immutable.
* 
* mutable : An object or something that can change.  -- ALl primitive Datatypes and Classes(unless you make them immunatble programmatically) are mutable
* Immutable : An object or something which cannot change. __ Where is String is Immutable
* 
* StringBuffer and StringBuilder : Both are Mutable .append(),insert(),delete(),replace(),trim,reverse;
* 
* StringBuffer is Synchronous Where are StringBuilder is not;
*
*
*
*/