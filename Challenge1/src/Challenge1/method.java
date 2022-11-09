package Challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class method {

	public static boolean containsTheVowelFalseOrTrue (String n,List <String> lista) {
		   
		   
	      if(lista.contains(n)) { 
	    	    		return  false;
	    	    		
		}else 
					return true;
		}
		
	public static String randomNumberBecauseOfType (String type) {
			
			String numbers = "1234567890";
					
			Random nRandom = new Random();
			
			int length = 8;
			
			String result2 = "";
			String result ="";
			String TypeA= "54";
			String TypeB = "08";
			
			if(type.equals("Tipo A")) {
				result2 = TypeA;
			} else if(type.equals("Tipo B")) {
				result2 = TypeB;
			}else
				result2 =" not found ";
				
			for (int i = 0; i <length; i++) {
				int position = nRandom.nextInt (numbers.length());
				char character = numbers.charAt (position);
				
						
				 result += String.valueOf(character);
					
					}
		
		 return result2 + result ;
	 }
	
	
	//METODO punto B ejecutado 
	  public static void main (String[] args) {  
		  
		  Scanner s = new Scanner (System.in);
	      System.out.print("insert a vowel ");
	      String vowel = s.next(); 
	      	
	      List <String> list = new ArrayList<String> ();

	      list.add("a");
	      list.add("e");
	      list.add("i");
	      list.add("o");
	      list.add("u");
	      
	   System.out.println("el resultado es " + containsTheVowelFalseOrTrue(vowel,list));
	   
	 //METODO punto A ejecutado 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a type ");
		String text = sc.nextLine();
				
			System.out.print("The random number for this type is " + randomNumberBecauseOfType(text));
	}


	}


