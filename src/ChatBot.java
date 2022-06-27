import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class ChatBot {

    static Stack<YourOption> storeStack = new Stack<YourOption>();

    public static void main(String args[]) {
        ChatBot chatBot = new ChatBot();
        chatBot.stackPopOp();
        System.out.println();
    }

    public void stackPopOp() {
        int choice;
        storeStack.push(new YourOption(0, 0));
        print(0, 0);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter your option : ");
            choice = input.nextInt();

            if (choice == 9) {
                storeStack.pop();

                if (storeStack.isEmpty()) {
                    break;
                }
            } else {
                storeStack.push(new YourOption(storeStack.peek().getLevel() + 1, choice));

            }
            YourOption top = storeStack.peek();
            print(top.getLevel(), top.getChoice());

        } while (choice != 0);
        System.out.println("Thank You!!");
    }

    private static void print(int level, int choice) {

        for (String choiceString : getChoices(level, choice)) {
            System.out.println(choiceString);
        }
    }

    static ArrayList<String> getChoices(int level, int choice) {
        ArrayList<String> choiceList = new ArrayList();
        if (level == 0) {
            choiceList.add(MainMenu.OPTION_1.toString());
            choiceList.add(MainMenu.OPTION_2.toString());
            choiceList.add(MainMenu.OPTION_3.toString());
            choiceList.add(MainMenu.OPTION_4.toString());
        }
        else if (level == 1) {
                switch (choice) {

                    case 1:
                        choiceList.add(Recharge.OPTION_1.toString());
                        choiceList.add(Recharge.OPTION_2.toString());
                        choiceList.add(Recharge.OPTION_3.toString());
                        choiceList.add(Recharge.OPTION_4.toString());
                        break;
                    case 2:
                        choiceList.add(CallerTune.OPTION_1.toString());
                        choiceList.add(CallerTune.OPTION_2.toString());
                        choiceList.add(CallerTune.OPTION_3.toString());
                        choiceList.add(CallerTune.OPTION_4.toString());
                        choiceList.add(CallerTune.OPTION_5.toString());
                        choiceList.add(CallerTune.OPTION_6.toString());
                        break;
                    case 3:
                        choiceList.add(DthRecharge.OPTION_1.toString());
                        choiceList.add(DthRecharge.OPTION_2.toString());
                        choiceList.add(DthRecharge.OPTION_3.toString());
                        choiceList.add(DthRecharge.OPTION_4.toString());
                        choiceList.add(DthRecharge.OPTION_5.toString());
                        break;
                    case 4:
                        choiceList.add(NewOffers.OPTION_1.toString());
                        choiceList.add(NewOffers.OPTION_2.toString());
                        choiceList.add(NewOffers.OPTION_3.toString());
                        choiceList.add(NewOffers.OPTION_4.toString());
                        choiceList.add(NewOffers.OPTION_5.toString());
                        choiceList.add(NewOffers.OPTION_6.toString());
                        break;
                }
        }
        else if (level == 2) {
                System.out.println("Action Successful!!");
                System.out.println("9-Back");
                System.out.println("0-Exit");}

        return choiceList;
    }
}