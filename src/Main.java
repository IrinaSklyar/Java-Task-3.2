public class Main {
    public static void main(String[] args) {
        int payment = 1100;
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }
        System.out.println(bonus);
    }
}
