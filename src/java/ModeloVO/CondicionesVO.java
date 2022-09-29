/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Gabriela Moron
 */
public class CondicionesVO {
    public String idCondicion,
            idRespuesta,
            nombre,
            fechaNacimiento,
            tipoDocumento,
            numDocumento,
            direccion,
            celular,
            profesion,
            trabajo,
            correo;

    public CondicionesVO(String idCondicion,
            String idRespuesta,
            String nombre,
            String fechaNacimiento,
            String tipoDocumento,
            String numDocumento,
            String direccion,
            String celular,
            String profesion,
            String trabajo,
            String correo) {
        
        this.idCondicion = idCondicion;
        this.idRespuesta = idRespuesta;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.direccion = direccion;
        this.celular = celular;
        this.profesion = profesion;
        this.trabajo = trabajo;
        this.correo = correo;
    }

    public CondicionesVO() {
    }

    public String getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(String idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
   
    
}