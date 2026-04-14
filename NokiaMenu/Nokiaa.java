import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int running = 1;
    System.out.println("Welcome to the Nokia Menu System");
    while (running == 1) {
    System.out.println("\n MAIN MENU ");
    System.out.println("1. Phone book");
    System.out.println("2. Messages");
    System.out.println("3. Chat");
    System.out.println("4. Call register");
    System.out.println("5. Tones");
    System.out.println("6. Settings");
    System.out.println("7. Call divert");
    System.out.println("8. Games");
    System.out.println("9. Calculator");
    System.out.println("10. Reminders");
    System.out.println("11. Clock");
    System.out.println("12. Profiles");
    System.out.println("13. SIM services");
    System.out.println("0. Exit phone");
    System.out.print("Choose option (0-13): ");

    int choice = input.nextInt();
    switch (choice) {
    case 0:
    running = 0;
    System.out.println("Exiting phone");
break;

    case 1:
    int pchoice = -1;
    while (pchoice != 0) {
    System.out.println("\n========== PHONE BOOK ==========");
    System.out.println("1. Search");
    System.out.println("2. Service Nos.");
    System.out.println("3. Add name");
    System.out.println("4. Erase");
    System.out.println("5. Edit");
    System.out.println("6. Assign tone");
    System.out.println("7. Send b'card");
    System.out.println("8. Options");
    System.out.println("9. Speed dials");
    System.out.println("10. Voice tags");
    System.out.println("0. Back to Main Menu");
    System.out.print("Choose option (0-10): ");

    pchoice = input.nextInt();

    switch (pchoice) {
    case 1: System.out.println("-> Search...");
break;
    case 2: System.out.println("-> Service Nos...");
break;
    case 3: System.out.println("-> Add name...");
break;
    case 4: System.out.println("-> Erase...");
break;
    case 5: System.out.println("-> Edit...");
break;
    case 6: System.out.println("-> Assign tone...");
break;
    case 7: System.out.println("-> Send b'card...");
break;
    case 8:
    int ochoice = -1;
    while (ochoice != 0) {
    System.out.println("\n========PHONE BOOK OPTIONS========");
    System.out.println("1. Type of view");
    System.out.println("2. Memory status");
    System.out.println("0. Back to phone book");
    System.out.print("Choose from option 0-2: ");

    ochoice = input.nextInt();

    switch (ochoice) {
    case 1: System.out.println("-> Type of view selected.");
break;
    case 2: System.out.println("-> Memory status shown.");
break;
    case 0:
break;
    default: System.out.println("Invalid input.");
break;
    }
}
break;
    case 9: System.out.println("-> Speed dials...");
break;
    case 10: System.out.println("-> Voice tags...");
break;
    case 0:
break;
    default: System.out.println("Invalid input.");
break;
    }
}
break;

    case 2:
    int mchoice = -1;
    while (mchoice != 0) {
    System.out.println("\n========== MESSAGES ==========");
    System.out.println("1. Write messages");
    System.out.println("2. Inbox");
    System.out.println("3. Outbox");
    System.out.println("4. Picture messages");
    System.out.println("5. Templates");
    System.out.println("6. Smileys");
    System.out.println("7. Message settings");
    System.out.println("0. Back to Main Menu");
    System.out.print("Choose option (0-7): ");

    mchoice = input.nextInt();

    switch (mchoice) {
    case 1: System.out.println("-> Write messages...");
break;
    case 2: System.out.println("-> Inbox...");
break;
    case 3: System.out.println("-> Outbox...");
break;
    case 4: System.out.println("-> Picture messages...");
break;
    case 5: System.out.println("-> Templates...");
break;
    case 6: System.out.println("-> Smileys...");
break;
    case 7:
    int mschoice = -1;
    while (mschoice != 0) {
    System.out.println("\n======= MESSAGE SETTINGS =======");
    System.out.println("1. Set 1");
    System.out.println("2. Common");
    System.out.println("0. Back to messages");

    mschoice = input.nextInt();

    switch (mschoice) {
    case 1:
    int setchoice = -1;
    while (setchoice != 0) {
    System.out.println("\n--- Set 1 ---");
    System.out.println("1. Message centre number");
    System.out.println("2. Messages sent as");
    System.out.println("3. Message validity");
    System.out.println("0. Back");

    setchoice = input.nextInt();

}
break;
    case 2:
    int commonhoice = -1;
    while (commonhoice != 0) {
    System.out.println("\n--- Common ---");
    System.out.println("1. Delivery reports");
    System.out.println("2. Reply via same centre");
    System.out.println("3. Character support");
    System.out.println("0. Back");

    commonhoice = input.nextInt();

}
break;
    }
}
break;
    }
}
break;

    case 3: System.out.println("-> Chat...");
break;

    case 4:
    int callchoice = -1;
    while (callchoice != 0) {
    System.out.println("\n========== CALL REGISTER ==========");
    System.out.println("1. Missed calls");
    System.out.println("2. Received calls");
    System.out.println("3. Dialled numbers");
    System.out.println("4. Erase recent call lists");
    System.out.println("5. Show call duration");
    System.out.println("6. Show call costs");
    System.out.println("7. Call cost settings");
    System.out.println("8. Prepaid credit");
    System.out.println("0. Back");

    callchoice = input.nextInt();

    switch (callchoice) {
    case 5:
    int durationchoice = -1;
    while (durationchoice != 0) {
    System.out.println("\n--- Show call duration ---");
    System.out.println("1. Last call duration");
    System.out.println("2. All calls' duration");
    System.out.println("3. Received calls' duration");
    System.out.println("4. Dialled calls' duration");
    System.out.println("5. Clear timers");
    System.out.println("0. Back");
  
    durationchoice = input.nextInt();
}
break;
    case 6:
    int costchoice = -1;
    while (costchoice != 0) {
    System.out.println("\n--- Show call costs ---");
    System.out.println("1. Last call cost");
    System.out.println("2. All calls' cost");
    System.out.println("3. Clear counters");
    System.out.println("0. Back");
    
    costchoice = input.nextInt();
}
break;
    case 7:
    int costsettingschoice = -1;
    while (costsettingschoice != 0) {
    System.out.println("\n--- Call cost settings ---");
    System.out.println("1. Call cost limit");
    System.out.println("2. Show costs in");
    System.out.println("0. Back");
    
    costsettingschoice = input.nextInt();
    }
break;
    }
}
break;

    case 5:
    int toneschoice = -1;
    while (toneschoice != 0) {
    System.out.println("\n========== TONES ==========");
    System.out.println("1. Ringing tone");
    System.out.println("2. Ringing volume");
    System.out.println("3. Incoming call alert");
    System.out.println("4. Composer");
    System.out.println("5. Message alert tone");
    System.out.println("6. Keypad tones");
    System.out.println("7. Warning and game tones");
    System.out.println("8. Vibrating alert");
    System.out.println("9. Screen saver");
    System.out.println("0. Back");
  
    toneschoice = input.nextInt();
}
break;

    case 6:
    int settingschoice = -1;
    while (settingschoice != 0) {
    System.out.println("\n========== SETTINGS ==========");
    System.out.println("1. Call settings");
    System.out.println("2. Phone settings");
    System.out.println("3. Security settings");
    System.out.println("4. Restore factory settings");
    System.out.println("0. Back");

    settingschoice = input.nextInt();

    switch (settingschoice) {
    case 1:
    int callsettingschoice = -1;
    while (callsettingschoice != 0) {
    System.out.println("\n--- Call settings ---");
    System.out.println("1. Automatic redesign");
    System.out.println("2. Speed dialing");
    System.out.println("3. Call waiting options");
    System.out.println("4. Own number sending");
    System.out.println("5. Phone line in use");
    System.out.println("6. Automatic answer");
    System.out.println("0. Back");

    callsettingschoice = input.nextInt();
}
break;
    case 2:
    int phonesettingschoice = -1;
    while (phonesettingschoice != 0) {
    System.out.println("\n--- Phone settings ---");
    System.out.println("1. Language");
    System.out.println("2. Cell info display");
    System.out.println("3. Welcome note");
    System.out.println("4. Network selection");
    System.out.println("5. Lights");
    System.out.println("6. Confirm SIM service actions");
    System.out.println("0. Back");

    phonesettingschoice = input.nextInt();
}
break;
    case 3:
    int securitychoice = -1;
    while (securitychoice != 0) {
    System.out.println("\n--- Security settings ---");
    System.out.println("1. PIN code request");
    System.out.println("2. Call barring service");
    System.out.println("3. Fixed dialing");
    System.out.println("4. Closed user group");
    System.out.println("5. Phone security");
    System.out.println("6. Change access codes");
    System.out.println("0. Back");
    
    securitychoice = input.nextInt();
}
break;
    }
}
    break;

    case 7: System.out.println("-> Call divert...");
break;
    case 8: System.out.println("-> Games...");
break;
    case 9: System.out.println("-> Calculator...");
break;
    case 10: System.out.println("-> Reminders...");
break;

    case 11:
    int clockchoice = -1;
    while (clockchoice != 0) {
    System.out.println("\n========== CLOCK ==========");
    System.out.println("1. Alarm clock");
    System.out.println("2. Clock settings");
    System.out.println("3. Date setting");
    System.out.println("4. Stopwatch");
    System.out.println("5. Countdown timer");
    System.out.println("6. Auto update of date and time");
    System.out.println("0. Back");
    clockchoice = input.nextInt();
}
break;

    case 12: System.out.println("-> Profiles...");
break;
    case 13: System.out.println("-> SIM services...");
break;

    default:
    System.out.println("Invalid selection.");
break;
            }
        }
    }
}

