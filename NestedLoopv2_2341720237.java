import java.util.Scanner;
public class NestedLoopv2_2341720237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double[2][2];

        int kota=0;
        for(double[] kotake : temps){
            System.out.println("Kota ke-" +kota);
            int hari = 0;
            for (double harike : kotake){
                System.out.print("Hari ke-"+(hari+1)+": ");
                temps[kota][hari] = sc.nextDouble();
                hari++;
            }
            kota++;
            System.out.println();
        }
        kota = 0;
        for(double[] kotake : temps){
            System.out.println("Kota ke-" +kota);
            int hari = 0;
            for (double[] suhu : temps){
                System.out.print("suhu"+(suhu)+": ");
            }
            System.out.println();
            kota++;
        }
    }
}
