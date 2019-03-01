package Familly;

public class FamilyApplication {

    public static void main(String[] args) {
        Grandma grandma = new Grandma();
        Mom mom = new Mom();
        Samantha samantha = new Samantha();

        System.out.println("-- Grandma -- ");
        grandma.bake();

        System.out.println("-- Mom -- ");
        mom.bake();
        mom.drive();


        System.out.println("-- Samantha -- ");
        samantha.bake();
        samantha.drive();
        samantha.text();
    }

}
