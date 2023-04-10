package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentException;

public class Ram extends MotherBoardComponent {

    private static final double RAM_ONE_MHZ_TEMP_INCREASE = .15;

    private int size;

    public Ram(String model, String manufacturer, String serialNumber, int clockFrequency, double averageWorkingTemperature, int maxTemperature, int size) {
        super(model, manufacturer, serialNumber, clockFrequency, averageWorkingTemperature, maxTemperature);
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    @Override
    public void overclock(int overclockByMhz) throws OverHeatingComponentException {
        int temp = (int) (RAM_ONE_MHZ_TEMP_INCREASE * overclockByMhz);
        if (averageWorkingTemperature + temp >= maxTemperature) {
            throw new OverHeatingComponentException("Nie można zwiększyć taktowania, ryzyko uszkodzenia RAM, Aktualna temp: "
                    + averageWorkingTemperature + ", Maksymalna dopuszczalna temp: " + maxTemperature);
        }
        averageWorkingTemperature += temp;
        increaseClockFrequency(overclockByMhz);
    }

    @Override
    public String toString() {
        return super.toString() +  ", size in Gb: " + size;
    }
}
