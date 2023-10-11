import java.util.Random;

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Random random = new Random();

        int n1 = random.nextInt(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(n1);
        }
    }
}
