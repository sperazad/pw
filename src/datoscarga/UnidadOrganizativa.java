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
public class UnidadOrganizativa {
    private String codigoEmpresa, codigo, codUnidadPadre, nombre, comentario;
    private DatosEmpresa datosEmpresa;
    private UnidadOrgCentro centrosUnidad;
    private UnidadOrganizativa unidadesHijas;

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodUnidadPadre() {
        return codUnidadPadre;
    }

    public void setCodUnidadPadre(String codUnidadPadre) {
        this.codUnidadPadre = codUnidadPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public DatosEmpresa getDatosEmpresa() {
        return datosEmpresa;
    }

    public void setDatosEmpresa(DatosEmpresa datosEmpresa) {
        this.datosEmpresa = datosEmpresa;
    }

    public UnidadOrgCentro getCentrosUnidad() {
        return centrosUnidad;
    }

    public void setCentrosUnidad(UnidadOrgCentro centrosUnidad) {
        this.centrosUnidad = centrosUnidad;
    }

    public UnidadOrganizativa getUnidadesHijas() {
        return unidadesHijas;
    }

    public void setUnidadesHijas(UnidadOrganizativa unidadesHijas) {
        this.unidadesHijas = unidadesHijas;
    }

    public UnidadOrganizativa() {
    }
    
}
