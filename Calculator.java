import java.util.Scanner;

public class Calculator {

    static void top(int a,int b){
        System.out.println("Sonuç : "+a+b);
    }
    static void cık(int a,int b){
        System.out.println("Sonuç : "+(a-b));
    }
    static void car(int a,int b){
        System.out.println("Sonuç : "+a*b);
    }
    static void bol(int a,int b){
        System.out.println("Sonuç : "+a/b);
    }
    static void us(int a,int b){
        System.out.println("Sonuç : "+(int) Math.pow(a,b));
    }
    static void mod(int a,int b){
        System.out.println("Sonuç : "+a%b);
    }
    static void dik(int a,int b){
        System.out.println("Dikdörtgen Alanı : "+(a*b));
        System.out.println("Dikdörtgen Çevresi : "+(2*(a+b)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,select;
        System.out.println("Patika Hesap Makinesi");
        System.out.print("Lütfen ilk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.println("Menü\n1 : Toplama\n2 : Çıkarma\n3 : Çarpma\n4 : Bölme\n5 : Üs Alma\n6 : Mod Alma");
        System.out.println("7 : Dikdörtgen alan ve çevresini hesaplama\n0 : Çıkış");
        System.out.print("Lütfen yapmak istediğiniz işlemin numarasını giriniz : ");
        select = input.nextInt();

        switch (select){
            case 1 :
                top(a,b);
                break;
            case 2 :
                cık(a,b);
                break;
            case 3 :
                car(a,b);
                break;
            case 4 :
                bol(a,b);
                break;
            case 5 :
                us(a,b);
                break;
            case 6 :
                mod(a,b);
                break;
            case 7 :
                dik(a,b);
                break;
            default:
                System.out.println("Güle Güle");
        }
    }
}
