package parking_spot_manager;

import java.util.*;
import vehicle.*;

public class ParkingSpotManagerFactory{
    private static HashMap<VehicleType, ParkingSpotManager> psm_map= new HashMap<VehicleType, ParkingSpotManager>();

    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        ParkingSpotManager psm = null;

        if( psm_map.get(vehicleType) != null){
            return psm_map.get(vehicleType);
        }else{
            switch(vehicleType){
                case TWO_WHEELER:
                    psm = new TwoWheelerParkingSpotManager(3, 100);
                    break;
                case FOUR_WHEELER:
                    psm = new FourWheelerParkingSpotManager(2, 150);
                    break;
            }

            psm_map.put(vehicleType, psm);
            return psm;
        }
    }
}