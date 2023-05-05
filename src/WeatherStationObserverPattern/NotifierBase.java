package WeatherStationObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface NotifierBase {

    void add(final DisplayObserver displayObserver);
    void remove(final DisplayObserver displayObserver);

    void updateObservers();

    void update();

}
