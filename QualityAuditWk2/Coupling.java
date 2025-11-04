/* This is an Example of High Coupling in Java
 * This creates Direct Dependencies 
 * Here, a Payment object has been created WITHIN 
 * the Order Class
 * Making Order TIGHTLY COUPLED to Payment
 * To make modifications to Payment, you need to modify ORDER
 * Any change in Payment also impacts a change in ORDER
 */

class Payment{
    int PaidPrice;
    void process(){
        System.out.println("Here is some process");
    }
}


class Order {
    Payment payment = new Payment();

    void processOrder() {
        payment.process(); // Direct dependency
    }
}

class Coupling{
    public static void main(String[] args) {
        Order ord = new Order();
        ord.processOrder();
    }
}