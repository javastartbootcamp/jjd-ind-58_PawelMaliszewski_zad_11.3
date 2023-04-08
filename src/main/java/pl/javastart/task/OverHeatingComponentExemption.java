package pl.javastart.task;

import pl.javastart.task.hardware.Component;

public class OverHeatingComponentExemption extends Exception {

    public OverHeatingComponentExemption(String message) {
        super(message);
    }
}
