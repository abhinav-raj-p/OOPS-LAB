import java.util.Scanner;

class sort{


public static void main(String a[]){
    String [] unsorted={"Apple","Sugarcane","Dog","Cat","Banana"};
    //Scanner sc=new Scanner(System.in);
    //bubble sort
    for(int i=0;i<unsorted.length;i++){
        for(int j=0;j<unsorted.length-i-1;j++){
            if(unsorted[j].compareTo(unsorted[j+1])>0){
                String temp=unsorted[j+1];
                unsorted[j+1]=unsorted[j];
                unsorted[j]=temp;
            }
        }
    }
    System.out.println(("Sorted array:"));
    for(int i=0;i<unsorted.length;i++){
        System.out.println(unsorted[i]+","+" ");
    }
}
}