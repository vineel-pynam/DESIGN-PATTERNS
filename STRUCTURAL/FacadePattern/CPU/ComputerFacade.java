class ComputerFacade{
    private CPU cpu;
    private Memory memory;
    private Graphics graphics;
    private DiskDrive diskDrive;
    private NetworkInterface networkInterface;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.graphics = new Graphics();
        this.diskDrive = new DiskDrive();
        this.networkInterface = new NetworkInterface();
    }

    public void startComputer(){
        cpu.powerOn();
        memory.initialize();
        graphics.enableGraphics();
        diskDrive.bootFromDisk();
        networkInterface.connectToNetwork();
        cpu.executeInstructions();
        System.out.println("Computer is powered on...................!");
    }
}