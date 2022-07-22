package homeworks.homework19.cpu;

public class CPUTest {
    public static void main(String[] args) {
        CPU cpu = new CPU(150.0);
        CPU.Processor processor = new CPU.Processor(32, "Intel");
        processor.hardWorking(15);
        CPU.Ram ram = new CPU.Ram(4096, "Samsung");
        ram.ramWorking(15);
        cpu.cost();
    }
}
