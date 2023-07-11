import java.io.*;
import java.util.*;
// Remove unnecessary import statements

// Read only region start
class UserMainCode {
    public int secondLastDigitOf(int input1) {
        // Read only region end
        // write code here...
        int absInput = Math.abs(input1);
        int lastDigit = absInput % 10;
        int secondLastDigit = (absInput / 10) % 10;

        return secondLastDigit;
    }
}
