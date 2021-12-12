
public class ComputerFacade {
private CPU cpu;
private HardDrive drive;
private Memory memory;
public ComputerFacade() {
	cpu=new CPU();
	drive=new HardDrive();
	memory=new Memory();
}
public void start() {
	cpu.freeze();
	memory.load(0, drive.read(1, 7));
	cpu.jump(0);
	cpu.execute();
}
}
