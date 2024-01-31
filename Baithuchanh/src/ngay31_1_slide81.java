import java.util.Scanner;

public class ngay31_1_slide81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("So dong cua ma tran : ");
        int m = sc.nextInt();

        System.out.println("So cot cua ma tran : ");
        int n = sc.nextInt();

        int A [][] = new int [m][n];
        System.out.println("Nhap cac phan tu cua ma tran");
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("A[" + i + "]" + "[" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if ( max < A[i][j] ){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : " + max);

    }
}
