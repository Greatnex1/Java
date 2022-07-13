package MyPractices;

import java.util.Scanner;

public class TweleveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unit = """
                         Twelve Days of Christmas lyrics :
                         
                Press 1 to view first Stanza
                Press 2 to view second Stanza
                Press 3 to view third Stanza
                Press 4 to view fourth Stanza
                Press 5 to view fifth Stanza
                Press 6 to view sixth Stanza
                Press 7 to view seventh Stanza
                Press 8 to view eight Stanza
                Press 9 to view ninth Stanza
                Press 10 to view tenth Stanza
                Press 11 to view eleventh Stanza
                Press 12 to view twelfth Stanza
                """;
        System.out.println(unit);

     int   first = scan.nextInt();
        switch (first) {
            case 1 -> System.out.println("""
                    On the first day of Christmas
                    My true love sent to me
                    A partridge in a pear tree
                     """);
            case 2 -> System.out.println("""
                    On the second day of Christmas
                    My true love sent to me
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 3 -> System.out.println("""
                    On the third day of Christmas
                    My true love sent to me
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 4 -> System.out.println("""
                    On the fourth day of Christmas
                    My true love sent to me
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 5 -> System.out.println("""
                    On the fifth day of Christmas
                    My true love sent to me
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 6 -> System.out.println("""
                    On the sixth day of Christmas
                    My true love sent to me
                    Six geese a laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 7 -> System.out.println("""
                    On the seventh day of Christmas
                    My true love sent to me
                    Seven swans a swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 8 -> System.out.println("""
                    On the eighth day of Christmas
                    My true love sent to me
                    Eight maids a milking
                    Seven swans a swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 9 -> System.out.println("""
                    On the ninth day of Christmas
                    My true love sent to me
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 10 -> System.out.println("""
                    On the tenth day of Christmas
                    My true love sent to me
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 11 -> System.out.println("""
                    On the 11th day of Christmas
                    My true love sent to me
                    I sent 11 pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    """);
            case 12 -> System.out.println("""
                    On the 12th day of Christmas
                    My true love sent to me
                    12 drummers drumming
                    Eleven pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings (five golden rings)
                    Four calling birds
                    Three French hens
                    Two turtle-doves
                    And a partridge in a pear tree
                    And a partridge in a pear tree
                    """);
        }
    }
}

