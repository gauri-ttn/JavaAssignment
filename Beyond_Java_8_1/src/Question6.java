public class Question6 {
    public static void main(String[] args) {
        System.out.println(orderStatus(OrderStatus.PENDING));
        System.out.println(orderStatus(OrderStatus.SHIPPED));
        System.out.println(orderStatus(OrderStatus.REFUNDED));
    }

    public static String orderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                System.out.println("Refund is on process");
                String message = "Refund has been issued for the order.";
                yield message;
            }
        };
    }
}

enum OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
}
