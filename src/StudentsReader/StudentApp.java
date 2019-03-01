package StudentsReader;


public class StudentApp {

    public static void main(String[] args) {
        LevelSummeraizer levelSummeraizer = new LevelSummeraizer();
        System.out.println(levelSummeraizer.collect1());
        System.out.println("Parent education level appearances:");
        System.out.println(levelSummeraizer.parentLevel());
        System.out.println("Parent education level appearances:\");");

       // System.out.println(levelSummeraizer.student());
       // System.out.println(levelSummeraizer.student2());


    }
}
