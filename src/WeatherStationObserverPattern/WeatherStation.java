package WeatherStationObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {


    private List<DisplayObserver> displayObserverList = new ArrayList<>();
    private int temperature;

    public void add(final DisplayObserver displayObserver){
        this.displayObserverList.add(displayObserver);
    }
    public void remove(final DisplayObserver displayObserver){
        this.displayObserverList.remove(displayObserver);
    }


    public void setTemperature(int temperature){
        this.temperature = temperature;

        updateObservers();
    }

    public void updateObservers(){
        for(DisplayObserver displayObserver:displayObserverList){
            displayObserver.update();
        }
    }
}
