package MyPractices;

public class StringClass {
    public static void main(String[] args) {

        String s = "abcdabcdabca";
        int numbersA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                numbersA++;
//s.compareTo("a");
            }
           //          for (numbersA: s) {
////            System.out.println(numbersA);
//////            }

        }
        System.out.println(numbersA);

//
//
//        String nameOne = "Nice";
//        nameOne.regionMatches(0, true);
//        System.out.println(nameOne.lastIndexOf("ce"));
    }


}
// == compares by reference.

// .equals compares by content
//this. is used to refer to the attribute belonginig to a particular variable and casnnot be used to access static varibles.
//.equalsIgnoreCase is used in java ti ignore ignore the case of a sentence i.e it compares cases and ignore cas sentences
//e.g
//"a".equalsIgnoreCase("A");

//a method signature consists of the methosd name, number of parameters and it returns type.
//toString prints out an Array