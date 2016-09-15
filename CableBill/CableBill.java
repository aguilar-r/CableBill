/***
 * Name: Raul Aguilar
 * Date: 19 Feb 2014
 * Desc: a program that calculates a customer's bill
 *		 for a local cable company
 ***/
 
 import java.util.*;
 
 public class CableBill {
 	
 	public static void main(String[] args) {
 		
 		Scanner keyboard = new Scanner(System.in);
 		int preChannels,
 			serConnections;
 		double processingFee,
 			serviceFee,
 			channelFee,
 			bill;
 		char custCode;
 		
 		System.out.println("Please enter your account number:");
 		int accountNum = keyboard.nextInt();
 		System.out.println("Please enter your customer code:");
 		custCode = keyboard.next().charAt(0);
 		int userChoice= Character.getNumericValue(custCode);
 		
 		switch (userChoice) {
 			
 			case 11:
 				serviceFee = 75.00;
 				processingFee = 15.00;
 				channelFee = 50.00;
 				
 				System.out.println("Please enter the number of premium channels:");
 				preChannels = keyboard.nextInt();
 				System.out.println("Please enter the number of basic service connections:");
 				serConnections = keyboard.nextInt();

 				while(serConnections >= 11) {
 					serviceFee = 75.00 + (serConnections * 5.00);
 	 				bill = (preChannels * channelFee)
 	 						+ (serviceFee)
 	 						+ (processingFee);
 				}
 				
 				bill = (preChannels * channelFee)
 						+ (serviceFee)
 						+ (processingFee);
 				System.out.println("The cost of your cable bill is $" + bill);
 				break;
 				
 			case 27:
 				processingFee = 4.50;
 				serviceFee = 20.50;
 				channelFee = 7.50;
 				System.out.println("Please enter the number of premium channels:");
 				preChannels = keyboard.nextInt();
 				
 				bill = (preChannels * channelFee)
 						+ (serviceFee)
 						+ (processingFee);
 				System.out.println("The cost of your cable bill is $" + bill);
 				break;
 				
 			default:
 				System.out.println("Unknown customer code!");
 				break;
 		}//end of switch
 	}//end of main
 }//end of CableBill