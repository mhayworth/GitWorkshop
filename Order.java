import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }

    public void addChickenSandwich() {
        totalCost += 5;
        items.add("Chicken Sandwich");
        System.out.println("You've added a chicken sandwich. yay");
    }
    public void addSalad() {
        totalCost += 6;
        items.add("Spicy Southwest Salad")
        System.out.println("You've added a Spicy Southwest Salad. Michael was here")
        //addvirus.pdf
    }

}
