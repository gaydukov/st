package com.service;



import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 27.02.2017.
 */
public class DAO {
    private final String URL = "jdbc:mysql://localhost:3306/mybdtest";
    private final String user = "root";
    private final String password = "root";
    private Connection cn=null;
    private Statement st=null;
    private PreparedStatement prst=null;
    private ResultSet rs=null;
    public List show(){
        List<Student> stud=new ArrayList<Student>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection(URL,user,password);
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM student");

            while (rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int grupa=rs.getInt(3);
                int ocenka=rs.getInt(4);
                stud.add(new Student(id,name,grupa,ocenka));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return stud;
    }
    public void DBAdd(Student student){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(URL,user,password);
            prst=cn.prepareStatement("insert into student (name,grupa,ocenka) values (?,?,?)");
            prst.setString(1,student.getName());
            prst.setInt(2,student.getGrupa());
            prst.setInt(3,student.getOcenka());
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                prst.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public void DBDel(int id){
        try {
            cn=DriverManager.getConnection(URL,user,password);
            prst=cn.prepareStatement("DELETE FROM student WHERE idstudent=?");
            prst.setInt(1,id);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String Nameone(){
        String s = null;
        try {

            cn= DriverManager.getConnection(URL,user,password);
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM student");
            s=rs.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }
    public List showid(int idst) {
        List<Student> stud = new ArrayList<Student>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(URL, user, password);
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM student WHERE idstudent=" + idst);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int grupa = rs.getInt(3);
                int ocenka = rs.getInt(4);
                stud.add(new Student(id, name, grupa, ocenka));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return stud;
    }
}
