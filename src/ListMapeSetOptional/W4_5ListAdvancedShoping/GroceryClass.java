package ListMapeSetOptional.W4_5ListAdvancedShoping;

public class GroceryClass {

    private String name;

    public GroceryClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name;


    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GroceryClass that = (GroceryClass) o;
//        return Objects.equals(name, that.name);
    }




