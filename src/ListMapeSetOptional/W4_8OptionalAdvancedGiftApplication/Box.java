package ListMapeSetOptional.W4_8OptionalAdvancedGiftApplication;

public class Box {

    private String content;

    public String getContent() {
        return content;
    }

    public Box(String content) {
        this.content = content;


    }

    @Override
    public String toString() {
        return "content='" + content;
    }
}
