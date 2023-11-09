import java.util.Scanner;
public class TriangleKebalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        
        while(i<N){ //perulangan baris untuk membuat segitiga
            int j = N; 
            while (j>i) { //perulangan kolom untuk segitiga
                System.out.print("*");
                j--; //kolom ditambah
            }
            System.out.println();
            i++; //baris ditambah
        }
    }
}