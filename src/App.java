import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        int s1,s2,secim;
        Scanner imp=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        s1=imp.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        s2=imp.nextInt();

        System.out.print("1-Topla\n2-Çıkar\n3-Çarp\n4-Böl\n");
        System.out.print("Yapmak istediğiniz işlemi seçiniz--->>>");
        secim=imp.nextInt();

        switch (secim) {
            case 1:
                System.out.println(s1+" + "+s2+" = "+(s1+s2));
                break;
            case 2:
                System.out.println(s1+" - "+s2+" = "+(s1-s2));
                break;
            case 3:
                System.out.println(s1+" * "+s2+" = "+(s1*s2));
                break;
            case 4:
                if(s1==0||s2==0)
                {
                    System.out.println("Bir sayı sıfıra BÖLÜNEMEZ!");
                }
                else{
                    System.out.println(s1+" / "+s2+" = "+(s1/s2));
                }
                
                break;
        
            default:
                System.out.println("Farklı bir seçim yaptınız. Tekrar deneyin.");
                break;
        }
        imp.close();


        
    }
}
