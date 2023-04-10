package pl.javastart.task;

import pl.javastart.task.hardware.ComputerDrive;
import pl.javastart.task.hardware.Cpu;
import pl.javastart.task.hardware.Ram;

public class Main {

    public static void main(String[] args) {
        Cpu cpu = new Cpu("i7", "Intel", "1JHH123", 2500, 56, 89);
        Ram ram = new Ram("DD4", "Crucial", "987JHG7", 1600, 38, 55, 4096);
        ComputerDrive ssd = new ComputerDrive("980PRO", "Samsung", "0987HJGS12", 500);

        try {
            Computer computer = new Computer(cpu, ram, ssd);
            System.out.println(computer);
            computer.overClockCpu(200);
            computer.overClockRam(100);
            System.out.println(computer);
//            computer.overClockCpu(200);
//            computer.overClockRam(100);
            System.out.println(computer);
        } catch (OverHeatingComponentException | RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
