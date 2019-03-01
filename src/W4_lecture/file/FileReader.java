package W4_lecture.file;

import java.util.List;

import static W4_9FileReader.FileReader.getString;

public class FileReader {

    public List<String> getLines(String filePath){
        return getString(filePath);
    }

}
