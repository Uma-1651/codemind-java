import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        char s = sc.next().charAt(0);

        if ((s >= 'A' && s <= 'Z')) {
            System.out.println("uppercase alphabet");
        } else if (s >= 'a' && s <= 'z') {
            System.out.println("lowercase alphabet");
        } else {
            System.out.println("not an alphabet");
        }
    }
}
