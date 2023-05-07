package PizzaDecoratorExample;

public class CheeseTopping extends DecoratedPizza{

    public CheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public Integer getCost() {
        System.out.println("Adding cheese topping");
        return super.getCost() +10;
    }
}
