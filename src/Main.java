import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;

        //Kullanıcıdan veri girişi bekleniyor.
        System.out.print("Sayı giriniz: ");
        int c = input.nextInt();
        System.out.print(c + " Sayısının Fibonacci Değerleri: ");

        //Kullanıcının girdiği değer kadar döngü çalıştırılır.
        for (int i = 1; i <= c; i++) {
            System.out.print(a + "  ");
            int total = a + b;
            a = b;
            b = total;
        }
    }
}