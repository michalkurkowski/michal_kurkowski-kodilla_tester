public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        User michal = new User("Michal", 12);
        User agata = new User("Agata", 25);
        User anna = new User("Anna", 28);
        User elsa = new User("Elsa", 27);
        User dorota = new User("Dorota", 29);
        User pawel = new User("Paweł", 38);
        User[] users = {michal, agata, anna, elsa, dorota, pawel};

        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        sum /= users.length;

        for (int k = 0; k < users.length; k++) {
            if (users[k].getAge() <= sum) {
                System.out.println(users[k].getName());
            }
        }
    }
}




