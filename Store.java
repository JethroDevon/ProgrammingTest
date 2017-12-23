import java.io.*;
import java.util.*; 
import java.math.*;


public class Store implements Serializable {
    
  private List<Sku> skus;
  
  public Store() {
    skus = new ArrayList<>();
  }
  
  public Store(List<Sku> skus) {
    this.skus = skus;
  }
  
  public List<Sku> getSkus() {
    return skus;
  }
  
  public void setSkus(List<Sku> skus) {
    this.skus = skus;
  }
  
  public void addSku(Sku sku) {
    skus.add(sku);
  }
  
  @Override
  public boolean equals(Object other) {


      return false;
  }
  
  @Override
  public int hashCode() {

      return 1;
  }
}
