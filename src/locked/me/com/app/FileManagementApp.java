package locked.me.com.app;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import locked.me.com.submenu.*;
import locked.me.com.mainmenu.*;

public class FileManagementApp {

	public static void main(String[] args) {
		File file = new File("D:\\LockedMe.com App Files");
		Scanner scanner = new Scanner(System.in);
		int choice;
		   	      
	       
	       do {
	           MainMenu.MainMenu();
	           try {
	           choice = scanner.nextInt();
	           } catch (Exception e) {
	           	choice = -1;
	           	scanner.nextLine();
	           }
	           
	           switch (choice) {
	           case 1:
            	   String allFiles[] = file.list();
            	   Arrays.sort(allFiles);
            	   System.out.println("The list of files in ascending order is the following:");
            	   
            	   if (allFiles.length > 0) {
            		   for(String name:allFiles) {
            			   System.out.println();
            			   System.out.println(name);
            		   
            		   }  
            		   
            	   } else {
            		   System.out.println("There are no files in the folder! You could add some if you please!");
            	   }
            	   System.out.println();
            	   break;
                   
	           case 2:
	               SubMenu.SubMenu();
	               break;
	           case 3:
	               System.out.println("Exiting the program.");
	               System.out.println("See you next time.");
	               break;
	           default:
	               System.out.println("Invalid choice. Please select again.");
	               System.out.println();
	           }
	       } while (choice != 3);
	      
	       scanner.close();
	}
	
	
	
}