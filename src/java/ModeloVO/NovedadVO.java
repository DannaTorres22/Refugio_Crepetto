package ModeloVO;

/**
 *
 * @author Danna Bejarano
 */
public class NovedadVO {
    private String idNovedad, idMascota, tipoNovedad, observacionNovedad, fechaNovedad;
    
        public NovedadVO() {
    }

    public NovedadVO(String idNovedad, String idMascota, String tipoNovedad, String observacionNovedad, String fechaNovedad) {
        this.idNovedad = idNovedad;
        this.idMascota = idMascota;
        this.tipoNovedad = tipoNovedad;
        this.observacionNovedad = observacionNovedad;
        this.fechaNovedad = fechaNovedad;
    }

    public NovedadVO(String idMascota, String tipoNovedad, String observacionNovedad, String fechaNovedad) {
        this.idMascota = idMascota;
        this.tipoNovedad = tipoNovedad;
        this.observacionNovedad = observacionNovedad;
        this.fechaNovedad = fechaNovedad;
    }

   



    public String getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(String idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public String getObservacionNovedad() {
        return observacionNovedad;
    }

    public void setObservacionNovedad(String observacionNovedad) {
        this.observacionNovedad = observacionNovedad;
    }

    public String getFechaNovedad() {
        return fechaNovedad;
    }

    public void setFechaNovedad(String fechaNovedad) {
        this.fechaNovedad = fechaNovedad;
    }
}