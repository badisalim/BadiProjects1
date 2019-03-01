package StudentsReader;

import W9_lecture.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    private FileReader reader = new FileReader();

    public List<Student> getStudent(String filePath) {

        return reader.asList(filePath).stream()
                .skip(1)
                .map(e -> e.replaceAll(",\\.", " "))
                //.map(e -> e.replaceAll("\\.", ""))
                .map(e -> e.split(";"))

                .map(columnes -> new Student(columnes[0], columnes[1],
                        Integer.valueOf(columnes[2]),Integer.valueOf(columnes[3]),Integer.valueOf(columnes[4])))
                //.flatMap(Stream::of)
                .collect(Collectors.toList());


    }
}


