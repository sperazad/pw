/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datoscarga;

/**
 *
 * @author TNFUSER-07
 */


public class TrabajadorPuestoTrabajo {
    private String codigoTrabajador, codigoEmpresa, codigoPuesto;
    private String codMotivoAsignacion;
    private String motivoAsignacion;
    private String comentario;
    private String fechaInicio, fechaFin;


    public String getMotivoAsignacion() {
        return motivoAsignacion;
    }

    public void setMotivoAsignacion(String motivoAsignacion) {
        this.motivoAsignacion = motivoAsignacion;
    }
    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }
    

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getCodMotivoAsignacion() {
        return codMotivoAsignacion;
    }

    public void setCodMotivoAsignacion(String codMotivoAsignacion) {
        this.codMotivoAsignacion = codMotivoAsignacion;
    }
    
    public TrabajadorPuestoTrabajo(){
    }
    
}
