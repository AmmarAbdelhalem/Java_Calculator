import java.util.Scanner;  

public class calc { 
    public static void ibanner() { 
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
        System.out.println(" _____________________"); 
        System.out.println("|  _________________  |");
        System.out.println("| |              0. | |");
        System.out.println("| |_________________| |");
        System.out.println("|  ___ ___ ___   ___  |");
        System.out.println("| | 7 | 8 | 9 | | + | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 4 | 5 | 6 | | - | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 1 | 2 | 3 | | x | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | . | 0 | = | | / | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("|_____________________|");
        System.out.println("\n\nWELCOME TO CLAC\n\n");
        System.out.println("Choose The Type Of Operation > \n");
        System.out.println("[1] Mathematical procedures\n");
        System.out.println("[2] Logical procedures\n");
        System.out.println("[0] Exit\n");
        try{
            Scanner consoleInput;
            consoleInput = new Scanner(System.in);
            System.out.print("CALC > ");
            int calcInput = consoleInput.nextInt();
            if (numberIsvalidInibanner(calcInput)) {
                if (calcInput == 0) {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else if (calcInput == 1) {
                    mbanner();
                } else if (calcInput == 2) {
                    lbanner();
                }
            } else {
                System.out.println("\nThe Option That You Was Inser > " + calcInput + " < Isn't In The Option List\n");
                System.out.print("Are You Want To Repeat (Y/N) > ");
                char Option = consoleInput.next().charAt(0);
                if (Option == 'Y' || Option == 'y') {
                    ibanner();
                } else if (Option == 'N' || Option == 'n') {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else {
                    System.out.println("[*] Sorry There Are An Error\n");
                }
            }
        } catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_i();
        }
    }
    public static void mbanner(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" __  __       _   _     ");
        System.out.println("|  \\/  | __ _| |_| |__  ");
        System.out.println("| |\\/| |/ _` | __| '_ \\ ");
        System.out.println("| |  | | (_| | |_| | | |");
        System.out.println("|_|  |_|\\__,_|\\__|_| |_|");
        System.out.println("\n\nMATHEMATICAL OPERATION\n\n");
        System.out.println("Choose Your Option > \n");
        System.out.println("[1] Addition Two Numbers\n");
        System.out.println("[2] Subtraction Two Numbers\n");
        System.out.println("[3] Multiplication Two Numbers\n");
        System.out.println("[4] Division Two Numbers\n");
        System.out.println("[5] Back\n");
        System.out.println("[0] Exit\n");
        try {
            Scanner inputm = new Scanner(System.in);
            System.out.print("MATHEMATICAL > ");
            int mathinput = inputm.nextInt();
            if (numberIsvalidInmbanner(mathinput)) {
                if (mathinput == 0) {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else if (mathinput == 1) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    Scanner inputa = new Scanner(System.in);
                    int pian = inputa.nextInt();
                    if (pian == 1) {
                        add();
                    } else if (pian == 2) {
                        addD();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pian + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLp = inputa.next().charAt(0);
                        if (OptionLp == 'Y' || OptionLp == 'y') {
                            mbanner();
                        } else if (OptionLp == 'N' || OptionLp == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (mathinput == 2) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    Scanner inputa = new Scanner(System.in);
                    int pian = inputa.nextInt();
                    if (pian == 1) {
                        sub();
                    } else if (pian == 2) {
                        subD();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pian + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLp = inputa.next().charAt(0);
                        if (OptionLp == 'Y' || OptionLp == 'y') {
                            mbanner();
                        } else if (OptionLp == 'N' || OptionLp == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    } 
                } else if (mathinput == 3) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    Scanner inputa = new Scanner(System.in);
                    int pian = inputa.nextInt();
                    if (pian == 1) {
                        multi();
                    } else if (pian == 2) {
                        multid();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pian + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLp = inputa.next().charAt(0);
                        if (OptionLp == 'Y' || OptionLp == 'y') {
                            mbanner();
                        } else if (OptionLp == 'N' || OptionLp == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (mathinput == 4) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    Scanner inputa = new Scanner(System.in);
                    int pian = inputa.nextInt();
                    if (pian == 1) {
                        dev();
                    } else if (pian == 2) {
                        devd();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pian + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLp = inputa.next().charAt(0);
                        if (OptionLp == 'Y' || OptionLp == 'y') {
                            mbanner();
                        } else if (OptionLp == 'N' || OptionLp == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (mathinput == 5) {
                    ibanner();
                }
            } else {
                System.out.println("\nThe Option That You Was Inser > " + mathinput + " < Isn't In The Option List\n");
                System.out.print("Are You Want To Repeat (Y/N) > ");
                char Optionm = inputm.next().charAt(0);
                if (Optionm == 'Y' || Optionm == 'y') {
                    mbanner();
                } else if (Optionm == 'N' || Optionm == 'n') {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else {
                    System.out.println("[*] Sorry There Are An Error\n");
                }
            }
        } catch (Exception r){
            System.out.println("\n[*] Invalid input\n");
            error_msg_math();
        }
    }
    public static void lbanner() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" _                _           _ ");
        System.out.println("| |    ___   __ _(_) ___ __ _| |");
        System.out.println("| |   / _ \\ / _` | |/ __/ _` | |");
        System.out.println("| |__| (_) | (_| | | (_| (_| | |");
        System.out.println("|_____\\___/ \\__, |_|\\___\\__,_|_|");
        System.out.println("            |___/               ");
        System.out.println("\n\nLOGICAL OPERATION\n\n");
        System.out.println("Choose Your Option > \n");
        System.out.println("[1] Prime Number\n");
        System.out.println("[2] Odd Number\n");
        System.out.println("[3] Even Number\n");
        System.out.println("[4] Smallest Number In 3 Numbers\n");
        System.out.println("[5] Largest Number In 3 Numbers\n");
        System.out.println("[6] Number Is Positive Or Negative Or Zero\n");
        System.out.println("[7] Back\n");
        System.out.println("[0] Exit\n");
        try{
            Scanner inputl = new Scanner(System.in);
            System.out.print("LOGICAL > ");
            int Logicalinput = inputl.nextInt();
            if (numberIsvalidInlbanner(Logicalinput)) {
                if (Logicalinput == 0) {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else if (Logicalinput == 1) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int pian = inputl.nextInt();
                    if (pian == 1) {
                        prime();
                    } else if (pian == 2) {
                        primeD();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pian + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLp = inputl.next().charAt(0);
                        if (OptionLp == 'Y' || OptionLp == 'y') {
                            lbanner();
                        } else if (OptionLp == 'N' || OptionLp == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 2) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int piano = inputl.nextInt();
                    if (piano == 1) {
                        oddnumber();
                    } else if (piano == 2) {
                        oddnumberD();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + piano + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLo = inputl.next().charAt(0);
                        if (OptionLo == 'Y' || OptionLo == 'y') {
                            lbanner();
                        } else if (OptionLo == 'N' || OptionLo == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 3) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int piane = inputl.nextInt();
                    if (piane == 1) {
                        evennumber();
                    } else if (piane == 2) {
                        evennumberd();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + piane + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLe = inputl.next().charAt(0);
                        if (OptionLe == 'Y' || OptionLe == 'y') {
                            lbanner();
                        } else if (OptionLe == 'N' || OptionLe == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 4) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int pians = inputl.nextInt();
                    if (pians == 1) {
                        smallestnumber();
                    } else if (pians == 2) {
                        smallestnumberd();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pians + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLs = inputl.next().charAt(0);
                        if (OptionLs == 'Y' || OptionLs == 'y') {
                            lbanner();
                        } else if (OptionLs == 'N' || OptionLs == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 5) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int pianl = inputl.nextInt();
                    if (pianl == 1) {
                        largestnumber();
                    } else if (pianl == 2) {
                        largestnumberd();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pianl + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLl = inputl.next().charAt(0);
                        if (OptionLl == 'Y' || OptionLl == 'y') {
                            lbanner();
                        } else if (OptionLl == 'N' || OptionLl == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 6) {
                    System.out.println("\n [1] INT");
                    System.out.println("\n [2] DOUBLE");
                    System.out.print("\n Please insert a number > ");
                    int pianpnz = inputl.nextInt();
                    if (pianpnz == 1) {
                        pnz();
                    } else if (pianpnz == 2) {
                        pnzd();
                    } else {
                        System.out.println("\nThe Option That You Was Inser > " + pianpnz + " < Isn't In The Option List\n");
                        System.out.print("Are You Want To Repeat (Y/N) > ");
                        char OptionLpnz = inputl.next().charAt(0);
                        if (OptionLpnz == 'Y' || OptionLpnz == 'y') {
                            lbanner();
                        } else if (OptionLpnz == 'N' || OptionLpnz == 'n') {
                            System.out.println("\nGood Bye (^_^)/\n");
                            System.exit(1);
                        } else {
                            System.out.println("[*] Sorry There Are An Error\n");
                        }
                    }
                } else if (Logicalinput == 7) {
                    ibanner();
                }
            } else {
                System.out.println("\nThe Option That You Was Inser > " + Logicalinput + " < Isn't In The Option List\n");
                System.out.print("Are You Want To Repeat (Y/N) > ");
                char OptionL = inputl.next().charAt(0);
                if (OptionL == 'Y' || OptionL == 'y') {
                    lbanner();
                } else if (OptionL == 'N' || OptionL == 'n') {
                    System.out.println("\nGood Bye (^_^)/\n");
                    System.exit(1);
                } else {
                    System.out.println("[*] Sorry There Are An Error\n");
                }
            }
        } catch(Exception t){
            System.out.println("\n[*] Invalid input\n");
            error_msg_logic();
        }
    }

    public static boolean numberIsvalidInibanner(int Inputnumber) {
        if (Inputnumber >= 0 && Inputnumber <= 2)
            return true;
        else {
            return false;
        }
    }

    public static boolean numberIsvalidInlbanner(int num) {
        if (num >= 0 && num <= 7) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean numberIsvalidInmbanner(int numm) {
        if (numm >= 0 && numm <= 6) {
            return true;
        } else {
            return false;
        }
    }
    public static void add(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    _    ____  ____  ");
        System.out.println("   / \\  |  _ \\|  _ \\ ");
        System.out.println("  / _ \\ | | | | | | |");
        System.out.println(" / ___ \\| |_| | |_| |");
        System.out.println("/_/   \\_\\____/|____/ ");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            int addo = inad.nextInt();
            System.out.print("\nInsert the 2nd number > ");
            int addt = inad.nextInt();
            int sumd = addo + addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptadd();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_add();
        }
    }
    public static void addD(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    _    ____  ____  ");
        System.out.println("   / \\  |  _ \\|  _ \\ ");
        System.out.println("  / _ \\ | | | | | | |");
        System.out.println(" / ___ \\| |_| | |_| |");
        System.out.println("/_/   \\_\\____/|____/ ");
        try{
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            double addo = inad.nextDouble();
            System.out.print("\nInsert the 2nd number > ");
            double addt = inad.nextDouble();
            double sumd = addo + addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptadd();
        }catch(Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_addD();
        }
    }
    public static void afterscriptadd(){
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAam = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAam = consoleAam.nextInt();
        if (numAam >= 1 && numAam <= 3) {
            if (numAam == 1) {
                System.out.println("\n [1] ADD {INT}");
                System.out.println("\n [2] ADD {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdam = consoleAam.nextInt();
                if (intdam == 1) {
                    add();
                } else if (intdam == 2) {
                    addD();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdam + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAam = consoleAam.next().charAt(0);
                    if (OptionAam == 'Y' || OptionAam == 'y') {
                        afterscriptadd();
                    } else if (OptionAam == 'N' || OptionAam == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAam == 2) {
                mbanner();
            } else if (numAam == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAam + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAam = consoleAam.next().charAt(0);
            if (OptionAam == 'Y' || OptionAam == 'y') {
                afterscriptadd();
            } else if (OptionAam == 'N' || OptionAam == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void sub(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _   _ ____  ");
        System.out.println("/ ___|| | | | __ ) ");
        System.out.println("\\___ \\| | | |  _ \\ ");
        System.out.println(" ___) | |_| | |_) |");
        System.out.println("|____/ \\___/|____/");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            int addo = inad.nextInt();
            System.out.print("\nInsert the 2nd number > ");
            int addt = inad.nextInt();
            int sumd = addo-addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptsub();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_sub();
        }
    }
    public static void subD(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _   _ ____  ");
        System.out.println("/ ___|| | | | __ ) ");
        System.out.println("\\___ \\| | | |  _ \\ ");
        System.out.println(" ___) | |_| | |_) |");
        System.out.println("|____/ \\___/|____/");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            double addo = inad.nextDouble();
            System.out.print("\nInsert the 2nd number > ");
            double addt = inad.nextDouble();
            double sumd = addo - addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptsub();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_subD();
        }
    }
    public static void afterscriptsub(){
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAam = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAam = consoleAam.nextInt();
        if (numAam >= 1 && numAam <= 3) {
            if (numAam == 1) {
                System.out.println("\n [1] SUB {INT}");
                System.out.println("\n [2] SUB {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdam = consoleAam.nextInt();
                if (intdam == 1) {
                    sub();
                } else if (intdam == 2) {
                    subD();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdam + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAam = consoleAam.next().charAt(0);
                    if (OptionAam == 'Y' || OptionAam == 'y') {
                        afterscriptsub();
                    } else if (OptionAam == 'N' || OptionAam == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAam == 2) {
                mbanner();
            } else if (numAam == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAam + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAam = consoleAam.next().charAt(0);
            if (OptionAam == 'Y' || OptionAam == 'y') {
                afterscriptsub();
            } else if (OptionAam == 'N' || OptionAam == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void multi(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" __  __       _ _   _ ");
        System.out.println("|  \\/  |_   _| | |_(_)");
        System.out.println("| |\\/| | | | | | __| |");
        System.out.println("| |  | | |_| | | |_| |");
        System.out.println("|_|  |_|\\__,_|_|\\__|_|");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            int addo = inad.nextInt();
            System.out.print("\nInsert the 2nd number > ");
            int addt = inad.nextInt();
            int sumd = addo * addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptmulti();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_multi();
        }
    }
    public static void multid(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" __  __       _ _   _ ");
        System.out.println("|  \\/  |_   _| | |_(_)");
        System.out.println("| |\\/| | | | | | __| |");
        System.out.println("| |  | | |_| | | |_| |");
        System.out.println("|_|  |_|\\__,_|_|\\__|_|");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            double addo = inad.nextDouble();
            System.out.print("\nInsert the 2nd number > ");
            double addt = inad.nextDouble();
            double sumd = addo * addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptmulti();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_multid();
        }
    }
    public static void afterscriptmulti(){
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAam = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAam = consoleAam.nextInt();
        if (numAam >= 1 && numAam <= 3) {
            if (numAam == 1) {
                System.out.println("\n [1] Multi {INT}");
                System.out.println("\n [2] Multi {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdam = consoleAam.nextInt();
                if (intdam == 1) {
                    multi();
                } else if (intdam == 2) {
                    multid();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdam + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAam = consoleAam.next().charAt(0);
                    if (OptionAam == 'Y' || OptionAam == 'y') {
                        afterscriptmulti();
                    } else if (OptionAam == 'N' || OptionAam == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAam == 2) {
                mbanner();
            } else if (numAam == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAam + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAam = consoleAam.next().charAt(0);
            if (OptionAam == 'Y' || OptionAam == 'y') {
                afterscriptmulti();
            } else if (OptionAam == 'N' || OptionAam == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void dev(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _______     __");
        System.out.println("|  _ \\| ____\\ \\   / /");
        System.out.println("| | | |  _|  \\ \\ / / ");
        System.out.println("| |_| | |___  \\ V / ");
        System.out.println("|____/|_____|  \\_/  ");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            int addo = inad.nextInt();
            System.out.print("\nInsert the 2nd number > ");
            int addt = inad.nextInt();
            int sumd = addo / addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptdev();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_dev();
        }
    }
    public static void devd(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _______     __");
        System.out.println("|  _ \\| ____\\ \\   / /");
        System.out.println("| | | |  _|  \\ \\ / / ");
        System.out.println("| |_| | |___  \\ V / ");
        System.out.println("|____/|_____|  \\_/  ");
        try {
            Scanner inad = new Scanner(System.in);
            System.out.print("\nInsert the 1st number > ");
            double addo = inad.nextDouble();
            System.out.print("\nInsert the 2nd number > ");
            double addt = inad.nextDouble();
            double sumd = addo / addt;
            System.out.println("\nThe result is > " +sumd);
            afterscriptdev();
        }catch (Exception e){
            System.out.println("\n[*] Invalid input\n");
            error_msg_devd();
        }
    }
    public static void afterscriptdev(){
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAam = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAam = consoleAam.nextInt();
        if (numAam >= 1 && numAam <= 3) {
            if (numAam == 1) {
                System.out.println("\n [1] DEV {INT}");
                System.out.println("\n [2] DEV {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdam = consoleAam.nextInt();
                if (intdam == 1) {
                    dev();
                } else if (intdam == 2) {
                    devd();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdam + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAam = consoleAam.next().charAt(0);
                    if (OptionAam == 'Y' || OptionAam == 'y') {
                        afterscriptdev();
                    } else if (OptionAam == 'N' || OptionAam == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAam == 2) {
                mbanner();
            } else if (numAam == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAam + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAam = consoleAam.next().charAt(0);
            if (OptionAam == 'Y' || OptionAam == 'y') {
                afterscriptdev();
            } else if (OptionAam == 'N' || OptionAam == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void prime() { 
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("            _                ");
        System.out.println(" _ __  _ __(_)_ __ ___   ___ ");
        System.out.println("| '_ \\| '__| | '_ ` _ \\ / _ \\");
        System.out.println("| |_) | |  | | | | | | |  __/");
        System.out.println("| .__/|_|  |_|_| |_| |_|\\___|");
        System.out.println("|_|                          ");
        try {
            Scanner console = new Scanner(System.in);
            System.out.print("\nPlease Insert The Number > ");
            int num = console.nextInt();
            if (num == 1 || num == 0) {
                System.out.println("\n" + num + " > Is Not A Prime Number");
            } else {
                int count = 3;
                if (num == count) {
                    count++;
                }
                int sum = num % count;
                if (sum == 1 || num == 2) {
                    System.out.println("\n" + num + " > Is A Prime Number\n");
                }else {
                    System.out.println("\n" + num + " > Is Not A Prime Number\n");
                }
            }
            afterScriptPrimary();
        } catch (Exception y){
            System.out.println("\n[*] Invalid input\n");
            error_msg_prime();
        }
    }

    public static void primeD() { 
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("            _                ");
        System.out.println(" _ __  _ __(_)_ __ ___   ___ ");
        System.out.println("| '_ \\| '__| | '_ ` _ \\ / _ \\");
        System.out.println("| |_) | |  | | | | | | |  __/");
        System.out.println("| .__/|_|  |_|_| |_| |_|\\___|");
        System.out.println("|_|                          ");
        try {
            Scanner consolePD = new Scanner(System.in);
            System.out.print("\nPlease Insert The Number > ");
            double numPD = consolePD.nextDouble();
            if (numPD == 1.0 || numPD == 0.0) {
                System.out.println("\n" + numPD + " > Is Not A Prime Number");
            } else {
                double countPD = 2.0;
                if (numPD == countPD) {
                    countPD++;
                }
                double sumPD = numPD % countPD;
                if (sumPD == 1.0 || numPD == 2.0) {
                    System.out.println("\n" + numPD + " > Is A Prime Number\n");
                } else {
                    System.out.println("\n" + numPD + " > Is Not A Prime Number\n");
                }
            }
            afterScriptPrimary();
        } catch (Exception u){
            System.out.println("\n[*] Invalid input\n");
            error_msg_primed();
        }
    }

    public static void afterScriptPrimary() {
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAp = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAp = consoleAp.nextInt();
        if (numAp >= 1 && numAp <= 3) {
            if (numAp == 1) {
                System.out.println("\n [1] Prime {INT}");
                System.out.println("\n [2] Prime {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intd = consoleAp.nextInt();
                if (intd == 1) {
                    prime();
                } else if (intd == 2) {
                    primeD();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intd + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionApint = consoleAp.next().charAt(0);
                    if (OptionApint == 'Y' || OptionApint == 'y') {
                        afterScriptPrimary();
                    } else if (OptionApint == 'N' || OptionApint == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAp == 2) {
                lbanner();
            } else if (numAp == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAp + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAp = consoleAp.next().charAt(0);
            if (OptionAp == 'Y' || OptionAp == 'y') {
                afterScriptPrimary();
            } else if (OptionAp == 'N' || OptionAp == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }

    public static void oddnumber() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("           _     _ ");
        System.out.println("  ___   __| | __| |");
        System.out.println(" / _ \\ / _` |/ _` |");
        System.out.println("| (_) | (_| | (_| |");
        System.out.println(" \\___/ \\__,_|\\__,_|");
        try {
            int number, reminder;
            System.out.print("\nPlease insert a number > ");
            Scanner num1 = new Scanner(System.in);
            number = num1.nextInt();
            reminder = number % 2;
            if (reminder == 0)
                System.out.println("\n" + number + " > is not an odd number");
            else
                System.out.println("\n" + number + " > is an odd number");
            afterScriptodd();
        }catch (Exception i){
            System.out.println("\n[*] Invalid input\n");
            error_msg_odd();
        }
    }

    public static void afterScriptodd() {
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAO = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAO = consoleAO.nextInt();
        if (numAO >= 1 && numAO <= 3) {
            if (numAO == 1) {
                System.out.println("\n [1] Odd {INT}");
                System.out.println("\n [2] Odd {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdO = consoleAO.nextInt();
                if (intdO == 1) {
                    oddnumber();
                } else if (intdO == 2) {
                    oddnumberD();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdO + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAO = consoleAO.next().charAt(0);
                    if (OptionAO == 'Y' || OptionAO == 'y') {
                        afterScriptodd();
                    } else if (OptionAO == 'N' || OptionAO == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAO == 2) {
                lbanner();
            } else if (numAO == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAO + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAO = consoleAO.next().charAt(0);
            if (OptionAO == 'Y' || OptionAO == 'y') {
                afterScriptodd();
            } else if (OptionAO == 'N' || OptionAO == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }

    public static void oddnumberD() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("           _     _ ");
        System.out.println("  ___   __| | __| |");
        System.out.println(" / _ \\ / _` |/ _` |");
        System.out.println("| (_) | (_| | (_| |");
        System.out.println(" \\___/ \\__,_|\\__,_|");
        try {
            double numberd, reminderd;
            System.out.print("\nPlease insert a number > ");
            Scanner num1d = new Scanner(System.in);
            numberd = num1d.nextDouble();
            reminderd = numberd % 2.0;
            if (reminderd == 0.0)
                System.out.println("\n" + numberd + " > is not an odd number");
            else
                System.out.println("\n" + numberd + " > is an odd number");
            afterScriptodd();
        }catch (Exception o){
            System.out.println("\n[*] Invalid input\n");
            error_msg_oddD();
        }
    }

    public static void evennumber() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("  _____   _____ _ __");
        System.out.println(" / _ \\ \\ / / _ \\ '_ \\");
        System.out.println("|  __/\\ V /  __/ | | |");
        System.out.println(" \\___| \\_/ \\___|_| |_|");
        try {
            int numbere, remindere;
            System.out.print("\nPlease insert a number > ");
            Scanner num1e = new Scanner(System.in);
            numbere = num1e.nextInt();
            remindere = numbere % 2;
            if (remindere == 0)
                System.out.println("\n" + numbere + " > is an even number");
            else
                System.out.println("\n" + numbere + " > is not an even number");
            afterScripteven();
        }catch (Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_even();
        }
    }

    public static void evennumberd() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("  _____   _____ _ __");
        System.out.println(" / _ \\ \\ / / _ \\ '_ \\");
        System.out.println("|  __/\\ V /  __/ | | |");
        System.out.println(" \\___| \\_/ \\___|_| |_|");
        try{
            double numbered, remindered;
            System.out.print("\nPlease insert a number > ");
            Scanner num1e = new Scanner(System.in);
            numbered = num1e.nextDouble();
            remindered = numbered % 2.0;
            if (remindered == 0.0)
                System.out.println("\n" + numbered + " > is an even number");
            else
                System.out.println("\n" + numbered + " > is not an even number");
            afterScripteven();
        }catch (Exception a){
            System.out.println("\n[*] Invalid input\n");
            error_msg_evend();
        }
    }

    public static void afterScripteven() {
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAE = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAE = consoleAE.nextInt();
        if (numAE >= 1 && numAE <= 3) {
            if (numAE == 1) {
                System.out.println("\n [1] Even {INT}");
                System.out.println("\n [2] Even {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdE = consoleAE.nextInt();
                if (intdE == 1) {
                    evennumber();
                } else if (intdE == 2) {
                    evennumberd();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdE + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAE = consoleAE.next().charAt(0);
                    if (OptionAE == 'Y' || OptionAE == 'y') {
                        afterScripteven();
                    } else if (OptionAE == 'N' || OptionAE == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAE == 2) {
                lbanner();
            } else if (numAE == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAE + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAE = consoleAE.next().charAt(0);
            if (OptionAE == 'Y' || OptionAE == 'y') {
                afterScripteven();
            } else if (OptionAE == 'N' || OptionAE == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }

    public static void smallestnumber() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("                     _ _ ");
        System.out.println(" ___ _ __ ___   __ _| | |");
        System.out.println("/ __| '_ ` _ \\ / _` | | |");
        System.out.println("\\__ \\ | | | | | (_| | | |");
        System.out.println("|___/_| |_| |_|\\__,_|_|_|");
        try {
            Scanner scan = new Scanner(System.in);

            System.out.print("\nEnter the first number > ");

            int snum1 = scan.nextInt();

            System.out.print("\nEnter the second number > ");

            int snum2 = scan.nextInt();

            System.out.print("\nEnter the Third number > ");

            int snum3 = scan.nextInt();

            if (snum1 <= snum2 && snum1 <= snum3) {
                System.out.println("\n" + snum1 + " > The smallest number");

            } else if (snum2 <= snum1 && snum2 <= snum3) {
                System.out.println("\n" + snum2 + " > The smallest number");

            } else {
                System.out.println("\n" + snum3 + " > The smallest number");

            }
            afterScriptsmall();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_small();
        }
    }

    public static void smallestnumberd() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("                     _ _ ");
        System.out.println(" ___ _ __ ___   __ _| | |");
        System.out.println("/ __| '_ ` _ \\ / _` | | |");
        System.out.println("\\__ \\ | | | | | (_| | | |");
        System.out.println("|___/_| |_| |_|\\__,_|_|_|");
        try {
            Scanner scand = new Scanner(System.in);

            System.out.print("\nEnter the first number > ");

            double dnum1 = scand.nextDouble();

            System.out.print("\nEnter the second number > ");

            double dnum2 = scand.nextDouble();

            System.out.print("\nEnter the Third number > ");

            double dnum3 = scand.nextDouble();

            if (dnum1 <= dnum2 && dnum1 <= dnum3) {
                System.out.println("\n" + dnum1 + " > The smallest number");

            } else if (dnum2 <= dnum1 && dnum2 <= dnum3) {
                System.out.println("\n" + dnum2 + " > The smallest number");

            } else {
                System.out.println("\n" + dnum3 + " > The smallest number");

            }
            afterScriptsmall();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_smalld();
        }
    }

    public static void afterScriptsmall() {
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAS = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAS = consoleAS.nextInt();
        if (numAS >= 1 && numAS <= 3) {
            if (numAS == 1) {
                System.out.println("\n [1] Small {INT}");
                System.out.println("\n [2] Small {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdS = consoleAS.nextInt();
                if (intdS == 1) {
                    smallestnumber();
                } else if (intdS == 2) {
                    smallestnumberd();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdS + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAS = consoleAS.next().charAt(0);
                    if (OptionAS == 'Y' || OptionAS == 'y') {
                        afterScriptsmall();
                    } else if (OptionAS == 'N' || OptionAS == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAS == 2) {
                lbanner();
            } else if (numAS == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAS + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAS = consoleAS.next().charAt(0);
            if (OptionAS == 'Y' || OptionAS == 'y') {
                afterScripteven();
            } else if (OptionAS == 'N' || OptionAS == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }

    public static void largestnumber() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" _                      ");
        System.out.println("| | __ _ _ __ __ _  ___ ");
        System.out.println("| |/ _` | '__/ _` |/ _ \\");
        System.out.println("| | (_| | | | (_| |  __/");
        System.out.println("|_|\\__,_|_|  \\__, |\\___|");
        System.out.println("             |___/              ");
        try {
            int x, y, z;
            Scanner scanl = new Scanner(System.in);
            System.out.print("\nEnter the first number > ");
            x = scanl.nextInt();
            System.out.print("\nEnter the second number > ");
            y = scanl.nextInt();
            System.out.print("\nEnter the third number > ");
            z = scanl.nextInt();
            if (x > y && x > z) {
                System.out.println("\n" + x + " > Largest number");
            } else if (y > z) {
                System.out.println("\n" + y + " > Largest number");
            } else {
                System.out.println("\n" + z + " > Largest number");
            }
            afterScriptlarge();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_large();
        }
    }

    public static void largestnumberd() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" _                      ");
        System.out.println("| | __ _ _ __ __ _  ___ ");
        System.out.println("| |/ _` | '__/ _` |/ _ \\");
        System.out.println("| | (_| | | | (_| |  __/");
        System.out.println("|_|\\__,_|_|  \\__, |\\___|");
        System.out.println("             |___/              ");
        try {
            double x, y, z;
            Scanner scanl = new Scanner(System.in);
            System.out.print("\nEnter the first number > ");
            x = scanl.nextDouble();
            System.out.print("\nEnter the second number > ");
            y = scanl.nextDouble();
            System.out.print("\nEnter the third number > ");
            z = scanl.nextDouble();
            if (x > y && x > z) {
                System.out.println("\n" + x + " > Largest number");
            } else if (y > z) {
                System.out.println("\n" + y + " > Largest number");
            } else {
                System.out.println("\n" + z + " > Largest number");
            }
            afterScriptlarge();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_larged();
        }
    }

    public static void afterScriptlarge() {
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAL = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAL = consoleAL.nextInt();
        if (numAL >= 1 && numAL <= 3) {
            if (numAL == 1) {
                System.out.println("\n [1] large {INT}");
                System.out.println("\n [2] large {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdL = consoleAL.nextInt();
                if (intdL == 1) {
                    largestnumber();
                } else if (intdL == 2) {
                    largestnumberd();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdL + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAL = consoleAL.next().charAt(0);
                    if (OptionAL == 'Y' || OptionAL == 'y') {
                        afterScriptlarge();
                    } else if (OptionAL == 'N' || OptionAL == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAL == 2) {
                lbanner();
            } else if (numAL == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAL + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAL = consoleAL.next().charAt(0);
            if (OptionAL == 'Y' || OptionAL == 'y') {
                afterScriptlarge();
            } else if (OptionAL == 'N' || OptionAL == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void pnz(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _   _ _____");
        System.out.println("|  _ \\| \\ | |__  /");
        System.out.println("| |_) |  \\| | / / ");
        System.out.println("|  __/| |\\  |/ /_ ");
        System.out.println("|_|   |_| \\_/____|");
        try {
            Scanner inbnz = new Scanner(System.in);
            System.out.print("\nInsert a number > ");
            int numbnz = inbnz.nextInt();
            if(numbnz > 0)
            {
                System.out.println("\n" +numbnz+" > Is a positive number");
            }
            else if(numbnz < 0)
            {
                System.out.println("\n" +numbnz+" > Is a negative number");
            }
            else
            {
                System.out.println("\n" +numbnz+" > Is a zero");
            }
            afterScriptpnz();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_pnz();
        }
    }
    public static void pnzd(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ____  _   _ _____");
        System.out.println("|  _ \\| \\ | |__  /");
        System.out.println("| |_) |  \\| | / / ");
        System.out.println("|  __/| |\\  |/ /_ ");
        System.out.println("|_|   |_| \\_/____|");
        try{
            Scanner inbnzd = new Scanner(System.in);
            System.out.print("\nInsert a number > ");
            double numbnzd = inbnzd.nextDouble();
            if(numbnzd > 0.0)
            {
                System.out.println("\n" +numbnzd+" > Is a positive number");
            }
            else if(numbnzd < 0.0)
            {
                System.out.println("\n" +numbnzd+" > Is a negative number");
            }
            else
            {
                System.out.println("\n" +numbnzd+" > Is a zero");
            }
            afterScriptpnz();
        }catch(Exception p){
            System.out.println("\n[*] Invalid input\n");
            error_msg_pnzd();
        }
    }
    public static void afterScriptpnz(){
        System.out.println("\n [1] Rebeat");
        System.out.println("\n [2] Back");
        System.out.println("\n [3] Exit");
        Scanner consoleAPNZ = new Scanner(System.in);
        System.out.print("\nPlease insert a number > ");
        int numAPNZ = consoleAPNZ.nextInt();
        if (numAPNZ >= 1 && numAPNZ <= 3) {
            if (numAPNZ == 1) {
                System.out.println("\n [1] PNZ {INT}");
                System.out.println("\n [2] PNZ {DOUBLE}");
                System.out.print("\n Please insert a number > ");
                int intdPNZ = consoleAPNZ.nextInt();
                if (intdPNZ == 1) {
                    pnz();
                } else if (intdPNZ == 2) {
                    pnzd();
                } else {
                    System.out.println("\nThe Option That You Was Inser > " + intdPNZ + " < Isn't In The Option List\n");
                    System.out.print("Are You Want To Repeat (Y/N) > ");
                    char OptionAPNZ = consoleAPNZ.next().charAt(0);
                    if (OptionAPNZ == 'Y' || OptionAPNZ == 'y') {
                        afterScriptpnz();
                    } else if (OptionAPNZ == 'N' || OptionAPNZ == 'n') {
                        System.out.println("\nGood Bye (^_^)/\n");
                        System.exit(1);
                    } else {
                        System.out.println("[*] Sorry There Are An Error\n");
                    }
                }
            } else if (numAPNZ == 2) {
                lbanner();
            } else if (numAPNZ == 3) {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            }
        } else {
            System.out.println("\nThe Option That You Was Inser > " + numAPNZ + " < Isn't In The Option List\n");
            System.out.print("Are You Want To Repeat (Y/N) > ");
            char OptionAPNZ = consoleAPNZ.next().charAt(0);
            if (OptionAPNZ == 'Y' || OptionAPNZ == 'y') {
                afterScriptpnz();
            } else if (OptionAPNZ == 'N' || OptionAPNZ == 'n') {
                System.out.println("\nGood Bye (^_^)/\n");
                System.exit(1);
            } else {
                System.out.println("[*] Sorry There Are An Error\n");
            }
        }
    }
    public static void error_msg_i(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            ibanner();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_i();
        }
    }
    public static void error_msg_math(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            mbanner();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_math();
        }
    }
    public static void error_msg_logic(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            lbanner();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_logic();
        }
    }
    public static void error_msg_prime(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            prime();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_prime();
        }
    }
    public static void error_msg_primed(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            primeD();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_primed();
        }
    }
    public static void error_msg_odd(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            oddnumber();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_odd();
        }
    }
    public static void error_msg_oddD(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            oddnumberD();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_oddD();
        }
    }
    public static void error_msg_even(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            evennumber();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_even();
        }
    }
    public static void error_msg_evend(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            evennumberd();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_evend();
        }
    }
    public static void error_msg_small(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            smallestnumber();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_small();
        }
    }
    public static void error_msg_smalld(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            smallestnumberd();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_smalld();
        }
    }
    public static void error_msg_large(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            largestnumber();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_large();
        }
    }
    public static void error_msg_larged(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            largestnumberd();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_larged();
        }
    }
    public static void error_msg_pnz(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            pnz();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_pnz();
        }
    }
    public static void error_msg_pnzd(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            pnzd();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_pnzd();
        }
    }
    public static void error_msg_add(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            add();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_add();
        }
    }
    public static void error_msg_addD(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            addD();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_addD();
        }
    }
    public static void error_msg_sub(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            sub();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_sub();
        }
    }
    public static void error_msg_subD(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            subD();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_subD();
        }
    }
    public static void error_msg_multi(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            multi();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_multi();
        }
    }
    public static void error_msg_multid(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            multid();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_multid();
        }
    }
    public static void error_msg_dev(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            dev();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_dev();
        }
    }
    public static void error_msg_devd(){
        Scanner erc = new Scanner(System.in);
        System.out.print("Are you want to try agian Y or N ? > ");
        char op = erc.next().charAt(0);
        if (op == 'Y' || op == 'y'){
            devd();
        }else if (op == 'N' || op == 'n'){
            System.out.println("\nGood Bye (^_^)/\n");
            System.exit(1);
        }else{
            System.out.println("\n[*] Invalid input\n");
            error_msg_devd();
        }
    }
    public static void main(String[] args) {
        ibanner();
    }
}