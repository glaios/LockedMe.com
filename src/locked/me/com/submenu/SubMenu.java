package locked.me.com.submenu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SubMenu {

	public static void SubMenu() {
		File file = new File("D:\\LockedMe.com App Files");
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
                String fileNameToAdd = scanner.next();
                String filePathToAdd = file.getPath()+"\\"+fileNameToAdd;
                File fileToAdd = new File(filePathToAdd);
                	                  
                if(fileToAdd.exists()) {
               	 System.out.println("The file " +fileNameToAdd+ " already exists!");
               	 System.out.println();
               
                } else { 
               	 try {
               		 fileToAdd.createNewFile();
               		 System.out.println("The file " +fileNameToAdd+ " has been added!");
	                	 System.out.println();
					} catch (IOException e) {
						e.printStackTrace();
					}
               	
                }
                break;
	            case 2:
	            	  scanner.nextLine();
	                  System.out.print("Please enter the file name you would like to delete: ");
	                  System.out.println();
	                  String fileNameToDel = scanner.next();
		              String filePathToDel = file.getPath()+"\\"+fileNameToDel;
	                  File fileToDelete = new File(filePathToDel);
	                  	                     
	                  if (fileToDelete.exists()) {
	                	  fileToDelete.delete();
	                      System.out.println("The file " +fileNameToDel+ " has been deleted!");
	                      System.out.println();
	                  } else {
	                      System.out.println("File " + fileNameToDel + " not found!");
	                      System.out.println();
	                  }
	                  break;
	                  
	            case 3:
	            	scanner.nextLine();
	            	System.out.println("Please enter the file you would like to search for: ");
	            	System.out.println();
	            	String fileNameToSearch = scanner.next();
	            	String filePathToSearch = file.getPath()+"\\"+fileNameToSearch;
	            	File fileToSearch = new File(filePathToSearch);
	            	File [] files = file.listFiles();
	            	
	            	if (files.length == 0) {
	            		System.out.println("There are no files in the folder! You could Add some if you please!");
	            		System.out.println();
	            	} else if (fileToSearch.exists()) {
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