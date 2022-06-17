package CHP_7;



public class Boo {
    public static void main(String[] args) {

        boolean b [] = new boolean [2];

        b[0] = true;
        b[1] = false;
        for (int i = 0; i <b.length ; i++) {

            System.out.println("boolean array Element : "+ i + " is " + b[i]);
        }

    }
}

// Converting boolean array to String
//    public static void main(String args[])
//    {
//        boolean boolean_array[] = {true, false, true, true};
//        // converting java boolean array to string
//        System.out.println("converted boolean array to String");
//        System.out.println(Arrays.toString(boolean_array));
////    }
//public class KboatSDAMarks
//{
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number of students: ");
//        int n = in.nextInt();
//
//        String name[] = new String[n];
//        int totalmarks[] = new int[n];
//        int grandTotal = 0;
//
//        for (int i = 0; i < n; i++) {
//            in.nextLine();
//            System.out.print("Enter name of student " + (i+1) + ": ");
//            name[i] = in.nextLine();
//            System.out.print("Enter total marks of student " + (i+1) + ": ");
//            totalmarks[i] = in.nextInt();
//            grandTotal += totalmarks[i];
//        }
//
//        double avg = grandTotal / (double)n;
//        System.out.println("Average = " + avg);
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Deviation for " + name[i] + " = "
//                    + (totalmarks[i] - avg));
//        }