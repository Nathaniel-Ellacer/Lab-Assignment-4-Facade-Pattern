public class Cart implements HotelService {
    
    @Override
    public void executeService() {
        System.out.println("[Cart Service] Processing luggage cart request...");
    }

    public void requestCart(int numberOfCarts) {
        executeService();
        System.out.println(" -> " + numberOfCarts + " luggage cart(s) have been dispatched to the lobby.");
    }
}