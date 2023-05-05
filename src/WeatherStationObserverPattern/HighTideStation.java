package WeatherStationObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class HighTideStation implements NotifierBase{
    private List<DisplayObserver> observerList = new ArrayList<>();
    private int tide;

    @Override
    public void add(DisplayObserver displayObserver) {
        this.observerList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        this.observerList.remove(displayObserver);
    }

    @Override
    public void updateObservers() {
        for(DisplayObserver displayObserver:observerList){
            displayObserver.update();
        }
    }

    @Override
    public void update() {
        System.out.println("notified for high tide");
    }

    public void setTide(int i) {
        this.tide = i;
        update();
        updateObservers();
    }
}
