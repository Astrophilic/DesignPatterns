package AnotherDecoratedPizzaExample;

public class Mushrooms extends PizzaDecorator{
    @Override
    public String getDescription() {
        return super.getDescription() + "adding mushrooms";
    }

    @Override
    public Integer getCost() {
        return super.getCost()+2;
    }

    public Mushrooms(Pizza wrappedPizza) {
        super(wrappedPizza);
    }
}
