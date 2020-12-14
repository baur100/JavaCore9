package hw9;

public class Order {

    private String orderName;
    private String accountType;
    private int price;
    private int shipment;

    public Order (String orderName, String accountType, int price, int shipment){
        this.orderName = orderName;
        this.accountType = accountType;
        this.price = price;
        this.shipment = shipment; }

        public String getOrderName () {return orderName;}
        public void setOrderName (String orderName){this.orderName = orderName;}

        public String getAccountType (){return accountType;}
        public void setAccountType (String accountType){this.accountType = accountType;}

        public int getPrice () {return price;}
        public void setPrice (int price) {this.price = price;}

        public int getShipment () {return shipment;}
        public void setShipment (int shipment){this.shipment = shipment;}


        public void printall (){
        int sum = (price+shipment);
            System.out.println("Your order: " + orderName + ", Your account type is: " + accountType +
                    "\n, Price is: " + price + ", Shipment is: "+ shipment + ", Summary is: " + sum);
        }


}
