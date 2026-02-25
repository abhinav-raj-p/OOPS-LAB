import java.util.Scanner;;
public class stringManu {



    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();

    System.out.println("Original string "+s);
    System.out.println("Original string "+s.toLowerCase());
    System.out.println("Original string "+s.toUpperCase());
    

    System.out.println("Enter a character to be replaced in"+s);
    System.out.println("Enter a character to replace, and the character to replace it with: ");
    String r1=sc.nextLine();
    String r2=sc.nextLine();
    String replaced=s.replace(r1,r2);

    System.out.println("length of the string "+s+" "+s.length());
    System.out.println("Enter position");
    int pos=sc.nextInt();
    System.out.println("String at poistion"+pos+" "+s.charAt(pos));
    System.out.println("");
    System.out.println("Trimmed string "+s.trim());

    System.out.println("");

    }
    //contruct overloading
    //inheritance teacher employee
    //method override
    
    
}
