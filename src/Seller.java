public class Seller {
    private static int count=1;
    private int sellerId;
    private String sellerName;
    private String sellerAddress;

    public Seller(String name,String address){
        this.sellerId = count++;
        this.sellerName = name;
        this.sellerAddress = address;
    }
    public int getSellerId(){
        return this.sellerId;
    }
    public String getSellerName(){
        return this.sellerName;
    }
    public String getSellerAddress(){
        return this.sellerAddress;
    }


}
