public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}