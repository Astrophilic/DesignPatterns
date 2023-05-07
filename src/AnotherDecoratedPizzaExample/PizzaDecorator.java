package AnotherDecoratedPizzaExample;

public abstract class PizzaDecorator implements Pizza{
    private Pizza wrappedPizza;

    public PizzaDecorator(Pizza wrappedPizza) {
        this.wrappedPizza = wrappedPizza;
    }

    @Override
    public String getDescription() {
        return this.wrappedPizza.getDescription();
    }

    @Override
    public Integer getCost() {
        return this.wrappedPizza.getCost();
    }
}
