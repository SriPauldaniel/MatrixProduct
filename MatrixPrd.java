import java.util.Scanner;
public class MatrixPrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] *= x;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}