/* This is an example of loose coupling which is
 * a good programming practice.
 * Instead of directly creating a payment OBJECT
 * the Order class accepts a paymentService interface 
 * as a dependency
 * This allows order to use any implementation of Payment Service
 */
class Order{
    private PaymentService paymentService;

    Order(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    void processOrder(){
        paymentService.process();
    }
}
 public class Coupling2 {
    public static void main(String[] args) {
        // A few example implementations in PaymentService interface:
        new Order(new CreditCardPayment());
        new Order(new PayPalPayment());
    }
}
