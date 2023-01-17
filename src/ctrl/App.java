package ctrl;

import db.Db;
import ui.Ui;

import java.sql.SQLException;

public class App {

    public static void launch() throws SQLException {

        Ctrl ctrl = new Ctrl();
        ctrl.ui = new Ui();
        ctrl.db = new Db();

        mainLoop:
        while (true) {
            int item = ctrl.ui.menu();

            switch (item) {
                case 1:
                    ctrl.addWorker();
                break ;
                case 2:
                    ctrl.updateWorker();
                break;
                case 3:
                    ctrl.deleteWorker();
                break;
                case 4:
                    ctrl.showWorkers();
                break;
                case 5:
                    ctrl.showWorker();
                break;
                case 6:
                    System.out.println("You closed the program");
                break mainLoop;
            }
        }
    }
}
