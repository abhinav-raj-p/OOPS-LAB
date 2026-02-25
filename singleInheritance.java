public class singleInheritance {
    
    static class A {
        void str() {
            System.out.println("This is from A");
        }
    }

    
    static class B extends A {
        @Override
        void str() {
            System.out.println("This is from B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.str();  
        b.str();  
        }
}