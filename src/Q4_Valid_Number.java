import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4_Valid_Number {
    public static void main(String[] args){
        if(args.length>0){
            String target = args[0];
            Pattern p = Pattern.compile("(0|91)?[1-9][0-9]{9}");
            Matcher m = p.matcher(target);
            if(m.find()){
                System.out.println("The number is valid number.");
            }
            else{
                System.out.println("The number is not valid.");
            }
        }
    }
}
