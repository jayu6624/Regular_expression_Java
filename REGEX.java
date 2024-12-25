import java.util.*;
public class REGEX {

    public static void main(String[] args) {
        
        // :=>mobile number validation :

        // String regx = "\\+[0-9]{0,3}[-][0-9]{0,4}[-][0-9]{10}";
        // String input = "+91-1234-8407605634";
        //System.out.println(input.matches(regx));



        //:=>less then 255 of number

        // String regx = "([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-4])";
        // String input = "255";
        // System.out.println(input.matches(regx));


        //:=>email validation 

        // String regx = "[a-z0-9_+.-]+@gmail.com";
        // String input = "jaydeep6624@gmail.com";

        // System.out.println(input.matches(regx));


        //:=>ip address validation
        // String regx = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        // String validation = regx+"."+regx+"."+regx+"."+regx;
        // String input = "255.255.90.87";
        // System.out.println(input.matches(validation));

    }
}
