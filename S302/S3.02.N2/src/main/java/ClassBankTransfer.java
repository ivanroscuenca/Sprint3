public class ClassBankTransfer {

    private PaymentGateway payment;
    double qty;
    int accountNumber;

    public ClassBankTransfer(PaymentGateway payment, double qty, int accountNumber) {
        this.payment = payment;
        this.qty = qty;
        this.accountNumber = accountNumber;
    }

    public void Process() {
        payment.makePayment();
        System.out.println("Your payment method is bank transfer, number : "+ accountNumber);
        System.out.println("Total paid is: "+ qty);
    }


}

