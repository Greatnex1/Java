package MyPractices;

import java. util. *;


public class Phone {

    static void sweet() {
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call Register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. Sim Service");

    }
    static void phone(){
        System.out.println("1.Search");
        System.out.println("2. Service Numbers");
        System.out.println("3. Add name");
        System.out.println("4. Service Numbers");
        System.out.println("5. Edit");
        System.out.println("6. Assign tone");
        System.out.println("7. Send b'card");
        System.out.println("8. Options");
        System.out.println("9. Speed dials");
        System.out.println("10. Voice tags");
        System.out.println("Press 0 to go back to List Functions");


    }
    static void mess(){
        System.out.println("2.Messages");
        System.out.println("1.Write Messages");
        System.out.println("2.Inbox");
        System.out.println("3.Outbox");
        System.out.println("4. Picture Messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
    }
static void call(){
    System.out.println("4. Call Register, Press 1");
    System.out.println("0. Back to List Functions");


}

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        System.out.println("List of Menu functions");
        System.out.println("Press 1 to view List of Menu Functions");

        int sweet = keyInput.nextInt();
        switch (sweet) {
            case 1:
                System.out.println("1. Phone book");
                System.out.println("2. Messages");
                System.out.println("3. Chat");
                System.out.println("4. Call Register");
                System.out.println("5. Tones");
                System.out.println("6. Settings");
                System.out.println("7. Call divert");
                System.out.println("8. Games");
                System.out.println("9. Calculator");
                System.out.println("10. Reminders");
                System.out.println("11. Clock");
                System.out.println("12. Profiles");
                System.out.println("13. Sim Service");

        }
        int phone = keyInput.nextInt();
        switch (phone) {
            case 1:
                System.out.println("1.Search");

            case 33:
                System.out.println("2. Service Numbers");

            case 43:
                System.out.println("3. Add name");

            case 16:
                System.out.println("4. Service Numbers");

            case 15:
                System.out.println("5. Edit");

            case 23:
                System.out.println("6. Assign tone");

            case 17:
                System.out.println("7. Send b'card");
            case 18:
                System.out.println("8. Options");
            case 19:
                System.out.println("9. Speed dials");
            case 29:
                System.out.println("10. Voice tags");

            case 28:
                System.out.println("Press 0 to go back to List Functions");

                int uInput = keyInput.nextInt();
                switch (uInput) {
                    case 8:
                        System.out.println("   1.Type of View");
                        System.out.println("   2.Memory status");

                        System.out.println("Press 0 to go back" );
                        int uwInput = keyInput.nextInt();
                        switch (uwInput) {

                            case 0:
                                phone();}

                        int uhInput = keyInput.nextInt();
                                switch (uhInput){
                            case 0:
                                sweet();
                        }


                }



                break;

                    case 2:
                        System.out.println("2.Messages");
                        int mess= keyInput.nextInt();
                        switch (mess) {
                            case 1:
                                System.out.println("1.Write Messages");
                            case 2:
                                System.out.println("2.Inbox");
                            case 3:
                                System.out.println("3.Outbox");
                            case 4:
                                System.out.println("4. Picture Messages");
                            case 51:
                                System.out.println("5. Templates");
                            case 6:
                                System.out.println("6. Smileys");
                            case 7:
                                System.out.println("7. Message settings");
                            case 8:
                                System.out.println("0. Back to List Functions");

                                int byInput = keyInput.nextInt();
                                switch (byInput) {

                                    case 0:
                                        sweet();


                                    case 7:
                                        System.out.println("  1. Set 1");
                                        System.out.println("  2.Common");
                                        System.out.println("  0. Back to Message");

                                        int uxyInput = keyInput.nextInt();
                                        switch (uxyInput) {
                                            case 0:
                                                mess();
                                        }


                                                int sInput = keyInput.nextInt();
                                        switch (sInput) {
                                            case 1:
                                                System.out.println("   1. Message Center Number");
                                            case 2:
                                                System.out.println("   2. Message sent as");
                                            case 3:
                                                System.out.println("   3. Message validity");
                                        }
                                                int bInput = keyInput.nextInt();
                                                switch (bInput) {
                                                    case 2:
                                                        System.out.println("  2.Common");

                                                        int jInput = keyInput.nextInt();
                                                        switch (jInput) {
                                                            case 1:
                                                                System.out.println("   1.Delievery reports");
                                                            case 2:
                                                                System.out.println("   2. Reply via same centre");
                                                            case 29:
                                                                System.out.println("   3. Character support");
                                                            case 24:
                                                                System.out.println("8. info Service");
                                                            case 30:
                                                                System.out.println("9. Voice mailbox number");
                                                            case 26:
                                                                System.out.println("10. Service command editor");
                                                            case 48:
                                                                System.out.println("0. Back to Messages");
                                                                System.out.println("1. Back to List Functions");
                                                        }
                                                        int uxInput = keyInput.nextInt();
                                                        switch (uxInput) {
                                                            case 0:
                                                                mess();
                                                                break;
                                                            case 1:
                                                                sweet();
                                                        }
                                                }

                                }
                                break;
                            //    case 39:
                            //  System.out.println("0. Back to List Functions");

                            //  int uxbInput = keyInput.nextInt();
                            //  switch (uxbInput) {
                            //   case 0:
                            //   sweet();

                            case 38:
                                System.out.println("0. Back to List Functions");

                                int uxbInput = keyInput.nextInt();
                                switch (uxbInput) {

                                    case 0:
                                        sweet();


                                        break;
                                }

                        }

                        break;

                    case 3:
                        System.out.println("3.Chats");
                        System.out.println("0. Back to List Functions");

                 int utInput = keyInput.nextInt();
                 switch (utInput) {
                     case 0:
                         sweet();

                 }
            break;

                    case 4:

                        System.out.println("4. Call Register, Press 1");
                        System.out.println("0. Back to List Functions");

                int call = keyInput.nextInt();
                switch (call) {
                    case 0:
                        sweet();

                        break;


                    case 1:
                        System.out.println("1. Missed call");
                    case 22:
                        System.out.println("2. Received call");
                    case 23:
                        System.out.println("3. Dialled number");
                    case 24:
                        System.out.println("4. Erase recent call lists");
                    case 25:
                        System.out.println("5. Show call duration");
                    case 26:
                        System.out.println("6. Show call costs");
                    case 27:
                        System.out.println("7. Call cost Settings");
                    case 28:
                        System.out.println("8. Prepaid Credit");
                    case 29:
                        System.out.println("0. Back ");


                        int uxbdInput = keyInput.nextInt();
                        switch (uxbdInput) {
                            case 0:
                                call();
                        }

                        int udbdtInput = keyInput.nextInt();
                        switch (udbdtInput) {

                            case 5:
                                System.out.println("    1. Last call duration");
                            case 2:
                                System.out.println("    2. All call's duration");
                            case 3:
                                System.out.println("    3. Received call's duration");

                            case 4:
                                System.out.println("   4. Dialled call's duration");

                            case 51:
                                System.out.println("     5. Cleartimers");
                            case 46:
                                System.out.println("    0. Back");
                                int uxbdtInput = keyInput.nextInt();
                                switch (uxbdtInput) {
                                    case 0:
                                        call();
                                }
                        }

                         break;

                            case 6:
                                System.out.println("1. Last call costs");
                            case 52:
                                System.out.println("    2. All call's costs");
                            case 53:
                                System.out.println("    3. Clear counters");


                                break;

                            case 7:
                                System.out.println("  1. Call cost limit");
                            case 55:
                                System.out.println("  2. Show costs in");

                                 break;

                            case 8:
                                System.out.println("8.Prepaid credit");



                }
                                       break;


                           case 5:
                                System.out.println("5. Tones");

                        int joInput = keyInput.nextInt();
                        switch (joInput) {
                            case 5:
                                System.out.println("  1. Ringtone");
                            case 2:
                                System.out.println("  2. Ringing volume");
                            case 3:
                                System.out.println("  3. incoming call alert");
                            case 4:
                                System.out.println("  4. Composer");
                            case 10:
                                System.out.println("  5. Message alert tone");
                            case 6:
                                System.out.println("  6. Keypad tones");
                            case 7:
                                System.out.println(" 7. Warning and game tones");
                            case 8:
                                System.out.println("  8. Vibrating alert");
                            case 9:
                                System.out.println("  9. Screen saver");
                        }
                        break;
                    case 6:
                        System.out.println("6.Settings");
                        System.out.println("0. Back to List Functions");

                        int utoInput = keyInput.nextInt();
                        switch (utoInput) {
                            case 0:
                                sweet();

                        }



                        int juInput = keyInput.nextInt();
                        switch (juInput) {
                            case 6:
                                System.out.println("1. Call Settings");
                            case 2:
                                System.out.println("2. Automatic redial");
                            case 3:
                                System.out.println("3. Speed dialing");
                            case 4:
                                System.out.println("4. Own number Settings");
                            case 5:
                                System.out.println("5. Phone line in use");

                            case 7:
                                System.out.println("6. Automatic answer");
                        }
                        int jitInput = keyInput.nextInt();
                        switch (jitInput) {
                            case 2:
                                System.out.println("2. Phone setting");
                        }
                        int jipInput = keyInput.nextInt();
                        switch (jipInput) {
                            case 1:
                                System.out.println("1. Language");
                                break;
                            case 2:
                                System.out.println("2. Cell info display");
                                break;
                            case 3:
                                System.out.println("3. Welcome note");
                                break;
                            case 4:
                                System.out.println("4. Network settings");
                                break;
                            case 5:
                                System.out.println("5. Light");
                                break;
                            case 6:
                                System.out.println("6. Confirm SIM service actions");
                        }
                        int justInput = keyInput.nextInt();
                        switch (justInput) {
                            case 1:
                                System.out.println("Security settings");
                        }

                        int jxInput = keyInput.nextInt();
                        switch (jxInput) {
                            case 1:
                                System.out.println("1. Pin code requests");
                            case 2:
                                System.out.println("2. Call barring  services");
                            case 3:
                                System.out.println("3.Fixed dialing");
                            case 4:
                                System.out.println("4. Closed user group");
                            case 5:
                                System.out.println("5. Phone Security");
                            case 6:
                                System.out.println("6. Change Access Code");
                            case 7:
                                System.out.println("7. Restore factory settings");

                                break;
                        }
                        case 7:
                                System.out.println("7. Call divert");
                            System.out.println("0. Back to List Functions");

                            int utaInput = keyInput.nextInt();
                            switch (utaInput) {
                                case 0:
                                    sweet();

                            }

                            break;

                    case 8:
                        System.out.println("8.Games");
                        System.out.println("0. Back to List Functions");

                        int uteInput = keyInput.nextInt();
                        switch (uteInput) {
                            case 0:
                                sweet();

                        }


                        break;

                    case 9:
                        System.out.println("9.Calculator");
                        System.out.println("0. Back to List Functions");

                        int utzInput = keyInput.nextInt();
                        switch (utzInput) {
                            case 0:
                                sweet();

                        }

                        break;

                        case 10:
                                System.out.println("10. Reminders");
                            System.out.println("0. Back to List Functions");

                            int utxInput = keyInput.nextInt();
                            switch (utxInput) {
                                case 0:
                                    sweet();

                            }


                            case 11:
                                System.out.println("11. Clock");

                                int utnInput = keyInput.nextInt();
                                switch (utnInput) {

                                    case 1:
                                System.out.println("1.Alarm Clock");
                            case 3:
                                System.out.println("2. Clock Settings");
                                break;
                            case 4:
                                System.out.println("3. Date Setting");
                            case 5:
                                System.out.println("4. StopWatch");
                                break;
                            case 6:
                                System.out.println("5, countdown timer");
                                break;
                            case 7:
                                System.out.println("6. Auto update of date and time");

                        }
                            case 12:
                                System.out.println("12. Profiles");
                                System.out.println("0. Back to List Functions");

                                int utdInput = keyInput.nextInt();
                                switch (utdInput) {
                                    case 0:
                                        sweet();
                                }


                            case 13:
                                System.out.println("13. Sim Service");
                                System.out.println("0. Back to List Functions");

                                int utvInput = keyInput.nextInt();
                                switch (utvInput) {
                                    case 0:
                                        sweet();

                                }


                        }
                }


        }

















