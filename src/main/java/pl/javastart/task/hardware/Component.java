package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentException;

public abstract class Component  {
    protected String model;
    protected String manufacturer;
    protected String serialNumber;

    public Component(String model, String manufacturer, String serialNumber) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public void overclock(int overclockByMhz) throws OverHeatingComponentException {
    }

    @Override
    public String toString() {
        return  " model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber;
    }
}
