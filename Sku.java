import java.io.*;
import java.util.*; 
import java.math.*;


public class Sku implements Serializable {
    
    private String productCode;
    private String description;
    private BigDecimal price;
  
    public Sku() {
      
	productCode = "";
	description = "";
	price = BigDecimal.ZERO;
    }
  
    public Sku(String productCode, String description, BigDecimal price) {
      
	this.productCode = productCode;
	this.description = description;
	this.price = price;
    }
  
    /**
     * Parses a tab separated String in the format:
     * productCode\tdescription\tprice
     *
     * @return {@link Sku} built from the line
     */
    public static Sku parse(String line) {

	String[] seperated = line.split("\t");
	return (new Sku( seperated[0], seperated[1],
			 new BigDecimal(seperated[2])));
    }
  
    public String getProductCode() {
      
	return productCode;
    }
  
    public String getDescription() {
      
	return description;
    }
  
    public BigDecimal getPrice() {
      
	return price;
    }
  
    public void setProductCode(String productCode) {
      
	this.productCode = productCode;
    }
  
    public void setDescription(String description) {
      
	this.description = description;
    }
  
    public void setPrice(BigDecimal price) {
      
	this.price = price;
    }
  
    @Override
    public boolean equals(Object Other) {

	if( Other instanceof Sku)
	    if(productCode.equals(((Sku) Other).productCode) &&
	       description.equals(((Sku) Other).description) &&
	       price.equals(((Sku) Other).price))
		return true;
	    	
	return false;
    }
  
    @Override
    public int hashCode() {

	return 1;
    }
}
