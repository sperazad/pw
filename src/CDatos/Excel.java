/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author TNF-User09
 */
public class Excel {
    
    private FileInputStream file;
    private XSSFWorkbook workbook;
    private int hoja;

    /**
     * Constructor
     * @param path
     * @param hoja 
     */
    public Excel(String path, int hoja) {
        this.hoja = hoja;
        try{
            //Se crea el FileInputStream a partir del path
            this.file = new FileInputStream(new File(path));
            //Se crea el workbook a partir del FileInputStream
            this.workbook = new XSSFWorkbook(file);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
      
    /**
     * Lee una hoja de un excel y devuelve una matriz con los datos
     * @return Matriz con los datos del excel
     */
    public ArrayList getDatosHoja(){
        ArrayList<ArrayList> filas = new ArrayList();
        XSSFSheet sheet = workbook.getSheetAt(hoja);
        int numColumnas = -1;
        
        // Recorremos fila a fila
        for (int r = 0; r <= sheet.getLastRowNum(); r++) {
            ArrayList<String> celdas = new ArrayList();
            XSSFRow row = sheet.getRow(r);
            if (row == null) break;
            else {
                // En la primera fila se leen las cabeceras, por lo que aprovechamos para 
                // guardar el número de columnas porque cuando una fila tiene celdas vacías el tamaño 
                // de la lista es menor
                if (numColumnas == -1) numColumnas = row.getLastCellNum();
                // Recorremos celda a celda
                for (int c = 0; c < numColumnas; c++) {
                    XSSFCell cell = row.getCell(c);
                    String cellValue = "";
                    if (cell != null) { 
                        switch(cell.getCellType()) {
                           case Cell.CELL_TYPE_NUMERIC:
                              if (DateUtil.isCellDateFormatted(cell)) {
                                  SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
                                 //cellValue = cell.getDateCellValue().toString();
                                 cellValue = formateador.format(cell.getDateCellValue());
                              } else {
                                 cellValue = (Integer.toString((int) cell.getNumericCellValue()));
                              }
                           break;
                           case Cell.CELL_TYPE_STRING:
                              cellValue = cell.getStringCellValue();
                           break;
                      }
                   }    
                   celdas.add(cellValue);
                }
                filas.add(celdas);    
            }
        }
        return filas;
    }
    
}
