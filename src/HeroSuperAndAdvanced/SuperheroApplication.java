package HeroSuperAndAdvanced;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {

    SuperheroCaller superheroCaller=new SuperheroCaller();

           System.out.println("Superhero: "+superheroCaller.call().getName());
        List<Superhero>superheroes=new ArrayList<>();

        for (int times = 0; times <6 ; times++) {
            Integer number=times+1;

            superheroes.add(superheroCaller.call());
            System.out.println("superhero:"+number+" "+superheroCaller.call().getName());

        }
        System.out.println(superheroes.size());


        }
    }
