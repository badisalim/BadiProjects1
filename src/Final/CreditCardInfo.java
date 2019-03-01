package Final;

import java.time.LocalDate;
import java.util.Objects;

public class CreditCardInfo {

    private String paymentDate;
    private String cardNumber;
    private String paidAmount;

    public CreditCardInfo(String paymentDate, String cardNumber, String paidAmount) {
        this.paymentDate = paymentDate;
        this.cardNumber = cardNumber;
        this.paidAmount = paidAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public static void addCard(String paymentDate, String cardNubmber, String paidAmount) {
        new CreditCardInfo(paymentDate, cardNubmber, paidAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardInfo that = (CreditCardInfo) o;
        return Objects.equals(paymentDate, that.paymentDate) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(paidAmount, that.paidAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentDate, cardNumber, paidAmount);
    }


}
