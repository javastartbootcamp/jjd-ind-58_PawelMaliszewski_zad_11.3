package pl.javastart.task;

import pl.javastart.task.hardware.Component;
import pl.javastart.task.hardware.ComputerDrive;
import pl.javastart.task.hardware.Cpu;
import pl.javastart.task.hardware.Ram;

public class Main {

    public static void main(String[] args) {
        Component cpu = new Cpu("i7", "Intel", "1JHH123", 2500, 56, 89);
        Component ram = new Ram("DD4", "Crucial", "987JHG7", 1600, 38, 55, 4096);
        Component ssd = new ComputerDrive("980PRO", "Samsung", "0987HJGS12", 500);

        try {
            ComputerFactory computer = new ComputerFactory(cpu, ram, ssd);
            System.out.println(computer.cpu);
            System.out.println(computer.ram);
            System.out.println(computer.computerDrive);
            computer.cpu.overclock(300);
            computer.ram.overclock(100);
            System.out.println(computer.cpu);
            System.out.println(computer.ram);
//            computer.cpu.overclock(100);
//            computer.ram.overclock(100);
        } catch (OverHeatingComponentExemption | NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
