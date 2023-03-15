
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Diziyi rastgele elemanlarla doldur
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        // Başlangıç zamanını kaydet
        long startTime = System.currentTimeMillis();

        // Brute Force algoritması ile sırala
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Bitiş zamanını kaydet ve çalışma süresini hesapla
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Sıralanmış diziyi yazdır ve çalışma süresini göster
        System.out.println("Sıralanmış dizi: " + Arrays.toString(arr));
        System.out.println("Programın çalışma süresi: " + duration + " milisaniye");
    }
}
