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

//He añadido codCentro, codEspFisico

public class PuestoTrabajo {
    private String codigoPuesto, nombrePuesto, comentario, codEmpresa, codUnidadOrg;
    private String codCentro;
    

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
    
    public String getCodCentro() {
        return codCentro;
    }

    public void setCodCentro(String codCentro) {
        this.codCentro = codCentro;
    }

    public String getCodUnidadOrg() {
        return codUnidadOrg;
    }

    public void setCodUnidadOrg(String codUnidadOrg) {
        this.codUnidadOrg = codUnidadOrg;
    }
    
    public PuestoTrabajo() {
    }
    
}
