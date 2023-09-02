package OOP2_test;

/**
 * ClassName: Order
 * Package: OOP2_test
 * Description:
 *    equals方法的重写和判断
 *
 * @Author: Hjr
 * @Create 2023/5/26 16:44
 * @Version 1.0
 */
public class Order {
    int orderId;
    String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    //手写equals

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order) obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}
