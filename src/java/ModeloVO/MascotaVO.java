/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

import java.io.InputStream;

/**
 *
 * @author julia_000
 */
public class MascotaVO {

    private String idMascota;
    private String idUsuario;
    private String fechaIngreso;
    private InputStream foto;
    private String url;
    private String nombre;
    private String edad;
    private String raza;
    private String tipo;
    private String estadoMascota;
    private String urlFoto;

    public MascotaVO(String idMascota, String idUsuario, String fechaIngreso, InputStream foto, String url,String nombre, String edad, String raza, String tipo, String estadoMascota) {
        this.idMascota = idMascota;
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
        this.foto = foto;
         this.url = url;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.estadoMascota = estadoMascota;
    }

    public MascotaVO(String idUsuario, String fechaIngreso, InputStream foto,String url ,String nombre, String edad, String raza, String tipo, String estadoMascota) {
        this.idUsuario = idUsuario;
        this.fechaIngreso = fechaIngreso;
        this.foto = foto;
         this.url = url;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.estadoMascota = estadoMascota;
    }

    public MascotaVO() {
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

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
    
    
    

}