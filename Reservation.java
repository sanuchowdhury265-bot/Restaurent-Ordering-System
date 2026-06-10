class Reservation {

    private String customerName;
    private int tableNumber;

    Reservation(String customerName,
                int tableNumber) {

        this.customerName = customerName;
        this.tableNumber = tableNumber;
    }

    String getReservationDetails() {

        return "Customer: " +
               customerName +
               ", Table: " +
               tableNumber;
    }
}
    

