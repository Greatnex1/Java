package MyPractices;

import javax.swing.*;
import java.security.SecureRandom;

public class Whots {
    private byte cardShape;
    private byte cardValue;
    SecureRandom rand = new SecureRandom();

    public String getCardShape(){
        String cardShape = "";
        switch(this.cardShape) {
            case 1 -> cardShape = "Circle";

            case 2 -> cardShape = "Triangle";

            case 3 -> cardShape = "Cross";

            case 4 -> cardShape = "Square";

            case 5 -> cardShape = "Star";


            case 6 -> cardShape = "Diamond";

        }


        return cardShape;



        }
        public void  setCardShape(){
        cardShape = (byte)(1+ rand.nextInt(6));
    }
    public  short getCardValue(){
        return cardValue;
    }
//    public void setCardValue(){
//        setCardShape();
//
//        byte tempCardValue = (byte) (1 + rand.nextInt(14));
//
//        switch(cardShape){
//            case 2 ->
//                switch(tempCardValue){
//                case 9 ->
//
//                setCardValue();
//                default ->
//                    cardValue = tempCardValue;
//
//                }
//            default ->
//                cardValue = 20;
//        }
//
//    }
//    public void display(){
//        setCardValue();
//        String card = "The card value is " + getCardValue() + " " + getCardShape();
//        JOptionPane.showMessageDialog(null, card);
//    }
    public static void arrayAdder(int arrayLength) {
        int total = 0;
        String numberList = "";
        int[] newArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = Integer.parseInt(JOptionPane.showInputDialog(("Enter a number")));
            numberList = numberList + newArray[1] + " ";
        }
        for (int addCounter = 0; addCounter < arrayLength; addCounter++) {
            total += newArray[addCounter];

        }
        String message = " ";

        String message3 = String.format("The sum of %d numbers is %d", arrayLength, total);
        message = numberList + message3;
        JOptionPane.showMessageDialog(null, message);
    }
        public static void assignment(){
            int[] newArray =new int[10];
            System.out.printf(" %s%10s%n", "Index", "Value");
            for (int i = 0; i < newArray.length ; i++) {
                newArray[i] = newArray.length - (i + 1);
                System.out.printf("%d%10d%n", 1, newArray[i]);
            }
        }
    }

