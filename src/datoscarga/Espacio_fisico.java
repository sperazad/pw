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
public class Espacio_fisico {
    private String codigoCentro, codigo, codEspacioPadre, nombre, comentario;
    private Espacio_fisico espacio_hijos;

    public String getCodigoCentro() {
        return codigoCentro;
    }

    public void setCodigoCentro(String codigoCentro) {
        this.codigoCentro = codigoCentro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodEspacioPadre() {
        return codEspacioPadre;
    }

    public void setCodEspacioPadre(String codEspacioPadre) {
        this.codEspacioPadre = codEspacioPadre;
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

    public Espacio_fisico getEspacio_hijos() {
        return espacio_hijos;
    }

    public void setEspacio_hijos(Espacio_fisico espacio_hijos) {
        this.espacio_hijos = espacio_hijos;
    }

    public Espacio_fisico() {
    }
    
}