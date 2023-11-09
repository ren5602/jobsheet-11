import java.util.Scanner;
import java.util.Random;
public class Quiz19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu ='y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if(answer < number){ //logika untuk menampilkan jawaban lebih kecil atau lebih besar dari nilai tebakan
                    System.out.println("Jawaban Anda Lebih Kecil Dari Nilai Tebakan");
                }else if(answer > number){
                    System.out.println("Jawaban Anda Lebih Besar dari Nilai Tebakan");
                }
                success = (answer == number);
            }while(!success); //!success bernilai true karena telah di deklarasikan "false sebelumnya pada line 10" sehingga program dapat lanjut ke command selanjutnya
            System.out.print("apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.next().charAt(0);
        }
        while(menu == 'Y' || menu == 'y');

    }
}
