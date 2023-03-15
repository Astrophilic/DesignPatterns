package StockObserver;

public class MobileDisplayObserver implements IStockObserver{
    private final String id;

    public MobileDisplayObserver(String id) {
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println("notified via mobile with id "+id);
    }
}
