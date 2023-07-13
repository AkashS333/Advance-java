import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode {
    public int digitsum(int input1) {
        // Read only region end
        // Write code here...
        int sum = 0;
        // Convert the input number to a positive value
        int num = Math.abs(input1);

        while (num > 9) {
            sum = 0;

            // Calculate the digit sum of the number
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        // If the original input was negative, make the result negative
        if (input1 < 0)
            sum *= -1;

        return sum;
    }
}
