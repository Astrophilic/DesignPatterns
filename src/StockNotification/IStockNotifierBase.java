package StockNotification;

import StockObserver.IStockObserver;

public interface IStockNotifierBase {

    public void add(final IStockObserver stockObserver);
    public void remove(final IStockObserver stockObserver);

    public void notifySubscribers();



    abstract void setStocks(int newStockCount);

    String getData();
}
