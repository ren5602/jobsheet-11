import java.util.Scanner;
public class NestedLoopv3_2341720237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double[2][2];
        double[] rataSuhu = new double[2];

        for (int i = 0; i< temps.length; i++){
            System.out.println("Kota ke-" +i);
            for (int j = 0; j< temps[i].length; j++){
                System.out.print("Hari ke-"+(j+i)+": ");
                temps[i][j] = sc.nextDouble();
                rataSuhu[i] += temps[i][j];
            }
            rataSuhu[i] /= temps[i].length; // Hitung rata-rata temperatur kota
            System.out.println();
        }
        for(int i =0; i< temps.length; i++){
            System.out.print("Kota ke-"+ (i + 1)+": ");
            for (double temp : temps[i]) {
            System.out.print(temp + " ");
            }
            System.out.println("Rata-rata suhu: " + rataSuhu[i]);
        }
    }
    
}
