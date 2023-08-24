package locked.me.com.app;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import locked.me.com.submenu.*;
import locked.me.com.mainmenu.*;

public class FileManagementApp {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    int choice;
		    LinkedList<String> fileList = new LinkedList<>();
	      
	       
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
	               	  listFilesAscending(fileList);
	                     break;
	               case 2:
	                   SubMenu.SubMenu(fileList);
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
	
	

		public static void listFilesAscending(LinkedList<String> fileList) {
		    if (fileList.isEmpty()) {
		    	System.out.println();
		        System.out.println("There is no files added yet.");
		        System.out.println();
		        return;
		    }
		
		    LinkedList<String> sortedList = new LinkedList<>(fileList);
		    Collections.sort(sortedList);
		    System.out.println();
		    System.out.println("Files in ascending order:");
		    System.out.println();
		    for (String fileName : sortedList) {
		    	System.out.println(fileName);
		        System.out.println();
		    }
		}

}