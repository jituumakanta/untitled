import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wrap me 09 on 21-08-2017.
 */
public class regex_test {
    public static void main(String[] args)  {

        /*Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);*/

       /* Pattern p = Pattern.compile("[abc]");//. represents single character
        Matcher m = p.matcher("a");
        boolean b = m.matches();
        System.out.println(b);*/

       /* Pattern p = Pattern.compile("[^abc]");//. represents single character
        Matcher m = p.matcher("f");
        boolean b = m.matches();
        System.out.println(b);*/

       /* Pattern p = Pattern.compile("[a-d[m-p]]");//. represents single character
        Matcher m = p.matcher("b");
        boolean b = m.matches();
        System.out.println(b);*/

      /*  Pattern p = Pattern.compile("[a-z&&[def]]");//. represents single character
        Matcher m = p.matcher("d");
        boolean b = m.matches();
        System.out.println(b);*/

        /*Pattern p = Pattern.compile("[a-z&&[^bc]]");//. represents single character
        Matcher m = p.matcher("b");
        boolean b = m.matches();
        System.out.println(b);*/

        /*Pattern p = Pattern.compile("[amn]?");//. represents single character
        Matcher m = p.matcher("a");
        boolean b = m.matches();
        System.out.println(b);*/

       /* Pattern p = Pattern.compile("\\D");//. represents single character
        Matcher m = p.matcher("1");
        boolean b = m.matches();
        System.out.println(b);*/

        /*Pattern p = Pattern.compile("\\d");//. represents single character
        Matcher m = p.matcher("1");
        boolean b = m.matches();
        System.out.println(b);*/

       /* Pattern p = Pattern.compile("\\s");//. represents single character
        Matcher m = p.matcher(" ");
        boolean b = m.matches();
        System.out.println(b);*/

        Pattern p = Pattern.compile("[a]");//. represents single character
        Matcher m = p.matcher("a");
        boolean b = m.matches();
        System.out.println(b);


    }
}
