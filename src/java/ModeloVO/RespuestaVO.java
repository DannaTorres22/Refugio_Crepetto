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
public class RespuestaVO {
    public String idRespuesta,idPregunta,idUsuario,respuesta,estadoRespuesta;

    public RespuestaVO() {
    }

    public RespuestaVO(String idRespuesta, String idPregunta, String idUsuario, String respuesta, String estadoRespuesta) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.idUsuario = idUsuario;
        this.respuesta = respuesta;
        this.estadoRespuesta = estadoRespuesta;
    }

    public String getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEstadoRespuesta() {
        return estadoRespuesta;
    }

    public void setEstadoRespuesta(String estadoRespuesta) {
        this.estadoRespuesta = estadoRespuesta;
    }

   
    
}

