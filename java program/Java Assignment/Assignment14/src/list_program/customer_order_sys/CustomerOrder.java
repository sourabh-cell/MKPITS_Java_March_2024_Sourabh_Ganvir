//Develop a customer order management system for a retail business. Each order should have properties such as
// `orderId`, `customerName`, `product`, `quantity`, and `orderDate`. Implement functionality to add new orders,
// update the quantity of an order, remove orders, and display all orders sorted by order date.

package list_program.customer_order_sys;

import java.time.LocalDate;

public class CustomerOrder implements Comparable<CustomerOrder> {
    private int order_id;
    private String name;
    private String product;
    private int quantity;
    private String date;

    public CustomerOrder(int order_id, String name, String product, int quantity, String date) {
        this.order_id = order_id;
        this.name = name;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }

    //implement Comparable interface and override method for sorting
    @Override
    public int compareTo(CustomerOrder o)
    {
        return this.date.compareTo(o.getDate());
    }

    //Override toString Method for printing object

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "order_id=" + order_id +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", date='" + date + '\'' +
                '}';
    }
}
