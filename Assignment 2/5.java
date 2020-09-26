import java.util.Scanner;
class MatrixMultiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows and column of first matrix");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter the number rows and columns of the second matrix");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(col1 != row2){
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int m1[][] = new int[row1][col1];
        int m2[][] = new int[row2][col2];
        System.out.println("Enter the first matrix");
        for(int i = 0;i<row1;i++){
            for(int j=0;j<col1;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of the second matrix");
        for(int i = 0;i<row2;i++){
            for(int j = 0;j<col2;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        int m3[][] = new int[row1][col2];
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col2;j++){
                m3[i][j] = 0;
                for(int k =0;k<col1;k++){
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }
        System.out.println("Elements of the third matrix :");
        for (int i = 0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
