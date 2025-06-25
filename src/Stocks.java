public class Stocks {
    private int sellerId;
    private int quantity;
    private long price;

    public Stocks(int sellerId,int quantity,long price){
        this.sellerId = sellerId;
        this.quantity = quantity;
        this.price = price;
    }
    public int getSellerId(){
        return this.sellerId;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public long getPrice(){
        return this.price;
    }

    public void Decrease(int count){
        this.quantity -=count;
    }
    public void Increase(int count){
        this.quantity += count;
    }

}
