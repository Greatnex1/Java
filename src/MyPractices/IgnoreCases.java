package MyPractices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IgnoreCases {

    private char[] charryArray;


    public IgnoreCases(String s) {
        this.charryArray = s.toCharArray();
    }

    public int indexOf(String subString, boolean ignoreCase) {
        char[] substringCharArray = subString.toCharArray();
        int lengthOfSubString = subString.length();
        char[] subArray = new char[lengthOfSubString];

        for (int i = 0; i <= charryArray.length-lengthOfSubString; i++) {

            for (int j = 0; j < lengthOfSubString; j++) {

                subArray[i] = charryArray[j + i];
            }
            int j = 0;
            while (j < subArray.length) {
                if (ignoreCase) {
                    if (!String.valueOf(subArray[j]).equalsIgnoreCase(String.valueOf(substringCharArray))) {
                        break;
                    } else {
                        if (!String.valueOf(subArray[j]).equalsIgnoreCase(String.valueOf(substringCharArray))) {
                            break;
                        }


                    }

                    j++;

                }
                if (j == subArray.length) {
                    return i;
                }

            }

        }
        return -1;

    }


        public static void main (String[]args){
            IgnoreCases s = new IgnoreCases("Ehis");
            int value = s.indexOf("his", true);
            System.out.println(value);
        }
    }
