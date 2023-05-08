package oasis;
import java.util.Scanner;
public class ATM {
	
	  private static Scanner scanner = new Scanner(System.in);
	  private static int balance = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to SBI Bank ATM");
	    
	    // Login
	    System.out.print("Enter your user id: ");
	    String userId = scanner.nextLine();
	    System.out.print("Enter your user pin: ");
	    String userPin = scanner.nextLine();
	    
	    // Check if the login credentials are valid
	    if (isValidLogin(userId, userPin)) {
	    
	      // Display the main menu
	      displayMenu();
	      
	    } else {
	      System.out.println("Invalid login credentials. Please try again.");
	    }
	    
	    scanner.close();
	  }
	  
	  private static boolean isValidLogin(String userId, String userPin) {
	    // Check if the login credentials are valid and return true or false accordingly
		  return true;
	  }
	  
	  private static void displayMenu() {
	  
	    while (true) {
	    	  System.out.println("Please select an option:");
	          System.out.println("1. Transactions History");
	          System.out.println("2. Withdraw");
	          System.out.println("3. Deposit");
	          System.out.println("4. Transfer");
	          System.out.println("5. Quit");
	          
	          int choice = scanner.nextInt();
	          
	          switch (choice) {
	            case 1:
	              displayTransactionsHistory();
	              break;
	            case 2:
	              withdraw();
	              break;
	            case 3:
	              deposit();
	              break;
	            case 4:
	              transfer();
	              break;
	            case 5:
	              quit();
	              break;
	            default:
	              System.out.println("Invalid choice. Please try again.");
	              break;
	          }
	          
	          // Add a delay before clearing the console
	          try {
	        	  Thread.sleep(2000);
	          } catch (InterruptedException e) {
	            e.printStackTrace();
	          }
	          
	          // Clear the console
	          System.out.print("\033[H\033[2J");
	          System.out.flush();
	          
	        }
	        
	      }
	      
	      private static void displayTransactionsHistory() {
	        // Code to display the transactions history
	      }
	      
	      private static void withdraw() {
	        // Code to withdraw money from the account
	      }
	      
	      private static void deposit() {
	        // Code to deposit money into the account
	      }
	      
	      private static void transfer() {
	        // Code to transfer money to another account
	      }
	      
	      private static void quit() {
	    	  System.out.println("Thank you for using XYZ Bank ATM");
	    	    System.exit(0);

	          }
	    


	}
