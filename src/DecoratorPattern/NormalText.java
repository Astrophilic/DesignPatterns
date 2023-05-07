package DecoratorPattern;

public class NormalText extends TextFormattingBase {

    private final String text;

    public NormalText(String text) {
        this.text = text;
    }


    @Override
    public void printFormattedText() {
        System.out.println("printing normal text "+this.text);
    }

    @Override
    public String getText() {
        return this.text;
    }
}
