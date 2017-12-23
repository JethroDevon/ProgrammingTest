import java.io.*;
import java.util.*; 
import java.math.*;

public class Application {
    
    public static void main(String[] args) {
      
	if(args.length != 1) {

	    System.out.println("Bad arguments - quiting");
	    return;
	}
    
	File skuFile = new File(args[0]);

	try{
	
	    if(skuFile.exists() && skuFile.canRead()) {
	
		List<Sku> skus = new ArrayList<>();
		FileReader fileReader = new FileReader(skuFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		boolean firstline = true;

		while ((line = bufferedReader.readLine()) != null) {

		    if(!firstline){

			String[] items;
			items = line.split("\\s+");
			skus.add(new Sku( items[0], items[1],
					  new BigDecimal(items[2]) ));
		    }
	  
		    firstline = false;
		}
      
		fileReader.close();
		Store store = new Store();
		store.setSkus(skus);
	    } else {

		System.out.println("File does not exist or is not readable");
	    }

	}catch(Exception e){

	    System.out.println( "Error parsing file");
	}
    }
}
