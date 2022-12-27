import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[]args){
        double boy;
        double kilo;

        Scanner ind =new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz" );
        boy = ind.nextDouble();

        System.out.println("Lütfen Kilo Değerinizi Giriniz");
        kilo = ind.nextDouble();

        double vki = kilo/(boy*boy);


        System.out.println("Vucut Kitle İndeksiniz: " +vki);




    }
}
