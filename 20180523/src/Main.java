import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int data [] = new int [n];
        for (int i = 0 ; i < n ; i++){
            data[i] = sca.nextInt();
        }
         for (int i = 0 ; i<n ; i++){
             for (int j = 0 ; j<n-1; j++){
                 if (data[j]>data[j+1]){
                     int tmp = data[j];
                     data[j] = data[j+1];
                     data[j+1] = tmp;
                 }
             }
         }
        System.out.println(data[0]*data[1]);
    }
}
