public class HouseKeeping implements HotelService {
    
    @Override
    public void executeService() {
        System.out.println("[HouseKeeping Service] Processing room cleaning request...");
    }

    public void cleanRoom(int roomNumber) {
        executeService();
        System.out.println(" -> Room number " + roomNumber + " is currently scheduled for cleaning.");
    }
}