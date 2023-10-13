class ElevatorSystem{
    private static ElevatorSystem instance = null;

    private int noOfFloors;
    private int noOfElevators;
    private ElevatorManager elevatorManager;
    private ExternalRequestProcessor externalRequestProcessor;
    private InternalRequestProcessor internalRequestProcessor;

    private ElevatorSystem(){}

    public static ElevatorSystem getInstance(){
        if( instance == null ){
            instance = new ElevatorSystem();
        }
        return instance;
    }


    public void initialize(int noOfFloors, int noOfElevators){
        // Initializing....
        this.noOfElevators = noOfElevators;
        this.noOfFloors = noOfFloors;

        elevatorManager = elevatorManager.getInstance();
        elevatorManager.initializeElevators(noOfElevators);

        internalRequestProcessor = new InternalRequestProcessor();
        externalRequestProcessor = new ExternalRequestProcessor();

    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy){
        externalRequestProcessor.setElevatorSelectionStrategy(elevatorSelectionStrategy);
    }

    public void processInternalRequest(int currentElevatorId, int floorNum){
        System.out.println("Internal Request....");
        internalRequestProcessor.processInternalRequest(new InternalRequest(currentElevatorId, floorNum));
    }

     public void processExternalRequest(Direction direction, int floorNum){
        System.out.println("External Request....");
        externalRequestProcessor.processExternalRequest(new ExternalRequest(direction, floorNum));
    }



}