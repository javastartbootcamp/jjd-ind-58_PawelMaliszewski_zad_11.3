package pl.javastart.task;

import pl.javastart.task.hardware.Component;
import pl.javastart.task.hardware.ComputerDrive;
import pl.javastart.task.hardware.Cpu;
import pl.javastart.task.hardware.Ram;

public class Computer {

    private final Cpu cpu;
    private final Ram ram;
    private final ComputerDrive computerDrive;

    public Computer(Cpu cpu, Ram ram, ComputerDrive computerDrive) {
        throwExceptionsIfNull(cpu);
        throwExceptionsIfNull(ram);
        throwExceptionsIfNull(computerDrive);
        this.cpu = cpu;
        this.ram = ram;
        this.computerDrive = computerDrive;
    }

    private void throwExceptionsIfNull(Component component) {
        if (component == null) {
            throw new NullPointerException("Nie można zbudować komputera bez wszystkich elementów");
        }
    }

    public void overClockCpu(int overclockByMhz) throws OverHeatingComponentException {
        cpu.overclock(overclockByMhz);
    }

    public void overClockRam(int overclockByMhz) throws OverHeatingComponentException {
        ram.overclock(overclockByMhz);
    }

    @Override
    public String toString() {
        return "Computer{\n" +
                "CPU ->" + cpu +
                "\nRAM ->" + ram +
                "\nCOMPUTER DRIVE ->" + computerDrive + '}';
    }
}

