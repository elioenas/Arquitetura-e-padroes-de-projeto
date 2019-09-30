package Facade;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	private HardDrive hardDrive;
	private Impressora impressora;

	public Computer() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
		this.impressora = new Impressora();
	}

	public void startComputer() {
		cpu.freeze();
		memory.load(10, hardDrive.read(1, 2));
		cpu.jump(2);
		cpu.execute();
	}
}
