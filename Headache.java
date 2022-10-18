public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Beans", 1.00);
        System.out.println(product1);
        Product product2 = new Product("Eggs", 1.25);

        Order myOrder = new Order(1, "18/10/22");
        myOrder.OrderItem(product1);
        myOrder.OrderItem(product2);

        System.out.println(myOrder.getOrderItemID(1));
        System.out.println(myOrder.getOrderItemPrice(1));


    }
}

// Split

//import java.time.*;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private int OrderNumber;
    private String DateOrdered;
    private ArrayList<Product> ProductArray = new ArrayList<>();
    private int NumberOfItemsOrdered = ProductArray.size();

    //LocalDateTime myDateObj = LocalDateTime.now();
    //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
    //private String DateOrdered = myDateObj.format(myFormatObj);

    public Order(int orderNumber, String dateOrdered){
        this.OrderNumber = orderNumber;
        this.DateOrdered = dateOrdered;
    }

    public void OrderItem(Product product){
        this.ProductArray.add(product);
    }

    public String getOrderItemID(int Index){
        Index -= 1;
        return ProductArray.get(Index).getProductID();
    }

    public double getOrderItemPrice(int Index){
        Index -= 1;
        return ProductArray.get(Index).getProdcutPrice();
    }


}

//Split

public class OrderStatus {
    private boolean HasShipped = false;

    public OrderStatus(boolean hasShipped){
        this.HasShipped = hasShipped;
    }

    public boolean getOrderStatus(){
        return HasShipped;
    }


}


//Split

public class Product {
    private String ProductID;
    private double ProdcutPrice;

    public Product(String productID, double productPrice){
        this.ProductID = productID;
        this.ProdcutPrice = productPrice;
    }

    public String getProductID(){
        return ProductID;
    }

    public double getProdcutPrice(){
        return ProdcutPrice;
    }
}
