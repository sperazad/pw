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
public class Trabajador {
    private String codigoTrabajador, login, apellido1, apellido2, nombreTrabajador, telefono, movil, fax, email, observaciones;
    private String tipoDocumento, sexo, estadoCivil, responsable;
    private String numDocumento, localidadNacimiento, formacion, nass, cno, tipoContrato, situacionProf, categoriaInterna, codTurno, turno;
    private Boolean sensibilidadEspecial;
    private TrabajadorEmpresa empresas;
    private TrabajadorPuestoTrabajo puestosTrabajo;
    private Domicilio domicilio;
    private CentroTrabajador centroTrabajador;
    private String fechaNacimiento;


    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getLocalidadNacimiento() {
        return localidadNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getNass() {
        return nass;
    }

    public void setNass(String nass) {
        this.nass = nass;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getSituacionProf() {
        return situacionProf;
    }

    public void setSituacionProf(String situacionProf) {
        this.situacionProf = situacionProf;
    }

    public String getCategoriaInterna() {
        return categoriaInterna;
    }

    public void setCategoriaInterna(String categoriaInterna) {
        this.categoriaInterna = categoriaInterna;
    }

    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Boolean isSensibilidadEspecial() {
        return sensibilidadEspecial;
    }

    public void setSensibilidadEspecial(Boolean sensibilidadEspecial) {
        this.sensibilidadEspecial = sensibilidadEspecial;
    }

    public TrabajadorEmpresa getEmpresas() {
        return empresas;
    }

    public void setEmpresas(TrabajadorEmpresa empresas) {
        this.empresas = empresas;
    }

    public TrabajadorPuestoTrabajo getPuestosTrabajo() {
        return puestosTrabajo;
    }

    public void setPuestosTrabajo(TrabajadorPuestoTrabajo puestosTrabajo) {
        this.puestosTrabajo = puestosTrabajo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public CentroTrabajador getCentroTrabajador() {
        return centroTrabajador;
    }

    public void setCentroTrabajador(CentroTrabajador centroTrabajador) {
        this.centroTrabajador = centroTrabajador;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
    /**
     * Constructor vacío
     */
     public Trabajador() {
    }
    
}
