public class ClassPayPal {

    private PaymentGateway payment;
    double qty;
    int PayPalNumber;

    public ClassPayPal(PaymentGateway payment, double qty, int payPalNumber) {
        this.payment = payment;
        this.qty = qty;
        PayPalNumber = payPalNumber;
    }

    public void Process() {
        payment.makePayment();
        System.out.println("Your payment method is Paypal number : "+ PayPalNumber);
        System.out.println("Total paid is: "+ qty);
    }


}

