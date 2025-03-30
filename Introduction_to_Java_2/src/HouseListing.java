enum House {
    APARTMENT(4500000),
    VILLA(20000000),
    BUNGALOW(15000000),
    COTTAGE(12000000),
    MANSION(50000000);


    private final int price;


    House(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }
}


public class HouseListing {
    public static void main(String[] args) {
        System.out.println("House Price List");


        for (House h : House.values()) {
            System.out.printf("%s : ₹%,d%n", h, h.getPrice());
        }
    }
}
