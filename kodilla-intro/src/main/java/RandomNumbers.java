import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        int r = rn.generateNumber(30);
        System.out.println(r);

        }
        public int generateNumber(int max) {
            Random random = new Random();
            int result = 0;
            int sum = 0;

            while (sum < 5000) {
                int a = random.nextInt(30);
                sum = sum + a;
                result++;
            }
            return result;
        }
    }