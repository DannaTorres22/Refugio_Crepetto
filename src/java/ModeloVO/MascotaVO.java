/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author julia_000
 */
public class MascotaVO {
    private String idMascota, idUsuario,fechaIngreso, nombre, edad, raza, tipo, estadoMascota;

    public MascotaVO(String idMascota, String idUsuario,String fechaIngreso, String nombre, String edad, String raza, String tipo, String estadoMascota) {
        this.idMascota = idMascota;
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.estadoMascota = estadoMascota;
    }

    public MascotaVO() {
    }

    public MascotaVO(String idUsuario, String fechaIngreso,String nombre, String edad, String raza,String tipo, String estadoMascota) {
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.estadoMascota = estadoMascota;
    }

    
    

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(String estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

}