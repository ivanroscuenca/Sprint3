public class ClassVisa {

    private PaymentGateway payment;
    double qty;
    int visaNumber;


    public ClassVisa(PaymentGateway payment, double qty, int visaNumber) {
        this.payment = payment;
        this.qty = qty;
        this.visaNumber = visaNumber;
    }


    public void Process() {
        payment.makePayment();
        System.out.println("Your payment method is Visa number : "+ visaNumber);
        System.out.println("Total paid is: "+ qty);
    }


}

