public class Main {
    public static void main(String[] args) {

        double count = 100;
        double pay = 1100;
        int bonus = pay > 1000 ? (int) pay / 100 : 0;

        count = count + pay + bonus;

        System.out.println(count);
    }
}
