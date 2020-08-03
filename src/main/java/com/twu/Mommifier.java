package com.twu;

/**
 * Created by wzw on 2020/8/3
 *
 * @author wzw
 */
public class Mommifier {

    public String momifierString(String inputString) throws Exception {
        if (inputString == null || "".equals(inputString)) {
            throw new Exception("input is wrong");
        }
        int length = inputString.length();
        double threshold = 0.3;
        int vowelsLength = 0;
        for (int i = 0; i < length; i++) {
            if (isVowels(inputString.charAt(i))) {
                vowelsLength++;
            }
        }
        if (vowelsLength > threshold * length) {
            inputString = addMommyInString(inputString);
        }
        return inputString;
    }

    private String addMommyInString(String inputString) {
        String resultString = inputString;
        for (int i = 0; i < inputString.length() - 1; i++) {
            if (isVowels(inputString.charAt(i)) && isVowels(inputString.charAt(i + 1))) {
                String preString = resultString.substring(0, i + 1);
                String nextString = resultString.substring(i + 1, inputString.length());
                resultString = preString + "mommy" + nextString;
            }
        }
        return resultString;
    }

    private boolean isVowels(char c) {
        String vowels = "aeiou";
        return vowels.contains(String.valueOf(c));
    }
}
