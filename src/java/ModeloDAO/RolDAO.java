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

    
    public ArrayList<RolVO> listar(String correoUsuario) 
    {
        ArrayList<RolVO> listaRol = new ArrayList<>();
        try 
        {
            conexion = this.obtenerConexion();
            sql = "SELECT usuario.idUsuario, rol.rolTipo FROM rol INNER JOIN usuario on rol.rolId = usuario.rolId where usuario.correoUsuario=?;";  
            puente = conexion.prepareStatement(sql);
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