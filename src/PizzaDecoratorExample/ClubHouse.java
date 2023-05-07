package PizzaDecoratorExample;

public class ClubHouse implements BasePizza{
    @Override
    public Integer getCost() {
        System.out.println("clubhouse cost is "+200);
        return 200;
    }
}
