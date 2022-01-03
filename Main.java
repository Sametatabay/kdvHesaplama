import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double deterjan,yağ,patates,kıyma,kdvOran=0.18;

        Scanner inp = new Scanner(System.in);

        System.out.println("Deterjan tutarı :");
        deterjan =inp.nextInt();
        double kdvsiz=deterjan;
        double kdvoranı= deterjan * kdvOran;
        double kdvoranlı=deterjan + kdvoranı;
        System.out.println("KDV'siz : "+kdvsiz);
        System.out.println("KDV Oranı : "+kdvoranı);
        System.out.println("KDV Oranlı : "+kdvoranlı);


        System.out.println("Yağ tutarı :");
        yağ =inp.nextInt();
        double kdvsiz1=yağ;
        double kdvoranı1= yağ * kdvOran;
        double kdvoranlı1=yağ + kdvoranı;
        System.out.println("KDV'siz : "+kdvsiz1);
        System.out.println("KDV Oranı : "+kdvoranı1);
        System.out.println("KDV Oranlı : "+kdvoranlı1);


        System.out.println("Patates tutarı :");
        patates =inp.nextInt();
        double kdvsiz2=patates;
        double kdvoranı2= patates * kdvOran;
        double kdvoranlı2=patates + kdvoranı;
        System.out.println("KDV'siz : "+kdvsiz2);
        System.out.println("KDV Oranı : "+kdvoranı2);
        System.out.println("KDV Oranlı : "+kdvoranlı2);


        System.out.println("Kıyma tutarı :");
        kıyma =inp.nextInt();
        double kdvsiz3=kıyma;
        double kdvoranı3= kıyma * kdvOran;
        double kdvoranlı3=kıyma + kdvoranı;
        System.out.println("KDV'siz : "+kdvsiz3);
        System.out.println("KDV Oranı : "+kdvoranı3);
        System.out.println("KDV Oranlı : "+kdvoranlı3);


    }
}
