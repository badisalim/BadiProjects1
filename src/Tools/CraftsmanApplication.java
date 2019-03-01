package Tools;

public class CraftsmanApplication {

    public static void main(String[] args) {
        Furniture table = new Furniture("Table");
        Craftsman craftsman = new Craftsman();

        Hammer hammer = new Hammer();
        Tool screwDriver = new ScrewDriver();

        craftsman.build(table, hammer);
        craftsman.build(table, screwDriver);
        craftsman.build(table, hammer);

        craftsman.build(table, hammer, screwDriver);
    }

}
