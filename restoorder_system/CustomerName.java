/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restoorder_system;

/**
 *
 * @author Jericho
 */
public class CustomerName {
      private String name;
    private Order order;

    public CustomerName(String name) {
        this.name = name;
        this.order = new Order();
    }

    public void addItemToOrder(Menu item) {
        order.addItem(item);
    }

    public double getTotalOrderPrice() {
        return order.getTotal();
    }

    public String getName() {
        return name;
    }

}



