package locked.me.com.submenu;

import java.util.LinkedList;
import java.util.Scanner;

public class SubMenu {

	public static void SubMenu(LinkedList<String> fileList) {
		Scanner scanner = new Scanner(System.in);
		int choice;
    

	    do {
	        System.out.println("File Manager Menu");
	        System.out.println("1. If you would like to Add a File");
	        System.out.println("2. If you would like to Delete a File");
	        System.out.println("3. If you would like to Search for a File");
	        System.out.println("4. If you would like to go Back to the Main Menu");
	        System.out.println();
	        System.out.print("Please enter your choice: ");
	        System.out.println();
	        try {
	        choice = scanner.nextInt();
	        } catch (Exception e) {
	        	choice = -1;
	        	scanner.nextLine();
	        }
	      
	
	        switch (choice) {
	            case 1:
	            	 scanner.nextLine();
	                 System.out.print("Please enter the file name you would like to add: ");
	                 System.out.println();
	                 String fileToAdd = scanner.nextLine();
	                 	                  
	                 if (fileList.contains(fileToAdd)) {
	                	 System.out.println("The file " +fileToAdd+ " already exists!");
	                	 System.out.println();
	                
	                 } else { 
	                	 fileList.add(fileToAdd);
	                	 System.out.println("The file " +fileToAdd+ " has been added!");
	                	 System.out.println();
	                 }
	                 break;
	            case 2:
	            	  scanner.nextLine();
	                  System.out.print("Please enter the file name you would like to delete: ");
	                  System.out.println();
	                  String fileToDelete = scanner.nextLine();
	                  	                     
	                  if (fileList.remove(fileToDelete)) {
	                      System.out.println("The file " +fileToDelete+ " has been deleted!");
	                      System.out.println();
	                  } else {
	                      System.out.println("File " + fileToDelete + " not found!");
	                      System.out.println();
	                  }
	                  break;
	                  
	            case 3:
	            	scanner.nextLine();
	            	System.out.println("Please enter the file you would like to search for: ");
	            	System.out.println();
	            	String fileToSearch = scanner.next();
	            	if (fileList.isEmpty()) {
	            		System.out.println("There no files in the list! You could Add some if you please!");
	            		System.out.println();
	            	} else if  (fileList.contains(fileToSearch)) {
	            		System.out.println("File "+fileToSearch+ " found!");
	            		System.out.println();
	            	} else {
	            		System.out.println("File "+fileToSearch+ " not found!");
	            		System.out.println();
	            	}
	            	break;	
	            case 4:
	                System.out.println("Returning to the main menu.");
	                System.out.println();
	                break;
	            default:
	                System.out.println("Invalid choice. Please select again.");
	                System.out.println();
	        	}  
	        } while (choice != 4);
	    	
	    }         
	         
}