package Ikea;

public class AddLeg implements Step {

    @Override
    public void perform(Chair chair) {
        System.out.println("Adding one leg...");
        Integer legs = chair.getLegs();
        chair.setLegs(legs + 1);
    }
}
