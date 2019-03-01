package Enums;

public class EBAY1 {
    public enum Company {
        EBAY("a", 1, 30), PAYPAL("b", 2, 50), GOOGLE("c", 3, 70), YAHOO("d", 4, 80), ATT("e", 5, 90);
        public String valueOf;
        public int value;
        public int value1;

        Company(String valueOf, int value1, int value) {
            this.valueOf = valueOf;
            this.value = value;
            this.value1 = value1;
        }

        static {
            for (Company cName : Company.values()) {
                System.out.println("Company Value: " + cName.value + "  Company String: " + cName.valueOf + " - Company Name: " + cName + "  Company value1: " + cName.value1);

            }
            System.out.println("Number of Companeis are: " + Company.values().length);

        }
    }
}

