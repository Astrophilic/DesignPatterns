package AnotherDecoratedPizzaExample;

import PizzaDecoratorExample.BasePizza;
import PizzaDecoratorExample.DecoratedPizza;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }


    @Override
    public Integer getCost() {
        return super.getCost() +2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "added cheese topping";
    }
}
