public class Main {
    public static void main(String[] args) {
        CarPrototype marutiCar = new MarutiCar("Maruti", "1000cc", "Seddan");
        CarPrototype tataCar = new TataCar("Tata", "1000cc", "SUV", "Yes");
        
        CarPrototype marutiClone = marutiCar.clone();
        CarPrototype tataClone = tataCar.clone();

        System.out.println("Actual Cars : ");
        marutiCar.display();
        tataCar.display();

        System.out.println("Cloned Cars: ");
        marutiClone.display();
        tataClone.display();

        // UPDATING
        marutiClone.update("Maruti Clone");
        marutiCar.update("Maruti Original");

        tataClone.update("Tata Clone");
        tataCar.update("Tata Original");

        System.out.println("Updated Actual Cars : ");
        marutiCar.display();
        tataCar.display();

        System.out.println("Updated Cloned Cars: ");
        marutiClone.display();
        tataClone.display();
    }    
}
