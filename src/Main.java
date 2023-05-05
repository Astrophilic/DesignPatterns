import StockNotification.IStockNotifierBase;
import StockNotification.IphoneStockNotifier;
import StockNotification.SamsungStockNotifier;
import StockObserver.EmailObserver;
import StockObserver.IStockObserver;
import StockObserver.MobileDisplayObserver;
import StrategyPatternAuth.AuthContext;
import StrategyPatternAuth.AuthStrategy;
import StrategyPatternAuth.OauthStrategy;
import StrategyPatternAuth.SamlStrategy;

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

//        ObserverPatternExample();
        authStrategyPattern();

    }
    private static void authStrategyPattern(){

        AuthStrategy oauthStrategy = new OauthStrategy("pnkj@hz.com","213213");
        AuthStrategy samlStrategy = new SamlStrategy("samid","sasmpassword");

        AuthContext authContext = new AuthContext(oauthStrategy);
        authContext.authenticateUser();
        authContext.setAuthStrategy(samlStrategy);

        authContext.authenticateUser();

    }
}