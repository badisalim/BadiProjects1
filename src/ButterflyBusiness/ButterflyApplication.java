package ButterflyBusiness;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ButterflyApplication {

    public static void main(String[] args) {
        FileReader fileReader2 = new FileReader();
        AccountReader2 accountReader2 = new AccountReader2();

        List<String> accounts2 = fileReader2.asLines("ButterflyBusiness/buterfly-business.txt");
        accounts2.forEach(System.out::println);
        try (Stream<String> stream = Files.lines(Paths.get("/home/badi/Downloads/BadiProjects/src/ButterflyBusiness/buterfly-business.txt"))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
