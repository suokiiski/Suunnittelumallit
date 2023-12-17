public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void Start() {
        cpu.Freeze();
        char[] bootData = hardDrive.Read(kBootSector, kSectorSize);
        memory.Load(kBootAddress, bootData);
        cpu.Jump(kBootAddress);
        cpu.Execute();
    }

    private static final long kBootAddress = 0x00000000;
    private static final long kBootSector = 0x00000080;
    private static final int kSectorSize = 512;

}
