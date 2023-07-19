import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode {
  int weight = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : input1.toCharArray()) {
            if (Character.isLetter(c)) {
                int charWeight = Character.toLowerCase(c) - 'a' + 1;
                
                if (input2 == 1 || !vowels.contains(Character.toString(c))) {
                    weight += charWeight;
                }
            }
        }
        
        return weight;
    }
}