public abstract class Phone{
    private String operatingSystem;
    private String metal;
    private String processor;

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public void setMetal(String metal){
        this.metal = metal;
    }

    public void setProcessor(String processor){
        this.processor = processor;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public String getMetal(){
        return metal;
    }

    public String getProcessor(){
        return processor;
    }

    public Phone(String operatingSystem, String metal, String processor){
        this.operatingSystem = operatingSystem;
        this.metal = metal;
        this.processor = processor;
    }

    public abstract void design();
    public abstract void features();
}