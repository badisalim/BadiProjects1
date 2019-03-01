package Robodog;

import java.util.List;

public class App {


    private static Summarizer summerizar = new Summarizer();

    public static void main(String[] args) {
        String filePath = "Robodog/robodog.txt";
        List<String> tricks = summerizar.findUniqueTricks(filePath);
        System.out.println(tricks);
    }

}

