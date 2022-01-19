package com.derri.cabinetmedecinrest.Dao;

import com.derri.cabinetmedecinrest.Entity.Patient;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDao {

    public int createPatient(Patient patient) throws SQLException {
        String query = "insert into patient(CNI, nom, prenom, ville, adresse, age, sexe,photo) VALUES ('"+ patient.getCni() + "', '"+ patient.getFirstName() +"', '"+ patient.getLastName() +"', '"+ patient.getCity() +"', '"+ patient.getAdresse() +"', '"+ patient.getAge() +"', '"+ patient.getSexe() +"', '"+ patient.getPicture() + "')";
        Statement st = (Statement) Connection.getInstance().createStatement();
        int n = st.executeUpdate(query);
        return n;
    }

    public Patient getPatient(int cni) throws RemoteException, SQLException {
        Patient patient = new Patient();
        Statement st = (Statement) Connection.getInstance().createStatement();
        try {
            String query = "select * from patient where CNI='"+cni+"'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                patient.setCni(rs.getString("CNI"));
                patient.setLastName(rs.getString("last name"));
                patient.setFirstName(rs.getString("FirstName"));
                patient.setCity(rs.getString("city"));
                patient.setAdresse(rs.getString("adresse"));
                patient.setAge(rs.getInt("age"));
                patient.setSexe(rs.getBoolean("sexe"));
                patient.setPicture(rs.getString("Picture"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return patient;
    }

    public int updatePatient(int cni, Patient patient) {
        String sql = "UPDATE patient SET cni=?, lastName=?, firstName=?, city=?, adresse=?, age=?, sexe=?, picture=? WHERE id=?";
        int rowsUpdated = 0;
        PreparedStatement statement;
        try {
            statement = (PreparedStatement) Connection.getInstance().prepareStatement(sql);
            statement.setString(1, patient.getCni());
            statement.setString(2, patient.getLastName());
            statement.setString(3, patient.getFirstName());
            statement.setString(4, patient.getCity());
            statement.setString(5, patient.getAdresse());
            statement.setInt(6, patient.getAge());
            statement.setBoolean(7, patient.getSexe());
            statement.setString(8, patient.getPicture());

            rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing user was updated successfully!");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowsUpdated;
    }


    public void deletePatient(int cni) throws RemoteException, SQLException {
        Statement st = (Statement) Connection.getInstance().createStatement();
        String query = "delete from patient where CNI='"+cni+"'";
        st.executeUpdate(query);
    }
}
