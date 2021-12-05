import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q5_Valid_MailID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]*[a-zA-Z][0-9]+[a-zA-Z0-9_.]*@([a-z]+.)+[a-z]+");
        Matcher m = p.matcher(target);
        if(m.find()){
            System.out.println("The email id is valid.");
        }
        else{
            System.out.println("The email is not valid.");
        }
        sc.close();
    }
}
