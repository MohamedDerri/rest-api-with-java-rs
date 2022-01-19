package com.derri.cabinetmedecinrest.Controller;

import com.derri.cabinetmedecinrest.Entity.Doctor;
import com.derri.cabinetmedecinrest.metier.DoctorService;

import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("doctor")
public class DoctorController {
    DoctorService doctorService = new DoctorService();

    @GET
    @Path("/{docId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Doctor getDoctor(@PathParam("docId") int docId) throws RemoteException, SQLException {
        return doctorService.getDoctor(docId);
    }

    @POST
    public void createDoctor(Doctor doctor) throws SQLException {
        doctorService.createDoctor(doctor);
    }

    @DELETE
    @Path("/{docId}")
    public void deleteDoctor(@PathParam("docId") int docId) throws RemoteException, SQLException {
        doctorService.deleteDoctor(docId);
    }

    @PUT
    @Path("/{docId}")
    public void updateDoctor(@PathParam("docId") int id_doc, Doctor doctor) {
        doctorService.updateDoctor(id_doc, doctor);
    }
}
