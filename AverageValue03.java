import java.util.Scanner;
public class AverageValue03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        float nilai, totalNilai, rataNilai;
        int nilaiMhs;

        System.out.println("Input Nilai Mahasiswa ke 1:  ");
        System.out.print("Nilai ke -1:" + i + " = ");
        nilai = sc.nextFloat();

        for(j = 1; j <= 5; j++) {  
        }
            totalNilai=0;
            for(j=1;j<=5;j++){
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;

            i = 1;
            while (i <= 5) {
                totalNilai = 0;
                for (j = 1; j <= 5; j++) {
                    System.out.print("Nilai ke-" +j + " = ");
                    nilaiMhs = sc.nextInt();
                    totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            i++;

        }
    }
}
}