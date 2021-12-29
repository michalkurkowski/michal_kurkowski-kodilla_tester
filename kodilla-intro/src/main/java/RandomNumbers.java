import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        int r = rn.generateNumber();
        System.out.println(r);
}
        public int generateNumber() {
            Random random = new Random();
            int result = 0;
            int sum = 0;

            int min = 31;
            int max = 0;

            while (sum < 5000) {
                int a = random.nextInt(31);
                if (a < min) {
                    min = a;
                }
                if (a > max) {
                    max = a;
                }
                sum = sum + a;
                result++;
            }
            System.out.println(min);
            System.out.println(max);
            return result;
        }
    }