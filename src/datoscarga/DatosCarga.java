/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datoscarga;

import CDatos.Excel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author TNFUSER-07
 */
public class DatosCarga {
   
   private String path; 
   private ArrayList<Centros> listaCentros = new ArrayList();
   private ArrayList<Empresa> listaEmpresas = new ArrayList();
   private ArrayList<CentroEmpresa> listaCentroEmpresa = new ArrayList();
   private ArrayList<UnidadOrganizativa> listaUO = new ArrayList();
   private ArrayList<UnidadOrgCentro> listaUOCentro = new ArrayList();
   private ArrayList<PuestoTrabajo> listaPuestos = new ArrayList();
   private ArrayList<Trabajador> listaTrabajadores = new ArrayList();
   
   /**
    * Constructor
     * @param path Ruta del fichero Excel con los datos de entrada
    */
   public DatosCarga(String path) {
       this.path = path;
       cargarListaCentros(0);
       cargarListaEmpresas(1);
       cargarListaCentroEmpresa(2);
       cargarListaUO(3);
       cargarListaUOCentro(4);
       cargarListaPuestos(5);
       cargarListaTrabajadores(6);
   }
   
   
    public ArrayList<Centros> getListaCentros() {
        return listaCentros;
    }

    public void setListaCentros(ArrayList<Centros> listaCentros) {
        this.listaCentros = listaCentros;
    }

    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    
    public ArrayList<CentroEmpresa> getListaCentroEmpresa() {
        return listaCentroEmpresa;
    }

    public void setListaCentroEmpresa(ArrayList<CentroEmpresa> listaCentroEmpresa) {
        this.listaCentroEmpresa = listaCentroEmpresa;
    }
    
    public ArrayList<UnidadOrganizativa> getListaUO() {
        return listaUO;
    }

    public void setListaUO(ArrayList<UnidadOrganizativa> listaUO) {
        this.listaUO = listaUO;
    }
    
    public ArrayList<UnidadOrgCentro> getListaUOCentro() {
        return listaUOCentro;
    }

    public void setListaUOCentro(ArrayList<UnidadOrgCentro> listaUOCentro) {
        this.listaUOCentro = listaUOCentro;
    }
    
    public ArrayList<Trabajador> getListaTrabajadores(){
        return listaTrabajadores;
    }
    
    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores){
        this.listaTrabajadores = listaTrabajadores;
    }
    
    public ArrayList<PuestoTrabajo> getListaPuestos(){
        return listaPuestos;
    }
    
    public void setListaPuestos(ArrayList<PuestoTrabajo> listaPuestos){
        this.listaPuestos = listaPuestos;
    }
    
    /***************************************************************************
    ***************************** CARGAR EXCEL *********************************
    ***************************************************************************/
    
    /**
     * Cargar lista de centros del excel 
     */
    private void cargarListaCentros(int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
            String codigoCentro = (lista.get(fila).get(0).toString() == null) ? "" : lista.get(fila).get(0).toString();
            String nombreCentro = (lista.get(fila).get(1).toString() == null) ? "" : lista.get(fila).get(1).toString();
            String comentario = (lista.get(fila).get(2).toString() == null) ? "" : lista.get(fila).get(2).toString();
            String tipo_calle = (lista.get(fila).get(3).toString() == null) ? "" : lista.get(fila).get(3).toString();
            String calle = (lista.get(fila).get(4).toString() == null) ? "" : lista.get(fila).get(4).toString();
            String numero = (lista.get(fila).get(5).toString() == null) ? "" : lista.get(fila).get(5).toString();
            String portal = (lista.get(fila).get(6).toString() == null) ? "" : lista.get(fila).get(6).toString();
            String bloque = (lista.get(fila).get(7).toString() == null) ? "" : lista.get(fila).get(7).toString();
            String escalera = (lista.get(fila).get(8).toString() == null) ? "" : lista.get(fila).get(8).toString();
            String piso = (lista.get(fila).get(9).toString() == null) ? "" : lista.get(fila).get(9).toString();
            String puerta = (lista.get(fila).get(10).toString() == null) ? "" : lista.get(fila).get(10).toString();
            String codPostal = (lista.get(fila).get(11).toString() == null) ? "" : lista.get(fila).get(11).toString();
            String telf = (lista.get(fila).get(12).toString() == null) ? "" : lista.get(fila).get(12).toString();
            String codProvincia = (lista.get(fila).get(13).toString() == null) ? "" : lista.get(fila).get(13).toString();
            String provincia_txt = (lista.get(fila).get(14).toString() == null) ? "" : lista.get(fila).get(14).toString();
            String descripcion = (lista.get(fila).get(15).toString() == null) ? "" : lista.get(fila).get(15).toString();
            String poblacion = (lista.get(fila).get(16).toString() == null) ? "" : lista.get(fila).get(16).toString();
            String nombrePoblacion = (lista.get(fila).get(17).toString() == null) ? "" : lista.get(fila).get(17).toString();
            String codMunicipio = (lista.get(fila).get(18).toString() == null) ? "" : lista.get(fila).get(18).toString();
            String nombreMunicipio = (lista.get(fila).get(19).toString() == null) ? "" : lista.get(fila).get(19).toString();

            Centros centro = new Centros();
            centro.setCodigoCentro(codigoCentro);
            centro.setNombreCentro(nombreCentro);
            centro.setComentario(comentario);
            centro.setDomicilio(new Domicilio());
            centro.getDomicilio().setTipo_calle(tipo_calle);
            centro.getDomicilio().setCalle(calle);
            centro.getDomicilio().setNum_calle(numero);
            centro.getDomicilio().setPortal(portal);
            centro.getDomicilio().setBloque(bloque);
            centro.getDomicilio().setEscalera(escalera);
            centro.getDomicilio().setPiso(piso);
            centro.getDomicilio().setPuerta(puerta);
            centro.getDomicilio().setCodpostal(codPostal);
            centro.getDomicilio().setTelf(telf);
            centro.getDomicilio().setCod_provincia(codProvincia);
            centro.getDomicilio().setProvincia_txt(provincia_txt);
            centro.getDomicilio().setDescripcion(descripcion);
            centro.getDomicilio().setPoblacion(new Poblacion());
            centro.getDomicilio().getPoblacion().setCodigoPoblacion(poblacion);
            centro.getDomicilio().getPoblacion().setNombrePoblacion(nombrePoblacion);
            centro.getDomicilio().getPoblacion().setMunicipio(new Municipio());
            centro.getDomicilio().getPoblacion().getMunicipio().setCodigoMunicipio(codMunicipio);
            centro.getDomicilio().getPoblacion().getMunicipio().setNombreMunicipio(nombreMunicipio);

            listaCentros.add(centro);
        }
        //}
    }
    
    /**
     * Cargar Lista de empresas
     * @param pestana 
     */
    private void cargarListaEmpresas(int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();

        for (int fila = 1; fila < lista.size(); fila++) {
            String codigo = (lista.get(fila).get(0).toString() == null) ? "" : lista.get(fila).get(0).toString();
            String razonSocial = (lista.get(fila).get(1).toString() == null) ? "" : lista.get(fila).get(1).toString();
            String nombreComercial = (lista.get(fila).get(2).toString() == null) ? "" : lista.get(fila).get(2).toString();
            String observaciones = (lista.get(fila).get(3).toString() == null) ? "" : lista.get(fila).get(3).toString();
            String cif = (lista.get(fila).get(4).toString() == null) ? "" : lista.get(fila).get(4).toString();

            Empresa emp = new Empresa();
            emp.setCodigo(codigo);
            emp.setRazonSocial(razonSocial);
            emp.setNombreComercial(nombreComercial);
            emp.setObservaciones(observaciones);
            emp.setDatosEmpresa(new DatosEmpresa());
            emp.getDatosEmpresa().setCif(cif);

            listaEmpresas.add(emp);
        }
    }
    
    /**
     * Cargar relaciones Empresa - Centro
     * @param pestana 
     */
    private void cargarListaCentroEmpresa (int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
            String codigoCentro = (lista.get(fila).get(0).toString() == null)? "" : lista.get(fila).get(0).toString();
            String nombreCentro = (lista.get(fila).get(1).toString() == null)? "" : lista.get(fila).get(1).toString();
            String codigoEmpresa = (lista.get(fila).get(2).toString() == null)? "" : lista.get(fila).get(2).toString();
            String nombreEmpresa = (lista.get(fila).get(3).toString() == null)? "" : lista.get(fila).get(3).toString();
        
            CentroEmpresa centroEmpresa = new CentroEmpresa();
            centroEmpresa.setCodigoCentro(codigoCentro);
            centroEmpresa.setNombreCentro(nombreCentro);
            centroEmpresa.setCodigoEmpresa(codigoEmpresa);
            centroEmpresa.setNombreEmpresa(nombreEmpresa);
            
            listaCentroEmpresa.add(centroEmpresa);           
        }       
    }
    
    /**
     * Cargar Lista UO
     * @param pestana 
     */
    private void cargarListaUO (int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
           String codigoEmpresa = (lista.get(fila).get(0).toString() == null)? "" : lista.get(fila).get(0).toString();
           String codigo = (lista.get(fila).get(1).toString() == null)? "" : lista.get(fila).get(1).toString();
           String nombre = (lista.get(fila).get(2).toString() == null)? "" : lista.get(fila).get(2).toString(); 
           String codUnidadPadre = (lista.get(fila).get(3).toString() == null)? "" : lista.get(fila).get(3).toString();
        
           UnidadOrganizativa unidadOrg = new UnidadOrganizativa();
           unidadOrg.setCodigoEmpresa(codigoEmpresa);
           unidadOrg.setCodigo(codigo);
           unidadOrg.setNombre(nombre);
           unidadOrg.setCodUnidadPadre(codUnidadPadre);  
           
           listaUO.add(unidadOrg);
        }
    }
    
    /**
     * Cargar relacion Empresa - UO - Centro
     * @param pestana 
     */
    private void cargarListaUOCentro (int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
           String codEmpresa = (lista.get(fila).get(0).toString() == null)? "" : lista.get(fila).get(0).toString();
           String codUnidadOrg = (lista.get(fila).get(1).toString() == null)? "" : lista.get(fila).get(1).toString();
           String codigo = (lista.get(fila).get(2).toString() == null)? "" : lista.get(fila).get(2).toString();
           String nombre = (lista.get(fila).get(3).toString() == null)? "" : lista.get(fila).get(3).toString(); 
        
           UnidadOrgCentro uoCentro = new UnidadOrgCentro();
           uoCentro.setCodEmpresa(codEmpresa);  
           uoCentro.setCodUnidadOrg(codUnidadOrg);
           uoCentro.setCodigo(codigo);
           uoCentro.setNombre(nombre);
           
           listaUOCentro.add(uoCentro);
        }
    }
    
    /**
     * Cargar lista de puestos
     * @param pestana 
     */
    private void cargarListaPuestos(int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
           String codigoPuesto = (lista.get(fila).get(0).toString() == null)? "" : lista.get(fila).get(0).toString();
           String nombrePuesto = (lista.get(fila).get(1).toString() == null)? "" : lista.get(fila).get(1).toString();
           String comentario = (lista.get(fila).get(2).toString() == null)? "" : lista.get(fila).get(2).toString();
           String codigoEmpresa = (lista.get(fila).get(3).toString() == null)? "" : lista.get(fila).get(3).toString();
           String codUnidadOrg = (lista.get(fila).get(4).toString() == null)? "" : lista.get(fila).get(4).toString();

           PuestoTrabajo puesto = new PuestoTrabajo();
           puesto.setCodigoPuesto(codigoPuesto);
           puesto.setNombrePuesto(nombrePuesto);
           puesto.setComentario(comentario);
           puesto.setCodEmpresa(codigoEmpresa);
           puesto.setCodUnidadOrg(codUnidadOrg);   
           
           listaPuestos.add(puesto);
        }
    }
    
    /**
     * Cargar Lista de Trabajadores
     * @param pestana 
     */
    private void cargarListaTrabajadores(int pestana) {
        Excel e = new Excel(path, pestana);
        ArrayList<ArrayList> lista = e.getDatosHoja();
        
        for (int fila = 1; fila < lista.size(); fila++) {
           String codigoTrabajador = (lista.get(fila).get(0).toString() == null)? "" : lista.get(fila).get(0).toString();
           String login = (lista.get(fila).get(1).toString() == null)? "" : lista.get(fila).get(1).toString();
           String apellido1 = (lista.get(fila).get(2).toString() == null)? "" : lista.get(fila).get(2).toString();
           String apellido2 = (lista.get(fila).get(3).toString() == null)? "" : lista.get(fila).get(3).toString();
           String nombreTrabajador = (lista.get(fila).get(4).toString() == null)? "" : lista.get(fila).get(4).toString();
           String telefono = (lista.get(fila).get(5).toString() == null)? "" : lista.get(fila).get(5).toString();
           String email = (lista.get(fila).get(6).toString() == null)? "" : lista.get(fila).get(6).toString();
           String observaciones = (lista.get(fila).get(7).toString() == null)? "" : lista.get(fila).get(7).toString();
           String tipoDocumento = (lista.get(fila).get(8).toString() == null)? "" : lista.get(fila).get(8).toString();
           String numDocumento = (lista.get(fila).get(9).toString() == null)? "" : lista.get(fila).get(9).toString();
           String sexo = (lista.get(fila).get(10).toString() == null)? "" : lista.get(fila).get(10).toString();
           String fechaNacimiento = (lista.get(fila).get(11).toString() == null)? "" : lista.get(fila).get(11).toString();          
           String codigoEmpresa = (lista.get(fila).get(12).toString() == null)? "" : lista.get(fila).get(12).toString();
           String fechaInicioEmpresa = (lista.get(fila).get(13).toString() == null)? "" : lista.get(fila).get(13).toString();
           String fechaFinEmpresa = (lista.get(fila).get(14).toString() == null)? "" : lista.get(fila).get(14).toString();
           String codigoPuesto = (lista.get(fila).get(15).toString() == null)? "" : lista.get(fila).get(15).toString();
           String fechaInicioPuesto = (lista.get(fila).get(16).toString() == null)? "" : lista.get(fila).get(16).toString();
           String fechaFinPuesto = (lista.get(fila).get(17).toString() == null)? "" : lista.get(fila).get(17).toString();
           String codMotivoAsignacion = (lista.get(fila).get(18).toString() == null)? "" : lista.get(fila).get(18).toString();
           String motivoAsignacion = (lista.get(fila).get(19).toString() == null)? "" : lista.get(fila).get(19).toString();
           String comentario = (lista.get(fila).get(20).toString() == null)? "" : lista.get(fila).get(20).toString();
           String codigoCentro = (lista.get(fila).get(21).toString() == null)? "" : lista.get(fila).get(21).toString();
           String nombreCentro = (lista.get(fila).get(22).toString() == null)? "" : lista.get(fila).get(22).toString();
           
           Trabajador trabajador = new Trabajador();
           trabajador.setCodigoTrabajador(codigoTrabajador);
           trabajador.setLogin(login);
           trabajador.setApellido1(apellido1);
           trabajador.setApellido2(apellido2);
           trabajador.setNombreTrabajador(nombreTrabajador);
           trabajador.setTelefono(telefono);
           trabajador.setEmail(email);
           trabajador.setObservaciones(observaciones);
           trabajador.setTipoDocumento(tipoDocumento);
           trabajador.setNumDocumento(numDocumento);
           trabajador.setSexo(sexo);
           trabajador.setFechaNacimiento(fechaNacimiento);
           trabajador.setEmpresas(new TrabajadorEmpresa());
           trabajador.getEmpresas().setCodTrabajador(codigoTrabajador);
           trabajador.getEmpresas().setCodEmpresa(codigoEmpresa);
           trabajador.getEmpresas().setFechaInicio(fechaInicioEmpresa);
           trabajador.getEmpresas().setFechaFin(fechaFinEmpresa);
           trabajador.setPuestosTrabajo(new TrabajadorPuestoTrabajo());
           trabajador.getPuestosTrabajo().setCodigoTrabajador(codigoTrabajador);
           trabajador.getPuestosTrabajo().setCodigoEmpresa(codigoEmpresa);
           trabajador.getPuestosTrabajo().setCodigoPuesto(codigoPuesto);
           trabajador.getPuestosTrabajo().setFechaInicio(fechaInicioPuesto);
           trabajador.getPuestosTrabajo().setFechaFin(fechaFinPuesto);
           trabajador.getPuestosTrabajo().setCodMotivoAsignacion(codMotivoAsignacion);
           trabajador.getPuestosTrabajo().setMotivoAsignacion(motivoAsignacion);
           trabajador.getPuestosTrabajo().setComentario(comentario);
           trabajador.setCentroTrabajador(new CentroTrabajador());
           trabajador.getCentroTrabajador().setCodigoCentro(codigoCentro);
           trabajador.getCentroTrabajador().setNombreCentro(nombreCentro);

           listaTrabajadores.add(trabajador);           
        }
    }
    
    /***************************************************************************
    ***************************** ESCRIBIR XML *********************************
    ***************************************************************************/

    /**
     * 
     * @param pathSalida 
     */
    public void guardaFicheroXML(String pathSalida) {
        //XML ficheroSalida = new XML(datos, pathSalida);
        File f;
        FileWriter fileWriter;
        try{
            f = new File(pathSalida);
            fileWriter = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bw);
            printWriter.write(XMLPrincipal() + "\n");
            printWriter.close();
            bw.close();
        }catch(IOException e){System.out.println("Error:"+e.getMessage());}
    }
    
    /**
     * Devuelve el XML a escribir en el fichero de salida. 
     * Es el método principal del que colgará el resto
     */
    private String XMLPrincipal() {
        // Escribir cabecera del XML
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" 
                   + "<p:importacion xmlns:p=\"http://www.capsis.org/importacion_template\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.capsis.org/importacion_template importFiliacion.xsd \">\r\n"; 
                                     
        // Escribir XML centros
        ArrayList<Centros> listaCentros = getListaCentros();
        xml += "    <p:importacionCentros><!--Contiene la información de todos los centros de la empresa, junto con sus espacios físicos.-->\r\n";
        for (int i = 0; i < listaCentros.size(); i++) {
//            xml += "        <p:centro op=\"actualizar\">\r\n"
//                + "            <p:codigo>" + listaCentros.get(i).getCodigoCentro() + "</p:codigo>\r\n"
//                + "            <p:nombre>" + listaCentros.get(i).getNombreCentro() + "</p:nombre>\r\n"
//                + "            <p:comentario>" + listaCentros.get(i).getComentario() + "</p:comentario>\r\n"
//                //+ XmlDomicilio(listaCentros.get(i).getDomicilio())
//                + "            <p:espacios-fisicos>\r\n"
//                + "            </p:espacios-fisicos>\r\n"
//                + "        </p:centro>\r\n";
        }  
        xml += "    </p:importacionCentros>\r\n";
        
        // Escribir XML empresas
        ArrayList<Empresa> listaEmpresas = getListaEmpresas();
        xml += "    <p:importacionEmpresas><!--Contiene la información de todas las empresas, junto con sus unidades organizativas.-->\r\n";
        for (int i = 0; i < listaEmpresas.size(); i++) {
        //    xml += XmlEmpresa(listaEmpresas.get(i));
        }
        xml += "    </p:importacionEmpresas>\r\n";

        //Escribir XML puestos
        ArrayList<PuestoTrabajo> listaPuestos = getListaPuestos();
        xml += "    <p:importacionPuestosTrabajo><!--Contiene la información de todos los puestos de trabajo, junto a que unidad organizativa pertenece y los espacios físicos que le afectan.-->\r\n";        
        for (int i = 0; i < listaPuestos.size(); i++) {           
            xml += XmlPuestoTrabajo(listaPuestos.get(i));
        }      
        xml += "    </p:importacionPuestosTrabajo>\r\n";

        //Escribir XML trabajador
        ArrayList<Trabajador> listaTrabajadores = getListaTrabajadores();
        xml += "    <p:importacionTrabajadores><!--Contiene la información de todos los trabajadores, junto con su asociación a sus empresas y sus puestos de trabajo.-->\r\n";
        for (int i = 0; listaTrabajadores.size() > i; i++) {
            xml += XmlTrabajador(listaTrabajadores.get(i));
        }
        xml += "    </p:importacionTrabajadores>\r\n";
            
        // Texto del pie del XML
        xml += "</p:importacion>\r\n";
        
        return xml;
    }

    /**
     * Devuelve el XML de un domicilio
     * @param d Domicilio
     * @return XML
     */
    private String XmlDomicilio(Domicilio d) {
        String xml = "            <p:domicilio op=\"actualizar\">\r\n";
        xml +=       "                <p:calle>" + d.getCalle() + "</p:calle>\r\n";
        xml +=       "                <p:num-calle>" + d.getNum_calle() + "</p:num-calle>\r\n";
        xml +=       "                <p:portal>" + d.getPortal() + "</p:portal>\r\n";
        xml +=       "                <p:bloque>" + d.getBloque()+ "</p:bloque>\r\n";
        xml +=       "                <p:escalera>" + d.getEscalera() + "</p:escalera>\r\n";
        xml +=       "                <p:piso>" + d.getPiso() + "</p:piso>\r\n";
        xml +=       "                <p:puerta>" + d.getPuerta() + "</p:puerta>\r\n";
        xml +=       "                <p:codPostal>" + d.getCodpostal() + "</p:codPostal>\r\n";
        xml +=       "                <p:telf>" + d.getTelf() + "</p:telf>\r\n";
        xml +=       "                <p:tipo-calle>"+ d.getTipo_calle() +"</p:tipo-calle>\r\n";
        xml +=       "                <p:cod-provincia>" + d.getCod_provincia() + "</p:cod-provincia>\r\n";
        xml +=       "                <p:provincia-txt>" + d.getProvincia_txt() + "</p:provincia-txt>\r\n";
                /*+ "                <p:poblacion>\r\n" 
                + "                    <p:codigo>" + d.getPoblacion().getCodigoPoblacion() + "</p:codigo>\r\n"
                + "                    <p:nombre>" + d.getPoblacion().getNombrePoblacion() + "</p:nombre>\r\n" 
                + "                    <p:municipio>\r\n"
                + "                        <p:codigo>" + d.getPoblacion().getMunicipio().getCodigoMunicipio() + "</p:codigo>\r\n"
                + "                        <p:nombre>" + d.getPoblacion().getMunicipio().getNombreMunicipio() + "</p:nombre>\r\n" 
                + "                        <p:cod-provincia>" + d.getCod_provincia() + "</p:cod-provincia>\r\n" 
                + "                    </p:municipio>\r\n" 
                + "                </p:poblacion>\r\n"*/
        xml += (d.getPoblacion().getNombrePoblacion().equals("")) ? "" : "                <p:poblacion-txt>" + d.getPoblacion().getNombrePoblacion() + "</p:poblacion-txt>\r\n";
        xml +=       "                <p:descripcion>" + d.getDescripcion() + "</p:descripcion>\r\n"    ;            
        xml +=       "            </p:domicilio>\r\n";
        return xml;
    }
        
    /**
     * Devuelve el XML de una empresa
     * @param emp Empresa
     * @return XML
     */
    private String XmlEmpresa(Empresa emp) {
        String xml =  "        <p:empresa op=\"actualizar\">\r\n";
        xml +=        "            <p:codigo>"+ emp.getCodigo()+"</p:codigo>\r\n";
        xml +=        "            <p:razon-social>"+ emp.getRazonSocial() +"</p:razon-social>\r\n";
        xml +=        "            <p:nombre-comercial>"+ emp.getNombreComercial() +"</p:nombre-comercial>\r\n";
        xml +=        "            <p:observaciones>"+ emp.getObservaciones()+"</p:observaciones>\r\n";
        xml +=        "            <p:datos-empresa>\r\n" ;
        xml +=        "                <p:cif>"+ emp.getDatosEmpresa().getCif() +"</p:cif>\r\n";             
        xml +=        "            </p:datos-empresa>\r\n";
        xml += XmlCentroEmpresa(emp.getCodigo());
        xml += XmlUnidadOrganizativa(emp.getCodigo());
        xml +=        "        </p:empresa>\r\n";
        
        return xml;
   }       
   
    /**
     * Devuelve el XML de la relación centros-empresa
     * @param centroEmpresa CentroEmpresa
     * @return XML
     */
    private String XmlCentroEmpresa (String codigoEmpresa) {
        String xml = "            <p:centros-trabajo>\r\n";
        
        for (int i = 0; i < listaCentroEmpresa.size(); i++) {
            CentroEmpresa centroEmpresa = listaCentroEmpresa.get(i);
            if (centroEmpresa.getCodigoEmpresa().equals(codigoEmpresa)) {
                xml += "                <p:centro-empresa op=\"actualizar\">\r\n" 
                    +  "                    <p:codigoCentro>" + centroEmpresa.getCodigoCentro() + "</p:codigoCentro>\r\n"
                    +  "                    <p:nombreCentro>" + centroEmpresa.getNombreCentro() + "</p:nombreCentro>\r\n" 
                    +  "                    <p:codigoEmpresa>" + centroEmpresa.getCodigoEmpresa() + "</p:codigoEmpresa>\r\n"
                    +  "                    <p:nombreEmpresa>" + centroEmpresa.getNombreEmpresa() +"</p:nombreEmpresa>\r\n"
                    +  "                </p:centro-empresa>\r\n";
            }
        }
        
        xml += "            </p:centros-trabajo>\r\n";
        return xml;
   }
    
    /**
     * Devuelve el XML de una Unidad Organizativa
     * @param codigoEmpresa String
     * @return XML
     */
    private String XmlUnidadOrganizativa (String codigoEmpresa) {
        String xml = "        <p:unidades-organizativas>\r\n";
        
        for (int i = 0; i < listaUO.size(); i++) {
            UnidadOrganizativa unidadOrg = listaUO.get(i);
            if (unidadOrg.getCodigoEmpresa().equals(codigoEmpresa)) {
                xml += "                <p:unidad-organizativa op=\"actualizar\">\r\n" 
                     + "                    <p:codigoEmpresa>"+ unidadOrg.getCodigoEmpresa() +"</p:codigoEmpresa>\r\n" 
                     + "                    <p:codigo>"+ unidadOrg.getCodigo() +"</p:codigo>\r\n"
                     + "                    <p:codUnidadPadre>"+ unidadOrg.getCodUnidadPadre() +"</p:codUnidadPadre>\r\n" 
                     + "                    <p:nombre>"+ unidadOrg.getNombre() +"</p:nombre>\r\n" 
                     + "                    <p:centros-unidad>\r\n"
                     +                          XmlUOCentro(codigoEmpresa, unidadOrg.getCodigo())
                     + "                    </p:centros-unidad>\r\n"
                     + "                    <p:unidades-hijas>" + "" + "</p:unidades-hijas>\r\n" 
                     + "                </p:unidad-organizativa>\r\n";    
            }
        }
        
        xml += "            </p:unidades-organizativas>\r\n";
        return xml;
    }
    
    /**
     * Devuelve el XML de los centros de una Unidad Organizativa
     * @param codigoEmpresa String
     * @param codigoUO String
     * @return XML
     */
    private String XmlUOCentro(String codigoEmpresa, String codigoUO) {
        String xml = "";
        
        for (int i = 0; i < listaUOCentro.size(); i++) {
            UnidadOrgCentro uoCentro = listaUOCentro.get(i);
            if (uoCentro.getCodEmpresa().equals(codigoEmpresa) && (uoCentro.getCodUnidadOrg().equals(codigoUO))) {
                xml += "                        <p:centro-unidad op=\"actualizar\">\r\n"
                     + "                            <p:codEmpresa>" + codigoEmpresa + "</p:codEmpresa>\r\n" 
                     + "                            <p:codUnidadOrg>" + codigoUO + "</p:codUnidadOrg>\r\n"
                     + "                            <p:codigo>" + uoCentro.getCodigo() + "</p:codigo>\r\n" 
                     + "                            <p:nombre>" + uoCentro.getNombre() + "</p:nombre>\r\n" 
                     + "                        </p:centro-unidad>\r\n";    
            }
        }
        
        return xml;
    }
    
    /**
     * Devuelve el XML de un puesto de trabajo
     * @param puesto TrabajadorPuestoTrabajo
     * @return XML
     */
    private String XmlPuestoTrabajo (PuestoTrabajo puesto) {
        String xml =  "        <p:puesto-trabajo op=\"actualizar\">\r\n" 
                    + "            <p:codigo>" + puesto.getCodigoPuesto() + "</p:codigo>\r\n" 
                    + "            <p:nombre>" + puesto.getNombrePuesto() + "</p:nombre>\r\n";
        xml += (puesto.getComentario().equals("")) ? "" : "            <p:comentario>" + puesto.getComentario() + "</p:comentario>\r\n";       
        xml +=        "            <p:codEmpresa>" + puesto.getCodEmpresa() + "</p:codEmpresa>\r\n" 
                    + "            <p:codUnidadOrg>" + puesto.getCodUnidadOrg() + "</p:codUnidadOrg>\r\n" 
                    + "            <p:espacios-fisicos>\r\n"                   
                    + "            </p:espacios-fisicos>\r\n" 
                    + "        </p:puesto-trabajo>\r\n";
        return xml;
    }
    
    
    /**
     * Devuelve el XML de un trabajador
     * @param trabajador Trabajador
     * @return XML
     */
    private String XmlTrabajador (Trabajador trabajador) {
        String xml =         "        <p:trabajador op=\"actualizar\">\r\n" 
                    + "            <p:codigo>"+ trabajador.getCodigoTrabajador() +"</p:codigo>\r\n";

        xml += (trabajador.getLogin().equals("")) ? "" : "            <p:login>"+ trabajador.getLogin() +"</p:login>\r\n";
        
        xml +=        "            <p:apellido1>"+ trabajador.getApellido1() +"</p:apellido1>\r\n";
        xml +=        "            <p:apellido2>"+ trabajador.getApellido2() +"</p:apellido2>\r\n"; 
        xml +=        "            <p:nombre>"+ trabajador.getNombreTrabajador() +"</p:nombre>\r\n";
        xml +=        "            <p:telefono>"+ trabajador.getTelefono() +"</p:telefono>\r\n";
        xml +=        "            <p:email>"+ trabajador.getEmail() +"</p:email>\r\n";
        xml +=        "            <p:observaciones>"+ trabajador.getObservaciones() +"</p:observaciones>\r\n";
        xml +=        "            <p:tipo-documento>"+ trabajador.getTipoDocumento() +"</p:tipo-documento>\r\n";
        xml +=        "            <p:num-documento>"+ trabajador.getNumDocumento() +"</p:num-documento>\r\n";
        xml +=        "            <p:sexo>"+ trabajador.getSexo() +"</p:sexo>\r\n";
        xml +=        "            <p:fecha-nacimiento>"+ trabajador.getFechaNacimiento() +"</p:fecha-nacimiento>\r\n";
        xml +=        "            <p:sensibilidad-especial>false</p:sensibilidad-especial>\r\n" 
                    + "            <p:empresas>\r\n"
                    + "                <p:trabajador-empresa op=\"actualizar\">\r\n" 
                    + "                    <p:codTrabajador>"+ trabajador.getCodigoTrabajador() +"</p:codTrabajador>\r\n"
                    + "                    <p:codEmpresa>"+ trabajador.getEmpresas().getCodEmpresa() +"</p:codEmpresa>\r\n"
                    + "                    <p:fechaInicio>"+ trabajador.getEmpresas().getFechaInicio() +"</p:fechaInicio>\r\n";
        xml += (trabajador.getEmpresas().getFechaFin().equals("")) ? "" : "                         <p:fechaFin>"+ trabajador.getEmpresas().getFechaFin() +"</p:fechaFin>\r\n";
        xml +=        "                </p:trabajador-empresa>\r\n" 
                    + "            </p:empresas>\r\n" 
                    + "            <p:puestos-trabajo>\r\n" 
                    + "                <p:trabajador-puesto-trabajo op=\"actualizar\">\r\n" 
                    + "                    <p:codigoTrabajador>"+ trabajador.getCodigoTrabajador() +"</p:codigoTrabajador>\r\n" 
                    + "                    <p:codigoEmpresa>"+ trabajador.getEmpresas().getCodEmpresa() +"</p:codigoEmpresa>\r\n" 
                    + "                    <p:codigoPuesto>"+ trabajador.getPuestosTrabajo().getCodigoPuesto() +"</p:codigoPuesto>\r\n" 
                    + "                    <p:fechaInicio>"+ trabajador.getPuestosTrabajo().getFechaInicio() +"</p:fechaInicio>\r\n";
        xml += (trabajador.getPuestosTrabajo().getFechaFin().equals("")) ? "" : "                    <p:fechaFin>"+ trabajador.getPuestosTrabajo().getFechaFin() +"</p:fechaFin>\r\n";
        xml +=        "                    <p:codMotivoAsignacion>" + trabajador.getPuestosTrabajo().getCodMotivoAsignacion() + "</p:codMotivoAsignacion>\r\n";
        xml +=        "                    <p:motivoAsignacion>" + trabajador.getPuestosTrabajo().getMotivoAsignacion() + "</p:motivoAsignacion>\r\n";
        xml += (trabajador.getPuestosTrabajo().getComentario().equals("")) ? "" : "                    <p:comentario>"+ trabajador.getPuestosTrabajo().getComentario() +"</p:comentario>\r\n";
        xml +=        "                </p:trabajador-puesto-trabajo>\r\n"
                    + "            </p:puestos-trabajo>\r\n"
                    + "            <p:centro-trabajo>\r\n"
                    + "                <p:codigo>"+ trabajador.getCentroTrabajador().getCodigoCentro() +"</p:codigo>\r\n"
                    + "                <p:nombre>"+ trabajador.getCentroTrabajador().getNombreCentro() +"</p:nombre>\r\n"
                    + "            </p:centro-trabajo>\r\n";
        xml +=        "        </p:trabajador>\r\n"; 
        return xml;
    }
}
