import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode {
    public int addLastDigits(int input1, int input2) {
        // Read only region end
        
        // write code here...
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        int sum = lastDigit1 + lastDigit2;
        return sum;
    }
}
