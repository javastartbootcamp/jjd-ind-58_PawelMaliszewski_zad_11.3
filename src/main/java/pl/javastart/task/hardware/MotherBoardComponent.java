package pl.javastart.task.hardware;

public abstract class MotherBoardComponent extends Component implements Overclockable {

    protected int mhz;
    protected double averageWorkingTemperature;
    protected double maxTemperature;

    protected MotherBoardComponent(String model, String manufacturer, String serialNumber, int mhz,
                                   double averageWorkingTemperature, int maxTemperature) {
        super(model, manufacturer, serialNumber);
        this.mhz = mhz;
        this.averageWorkingTemperature = averageWorkingTemperature;
        this.maxTemperature = maxTemperature;
    }

    protected int overclockingIncreaseOfTemperature(double oneMhzTempIncrease, int overclockByFrequency) {
        return (int) (oneMhzTempIncrease * overclockByFrequency);
    }

    protected void increaseClockFrequency(int increaseBy) {
        mhz += increaseBy;
    }

    @Override
    public String toString() {
        return super.toString() +  ", clockFrequency=" + mhz +
                ", averageWorkingTemperature=" + averageWorkingTemperature +
                ", maxTemperature=" + maxTemperature;
    }
}

