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
public class DatosEmpresa {
    private String cif, ccc, cod_cnae, formaJuridica;   

    public String getFormaJuridica() {
        return formaJuridica;
    }

    public void setFormaJuridica(String formaJuridica) {
        this.formaJuridica = formaJuridica;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getCod_cnae() {
        return cod_cnae;
    }

    public void setCod_cnae(String cod_cnae) {
        this.cod_cnae = cod_cnae;
    }
    
    public DatosEmpresa() {
    }
    
}
