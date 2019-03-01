package CreditCardBadi;

import java.util.Scanner;

public class CardApplication {

    public static void main(String args[]) {
        Scanner scanner = new Scanner((System.in));
        System.out.println(" input number");
        long number = scanner.nextLong();

        // if (Visa.isValid(number)) {
        System.out.println(number + " is " + (Visa.isValid(number) ? "Visa valid" : "Visa invalid"));
        //} else ;
        // if (AmericanExpress.isValid(number)) {
        System.out.println(number + " is " + (AmericanExpress.isValid(number) ? "American valid" : "American invalid"));
        // } else ;
        //  if (MasterCard.isValid(number)) {
        System.out.println(number + " is " + (MasterCard.isValid(number) ? "Master valid" : "Master invalid"));

        System.out.println(number + " is " + (DiscoverCards.isValid(number) ? "Discover valid" : "Discover invalid"));
        System.out.println("sumOfDoubleEvenPlace: "+CreditCard.sumOfDoubleEvenPlace(number));
        System.out.println("sumOfOddPlace: "+CreditCard.sumOfOddPlace(number));
        System.out.println("totalSum: "+(CreditCard.sumOfOddPlace(number)+CreditCard.sumOfDoubleEvenPlace(number)));

    }
}

//        long numberAmericanValid=379354508162306;
//        long numberAmericanInvalid=379354508162307;
//        long numberMasterValid=5196081888500645;
//        long numberMasterInvalid=5196081888500646;
//        long numberVisaValid=4388576018410707;
//        long numberVisaInvalid=4388576018402626;
//        long numberDiscoverValid=6011000593748746;
//        long numberDiscoverValid=6700601047639225401;
//        long numberDiscoverInvalid=6011000593748745;
