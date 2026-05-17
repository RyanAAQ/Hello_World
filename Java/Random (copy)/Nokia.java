import java.util.Scanner;

public class Nokia3310MenuSimpler {
  public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========Welcome to Nokia 3310==========");
        
        int running = 1;
        while (running == 1) {
            running = showMainMenu();

        if (running == 0){
        System.out.println("Power off nigger");
}
    }
  
}

    public static int showMainMenu() {
        System.out.println("\n           MAIN MENU           ");
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
    case 1: phoneBookMenu();
break;
    case 2:  messagesMenu();
break;
    case 3:  chatMenu();
break;
    case 4:  callRegisterMenu(); 
break;
    case 5:  tonesMenu(); 
break;
    case 6:  settingsMenu(); 
break;
    case 7:  callDivertMenu(); 
break;
    case 8:  gamesMenu(); 
break;
    case 9: calculatorMenu(); 
break;
    case 10: remindersMenu(); 
break;
    case 11: clockMenu(); 
break;
    case 12: profilesMenu(); 
break;
    case 13: simServicesMenu(); 
break;
    case 0: return 0;
    default: System.out.println("Invalid option choose from 0-13.");
    }
        return 1;
}

    public static void phoneBookMenu() {
        while (true) {
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
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1:  System.out.println(" Search: Enter name to find contact."); 
break;
    case 2:  System.out.println(" Service Nos: Calling service numbers "); 
break;
    case 3:  System.out.println(" Add name: Enter new contact name and number."); 
break;
    case 4:  System.out.println(" Erase: Delete selected contact."); 
break;
    case 5:  System.out.println(" Edit: Modify existing contact."); 
break;
    case 6:  System.out.println(" Assign tone: Set ringtone for specific caller."); 
break;
    case 7:  System.out.println(" Send b'card: Send business card via SMS."); 
break;
    case 8:  phoneBookOptionsSubMenu(); 
break;
    case 9:  System.out.println(" Speed dials: Assign numbers to keys 2-9."); 
break;
    case 10: System.out.println(" Voice tags: Record voice dialing tags."); 
break;
    default: System.out.println(" Invalid option. Please choose 0-10.");
        }
        
    }
}

    public static void phoneBookOptionsSubMenu() {
       while (true) {
            System.out.println("\n------ PHONE BOOK > OPTIONS ------");
            System.out.println("1. Type of view");
            System.out.println("2. Memory status");
            System.out.println("0. Back to Phone Book");
            System.out.print("Choose from option 0-2: ");
            
       int choice = input.nextInt();
       if (choice == 0)
break;
            
       switch (choice) {
    case 1: System.out.println("-> Type of view: Change how contacts are displayed (Name list / Name+Number)."); 
break;
    case 2: System.out.println("-> Memory status: Used/Free space in phonebook."); 
break;
    default: System.out.println("Invalid option.");
        }
      
    }
}

    public static void messagesMenu() {
        while (true) {
        System.out.println("\n========== MESSAGES ==========");
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
        System.out.println("8. Info service");
        System.out.println("9. Voice mailbox number");
        System.out.println("10. Service command editor");
        System.out.println("0. Back to Main Menu");
        System.out.print("Choose option (0-10): ");
            
        int choice = input.nextInt();
        if (choice == 0) 
break;
            
        switch (choice) {
    case 1:  System.out.println("-> Write messages: Compose new SMS."); 
break;
    case 2:  System.out.println("-> Inbox: View received messages."); 
break;
    case 3:  System.out.println("-> Outbox: View sent messages."); 
break;
    case 4:  System.out.println("-> Picture messages: Send/receive picture SMS."); 
break;
    case 5:  System.out.println("-> Templates: Use predefined message templates."); 
break;
    case 6:  System.out.println("-> Smileys: Insert emoticons like :-)"); 
break;
    case 7:  messageSettingsSubMenu(); 
break;
    case 8:  System.out.println("-> Info service: Subscribe to news/service info."); 
break;
    case 9:  System.out.println("-> Voice mailbox number: Set voicemail number."); 
break;
    case 10: System.out.println("-> Service command editor: Send USSD commands."); 
break;
    default: System.out.println("Invalid option.");
        }
  
    }
}

    public static void messageSettingsSubMenu() {
         while (true) {
            System.out.println("\n------ MESSAGES > MESSAGE SETTINGS ------");
            System.out.println("1. Set 1");
            System.out.println("2. Common");
            System.out.println("0. Back to Messages");
            System.out.print("Choose option (0-2): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
            
        switch (choice) {
    case 1:
    System.out.println("Set 1 includes: Message centre number, Messages sent as, Message validity.");
break;
    case 2:
    System.out.println("Common includes: Delivery reports, Reply via same centre, Character support.");
break;
    default: System.out.println("Invalid option.");
        }
            
    }
}

    public static void chatMenu() {
        while (true) {
            System.out.println("\n========== CHAT ==========");
            System.out.println("Start SMS conversation with another person.");
            System.out.println("1. Start new chat");
            System.out.println("2. Chat history");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option (0-2): ");
  
        int choice = input.nextInt();
        if (choice == 0) 
break;
            
        switch (choice) {
    case 1: System.out.println("-> Enter phone number and nickname to begin chatting."); 
break;
    case 2: System.out.println("-> View previous chat conversations."); 
break;
    default: System.out.println("Invalid option.");
        }
            
    }
}

    public static void callRegisterMenu() {
        while (true) {
            System.out.println("\n========== CALL REGISTER ==========");
            System.out.println("1. Missed calls");
            System.out.println("2. Received calls");
            System.out.println("3. Dialled numbers");
            System.out.println("4. Erase recent call lists");
            System.out.println("5. Show call duration");
            System.out.println("6. Show call costs");
            System.out.println("7. Call cost settings");
            System.out.println("8. Prepaid credit");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option (0-8): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
            
        switch (choice) {
    case 1: System.out.println("-> Missed calls: List of unanswered calls.");
break;
    case 2: System.out.println("-> Received calls: List of answered calls.");
break;
    case 3: System.out.println("-> Dialled numbers: Last 20 dialed numbers.");
break;
    case 4: System.out.println("-> Erase recent call lists: Clear all logs.");
break;
    case 5: showCallDurationSubMenu(); 
break;
    case 6: System.out.println("-> Show call costs: Last call / all calls cost.");
break;
    case 7: System.out.println("-> Call cost settings: Set cost limit, currency unit.");
break;
    case 8: System.out.println("-> Prepaid credit: Check remaining balance.");
break;
    default: System.out.println("Invalid option.");
        }

    }
}

    public static void showCallDurationSubMenu() {
        while (true) {
            System.out.println("\n--- CALL DURATION ---");
            System.out.println("1. Last call duration");
            System.out.println("2. All calls' duration");
            System.out.println("3. Received calls' duration");
            System.out.println("4. Dialled calls' duration");
            System.out.println("5. Clear timers");
            System.out.println("0. Back");
            System.out.print("Choose: ");
        
        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("Last call: 00:02:15");
break;
    case 2: System.out.println("Total all calls: 12:34:56");
break;
    case 3: System.out.println("Total received: 05:20:10");
break;
    case 4: System.out.println("Total dialled: 07:14:46");
break;
    case 5: System.out.println("Timers cleared.");
break;
    default: System.out.println("Invalid.");
            }
         
        }
    }

    public static void tonesMenu() {
        while (true) {
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
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-9): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("Select ringing tone.");
break;
    case 2: System.out.println("Adjust volume level.");
break;
    case 3: System.out.println("Set alert type (Ring/Beep/Silent).");
break;
    case 4: System.out.println("Compose own ringtone.");
break;
    case 5: System.out.println("Choose message alert tone.");
break;
    case 6: System.out.println("Keypad tones on/off.");
break;
    case 7: System.out.println("Warning/game tones settings.");
break;
    case 8: System.out.println("Vibrating alert on/off.");
break;
    case 9: System.out.println("Screen saver selection.");
break;
    default: System.out.println("Invalid.");
            }
          
        }
    }

    public static void settingsMenu() {
        while (true) {
            System.out.println("\n========== SETTINGS ==========");
            System.out.println("1. Call settings");
            System.out.println("2. Phone settings");
            System.out.println("3. Security settings");
            System.out.println("4. Restore factory settings");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-4): ");
            
        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: callSettingsSubMenu();
break;
    case 2: phoneSettingsSubMenu(); 
break;
    case 3: securitySettingsSubMenu(); 
break;
    case 4: System.out.println("Restore factory settings? All data will be lost."); 
break;
    default: System.out.println("Invalid.");
        }
          
    }
}

    public static void callSettingsSubMenu() {
        while (true) {
            System.out.println("\n--- CALL SETTINGS ---");
            System.out.println("1. Automatic redial");
            System.out.println("2. Speed dialling");
            System.out.println("3. Call waiting options");
            System.out.println("4. Own number sending");
            System.out.println("5. Phone line in use");
            System.out.println("6. Automatic answer");
            System.out.println("0. Back");
            System.out.print("Choose: ");

        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("Auto redial on/off.");
break;
    case 2: System.out.println("Speed dialling on/off.");
break;
    case 3: System.out.println("Call waiting activate/cancel.");
break;
    case 4: System.out.println("Hide/Show my number.");
break;
    case 5: System.out.println("Select line 1 or 2.");
break;
    case 6: System.out.println("Auto answer for car kit.");
break;
    default: System.out.println("Invalid.");
            }
        
        }
    }

    public static void phoneSettingsSubMenu() {
        while (true) {
            System.out.println("\n--- PHONE SETTINGS ---");
            System.out.println("1. Language");
            System.out.println("2. Cell info display");
            System.out.println("3. Welcome note");
            System.out.println("4. Network selection");
            System.out.println("5. Lights");
            System.out.println("6. Confirm SIM service actions");
            System.out.println("0. Back");
            System.out.print("Choose: ");

        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("Set phone language."); 
break;
    case 2: System.out.println("Cell info display on/off."); 
break;
    case 3: System.out.println("Write welcome message."); 
break;
    case 4: System.out.println("Auto/Manual network selection."); 
break;
    case 5: System.out.println("Keypad lights on/off."); 
break;
    case 6: System.out.println("Confirm SIM actions."); 
break;
    default: System.out.println("Invalid.");
            }
        
        }
    }

    public static void securitySettingsSubMenu() {
        while (true) {
            System.out.println("\n--- SECURITY SETTINGS ---");
            System.out.println("1. PIN code request");
            System.out.println("2. Call barring service");
            System.out.println("3. Fixed dialling");
            System.out.println("4. Closed user group");
            System.out.println("5. Phone security");
            System.out.println("6. Change access codes");
            System.out.println("0. Back");
            System.out.print("Choose: ");

         int choice = input.nextInt();
         if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("PIN request on/off."); 
break;
    case 2: System.out.println("Bar outgoing/incoming calls."); 
break;
    case 3: System.out.println("Restrict calls to fixed numbers."); 
break;
    case 4: System.out.println("Closed user group settings."); 
break;
    case 5: System.out.println("Phone security: code on SIM change."); 
break;
    case 6: System.out.println("Change security/PIN/PIN2 codes."); 
break;
    default: System.out.println("Invalid.");
            }
         
        }
    }

    public static void callDivertMenu() {
        while (true) {
            System.out.println("\n========== CALL DIVERT ==========");
            System.out.println("1. Divert all voice calls");
            System.out.println("2. Divert if busy");
            System.out.println("3. Divert if not answered");
            System.out.println("4. Divert if unreachable");
            System.out.println("5. Cancel all diverts");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-5): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("All calls forwarded to: [set number]"); 
break;
    case 2: System.out.println("Divert when busy."); 
break;
    case 3: System.out.println("Divert if no answer."); 
break;
    case 4: System.out.println("Divert when unreachable."); 
break;
    case 5: System.out.println("All call diverts cancelled."); 
break;
    default: System.out.println("Invalid.");
            }
       
        }
    }

    public static void gamesMenu() {
        while (true) {
            System.out.println("\n========== GAMES ==========");
            System.out.println("1. Snake II");
            System.out.println("2. Space Impact");
            System.out.println("3. Bantumi");
            System.out.println("4. Pairs II");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-4): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("Starting Snake II..."); 
break;
    case 2: System.out.println("Starting Space Impact..."); 
break;
    case 3: System.out.println("Starting Bantumi..."); 
break;
    case 4: System.out.println("Starting Pairs II..."); 
break;
    default: System.out.println("Invalid.");
            }
          
        }
    }

    public static void calculatorMenu() {
        while (true) {
            System.out.println("\n========== CALCULATOR ==========");
            System.out.println("1. Basic calculation");
            System.out.println("2. Currency conversion");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-2): ");
            
        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("Calculator: Enter numbers (simple demo)."); 
break;
    case 2: System.out.println("Set exchange rate and convert."); 
break;
    default: System.out.println("Invalid.");
            }
         
        }
    }

    public static void remindersMenu() {
        while (true) {
            System.out.println("\n========== REMINDERS ==========");
            System.out.println("1. Add new");
            System.out.println("2. Erase");
            System.out.println("3. View all");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-3): ");
            
        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("New reminder: Enter note and alarm time."); 
break;
    case 2: System.out.println("Delete reminder(s)."); 
break;
    case 3: System.out.println("Showing all saved reminders."); 
break;
    default: System.out.println("Invalid.");
            }
         
        }
    }

    public static void clockMenu() {
        while (true) {
            System.out.println("\n========== CLOCK ==========");
            System.out.println("1. Alarm clock");
            System.out.println("2. Clock settings");
            System.out.println("3. Date setting");
            System.out.println("4. Stopwatch");
            System.out.println("5. Countdown timer");
            System.out.println("6. Auto update of date and time");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-6): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("Set alarm time.");
break;
    case 2: System.out.println("Set time, 12/24h format.");
break;
    case 3: System.out.println("Set date.");
break;
    case 4: System.out.println("Stopwatch: Start/Stop timing.");
break;
    case 5: System.out.println("Countdown timer: Set and start.");
break;
    case 6: System.out.println("Auto update time from network."); 
break;
    default: System.out.println("Invalid.");
            }
         
        }
    }

    public static void profilesMenu() {
        while (true) {
            System.out.println("\n========== PROFILES ==========");
            System.out.println("1. General");
            System.out.println("2. Silent");
            System.out.println("3. Meeting");
            System.out.println("4. Outdoor");
            System.out.println("5. Pager");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-5): ");
            
        int choice = input.nextInt();
        if (choice == 0)
break;
        switch (choice) {
    case 1: System.out.println("General profile activated.");
break;
    case 2: System.out.println("Silent profile: all tones off."); 
break;
    case 3: System.out.println("Meeting profile: beep only."); 
break;
    case 4: System.out.println("Outdoor: loud tones."); 
break;
    case 5: System.out.println("Pager profile."); 
break;
    default: System.out.println("Invalid.");
              }
   
        }
  }

    public static void simServicesMenu() {
        while (true) {
            System.out.println("\n========== SIM SERVICES ==========");
            System.out.println("1. SIM Toolkit");
            System.out.println("2. Service info");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose (0-2): ");
            
        int choice = input.nextInt();
        if (choice == 0) 
break;
        switch (choice) {
    case 1: System.out.println("SIM Toolkit applications (if available).");
break;
    case 2: System.out.println("Operator specific services.");
break;
    default: System.out.println("Invalid.");
       }
   }
}


  
}
