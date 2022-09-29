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
public class UsuarioVO {
  private String idUsuario,
          correoUsuario,
          password,
          rolId;

   

    public UsuarioVO(String idUsuario,
            String correoUsuario,
            String password,
            String rolId) {
        
        this.idUsuario = idUsuario;
        this.correoUsuario = correoUsuario;
        this.password = password;
        this.rolId = rolId;
    }

     public UsuarioVO() {
    }

    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    } 
}