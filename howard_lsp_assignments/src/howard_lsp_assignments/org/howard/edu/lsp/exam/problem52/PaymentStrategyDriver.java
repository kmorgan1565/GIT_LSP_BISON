package howard_lsp_assignments.org.howard.edu.lsp.exam.problem52;


public class PaymentStrategyDriver {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");


        ShoppingCart cart = new ShoppingCart();
 
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50.0);

        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}
