import java.util.*;
public class symmetric {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols");
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int [][] a=new int [r][c];
        System.out.println("Enter the matrix values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        boolean isSymmetric=true;
        if(r==c){
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=a[j][i]){
                    isSymmetric=false;
                   
                    
                }
            }
        }
    }else{
        isSymmetric=false;
    }
        if(isSymmetric){
             System.out.println("Matrix is symmetric");
        }else{
             System.out.println("Matrix is not symmetric");
        }
    }
}
