package MyPractices;

import java. util. *;


public class Phone {

    static void sweet(){
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
        int useInput = keyInput.nextInt();
        switch (useInput) {
            case 1:
                System.out.println("1.Search");

            case 14:
                System.out.println("2. Service Numbers");

            case 13:
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

                int uInput = keyInput.nextInt();
                switch (uInput) {
                    case 1:
                        System.out.println("   1.Type of View");
                    case 2:
                        System.out.println("   2.Memory status");
                }


            case 19:
                System.out.println("9. Speed dials");
            case 10:
                System.out.println("10. Voice tags");

            case 28:
                System.out.println("Press 0 to go back to List Functions");

                int umInput = keyInput.nextInt();
                switch (umInput) {
                    case 0:
                        sweet();

                }
                break;

                    case 2:
                        System.out.println("2.Messages");
                        int ufInput = keyInput.nextInt();
                        switch (ufInput) {
                            case 1:
                                System.out.println("1.Write Messages");
                            case 2:
                                System.out.println("2.Inbox");
                            case 10:
                                System.out.println("3.Outbox");
                            case 20:
                                System.out.println("4. Picture Messages");
                            case 21:
                                System.out.println("5. Templates");
                            case 22:
                                System.out.println("6. Smileys");
                            case 23:
                                System.out.println("7. Message settings");
                        }

                        int usedInput = keyInput.nextInt();
                        switch (usedInput) {
                            case 1:
                                System.out.println("  1. Set 1");
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
                        }
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
                        }
                        break;

                    case 3:
                        System.out.println("3.Chats");

                        break;

                    case 4:

                        System.out.println("4. Call Register");


                        int yInput = keyInput.nextInt();
                        switch (yInput) {
                            case 1:
                                System.out.println("1. Missed call");
                            case 2:
                                System.out.println("2. Received call");
                            case 3:
                                System.out.println("3. Dialled number");
                            case 4:
                                System.out.println("4. Erase recent call lists");
                            case 5:
                                System.out.println("5. Show call duration");
                        }
                        int oInput = keyInput.nextInt();
                        switch (oInput) {
                            case 5:
                                System.out.println("  5.Show call duration");
                        }
                        int vInput = keyInput.nextInt();
                        switch (vInput) {
                            case 1:
                                System.out.println("    1. Last call duration");
                            case 2:
                                System.out.println("    2. All call's duration");
                            case 3:
                                System.out.println("    3. Received call's duration");

                            case 4:
                                System.out.println("   4. Dialled call's duration");

                            case 5:
                                System.out.println("     5. Cleartimers");
                        }
                        int nInput = keyInput.nextInt();
                        switch (nInput) {
                            case 6:
                                System.out.println("6. Show call costs");
                        }
                        int hInput = keyInput.nextInt();
                        switch (hInput) {
                            case 1:
                                System.out.println("1. Last call costs");
                            case 2:
                                System.out.println("    2. All call's costs");
                            case 3:
                                System.out.println("    3. Clear counters");

                        }
                        int zInput = keyInput.nextInt();
                        switch (zInput) {
                            case 7:
                                System.out.println("  7. Call cost Settings");
                        }
                        int hiInput = keyInput.nextInt();
                        switch (hiInput) {
                            case 1:
                                System.out.println("  1. Call cost limit");
                            case 2:
                                System.out.println("  2. Show costs in");

                        }
                        int opInput = keyInput.nextInt();
                        switch (opInput) {
                            case 8:
                                System.out.println("Prepaid credit");

                        }
                        int opiInput = keyInput.nextInt();
                        switch (opiInput) {
                            case 5:
                                System.out.println("5. Tones");
                        }
                        int joInput = keyInput.nextInt();
                        switch (joInput) {
                            case 1:
                                System.out.println("  1. Ringtone");
                            case 2:
                                System.out.println("  2. Ringing volume");
                            case 3:
                                System.out.println("  3. incoming call alert");
                            case 4:
                                System.out.println("  4. Composer");
                            case 5:
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


                        int juInput = keyInput.nextInt();
                        switch (juInput) {
                            case 1:
                                System.out.println("1. Call Settings");
                            case 2:
                                System.out.println("2. Automatic redial");
                            case 3:
                                System.out.println("3. Speed dialing");
                            case 4:
                                System.out.println("4. Own number Settings");
                            case 5:
                                System.out.println("5. Phone line in use");

                            case 6:
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
                                break;
                        }

                        System.out.println("4. Restore factory settings");

                        int callInput = keyInput.nextInt();
                        switch (callInput) {
                            case 1:
                                System.out.println("7. Call divert");
                        }

                    case 8:
                        System.out.println("8.Games");

                    case 9:
                        System.out.println("9.Games");


                        int remInput = keyInput.nextInt();
                        switch (remInput) {
                            case 1:
                                System.out.println("10. Reminders");
                        }
                        int clockInput = keyInput.nextInt();
                        switch (clockInput) {
                            case 1:
                                System.out.println("11. Clock");
                            case 2:
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

                        int proInput = keyInput.nextInt();
                        switch (proInput) {
                            case 12:
                                System.out.println("12. Profiles");

                        }
                        int simInput = keyInput.nextInt();
                        switch (simInput) {
                            case 12:
                                System.out.println("13. Sim Service");


                        }
                }


        }

    }















