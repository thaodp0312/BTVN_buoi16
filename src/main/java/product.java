import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class product {
int product_id;
String product_name;
int quantity;
double price;

    public product(int product_id, String product_name, int quantity, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return   product_id +"-"+
              product_name + "-" +
                quantity +"-"+
                price ;
    }
}

