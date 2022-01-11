package _Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String REGEX_PHONE = "^[(](\\+84)[)][-][0-9]{9,}$";
    private static final String REGEX_EMAIL = "^[a-z][a-z0-9]{0,9}\\.[a-z0-9]{1,10}@[a-z]+\\.(com|vn)+$";

    public Validate() {
    }

    public boolean validatePhone(String regex) {
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateEmail(String regex) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validatePhoneOrName(String keyword, String regex) {
        keyword = keyword.toLowerCase();
        String REGEX_PHONE = ".*" + keyword + ".*";
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(regex.toLowerCase());
        return matcher.matches();
    }
}
