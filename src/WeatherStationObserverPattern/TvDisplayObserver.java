package WeatherStationObserverPattern;

public class TvDisplayObserver implements DisplayObserver{

    @Override
    public void update() {
        System.out.println("notified on tv");
    }
}
