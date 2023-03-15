package StockObserver;

import StockNotification.IStockNotifierBase;

public class EmailObserver implements IStockObserver{
    private final String emailId;
    private final IStockNotifierBase stockNotifierBase;
    @Override
    public void update() {
        System.out.println("notified via email"+emailId);
        System.out.println("notified for "+stockNotifierBase.getData());
    }

    public EmailObserver(String emailId, IStockNotifierBase stockNotifierBase) {
        this.emailId = emailId;
        this.stockNotifierBase = stockNotifierBase;
    }
}
