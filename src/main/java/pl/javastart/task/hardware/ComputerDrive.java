package pl.javastart.task.hardware;

public class ComputerDrive extends Component {

    protected int sizeInGb;

    public ComputerDrive(String model, String manufacturer, String serialNumber, int sizeInGb) {
        super(model, manufacturer, serialNumber);
        this.sizeInGb = sizeInGb;
    }

    @Override
    public String toString() {
        return super.toString() + ", sizeInGb=" + sizeInGb;
    }
}
