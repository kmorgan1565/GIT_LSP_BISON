package howard_lsp_assignments.org.howard.edu.lsp.exam.problem52;


class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account " + emailAddress);
    }
}