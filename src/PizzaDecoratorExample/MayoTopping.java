package PizzaDecoratorExample;

public class MayoTopping extends DecoratedPizza{
    public MayoTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public Integer getCost() {
        System.out.println("adding mayo topping");
        return super.getCost()+20;
    }
}
