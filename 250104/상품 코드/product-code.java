import java.util.*;

class Product {
    String p_name;
    String p_code;

    public Product(String p_name, String p_code) {
        this.p_name = p_name;
        this.p_code = p_code;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("codetree", "50");
        System.out.println("product " + p1.p_code + " is " + p1.p_name);
        
        String p_name = sc.next();
        String p_code = sc.next();

        Product p2 = new Product(p_name, p_code);
        System.out.println("product " + p2.p_code + " is " + p2.p_name);
    }
}