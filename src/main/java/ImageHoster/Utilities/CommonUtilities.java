package ImageHoster.Utilities;

import java.util.regex.*;

public class CommonUtilities {
    public static boolean isValidPassword(String password) {
        //used regular expression to validate the password as mentioned in the assignment.

        String regex = "^(?=.*?[A-Z,a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{3,}$";

        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
