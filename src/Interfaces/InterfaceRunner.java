package Interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {
        Pricable pizza = new Pizza("Peperoni", 1, 20, Size.L);
        Pricable cellPhone = new CellPhone("Motorolla", "X55", 1, 250);
        Pricable fridge = new Fridge("LG", "90", 1, 300);

        printDeliveryblePrice(pizza);
        printDeliveryblePrice(cellPhone);
        printDeliveryblePrice(fridge);

    }

    private static void printDeliveryblePrice(Pricable del){
        System.out.println("Deliverable price "+ del.calcDeliveryPrice());
        System.out.println("Order price "+ del.calcOrderPrice());
    }
}
