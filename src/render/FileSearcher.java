package render;

import java.io.File;
import java.util.Scanner;

public class FileSearcher {

	public String run() {
		String startingLocation = System.getProperty("user.home");
		String currentLocation = "";
		String request = "";
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		while(running) {
			File folder = new File(startingLocation + currentLocation);
			if (folder.exists()) {
				System.out.println("CurrentLocation: " + startingLocation + currentLocation);
				File[] listOfFiles = folder.listFiles();
				if(request.contains(".noted")) {
			    	System.out.println("FOUND A FILE THAT IS A .NOTED FILE. YES!");
			    	break;
			    }
			    for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile() && !listOfFiles[i].getName().startsWith(".")) {
			        System.out.println("File " + listOfFiles[i].getName());
			      } else if (listOfFiles[i].isDirectory() && !listOfFiles[i].getName().startsWith(".")) {
			        System.out.println("Directory " + listOfFiles[i].getName());
			      }
			    }
			} else {
				System.out.println("That does not exist.");
			    if(request.contains(".noted")) {
			    	System.out.println("Do you want to create the file " + request + "?");
			    	request = scan.nextLine();
			    	if(request.toLowerCase().equals("yes") || request.toLowerCase().equals("y")) {
			    		currentLocation += "CNF";
			    		break;
			    	}
			    }
				currentLocation = currentLocation.substring(0, (currentLocation.length() - request.length() - 1));
			}
		    System.out.println("Where do you want to go?");
		    request = scan.nextLine();
		    if(request.equals("~")) {
		    	currentLocation = "";
		    } else {
		    	currentLocation += ("/" + request);
		    }
		}
		scan.close();
		return currentLocation;
	}
	
}
