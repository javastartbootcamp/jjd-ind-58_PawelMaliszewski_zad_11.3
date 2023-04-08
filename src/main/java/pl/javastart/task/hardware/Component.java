package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentExemption;

public abstract class Component  {
    protected String model;
    protected String manufacturer;
    protected String serialNumber;

    public Component(String model, String manufacturer, String serialNumber) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public void overclock(int overclockByMhz) throws OverHeatingComponentExemption {
    }

    @Override
    public String toString() {
        return "Component, " + getClass().getSimpleName() +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber;
    }
}
