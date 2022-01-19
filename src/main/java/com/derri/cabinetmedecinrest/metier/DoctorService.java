package com.derri.cabinetmedecinrest.metier;

import com.derri.cabinetmedecinrest.Dao.doctorDao;
import com.derri.cabinetmedecinrest.Entity.Doctor;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class DoctorService {

    doctorDao doctorDao = new doctorDao();

    public int createDoctor(Doctor doctor) throws SQLException {
        return doctorDao.createDoctor(doctor);
    }

    public Doctor getDoctor(int docId) throws RemoteException, SQLException {
        return doctorDao.getDoctor(docId);
    }

    public int updateDoctor(int docId, Doctor doctor) {
        return doctorDao.updateDoctor(docId, doctor);
    }


    public void deleteDoctor(int docId) throws RemoteException, SQLException {
        doctorDao.deleteDoctor(docId);
    }
}
