import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Product {
    private static int count=1;
    private int productId;
    private String productName;
    private String productDescription;
    private String Manufacturer;
    private  HashMap<Integer,Stocks> stocks;

    public Product(String name,String productDescription,String manufacturer){
        this.productId = count++;
        this.productName=name;
        this.productDescription=productDescription;
        this.Manufacturer = manufacturer;
        this.stocks= new HashMap<>();
    }
    public int getProductId(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }
    public String getProductDescription(){
        return this.productDescription;
    }
    public String getManufacturer(){
        return this.Manufacturer;
    }
    public void addStocks(int sellerId,int quantity,long price){
        Stocks stock = new Stocks(sellerId,quantity,price);
        stocks.put(sellerId,stock);
    }
    public void showStocks(){

        for (Map.Entry<Integer, Stocks> st:this.stocks.entrySet()){
            Stocks temp = st.getValue();
            System.out.println(this.getProductId()+" \t"+temp.getSellerId()+" \t"+ temp.getQuantity()+" \t"+ temp.getPrice());
        }

    }

}
