package MyPractices;

import java.util.Scanner;

public class TweleveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tweleve Days of Christmas lyrics:");
        System.out.println("Press 1 to view first Stanza");
        System.out.println("Press 2 to view second Stanza");
        System.out.println("Press 3 to view third Stanza");
        System.out.println("Press 4 to view fourth Stanza");
        System.out.println("Press 5 to view fifth Stanza");
        System.out.println("Press 6 to view sixth Stanza");
        System.out.println("Press 7 to view seventh Stanza");
        System.out.println("Press 8 to view eight Stanza");
        System.out.println("Press 9 to view ninth Stanza");
        System.out.println("Press 10 to view tenth Stanza");
        System.out.println("Press 11 to view eleventh Stanza");
        System.out.println("Press 12 to view twelevth Stanza");


        int first = scan.nextInt();
        switch (first) {
            case 1:
                System.out.println("On the first day of Christmas\n" +
                        "My true love sent to me\n" +
                        "A partridge in a pear tree\n  ");
                break;


                case 2:

                    System.out.println("On the second day of Christmas\n" +
                            "My true love sent to me\n" +
                            "Two turtle-doves\n" +
                            "And a partridge in a pear tree\n");

                    break;


                case 3:
                    System.out.println("On the third day of Christmas\n" +
                            "My true love sent to me\n" +
                            "Three French hens\n" +
                            "Two turtle-doves\n" +
                            "And a partridge in a pear tree \n");
                    break;

                case 4:
                    System.out.println("On the fourth day of Christmas\n" +
                            "My true love sent to me\n" +
                            "Four calling birds\n" +
                            "Three French hens\n" +
                            "Two turtle-doves\n" +
                            "And a partridge in a pear tree\n");

            break;
                case 5:
                    System.out.println("On the fifth day of Christmas\n" +
                            "My true love sent to me\n" +
                            "Five golden rings (five golden rings)\n" +
                            "Four calling birds\n" +
                            "Three French hens\n" +
                            "Two turtle-doves\n" +
                            "And a partridge in a pear tree\n");
                    break;

                case 6:
                    System.out.println("On the sixth day of Christmas\n" +
                            "My true love sent to me\n" +
                            "Six geese a laying\n" +
                            "Five golden rings (five golden rings)\n" +
                            "Four calling birds\n" +
                            "Three French hens\n" +
                            "Two turtle-doves\n" +
                            "And a partridge in a pear tree\n");
                    break;
            case 7:
            System.out.println("On the seventh day of Christmas\n" +
                    "My true love sent to me\n" +
                    "Seven swans a swimming\n" +
                    "Six geese a-laying\n" +
                    "Five golden rings (five golden rings)\n" +
                    "Four calling birds\n" +
                    "Three French hens\n" +
                    "Two turtle-doves\n" +
                    "And a partridge in a pear tree\n");
            break;

            case 8:
                System.out.println("On the eighth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Eight maids a milking\n" +
                        "Seven swans a swimming\n" +
                        "Six geese a-laying\n" +
                        "Five golden rings (five golden rings)\n" +
                        "Four calling birds\n" +
                        "Three French hens\n" +
                        "Two turtle-doves\n" +
                        "And a partridge in a pear tree\n");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Nine ladies dancing\n" +
                        "Eight maids a-milking\n" +
                        "Seven swans a-swimming\n" +
                        "Six geese a-laying\n" +
                        "Five golden rings (five golden rings)\n" +
                        "Four calling birds\n" +
                        "Three French hens\n" +
                        "Two turtle-doves\n" +
                        "And a partridge in a pear tree\n");
                break;

            case 10:
                System.out.println("On the tenth day of Christmas\n" +
                        "My true love sent to me\n" +
                        "Ten lords a-leaping\n" +
                        "Nine ladies dancing\n" +
                        "Eight maids a-milking\n" +
                        "Seven swans a-swimming\n" +
                        "Six geese a-laying\n" +
                        "Five golden rings (five golden rings)\n" +
                        "Four calling birds\n" +
                        "Three French hens\n" +
                        "Two turtle-doves\n" +
                        "And a partridge in a pear tree\n");
                break;

            case 11:
                System.out.println("On the 11th day of Christmas\n" +
                        "My true love sent to me\n" +
                        "I sent 11 pipers piping\n" +
                        "Ten lords a-leaping\n" +
                        "Nine ladies dancing\n" +
                        "Eight maids a-milking\n" +
                        "Seven swans a-swimming\n" +
                        "Six geese a-laying\n" +
                        "Five golden rings (five golden rings)\n" +
                        "Four calling birds\n" +
                        "Three French hens\n" +
                        "Two turtle-doves\n" +
                        "And a partridge in a pear tree\n");
                break;

            case 12:
                System.out.println("On the 12th day of Christmas\n" +
                        "My true love sent to me\n" +
                        "12 drummers drumming\n" +
                        "Eleven pipers piping\n" +
                        "Ten lords a-leaping\n" +
                        "Nine ladies dancing\n" +
                        "Eight maids a-milking\n" +
                        "Seven swans a-swimming\n" +
                        "Six geese a-laying\n" +
                        "Five golden rings (five golden rings)\n" +
                        "Four calling birds\n" +
                        "Three French hens\n" +
                        "Two turtle-doves\n" +
                        "And a partridge in a pear tree\n" +
                        "And a partridge in a pear tree\n");
            }
        }
    }

