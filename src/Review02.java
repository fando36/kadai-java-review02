
public class Review02 {
    public static void main(String[] args) {
        // 1から100までループ
        for (int i = 1; i <= 100; i++) {
            // 3と5で割り切れる場合
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // 3で割り切れる場合
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // 5で割り切れる場合
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // それ以外はそのまま数字を表示
            else {
                System.out.println(i);
            }
        }
    }
}