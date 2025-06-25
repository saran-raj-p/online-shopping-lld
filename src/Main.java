import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Product> productmap = new HashMap<>();
        HashMap<Integer,Seller> sellermap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Options \n 1.Add Products \n 2.show products \n 3.Add Sellers \n 4.show Sellers \n 5.Add Stock \n 6.Show Stock \n 0.Exit \n");
            int n = sc.nextInt();
            if(n!=0) {

                switch (n) {
                    case 1:
                        System.out.println("Enter ProductName:");
                        String prodName = sc.next();
                        System.out.println("Enter ProductDescription:");
                        String prodDescription = sc.next();
                        System.out.println("Enter ProductManufacturer:");
                        String prodManufacturer = sc.next();
                        Product product = new Product(prodName, prodDescription, prodManufacturer);
                        productmap.put(product.getProductId(), product);
                        System.out.println("Product Added");
                        break;
                    case 2:
                        if(productmap.isEmpty()){
                            System.out.println("No Product Found");
                            break;
                        }
                        System.out.println("ProductId \t ProductName \t Description \t Manufacturer");
                        for (Map.Entry<Integer, Product> prod : productmap.entrySet()) {
                            Product temp = prod.getValue();
                            System.out.println(prod.getKey() + " \t" + temp.getProductName() + " \t" + temp.getProductDescription() + " \t" + temp.getManufacturer());
                        }
                        break;
                    case 3:
                        System.out.println("Enter The Seller:");
                        String sellerName = sc.next();
                        System.out.println("Enter The Address");
                        String sellerAddress = sc.next();
                        Seller tempseller = new Seller(sellerName,sellerAddress);
                        sellermap.put(tempseller.getSellerId(),tempseller);
                        System.out.println("Sellers Added");
                        break;

                    case 4:
                        if(sellermap.isEmpty()){
                            break;
                        }
                        System.out.println("SellerId \t SellerName \t Address ");
                        for(Map.Entry<Integer,Seller> sellers:sellermap.entrySet()){
                            Seller seller = sellers.getValue();
                            System.out.println(seller.getSellerId()+" \t"+seller.getSellerName()+" \t"+seller.getSellerAddress());
                        }
                        break;

                    case 5:
                        System.out.println("Enter the ProductId:");
                        int prodId = sc.nextInt();
                        System.out.println("Enter the sellersId:");
                        int sellersId = sc.nextInt();
                        System.out.println("Enter the Quantity");
                        int prodQuantity = sc.nextInt();
                        System.out.println("Enter the Price");
                        long price = sc.nextInt();
                        productmap.get(prodId).addStocks(sellersId,prodQuantity,price);
                        System.out.println("Stocks Added");
                        break;

                    case 6:

                        for(Map.Entry<Integer, Product> i:productmap.entrySet()){
                            System.out.printf("ProductId:%d",i.getKey());
                            System.out.println(" \n SellerId \t Quantity \t Price");
                            i.getValue().showStocks();
                            System.out.println();
                        }
                        break;
                    default:
                        break;
                }
            }
            else {
                System.out.println("Exiting System");
                break;
            }
        }
    }
}