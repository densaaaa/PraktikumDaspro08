package betaTest;
import java.util.Scanner;
public class uangSakuUhuy {
    public static void main(String[] args) {
        
    Scanner uhuy = new Scanner(System.in);

    int uangSaku;

    System.out.println("Masukkan uang saku: ");
    uangSaku = uhuy.nextInt();

    if (uangSaku >= 50000) {
        System.out.println("foya-foya");
    } else if  
        (uangSaku >= 25000) {
        System.out.println("makan naspad");
    } else {System.out.println("energen");

    }
    uhuy.close();    
}
    
}
