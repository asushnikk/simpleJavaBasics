package task3;

public class Main {

    public static void main(String[] args) {

                Newbie newbie1 = new Newbie();
                newbie1.setStationeryList(new NewbiePack().getNewbieStationery());
                newbie1.printInfo();
    }
}
