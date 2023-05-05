package WeatherStationObserverPattern;

public class MobleDisplayObserver implements DisplayObserver{


    @Override
    public void update() {
        System.out.println("updated via mobile");
    }
}
