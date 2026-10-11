public class Valet implements HotelService {
    
    @Override
    public void executeService() {
        System.out.println("[Valet Service] Processing vehicle valet request...");
    }

    public void pickUpVehicle(String plateNumber) {
        executeService();
        System.out.println(" -> Vehicle with plate number " + plateNumber + " has been requested and is on its way.");
    }
}