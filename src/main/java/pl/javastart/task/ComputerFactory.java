package pl.javastart.task;

import pl.javastart.task.hardware.Component;

public class ComputerFactory {

    Component cpu;
    Component ram;
    Component computerDrive;

    public ComputerFactory(Component cpu, Component ram, Component computerDrive) {
        throwExemptionIfNull(cpu);
        throwExemptionIfNull(ram);
        throwExemptionIfNull(computerDrive);
        this.cpu = cpu;
        this.ram = ram;
        this.computerDrive = computerDrive;
    }

    private void throwExemptionIfNull(Component component) {
        if (component == null) {
            throw new NullPointerException("Nie można zbudować komputera bez wszystkich elementów");
        }
    }
}

