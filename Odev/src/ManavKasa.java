import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
        Scanner mnv = new Scanner(System.in);

        double armut =2.14;
        double elma = 3.67;
        double domates =1.11;
        double muz =0.95;
        double patlican =5.00;

        System.out.println("Armut kaç kilo : ");
        double armutKilo = mnv.nextDouble();

        System.out.println("Elma kaç kilo : ");
        double elmaKilo = mnv.nextDouble();

        System.out.println("Domates kaç kilo : ");
        double domatesKilo = mnv.nextDouble();

        System.out.println("Muz kaç kilo : ");
        double muzKilo = mnv.nextDouble();

        System.out.println("Patlican kaç kilo : ");
        double patlicanKilo = mnv.nextDouble();



        double toplam =(armut*armutKilo)+(elma*elmaKilo)+ (domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);




        System.out.println("Toplam Tutar: " + toplam);






    }

}
