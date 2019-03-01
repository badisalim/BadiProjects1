package StudentsReader;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LevelSummeraizer {

    private StudentReader reader = new StudentReader();
    private List<Student> students = reader.getStudent("W10_ex2/students-performance.csv");

    public Map<Integer, Set<String>> collect1() {
        return
                students.stream()

                        .map(student -> student.getParentLevel())
                        //.limit(6)
                        .collect(Collectors.groupingBy(e -> e.length(), Collectors.toSet()));

    }


    public List<String> parentLevel() {
        List<String> collect = students.stream()
                .map(student -> student.getParentLevel())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
               // .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                //.sorted()
                .collect(Collectors.toList());
        return collect;

    }



}


//    protected static List<String> parentLevel(List<Student> students) {
//
//        return students
//                .stream()
//                .collect((Collectors.groupingBy(Student::getParentLevel, Collectors.counting()))
//                .entrySet ()
//                .stream ()
//                .map (e -> e.getKey() + " | " + e.getValue())
//                .collect (Collectors.toList());
//
//    }
//        protected static Long collect(List<Student> students){...}


