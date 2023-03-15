package StockNotification;

import StockObserver.IStockObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungStockNotifier implements IStockNotifierBase {

    private int stockCount;
    List<IStockObserver> observerList = new ArrayList<>();
    @Override
    public void add(IStockObserver stockObserver) {
        this.observerList.add(stockObserver);
    }

    @Override
    public void remove(IStockObserver stockObserver) {
        this.observerList.remove(stockObserver);
    }

    @Override
    public void notifySubscribers() {
        for(IStockObserver stockObserver: observerList){
            stockObserver.update();
        }
    }

    @Override
    public void setStocks(int newStockCount) {

        this.stockCount += newStockCount;

        if(stockCount>0){
            this.notifySubscribers();
        }

    }

    @Override
    public String getData() {
        return "The samsung are back in stock and count is "+this.stockCount;
    }
}
