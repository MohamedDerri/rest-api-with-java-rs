package com.derri.cabinetmedecinrest.Controller;


import com.derri.cabinetmedecinrest.Entity.Patient;
import com.derri.cabinetmedecinrest.metier.PatientService;

import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("patient")
public class PatientController {
    PatientService patientService = new PatientService();

    @GET
    @Path("/{CNI}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatient(@PathParam("CNI") int cni) throws RemoteException, SQLException {
        System.out.println("getPatient");
        return patientService.getPatient(cni);
    }

    @POST
    public void createPatient(Patient patient) throws SQLException {
        patientService.createPatient(patient);
    }

    @DELETE
    @Path("/{CNI}")
    public void deletePatient(@PathParam("CNI") int cni) throws RemoteException, SQLException {
        patientService.deletePatient(cni);
    }

    @PUT
    @Path("/{CNI}")
    public void updatePatient(@PathParam("CNI") int cni, Patient patient) {
        patientService.updatePatient(cni, patient);
    }
}