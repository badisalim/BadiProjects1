package Developers;

public class DeveloperApplication {

    public static void main(String[] args) {
        Problem problem = new Problem();

        FrontEndSkills feSkills = new FrontEndSkills();
        FullStackSkills fsSkills = new FullStackSkills();
        BackEndSkills beSkills = new BackEndSkills();

        Developer feDeveloper = new Developer(feSkills);
        feDeveloper.solve(problem);

        Developer beDeveloper = new Developer(beSkills);
        beDeveloper.solve(problem);

        Developer fsDeveloper = new Developer(fsSkills);
        fsDeveloper.solve(problem);

        Developer awesomeDeveloper = new Developer();
        awesomeDeveloper.solve(problem, feSkills);
        awesomeDeveloper.solve(problem, beSkills);
        awesomeDeveloper.solve(problem, fsSkills);
    }

}
