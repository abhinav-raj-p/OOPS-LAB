import java.util.Scanner;

public class matrix {
    public static int a[][];
    public static int b[][];

    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix column and rows");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Enter matrix values");
        a = new int[r1][r2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix values");
       
        b = new int[r1][r2];
         for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                 b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("\n");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                System.out.print(a[i][j]+" ");
                a[i][j]=a[i][j]+b[i][j];
            }
            System.out.println("\n");
        }
    }

}
