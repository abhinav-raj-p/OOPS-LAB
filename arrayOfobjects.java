import java.util.*;

public class arrayOfobjects {
    //take this as a car class
    String model;
    String company;
    int year;

    void add(String model,String company,int year){
        this.model=model;
        this.company=company;
        this.year=year;
    }

    void display(){
        System.out.println("Model: "+this.model+" Company: "+this.company+" Year: "+this.year);
    }


public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    arrayOfobjects[] showroom = new arrayOfobjects[3];
    System.out.println("Add your showroom details one by one(# showrooms are available)");
    for(int i=0;i<showroom.length;i++){
        String model=sc.nextLine();
        String company=sc.nextLine();
        int year=sc.nextInt();
        sc.nextLine();
        showroom[i]=new arrayOfobjects();
        showroom[i].add(model,company,year);
    }
    for(int i=0;i<showroom.length;i++){
        showroom[i].display();
    }
    sc.close();
}}