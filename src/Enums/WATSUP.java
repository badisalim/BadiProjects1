package Enums;

public class WATSUP {

    public enum Company2 {

        WATSUP("W", (5), (8));
        public String valueOf;
        public int value;
        public int value1;

        Company2(String valueOf, int value1, int value) {
            this.valueOf = valueOf;
            this.value = value;
            this.value1 = value1;
        }

        static {
            for (Company2 cName : Company2.values()) {
                System.out.println("Company Value: " + cName.value + "  Company String: " + cName.valueOf + " - Company Name: " + cName + "  Company value1: " + cName.value1);

            }
            System.out.println("Number of Companeis are: " + Company2.values().length);
        }
    }
}