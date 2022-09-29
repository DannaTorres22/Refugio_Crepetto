package ModeloDAO;

import ModeloVO.RolVO;
import Util.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class RolDAO extends ConexionBd 
{
    //1. Declarar variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    private String rolId = "", rolTipo = "";
    
    public RolDAO()
    {
    
    }

    public RolDAO(RolVO rolVO) 
    {
        super();

        try 
        {
            conexion = this.obtenerConexion();

            rolId = rolVO.getRolId();
            rolTipo = rolVO.getRolTipo();
            
        } 
        catch (Exception e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    public ArrayList<RolVO> listar(String correUsuario) 
    {
        ArrayList<RolVO> listaRol = new ArrayList<>();
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT usuario.IDUSUARIO, rol.ROLTIPO FROM rol INNER JOIN usuario_rol ON rol.ROLID = usuario_rol.ROLID INNER JOIN usuario ON usuario_rol.IDUSUARIO = usuario.IDUSUARIO WHERE usuario.CORREOUSUARIO=?;";  
            puente = conexion.prepareStatement(sql);
            String correoUsuario = null;
            puente.setString(1, correoUsuario);
            mensajero = puente.executeQuery();
            while (mensajero.next()) 
            {
                RolVO rolVO = new RolVO(mensajero.getString(1), mensajero.getString(2));
                listaRol.add(rolVO);
            }

        } 
        catch (SQLException e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        finally 
        {
            try 
            {
                this.cerrarConexion();
            } 
            catch (SQLException e) 
            {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaRol;
    }
}