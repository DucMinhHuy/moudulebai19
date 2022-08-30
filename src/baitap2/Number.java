package baitap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    public static final String ACONUT="^[0-9]{3}+[0-9]{4}+[0-9]{3}$";
    public Number(){}
    public boolean check(String regex){
        Pattern pattern=Pattern.compile(ACONUT);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
