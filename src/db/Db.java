package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Db {

    public Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/company", "root", "pass");
        return conn;
    }

    public void insertWorker(Worker worker) throws SQLException {
        Connection connection = connect();
        Statement st = connection.createStatement();
        String query = "insert into workers values (null, '" + worker.name + "', '" +worker.age + "', '" + worker.address + "', '" + worker.salary +"')";
        st.execute(query);
        connection.close();
    }

    public void deleteWorker(int id) throws SQLException {
        Connection connection = connect();
        Statement st = connection.createStatement();
        String query = "delete from workers where id = " + id;
        st.execute(query);
        connection.close();
    }

    public void updateWorker(Worker worker) throws SQLException {
        Connection connection = connect();
        String query = "update workers set name = ?, age = ?, address = ?, salary = ? where id = ?";
        PreparedStatement st = connection.prepareStatement(query);
        st.setString(1, worker.name);
        st.setInt(2, worker.age);
        st.setString(3, worker.address);
        st.setInt(4, worker.salary);
        st.setInt(5, worker.id);
        st.execute();
        connection.close();
    }

    public List<Worker> getAllWorkers() throws SQLException {
        List<Worker> list = new ArrayList();
        Connection connection = connect();
        Statement st = connection.createStatement();
        String query = "select * from workers";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Worker worker = new Worker();
            worker.id = rs.getInt("id");
            worker.name = rs.getString("name");
            worker.age = rs.getInt("age");
            worker.address = rs.getString("address");
            worker.salary = rs.getInt("salary");
            list.add(worker);
        }
        connection.close();
        return list;
    }

    public Worker getWorker(int id) throws SQLException {
        Connection connection = connect();
        Worker worker = null;
        String query = "select * from workers where id = ?";
        PreparedStatement st = connection.prepareStatement(query);
        st.setInt(1, id);

        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            worker = new Worker();
            worker.id = rs.getInt("id");
            worker.name = rs.getString("name");
            worker.age = rs.getInt("age");
            worker.address = rs.getString("address");
            worker.salary = rs.getInt("salary");
        }
        st.close();
        connection.close();
        return worker;
    }

    public Worker getWorkerByName(String name) throws SQLException {
        Worker worker = null;
        Connection connection = connect();
        String query = "select * from workers where name = ?";
        PreparedStatement st = connection.prepareStatement(query);
        st.setString(1, name);

        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            worker = new Worker();
            worker.id = rs.getInt("id");
            worker.name = rs.getString("name");
            worker.age = rs.getInt("age");
            worker.address = rs.getString("address");
            worker.salary = rs.getInt("salary");
        }
        st.close();
        connection.close();
        return worker;
    }


}
