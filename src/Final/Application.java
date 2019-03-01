package Final;

import Final.CreditCards.*;

import java.util.ArrayList;
import java.util.List;
mm
public class Application {


    public static void main(String[] args) {
        AccountReader reader = new AccountReader();
        List<Account> accounts = reader.read("/home/badi/Downloads/BadiProjects/src/Final/buterfly-business.txt");
        List<CreditCardInfo> creditCardInfos = getInfos(accounts);
        displayInfos(creditCardInfos);


    }

    public static void displayInfos(List<CreditCardInfo> creditCardInfos) {

        for (CreditCardInfo creditCardInfo : creditCardInfos) {

            Long number = Long.parseLong(creditCardInfo.getCardNumber().replace(" ", ""));



            System.out.println(number + " is " + (AmericanExpress.isValid(number) ? "AmericanExpress valid" : "AmericanExpress invalid"));

            System.out.println(number + " is " + (MasterCard.isValid(number) ? "Master valid" : "Master invalid"));

            System.out.println(number + " is " + (DiscoverCards.isValid(number) ? "Discover valid" : "Discover invalid"));

            System.out.println(number + " is " + (VisaElectron.isValid(number) ? "Visa Electron valid" : "Visa Electron invalid"));

            System.out.println(number + " is " + (Visa.isValid(number) ? "Visa valid" : "Visa invalid"));
            System.out.println(number + " is " + (Maestro.isValid(number) ? "Maestro valid" : "Maestro invalid"));

            System.out.println(number + " is " + (InstaPayment.isValid(number) ? "InstaPayment valid" : "InstaPayment invalid"));

            System.out.println("-----------------------------------------");


            System.out.println("sumOfDoubleEvenPlace: " + CreditCard.sumOfDoubleEvenPlace(number));
            System.out.println("sumOfOddPlace: " + CreditCard.sumOfOddPlace(number));
            System.out.println("totalSum: " + (CreditCard.sumOfOddPlace(number) + CreditCard.sumOfDoubleEvenPlace(number)));

        }
    }


    public static List<CreditCardInfo> getInfos(List<Account> accounts) {

        List<CreditCardInfo> creditCardInfos = new ArrayList<>();

        for (Account account : accounts) {
            String card = account.toString().replace("99", "-").replace("88", " ").replace("77", ".").replace(",", "");

            String[] elements = card.split("   ");

            String paymentDate = elements[0].replace("\"", "");

            String cardNumber = elements[1];

            String amount = elements[2];

            creditCardInfos.add(new CreditCardInfo(paymentDate, cardNumber, amount));


        }

        return creditCardInfos;
    }
}
