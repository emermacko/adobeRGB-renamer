import java.io.File;

public class UnderscoreChange {
	
/*
	Launching: java -jar UnderscoreChange.jar "dirPath"
	
	######################################################################################################################

	Computer\HKEY_CLASSES_ROOT\Directory\shell\
	
	>new key
		AdobeRGB
		>new key
			command
				>(Default)
					...\AdobeRGB.exe" "%1"

*/
		
	public static void main(String[] args) {
	    try {
	    	String folderPath = args[0];	// take command line 1st argument as folder path
	    	File dir = new File(folderPath);
			
		    if (dir.isDirectory()) {	// make sure it's a directory
		        for (final File f : dir.listFiles()) {		// check every file in folder
		        	
		        	String fileName = f.getName();
		        	
		        	String newName = "";
		        	if(fileName.charAt(1) == 'M')	newName = "IMG_";		// for canon 
		        	if(fileName.charAt(3) == 'F')	newName = "DSCF";		// for fuji
		        	if(fileName.charAt(3) == 'C')	newName = "DSC";		// for nikon & sony
		   
		            try {
		            	if(fileName.charAt(0) == '_'){		// apply only to AdobeRGB files
		            		
		            		for(int i=4; i<fileName.length(); i++) {
		            			newName += fileName.charAt(i);
		            		}
		            		
		            		File newfile = new File(folderPath + "\\" + newName);		// actual renaming
			                
		            		// debugging
		            		System.out.println();
			                if(f.renameTo(newfile)){
			                    System.out.println("Rename succesful: " + fileName + " > " + newName);
			                } else {
			                    System.out.println("Rename failed");
			                }
		            	}
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    }
	    }
	    catch (ArrayIndexOutOfBoundsException e){
	        System.out.println("No arguments provided");	// if folder path is not specified
	    }
	}
}
