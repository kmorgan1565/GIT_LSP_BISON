package howard_lsp_assignments.org.howard.edu.lsp.exam.problem52;

class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
    }
}
