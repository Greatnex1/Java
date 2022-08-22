package CHP_14;

import java.util.ArrayList;
import java.util.List;

public class SpamScanner {

    private static String[] spamPhrases = {"Auto email removal", "Free trial", "Free website", "Being a member",
            "Please read", " Be amazed\t", " Full refund\t", "Buy direct", "Pure profit", " \tGet paid", "Promise you",
            "Get It Now\t", "\tRemoval instructions", "Hidden assets", "Gift certificate", "   Print form signature",
            "Potential earnings\t", "Bulk email\t", " Avoid bankruptcy", "Home employment", "Refinance home",
            "Produced and sent out", "Be your own boss", "Real thing", "Billing address", "Great offer", " Big bucks",
            "Billion dollars", "Guarantee Refunding", "Brand new pager	Have you been turned down?", "Get started now",
            "Earn massive Profits", "Print out and fax", "Bill"};


    public String[] getSpamPhrasesList() {
        return spamPhrases;
    }

    public static int countSpamPhrases(String mail) {
        int count = 0;
        for (String spam : spamPhrases) {
            if (mail.toLowerCase().contains(spam.toLowerCase())) {
                count++;
            }
           
        }
        return count;
    }
//        public static String rateEmail (String wim){
//            return
//
//        }
//    public static int countWords(String mail){
//        List<String> words = new ArrayList<>();
//        var mailWords =  mail.split(" ");
//        for (String wrd : mailWords){
//            if(!wrd.equals(" "))words.add(wrd);
//
//        }
//        return words.size();
//
//    }

//    }
}