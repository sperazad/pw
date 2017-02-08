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
public class Domicilio {
    private String calle, num_calle, /*num_calle_fin,*/ portal, bloque, /*km,*/ escalera, piso, puerta;
    private String codpostal, telf, tipo_calle, cod_provincia, provincia_txt, descripcion;
    /*private Boolean bis;*/
    private Poblacion poblacion;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNum_calle() {
        return num_calle;
    }

    public void setNum_calle(String num_calle) {
        this.num_calle = num_calle;
    }

    /*public String getNum_calle_fin() {
        return num_calle_fin;
    }

    public void setNum_calle_fin(String num_calle_fin) {
        this.num_calle_fin = num_calle_fin;
    }*/

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    /*public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }*/

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getTipo_calle() {
        return tipo_calle;
    }

    public void setTipo_calle(String tipo_calle) {
        this.tipo_calle = tipo_calle;
    }

    public String getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getProvincia_txt() {
        return provincia_txt;
    }

    public void setProvincia_txt(String provincia_txt) {
        this.provincia_txt = provincia_txt;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*public Boolean isBis() {
        return bis;
    }

    public void setBis(Boolean bis) {
        this.bis = bis;
    }*/

    public Poblacion getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    public Domicilio() {
    }
    
}
