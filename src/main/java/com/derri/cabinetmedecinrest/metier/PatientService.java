package com.derri.cabinetmedecinrest.metier;

import com.derri.cabinetmedecinrest.Dao.PatientDao;
import com.derri.cabinetmedecinrest.Entity.Patient;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class PatientService {
    PatientDao patientDao = new PatientDao();

    public int createPatient(Patient patient) throws SQLException {
        return patientDao.createPatient(patient);
    }

    public Patient getPatient(int cni) throws RemoteException, SQLException {
        return patientDao.getPatient(cni);
    }

    public int updatePatient(int cni, Patient patient) {
        return patientDao.updatePatient(cni, patient);
    }


    public void deletePatient(int cni) throws RemoteException, SQLException {
        patientDao.deletePatient(cni);
    }
}
