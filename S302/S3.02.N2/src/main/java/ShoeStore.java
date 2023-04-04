public class ShoeStore {

    public static void main(String[] args) {
        // create payment method class implements from Interface
        class PaymentMethod implements PaymentGateway{

            @Override
            public void makePayment() {
                System.out.println("Payment is done");
            }
        }

        //instance of payments methods
        PaymentMethod payment1 = new PaymentMethod();
        PaymentMethod payment2 = new PaymentMethod();
        PaymentMethod payment3 = new PaymentMethod();

        //assign payments to each class
        ClassVisa visaPayment = new ClassVisa(payment1,50,345345345);
        ClassPayPal payPalPayment = new ClassPayPal(payment2,100,45645645);
        ClassBankTransfer transferPayment = new ClassBankTransfer(payment3,85,6969696);

        //call to method Process
        visaPayment.Process();
        payPalPayment.Process();
        transferPayment.Process();


    }
}
