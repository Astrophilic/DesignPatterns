package DecoratorPattern;

public class DecoratorBase extends TextFormattingBase{

    private final TextFormattingBase textFormattingBase;

    public DecoratorBase(TextFormattingBase textFormattingBase) {
        this.textFormattingBase = textFormattingBase;
    }

    @Override
    public void printFormattedText() {
        this.textFormattingBase.printFormattedText();
    }

    @Override
    public String getText() {
        return this.textFormattingBase.getText();
    }
}
