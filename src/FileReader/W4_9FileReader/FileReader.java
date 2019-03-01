package FileReader.W4_9FileReader;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader extends W9_lecture.reader.FileReader {

    public List<String> asLines(String filePath){
        return getString(filePath);
    }

    public static List<String> getString(String filePath) {
        try {
            URI uri= ClassLoader.getSystemResource(filePath).toURI();
            Path path = Paths.get(uri);
            return Files.readAllLines(path);

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}