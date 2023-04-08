package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentExemption;

public interface Overclockable {

    void overclock(int overclockByMhz) throws OverHeatingComponentExemption;
}
