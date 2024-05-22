package static_counter_implementation;

public class Product {

    private String product_name;
    private int product_id;
    public static int count=0;

    public Product(){
    }

    public Product(String product_name,int product_id){
        this.product_name = product_name;
        this.product_id=product_id;
        count++;

    }

}
