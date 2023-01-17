package ctrl;

import db.Db;
import db.Worker;
import ui.Ui;
import java.sql.SQLException;
import java.util.List;

public class Ctrl {

    public Ui ui;
    public Db db;

    public void showWorkers() throws SQLException {
        List<Worker> allWorkers = db.getAllWorkers();
        for (int i = 0; i < allWorkers.size(); i++) {
            System.out.println(allWorkers.get(i));
        }
    }

    public void addWorker() throws SQLException {
        Worker worker = ui.getWorker();
        db.insertWorker(worker);
    }

    public void deleteWorker() throws SQLException {
        int id = ui.getId();
        db.deleteWorker(id);
    }

    public void updateWorker() throws SQLException {
        int id = ui.getId();
        Worker worker = db.getWorker(id);
        if(worker == null) {
            System.out.println("There is no worker with this id");
            return;
        }
        ui.updateWorker(worker);
        db.updateWorker(worker);
    }

    public void showWorker() throws SQLException {
        String name = ui.showWorkerByName();
        Worker worker = db.getWorkerByName(name);
        if(worker != null) {
            System.out.println(worker);
        } else {
            System.out.println("There is no worker with this name");
        }
    }
}
