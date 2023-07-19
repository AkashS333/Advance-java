import java.io.*;
import java.util.*;

// Read only region start
class UserMaincode

public int isPalindrome(string input1){
// Read only region end
// Write code here...
 String input = input1.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return 1;
            }
            left++;
            right--;
        }
        
        return 2;
    }
}    