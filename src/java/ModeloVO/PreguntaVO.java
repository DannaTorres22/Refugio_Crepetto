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
public class PreguntaVO {
     private String idPregunta,idUsuario,nombre,descripcion;

 

    public PreguntaVO(String idPregunta, String idUsuario, String nombre, String descripcion) {
        this.idPregunta = idPregunta;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
     
    }

    public PreguntaVO() {
    }

    public PreguntaVO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    public String getIdPregunta() {
        return idPregunta;
    }
    

    public void setIdPregunta(String idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  

    
}