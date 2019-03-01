package Ikea;

public class AddSeat implements Step {

    @Override
    public void perform(Chair chair) {
        System.out.println("Adding the seat");
        chair.setSeat(true);
    }
}
