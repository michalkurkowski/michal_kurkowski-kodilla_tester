public class FirstClass {
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + notebook.price + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2017);
        System.out.println(heavyNotebook.weight + heavyNotebook.price + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println(oldNotebook.weight + oldNotebook.price + heavyNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
}

