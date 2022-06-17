package CHP_7;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String... args) {
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        ShoppingCartMethod receipt = new ShoppingCartMethod();
        //String format
        // String set = String.format("name is %s", name)


        System.out.print("Enter customer name : ");
        String customer = input.nextLine();
        String addItem = "yes";
        int counter = 0;
        double subTotal = 0.0;
        while (Objects.equals(addItem, "yes")) {
            System.out.print("What item is purchased : ");
            String buyer = input.nextLine();
            receipt.addItem(buyer, counter);

            System.out.print("How many pieces of the item is purchased :");
            int purchase = input.nextInt();
            receipt.addQuantity(purchase, counter);

            System.out.print("How much per unit : ");
            int per = input.nextInt();
            input.nextLine();
            receipt.addPrice(per, counter);

            System.out.print("Add more item? yes or no : ");
            addItem = input.nextLine();


            counter++;

        }


        System.out.println(" Enter Cashier name : ");
        String cash = input.nextLine();

        
        System.out.println("How much discount : ");
        double discount = input.nextDouble();

        for (int i = 0; i < counter ; i++) {
            subTotal = receipt.total(i);

        }
        discount = 10.0;
        double discountAmount = 0.0;
        for (int i = 0; i < counter ; i++) {
            discountAmount = discount/100 * subTotal;

        }
        double vat = 0.0;
        double vats = 17.5;
        for (int i = 0; i < counter ; i++) {
            vat = vats/ 100 + subTotal;

        }
        double bill = 0.0;
        for (int i = 0; i <counter ; i++) {
            bill = subTotal - discountAmount + vat;

        }
       //          String formatted = block.formatted(LocalDateTime.now().toString(),cashier, cost);
//        System.out.println(formatted);


        System.out.printf("""


                 SEMICOLON STORES
                 MAIN BRANCH
                 LOCATION: 312,HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                 TEL: 03299388343  
                 Date: %s
                 Cashier: %s 
                 Customer Name : %s
                 =======================================================================================
  
                                            ITEM       QTY        PRICE             TOTAL(NGN)
                ----------------------------------------------------------------------------------------
                """,date,cash,customer);


        for (int i = 0; i <counter ; i++) {
            System.out.printf("%32s%12d%17.2f%n", receipt.getItem(i), receipt.getQuantity(i), receipt.getPrice(i));
        }
        System.out.println("=".repeat(80));
        System.out.printf("%40s%20.2f%n", "Subtotal : ", subTotal);
        System.out.printf("%40s%20.2f%n", "Discount : ", discountAmount);
        System.out.printf("%40s%20.2f%n", "VAT@17.50percent: ", vat);
        System.out.println("===========================================================================");
        System.out.printf("%38s%20.2f%n", "Bill: ", bill);
        System.out.println("===========================================================================");
        System.out.printf("                    THIS IS NOT A RECEIPT KINDLY PAY %.2f(NGN)\n", bill);
        System.out.println("=".repeat(80));
        System.out.println("How much is given to you by the customer: ");
        double amountPaid = input.nextDouble();

        double balance = amountPaid - bill;

        System.out.printf("""
                   
                   
                 SEMICOLON STORES
                 MAIN BRANCH
                 LOCATION: 312,HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                 TEL: 03299388343  
                 Date: %s
                 Cashier: %s 
                 Customer Name : %s
                 =======================================================================================
  
                                                 ITEM       QTY        PRICE             TOTAL(NGN)
                ----------------------------------------------------------------------------------------
                ----------------------------------------------------------------------------------------

    
                   """,date,cash, customer);

        for (int i = 0; i < counter; i++) {
            System.out.printf("%40s%11d%12.2f%17.2f%n", receipt.getItem(i), receipt.getQuantity(i), receipt.getPrice(i),
            receipt.total(i));
        }
        System.out.println("=".repeat(80));
        System.out.println("=".repeat(80));
        System.out.printf("%90s%20.2f%n", "Subtotal : ", subTotal);
        System.out.printf("%40s%20.2f%n", "Discount : ", discountAmount);
        System.out.printf("%40s%20.2f%n", "VAT@17.50percent: ", vat);
        System.out.println("===========================================================================================");
        System.out.printf("%48s%20.2f%n", "Bill: ", bill);
        System.out.println("===========================================================================================");
        System.out.printf("%50s%20.2f%n","Amount paid :", amountPaid);
        System.out.printf("%50s%2.2f%n","Balance :", balance);

    }
}

     /*   System.out.println("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312,HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 0329388343
                Date: 20-May-22
                Cashier :
                Customer Name:"""+cost);
                System.out.println(  """


         """;*/
//                ==============================================================
//                                   ITEM      QTY     PRICE        TOTAL(NGN)
//                ---------------------------------------------------------------
//
//                """ + cost);
