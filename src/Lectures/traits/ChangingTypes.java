package Lectures.traits;

public class ChangingTypes {

    public static void main(String[] args) {
        Integer number = 7;
        System.out.println(number);

        Double decimalNumber = 4.2;
        System.out.println(decimalNumber);

        Double result = number + decimalNumber;
        System.out.println(result);
        // Integer result2 = number + decimalNumber; does not work
        // because Java does not want to be responsible for the loss of information
        // you must choose how you loose it instead (then you're responsible)

        Double decimal = new Double(number);
        System.out.println(decimal);

        double decimalResult = decimal + decimalNumber;
        System.out.println(decimalResult);

        String seven = number.toString();
        System.out.println(seven);

        Integer fiftySeven = Integer.valueOf("57");
        System.out.println(fiftySeven);

        Long zeroNumbers = Long.valueOf("57");
        System.out.println(Long.MAX_VALUE);
        System.out.println(zeroNumbers+3);
    }

}
