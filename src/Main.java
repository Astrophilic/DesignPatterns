import DecoratorPattern.TextFormattingBase;
import DecoratorPattern.*;
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
import WeatherStationObserverPattern.HighTideStation;
import WeatherStationObserverPattern.MobleDisplayObserver;
import WeatherStationObserverPattern.TvDisplayObserver;
import WeatherStationObserverPattern.WeatherStation;

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
//        authStrategyPattern();
//        weatherObserverPattern();
        decoratedTextExample();

    }

    private static void weatherObserverPattern(){
         WeatherStation weatherStation = new WeatherStation();
         weatherStation.add(new TvDisplayObserver());

         weatherStation.add(new MobleDisplayObserver());

         weatherStation.setTemperature(10);
        HighTideStation highTideStation = new HighTideStation();
        highTideStation.add(new TvDisplayObserver());
        highTideStation.setTide(10);
    }
    private static void decoratedTextExample(){
        TextFormattingBase textFormattingBase = new NormalText("hello text");
//        textFormattingBase.printFormattedText();
        TextFormattingBase decoratedText = new BoldDecorator(textFormattingBase);
//        decoratedText.printFormattedText();
        TextFormattingBase decoratedItalic = new ItalicDecorator(decoratedText);
        System.out.println(decoratedItalic.getText());
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