package DecoratorPattern;

public class ItalicDecorator extends DecoratorBase{

    public ItalicDecorator(TextFormattingBase textFormattingBase) {
        super(textFormattingBase);
         }


    @Override
    public void printFormattedText() {
        System.out.println("italic text");
    }

    @Override
    public String getText() {
        String italic  = "<i>"+super.getText()+"</i>";
        return italic;
    }
}
