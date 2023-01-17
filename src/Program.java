import com.mysql.cj.xdevapi.DbDocImpl;
import ctrl.App;
import db.Db;
import db.Worker;
import ui.Ui;
import java.sql.*;

public class Program extends App{
    public static void main(String[] args) throws SQLException {

        /*

        Statement st = conn.createStatement();
        //st.execute("insert into workers values (null, 'Pera Peric', 45, 'Akacija 29', 5000)");

        ResultSet rs = st.executeQuery("select * from workers");

        rs.next();

        *//*String name = rs.getString(2);
        System.out.println(name);*/

        Ui ui = new Ui();

        /*int selectedOption = ui.menu();
        System.out.println(selectedOption);*/

        /*int selectedId = ui.getId();
        System.out.println(selectedId);*/

        /*Worker selectedWorker = ui.getWorker();
        System.out.println(selectedWorker);*/

        /*Worker worker = new Worker();
        worker.name = "Dejan";
        worker.age = 47;
        worker.address = "Nisavska 11";
        worker.salary = 50000;
        System.out.println(worker);

        ui.updateWorker(worker);
        System.out.println(worker);*/

        //ui.showWorkerByName();

        /*Worker worker = ui.getWorker();
        Db db = new Db();
        db.insertWorker(worker);*/

        /*int id = ui.getId();
        Db db = new Db();
        db.deleteWorker(id);*/

        /*Worker worker = new Worker();
        worker.id = 1;
        worker.name = "Mika Mikic";
        worker.age = 40;
        worker.address = "Meseceva 20";
        worker.salary = 55555;
        Db db = new Db();
        db.updateWorker(worker);*/

        Db db = new Db();
        //db.getWorkerByName("Mika");


        /*Worker worker = db.getWorker(2);
        System.out.println(worker);*/

        launch();
    }
}
