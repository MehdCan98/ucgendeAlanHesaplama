import java.util.Scanner;
// Scanner Sınıfımızı Projemize dahil ettikten sonra programımızı yazmaya başlıyoruz

public class Main {
    public static void main(String[] args) {
        // 3 kenar için 3 ayrı değişken atıyoruz.
        int a, b, c;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kenar uzunluklarını alıyoruz.
        System.out.print("Birinci Kenar Uzunluğunu Giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci Kenar Uzunluğunu Giriniz: ");
        b = input.nextInt();

        System.out.print("Üçüncü Kenar Uzunluğunu Giriniz: ");
        c = input.nextInt();

        //Bu aşamada formülü koda dahil ederek devam ediyoruz.

        double formul = (a + b+ c) /2;
        double alan = Math.sqrt(formul*(formul-a)*(formul-b)*(formul-c));
        System.out.println(alan);

    }
}