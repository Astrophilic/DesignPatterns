package DecoratorPattern;

public class BoldDecorator extends DecoratorBase {

    public BoldDecorator(DecoratorPattern.TextFormattingBase textFormattingBase) {
        super(textFormattingBase);
    }

    @Override
    public String getText() {
        String boldText=("<b>"+super.getText()+"</b>");
        return boldText;
    }
}
