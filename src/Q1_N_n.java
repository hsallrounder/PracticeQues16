import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1_N_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String target=sc.nextLine();
        Pattern p = Pattern.compile("[Nn][a-zA-z]+");
        Matcher m = p.matcher(target);
        while(m.find()){
            System.out.println(m.group()+"("+m.start()+"--"+m.end()+")");
        }
        sc.close();
    }
}
