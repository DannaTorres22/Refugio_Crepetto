/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Danna_bejarano
 */
public class PersonaVO {
    private String idPersona, idMascota, nombresPersona, apellidoPersona, fechaNacimiento, estadoPersona;

    public PersonaVO() {
    }

    public PersonaVO(String idPersona, String idMascota, String nombresPersona, String apellidoPersona, String fechaNacimiento, String estadoPersona) {
        this.idPersona = idPersona;
        this.idMascota = idMascota;
        this.nombresPersona = nombresPersona;
        this.apellidoPersona = apellidoPersona;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoPersona = estadoPersona;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(String estadoPersona) {
        this.estadoPersona = estadoPersona;
    }
    
}
