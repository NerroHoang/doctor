
import entity.History;
import entity.Worker;
import java.util.ArrayList;
import manager.Manager;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.addWorker(lw);
                    break;
                case 2:
                    Manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    Manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    Manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
