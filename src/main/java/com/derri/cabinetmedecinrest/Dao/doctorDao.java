package com.derri.cabinetmedecinrest.Dao;

import com.derri.cabinetmedecinrest.Entity.Doctor;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class doctorDao {

    public int createDoctor(Doctor doctor) throws SQLException {
        String query = "insert into docteur(id, firstName, lastName, city, diseaseId) VALUES ('"+ doctor.getId() + "', '"+ doctor.getLastName() +"', '"+ doctor.getFirstName() + "')";
        Statement st = (Statement) Connection.getInstance().createStatement();
        int n = st.executeUpdate(query);
        return n;
    }

    public Doctor getDoctor(int docId) throws RemoteException, SQLException {
        Doctor doctor = new Doctor();
        Statement st = (Statement) Connection.getInstance().createStatement();
        try {
            String query = "select * from docteur where docId='"+docId+"'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                doctor.setId(rs.getInt("id"));
                doctor.setLastName(rs.getString("lastName"));
                doctor.setFirstName(rs.getString("firstName"));
                doctor.setCity(rs.getString("city "));
                doctor.setDiseaseId(rs.getInt("dId"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctor;
    }

    public int updateDoctor(int cni, Doctor doctor) {
        String sql = "UPDATE docteur SET id=?, lastName=?, firstName? WHERE id=?";
        int rowsUpdated = 0;
        PreparedStatement statement;
        try {
            statement = (PreparedStatement) Connection.getInstance().prepareStatement(sql);
            statement.setLong(1, doctor.getId());
            statement.setString(2, doctor.getLastName());
            statement.setString(3, doctor.getFirstName());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("updated successfully!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowsUpdated;
    }


    public void deleteDoctor(int docId) throws RemoteException, SQLException {
        Statement st = (Statement) Connection.getInstance().createStatement();
        String query = "delete from doctor where cni='"+docId+"'";
        System.out.println("doctor was deleted successfully!");
        st.executeUpdate(query);
    }
}
