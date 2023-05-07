package AnotherDecoratedPizzaExample;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return " Plain pizza ";
    }

    @Override
    public Integer getCost() {
        return 50;
    }
}
