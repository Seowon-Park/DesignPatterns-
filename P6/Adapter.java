package P6;

public class Adapter implements NewPaymentProcessor{
    public void process(String userCardNumber, int totalAmount){
        OldPaymentGateway pay = new OldPaymentGateway();

        pay.makePayment(userCardNumber, totalAmount);
    }
}
