import java.util.Scanner;


class Product {

    int pcode;
    String pname;
    int price;


    Product(int pcode, String pname, int price) {

        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }


    public static Product cheap(Product p1, Product p2, Product p3) {
        Product cheap = p1;

        if (p2.price < cheap.price) {
            cheap = p2;
        }
        if (p3.price < cheap.price) {
            cheap = p3;
        }

        System.out.println("Cheapest product is: " + cheap.pname + 
                           " with price " + cheap.price);
       return cheap;
    }

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the product code of first product");
      int p1code=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the product name of first product");
      String p1name=sc.nextLine(); 
      System.out.println("Enter the product price of first product");
      int p1price=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the product code of second product");
      int p2code=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the product name of second product");
      String p2name=sc.nextLine(); 
      System.out.println("Enter the product price of second product");
      int p2price=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the product code of third product");
      int p3code=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the product name of third product");
      String p3name=sc.nextLine(); 
      System.out.println("Enter the product price of third product");
      int p3price=sc.nextInt();
      sc.nextLine();
      Product p1=new Product(p1code,p1name,p1price);
      Product p2=new Product(p2code,p2name,p2price);
      Product p3=new Product(p3code,p3name,p3price);
        sc.close();
      Product i=cheap(p1, p2, p3);
      System.out.println(i.pcode);
      

    //   p2.cheap(code, name, price);
    }
}