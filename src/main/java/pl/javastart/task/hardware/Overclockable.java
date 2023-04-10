package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentException;

public interface Overclockable {

    void overclock(int overclockByMhz) throws OverHeatingComponentException;
}
