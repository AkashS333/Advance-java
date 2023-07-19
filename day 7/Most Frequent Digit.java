import java.util.HashMap;
import java.util.Map;

class UserMainCode {
    public static int MostFrequentDigit(int input1, int input2, int input3, int input4) {
        Map<Integer, Integer> digitCount = new HashMap<>();

        countDigits(input1, digitCount);
        countDigits(input2, digitCount);
        countDigits(input3, digitCount);
        countDigits(input4, digitCount);

        int maxCount = 0;
        int mostFrequentDigit = 0;

        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            int digit = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && digit > mostFrequentDigit)) {
                maxCount = count;
                mostFrequentDigit = digit;
            }
        }

        return mostFrequentDigit;
    }

    private static void countDigits(int number, Map<Integer, Integer> digitCount) {
        while (number != 0) {
            int digit = number % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
    }
}
