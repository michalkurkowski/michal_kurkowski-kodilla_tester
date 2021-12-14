public class Application {
    String name;
    double age;
    double height;

    public static void main(String[] args) {
        Application Adam = new Application("adam", 40.5, 178);
        Adam.checkUser();
    }

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkUser() {

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}
