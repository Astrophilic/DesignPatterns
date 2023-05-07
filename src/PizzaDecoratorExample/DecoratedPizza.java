package PizzaDecoratorExample;


public abstract class DecoratedPizza implements BasePizza {
    BasePizza wrappedPizza;

    public DecoratedPizza(BasePizza pizza) {
        this.wrappedPizza = pizza;
    }

    @Override
    public Integer getCost() {
        return this.wrappedPizza.getCost();
    }
}
