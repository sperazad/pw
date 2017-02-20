/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscarga;

/**
 *
 * @author TNF-User09
 */
public class Centros {
    private String codigoCentro;
    private String nombreCentro;
    private String comentario;
    private String tipoCentro;
    private Domicilio domicilio;
    
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(String TipoCentro) {
        this.tipoCentro = tipoCentro;
    }
    
    public String getCodigoCentro() {
        return codigoCentro;
    }

    public void setCodigoCentro(String codigoCentro) {
        this.codigoCentro = codigoCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
        public Centros() {
    }
    
}