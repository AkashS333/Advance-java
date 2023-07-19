import java.util.*;

class UserMainCode {
    public String secondWordUppercase(String input1) {
        String[] words = input1.split(" ");
        if (words.length < 2) {
            return "LESS";
        } else {
            return words[1].toUpperCase();
        }
    }
}
