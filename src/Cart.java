public class Cart {
    private static int count=0;
    private int cartId;
    private int productId;
    private int sellerId;
    private long price;
    private int quantity;
    private long totalamount;
    public Cart(int prodID,int sellid,long price,int quantity){
        this.cartId = count++;
        this.productId = prodID;
        this.sellerId = sellid;
        this.price=price;
        this.quantity=quantity;
        this.totalamount = price*quantity;
    }
    public int getCartId(){
        return this.cartId;
    }

    public int getProductId() {
        return productId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getTotalamount() {
        return totalamount;
    }
}
