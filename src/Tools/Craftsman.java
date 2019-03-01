package Tools;

public class Craftsman {

    public void build(Furniture furniture, Tool tool){
        System.out.println("With one tool");
        tool.build(furniture);
    }

    public void build(Furniture furniture, Tool tool1, Tool tool2){
        System.out.println("With two tools");
        tool1.build(furniture);
        tool2.build(furniture);
    }

}
