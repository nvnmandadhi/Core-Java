package com.tutorial.array;

public class TestEmployee {

	public static void main(String[] args) {
		
		HrManager hr = new HrManager();
		
		
		Employee[] result = hr.getTotalRecords();

		int length = result.length;

		
		/*for (int i=0 ;i<length;i++){
			
			System.out.println(result[i].employeeNum);
			System.out.println(result[i].name);
			System.out.println(result[i].salary);
		}*/
		
		int i =0 ;
		
		/*while (i<length){
			
			System.out.println(result[i].employeeNum);
			System.out.println(result[i].name);
			System.out.println(result[i].salary);
			
			 i++;
		}*/
		
		
		do{
			System.out.println(result[i].employeeNum);
			System.out.println(result[i].name);
			System.out.println(result[i].salary);
			i++;
			
		}while(i<length);
		
		
		

	}

}


// result -- arry of employee,  e1,e2,e3 and e4

// 
