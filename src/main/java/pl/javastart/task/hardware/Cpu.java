package pl.javastart.task.hardware;

import pl.javastart.task.OverHeatingComponentExemption;

public class Cpu extends MotherBoardComponent implements Overclockable {

    private static final double CPU_ONE_MHZ_TEMP_INCREASE = .1;

    public Cpu(String model, String manufacturer, String serialNumber, int clockFrequency, double averageWorkingTemperature, int maxTemperature) {
        super(model, manufacturer, serialNumber, clockFrequency, averageWorkingTemperature, maxTemperature);
    }

    @Override
    public void overclock(int overclockByMhz) throws OverHeatingComponentExemption {
        int temp = (int) (CPU_ONE_MHZ_TEMP_INCREASE * overclockByMhz);
        if (averageWorkingTemperature + temp >= maxTemperature) {
            throw new OverHeatingComponentExemption("Nie można zwiększyć taktowania, ryzyko uszkodzenia CPU, Aktualna temp: "
                    + averageWorkingTemperature + ", Maksymalna dopuszczalna temp: " + maxTemperature);
        }
        averageWorkingTemperature += temp;
        increaseClockFrequency(overclockByMhz);
    }
}

