package WEEK1.Design_principles_patterns.Exercise8;
public class PaypalPayment implements PaymentStrategy {
  private String email;
  public PaypalPayment(String email)
  {
    this.email=email;
  }
  public void pay(double amount)
  {
            System.out.println("Paid ₹" + amount + " using PayPal account: " + email);

  }
}
