package faid1;

import java.util.Scanner;

public class MentoringTraining {
	
//	non Static global variable
     int modelQuantity= 200;
	 char modelGender= 'f';
	 
	String brandName= "celiashop";
	String size= "xxs";
	String shoseColor="black";
	
	
	public static void main (String[]args) {
	 
	double price=15000;
	int shosePrice =5000;
	byte shoseQantity=20;
	
	
	
	 MentoringTraining celShop= new  MentoringTraining();   
	 
	 
	 
	 
	 Scanner celia = new Scanner (System.in);
	 
	 System.out.println("please enter your modelQantity");
	
	 String shop= celia.nextLine();
	 
	 System.out.println("your order model qantity is: "+celShop. modelQuantity);
	
	 
	 System.out.println("the size will be: "+celShop.size);
	 
	 System.out.println("the gender  will be: "+celShop.modelGender);
	 
	 
	 
	 System.out.println("your shoes oredr price is:$"+shoseQantity* shosePrice);
	 System.out.println("total cloths  order is: $ "+celShop.modelQuantity * price );
	 
	 System.out.println("the all total order will be: $"+shoseQantity* shosePrice + celShop.modelQuantity * price );
	  

	 
	System.out.println("thank you for shoping at celiaShop hope we will see you soon  :)");
	
	
	 
	 

 
	celia.close();
	
	
	
	
	
	
		
		
		
		
	}

}
