import StockNotification.IStockNotifierBase;
import StockNotification.IphoneStockNotifier;
import StockNotification.SamsungStockNotifier;
import StockObserver.EmailObserver;
import StockObserver.IStockObserver;
import StockObserver.MobileDisplayObserver;

public class Main {


    private static void ObserverPatternExample(){
        final IStockNotifierBase iphoneStockNotifier = new IphoneStockNotifier();
        final IStockNotifierBase samsungStockNotifier = new SamsungStockNotifier();
        final IStockObserver stockObserver = new EmailObserver("pankajhz99@gmail.com", iphoneStockNotifier);
        final IStockObserver samsungStockObserver= new EmailObserver("astro@gmail.com",samsungStockNotifier);
        final IStockObserver MobileObserver = new MobileDisplayObserver("pkjhz");


        iphoneStockNotifier.add(stockObserver);
        iphoneStockNotifier.add(MobileObserver);
        samsungStockNotifier.add(samsungStockObserver);

        iphoneStockNotifier.setStocks(10);
        samsungStockNotifier.setStocks(0);
    }
    public static void main(String[] args) {

        ObserverPatternExample();


    }
}