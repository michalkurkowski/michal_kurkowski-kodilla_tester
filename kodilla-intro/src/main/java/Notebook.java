public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {

        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");

        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1500) {
            System.out.println("This notebook isn't heavy.");
        } else {
            System.out.println("This notebook is heavy.");

        }
    }

    public void checkYear() {
            if (this.year > 2020) {
                System.out.println("This notebook is new and cheap");
            } else if (this.year > 2017) {
                System.out.println("This notebook isn't old and expensive.");
            } else {
                System.out.println("This notebook is old and expensive.");
            }
        }
    }