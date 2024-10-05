import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tusk2 {

    public void metod1() {

        String text = "The Java Plug-in software is a 123123 component of the Java Runtime Environment (JRE).";

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
}
