package W4_lecture.datastructure;

import java.util.Optional;

public class StorageApplication {

    public static void main(String[] args) {
        Storage toolStorage = new Storage();

        ToolMaker toolMaker = new ToolMaker();
        toolMaker.fillStorage(toolStorage);

        Optional<Tool> tool = toolStorage.getTool("drill");
        if(tool.isPresent()){
            System.out.println("Start working with: " + tool.get().getName());
        } else {
            System.out.println("Oh no, I have got no tool");
        }
    }
}
