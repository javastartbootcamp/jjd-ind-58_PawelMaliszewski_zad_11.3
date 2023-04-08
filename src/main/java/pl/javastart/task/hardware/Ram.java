package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentExemption;

public class Ram extends MotherBoardComponent {

    private static final double RAM_ONE_MHZ_TEMP_INCREASE = .15;

    private int size;

    public Ram(String model, String manufacturer, String serialNumber, int clockFrequency, double averageWorkingTemperature, int maxTemperature, int size) {
        super(model, manufacturer, serialNumber, clockFrequency, averageWorkingTemperature, maxTemperature);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void overclock(int overclockByMhz) throws OverHeatingComponentExemption {
        int temp = overclockingIncreaseOfTemperature(RAM_ONE_MHZ_TEMP_INCREASE, overclockByMhz);
        if (averageWorkingTemperature + temp >= maxTemperature) {
            throw new OverHeatingComponentExemption("Nie można zwiększyć taktowania, ryzyko uszkodzenia RAM, Aktualna temp: "
                    + averageWorkingTemperature + ", Maksymalna dopuszczalna temp: " + maxTemperature);
        }
        averageWorkingTemperature += overclockByMhz * RAM_ONE_MHZ_TEMP_INCREASE;
        increaseClockFrequency(overclockByMhz);
    }

    @Override
    public String toString() {
        return super.toString() +  ", size in Gb: " + size;
    }
}
