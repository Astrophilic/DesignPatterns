package AnotherDecoratedPizzaExample;

public class Pepperoni extends PizzaDecorator{
    public Pepperoni(Pizza wrappedPizza) {
        super(wrappedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "added pepperoni";
    }

    @Override
    public Integer getCost() {
        return super.getCost()+10;
    }
}
