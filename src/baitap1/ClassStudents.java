package baitap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStudents {
    private static Matcher matcher;
    private static Pattern pattern;
    private static final String ACCOUNT_STANCE="^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]$";
    public ClassStudents(){
        pattern=Pattern.compile(ACCOUNT_STANCE);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
