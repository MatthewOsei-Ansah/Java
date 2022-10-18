package com.company;

public class Main {

    public static void main(String[] args) {
	Product myProduct = new Product("Beans", 1.00);
    System.out.println(myProduct);
    }
}

//Split

package com.company;

//import java.time.*;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private String OrderNumber;
    private String DateOrdered;
    private ArrayList<String> ProductArray = new ArrayList<>();
    private int NumberOfItemsOrdered = ProductArray.size();

    //LocalDateTime myDateObj = LocalDateTime.now();
    //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
    //private String DateOrdered = myDateObj.format(myFormatObj);

    public Order(String orderNumber, String dateOrdered){
        this.OrderNumber = orderNumber;
        this.DateOrdered = dateOrdered;
    }

    public void OrderItem(String Product){
        this.ProductArray.add(Product);
    }

}


//Split

package com.company;

public class OrderStatus {
    private boolean HasShipped;

    public OrderStatus(boolean hasShipped){
        this.HasShipped = hasShipped;
    }

    public boolean getOrderStatus(){
        return HasShipped;
    }


}

//Split

package com.company;

public class Product {
    private String ProductID;
    private double ProdcutPrice;

    public Product(String productID, double productPrice){
        this.ProductID = productID;
        this.ProdcutPrice = productPrice;
    }
}
