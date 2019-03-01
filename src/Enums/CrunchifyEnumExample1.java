package Enums;

import java.util.Arrays;

public class CrunchifyEnumExample1 {
    public enum Company {
        EBAY("A", 10, 40), PAYPAL("B", 20, 10), GOOGLE("C", 30, 15), YAHOO("D", 40, 20), ATT("E", 50, 25);
        private String valueOf;
        private int value;
        private int value1;

        Company(String valueOf, int value1, int value) {
            this.valueOf = valueOf;
            this.value = value;
            this.value1 = value1;
        }
    }

    public static void main(String[] args) {
        for (Company cName : Company.values()) {

            System.out.println("Company Value: " + cName.value + "  Company String: " + cName.valueOf + " - Company Name: " + cName + "  Company value1: " + cName.value1);
        }
        System.out.println("Number of Companeis are: " + Company.values().length);
        System.out.println(Arrays.toString(EBAY1.Company.values()));
        System.out.println(Arrays.toString(WATSUP.Company2.values()));
    }
}
