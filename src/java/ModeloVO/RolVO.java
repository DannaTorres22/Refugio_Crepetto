package ModeloVO;

/**
 *
 * @author alrod
 */
public class RolVO {

    private String rolId, rolTipo;

    public RolVO(String rolId, String rolTipo) {
        this.rolId = rolId;
        this.rolTipo = rolTipo;
    }

    public RolVO() {

    }

    public RolVO(String rolId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }

    public String getRolTipo() {
        return rolTipo;
    }

    public void setRolTiPo(String rolTipo) {
        this.rolTipo = rolTipo;
    }


}