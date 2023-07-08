
package GUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 50672
 */
public class Eliminatoria extends javax.swing.JFrame {

    DefaultTableModel modeloConca = new DefaultTableModel();//Se crean los objetos DefaultTableModel vacíos con los nombres modeloConca, modeloAFC, modeloCAF, modeloCONMEBOL, modeloOFC, modeloUEFA
    DefaultTableModel modeloAFC = new DefaultTableModel();//es una implementación de la interfaz TableModel en Swing que proporciona una estructura de datos tabular para almacenar y gestionar los datos de una tabla.
    DefaultTableModel modeloCAF = new DefaultTableModel();//estos objetos permiten definir las columnas y filas de una tabla, así como realizar operaciones de inserción, eliminación y modificación de datos en la tabla.
    DefaultTableModel modeloCONMEBOL = new DefaultTableModel();//en este caso, los objetos DefaultTableModel se inicializan sin ninguna columna o fila específica, lo que significa que están vacíos.
    DefaultTableModel modeloOFC = new DefaultTableModel();//se crearon estos objetos para crear y gestionar el modelo de tabla que necesitamos.
    DefaultTableModel modeloUEFA = new DefaultTableModel();
    

    private void cargaConca() {
        ArrayList<Object> seleccionesConca = new ArrayList<Object>();
        seleccionesConca.add("Selecciones");
        for (Object columna : seleccionesConca) {
            modeloConca.addColumn(columna);
        }
        this.tblSeleccionCONCACAF.setModel(modeloConca);

        ArrayList<Object[]> SeleccionesConca = new ArrayList<Object[]>();

        Object[] seleccion1Conca = new Object[]{"Anguila"};
        Object[] seleccion2Conca = new Object[]{"Antigua y Barbuda"};
        Object[] seleccion3Conca = new Object[]{"Aruba"};
        Object[] seleccion4Conca = new Object[]{"Bahamas"};
        Object[] seleccion5Conca = new Object[]{"Barbados"};
        Object[] seleccion6Conca = new Object[]{"Belice"};
        Object[] seleccion7Conca = new Object[]{"Bermudas"};
        Object[] seleccion8Conca = new Object[]{"Bonaire"};
        Object[] seleccion9Conca = new Object[]{"Canadá"};
        Object[] seleccion10Conca = new Object[]{"Costa Rica"};
        Object[] seleccion11Conca = new Object[]{"Cuba"};
        Object[] seleccion12Conca = new Object[]{"Curazao"};
        Object[] seleccion13Conca = new Object[]{"Dominica"};
        Object[] seleccion14Conca = new Object[]{"El Salvador"};
        Object[] seleccion15Conca = new Object[]{"Estados Unidos"};
        Object[] seleccion16Conca = new Object[]{"Granada"};
        Object[] seleccion17Conca = new Object[]{"Guatemala"};
        Object[] seleccion18Conca = new Object[]{"Guadalupe"};
        Object[] seleccion19Conca = new Object[]{"Guayana"};
        Object[] seleccion20Conca = new Object[]{"Guayana Francesa"};
        Object[] seleccion21Conca = new Object[]{"Haití"};
        Object[] seleccion22Conca = new Object[]{"Honduras"};
        Object[] seleccion23Conca = new Object[]{"Islas Caimán"};
        Object[] seleccion24Conca = new Object[]{"Islas Turcas y Caicos"};
        Object[] seleccion25Conca = new Object[]{"Islas Vírgenes Británicas"};
        Object[] seleccion26Conca = new Object[]{"Islas Vírgenes de los Estados Unidos"};
        Object[] seleccion27Conca = new Object[]{"Jamaica"};
        Object[] seleccion28Conca = new Object[]{"Martinica"};
        Object[] seleccion29Conca = new Object[]{"México"};
        Object[] seleccion30Conca = new Object[]{"Montserrat"};
        Object[] seleccion31Conca = new Object[]{"Nicaragua"};
        Object[] seleccion32Conca = new Object[]{"Panamá"};
        Object[] seleccion33Conca = new Object[]{"Puerto Rico"};
        Object[] seleccion34Conca = new Object[]{"República Dominicana"};
        Object[] seleccion35Conca = new Object[]{"Saint-Martin"};
        Object[] seleccion36Conca = new Object[]{"San Cristóbal y Nieves"};
        Object[] seleccion37Conca = new Object[]{"San Vicente y las Granadinas"};
        Object[] seleccion38Conca = new Object[]{"Santa Lucía"};
        Object[] seleccion39Conca = new Object[]{"Sint Maarten"};
        Object[] seleccion40Conca = new Object[]{"Surinam"};
        Object[] seleccion41Conca = new Object[]{"Trinidad y Tobago"};

        SeleccionesConca.add(seleccion1Conca);
        SeleccionesConca.add(seleccion2Conca);
        SeleccionesConca.add(seleccion3Conca);
        SeleccionesConca.add(seleccion4Conca);
        SeleccionesConca.add(seleccion5Conca);
        SeleccionesConca.add(seleccion6Conca);
        SeleccionesConca.add(seleccion7Conca);
        SeleccionesConca.add(seleccion8Conca);
        SeleccionesConca.add(seleccion9Conca);
        SeleccionesConca.add(seleccion10Conca);
        SeleccionesConca.add(seleccion11Conca);
        SeleccionesConca.add(seleccion12Conca);
        SeleccionesConca.add(seleccion13Conca);
        SeleccionesConca.add(seleccion14Conca);
        SeleccionesConca.add(seleccion15Conca);
        SeleccionesConca.add(seleccion16Conca);
        SeleccionesConca.add(seleccion17Conca);
        SeleccionesConca.add(seleccion18Conca);
        SeleccionesConca.add(seleccion19Conca);
        SeleccionesConca.add(seleccion20Conca);
        SeleccionesConca.add(seleccion21Conca);
        SeleccionesConca.add(seleccion22Conca);
        SeleccionesConca.add(seleccion23Conca);
        SeleccionesConca.add(seleccion24Conca);
        SeleccionesConca.add(seleccion25Conca);
        SeleccionesConca.add(seleccion26Conca);
        SeleccionesConca.add(seleccion27Conca);
        SeleccionesConca.add(seleccion28Conca);
        SeleccionesConca.add(seleccion29Conca);
        SeleccionesConca.add(seleccion30Conca);
        SeleccionesConca.add(seleccion31Conca);
        SeleccionesConca.add(seleccion32Conca);
        SeleccionesConca.add(seleccion33Conca);
        SeleccionesConca.add(seleccion34Conca);
        SeleccionesConca.add(seleccion35Conca);
        SeleccionesConca.add(seleccion36Conca);
        SeleccionesConca.add(seleccion37Conca);
        SeleccionesConca.add(seleccion38Conca);
        SeleccionesConca.add(seleccion39Conca);
        SeleccionesConca.add(seleccion40Conca);
        SeleccionesConca.add(seleccion41Conca);

        for (Object []SeleccioneConca : SeleccionesConca){
            modeloConca.addRow(SeleccioneConca);
        }
            tblSeleccionCONCACAF.setModel(modeloConca);
    }
    private void cargarAFC() {
        ArrayList<Object> seleccionesAFC = new ArrayList<Object>();
        seleccionesAFC.add("Selecciones");
        for (Object columna : seleccionesAFC) {
            modeloAFC.addColumn(columna);
        }
        this.tblSeleccionAFC.setModel(modeloAFC);

        ArrayList<Object[]> SeleccionesAFC = new ArrayList<Object[]>();

        Object[] seleccion1AFC = new Object[]{"Afganistán"};
        Object[] seleccion2AFC = new Object[]{"Arabia Saudí"};
        Object[] seleccion3AFC = new Object[]{"Australia"};
        Object[] seleccion4AFC = new Object[]{"Bahréin"};
        Object[] seleccion5AFC = new Object[]{"Bangladesh"};
        Object[] seleccion6AFC = new Object[]{"Brunéi Darussalam"};
        Object[] seleccion7AFC = new Object[]{"Bután"};
        Object[] seleccion8AFC = new Object[]{"Camboya"};
        Object[] seleccion9AFC = new Object[]{"Chinese Taipei"};
        Object[] seleccion10AFC = new Object[]{"Emiratos Árabes Unidos"};
        Object[] seleccion11AFC = new Object[]{"Filipinas"};
        Object[] seleccion12AFC = new Object[]{"Guam"};
        Object[] seleccion13AFC = new Object[]{"Hong Kong China"};
        Object[] seleccion14AFC = new Object[]{"India"};
        Object[] seleccion15AFC = new Object[]{"Indonesia"};
        Object[] seleccion16AFC = new Object[]{"Irak"};
        Object[] seleccion17AFC = new Object[]{"Japón"};
        Object[] seleccion18AFC = new Object[]{"Jordania"};
        Object[] seleccion19AFC = new Object[]{"Kuwait"};
        Object[] seleccion20AFC = new Object[]{"Laos"};
        Object[] seleccion21AFC = new Object[]{"Líbano"};
        Object[] seleccion22AFC = new Object[]{"Macao"};
        Object[] seleccion23AFC = new Object[]{"Malasia"};
        Object[] seleccion24AFC = new Object[]{"Maldivas"};
        Object[] seleccion25AFC = new Object[]{"Mongolia"};
        Object[] seleccion26AFC = new Object[]{"Myanmar"};
        Object[] seleccion27AFC = new Object[]{"Nepal"};
        Object[] seleccion28AFC = new Object[]{"Omán"};
        Object[] seleccion29AFC = new Object[]{"Pakistán"};
        Object[] seleccion30AFC = new Object[]{"Palestina"};
        Object[] seleccion31AFC = new Object[]{"Qatar"};
        Object[] seleccion32AFC = new Object[]{"RDP de Corea"};
        Object[] seleccion33AFC = new Object[]{"República de Corea"};
        Object[] seleccion34AFC = new Object[]{"República Kirguisa"};
        Object[] seleccion35AFC = new Object[]{"Rl de Irán"};
        Object[] seleccion36AFC = new Object[]{"RP China"};
        Object[] seleccion37AFC = new Object[]{"Singapur"};
        Object[] seleccion38AFC = new Object[]{"Siria"};
        Object[] seleccion39AFC = new Object[]{"Sri Lanka"};
        Object[] seleccion40AFC = new Object[]{"Tailandia"};
        Object[] seleccion41AFC = new Object[]{"Tayikistán"};
        Object[] seleccion42AFC = new Object[]{"Timor Oriental"};
        Object[] seleccion43AFC = new Object[]{"Turkmenistán"};
        Object[] seleccion44AFC = new Object[]{"Uzbekistán"};
        Object[] seleccion45AFC = new Object[]{"Vietnam"};
        Object[] seleccion46AFC = new Object[]{"Yemen"};

        SeleccionesAFC.add(seleccion1AFC);
        SeleccionesAFC.add(seleccion2AFC);
        SeleccionesAFC.add(seleccion3AFC);
        SeleccionesAFC.add(seleccion4AFC);
        SeleccionesAFC.add(seleccion5AFC);
        SeleccionesAFC.add(seleccion6AFC);
        SeleccionesAFC.add(seleccion7AFC);
        SeleccionesAFC.add(seleccion8AFC);
        SeleccionesAFC.add(seleccion9AFC);
        SeleccionesAFC.add(seleccion10AFC);
        SeleccionesAFC.add(seleccion11AFC);
        SeleccionesAFC.add(seleccion12AFC);
        SeleccionesAFC.add(seleccion13AFC);
        SeleccionesAFC.add(seleccion14AFC);
        SeleccionesAFC.add(seleccion15AFC);
        SeleccionesAFC.add(seleccion16AFC);
        SeleccionesAFC.add(seleccion17AFC);
        SeleccionesAFC.add(seleccion18AFC);
        SeleccionesAFC.add(seleccion19AFC);
        SeleccionesAFC.add(seleccion20AFC);
        SeleccionesAFC.add(seleccion21AFC);
        SeleccionesAFC.add(seleccion22AFC);
        SeleccionesAFC.add(seleccion23AFC);
        SeleccionesAFC.add(seleccion24AFC);
        SeleccionesAFC.add(seleccion25AFC);
        SeleccionesAFC.add(seleccion26AFC);
        SeleccionesAFC.add(seleccion27AFC);
        SeleccionesAFC.add(seleccion28AFC);
        SeleccionesAFC.add(seleccion29AFC);
        SeleccionesAFC.add(seleccion30AFC);
        SeleccionesAFC.add(seleccion31AFC);
        SeleccionesAFC.add(seleccion32AFC);
        SeleccionesAFC.add(seleccion33AFC);
        SeleccionesAFC.add(seleccion34AFC);
        SeleccionesAFC.add(seleccion35AFC);
        SeleccionesAFC.add(seleccion36AFC);
        SeleccionesAFC.add(seleccion37AFC);
        SeleccionesAFC.add(seleccion38AFC);
        SeleccionesAFC.add(seleccion39AFC);
        SeleccionesAFC.add(seleccion40AFC);
        SeleccionesAFC.add(seleccion41AFC);
        SeleccionesAFC.add(seleccion42AFC);
        SeleccionesAFC.add(seleccion43AFC);
        SeleccionesAFC.add(seleccion44AFC);
        SeleccionesAFC.add(seleccion45AFC);
        SeleccionesAFC.add(seleccion46AFC);

        for (Object[] seleccioneAFC : SeleccionesAFC) {
            modeloAFC.addRow(seleccioneAFC);
        }
        tblSeleccionAFC.setModel(modeloAFC);
    }
    
    private void cargarCONMEBOL() {
        ArrayList<Object> seleccionesCONMEBOL = new ArrayList<Object>();
        seleccionesCONMEBOL.add("Selecciones");
        for (Object columna : seleccionesCONMEBOL) {
            modeloCONMEBOL.addColumn(columna);
        }
        this.tblSeleccionCONMEBOL.setModel(modeloCONMEBOL);

        ArrayList<Object[]> SeleccionesCONMEBOL = new ArrayList<Object[]>();

        Object[] seleccion1Conmebol = new Object[]{"Argentina"};
        Object[] seleccion2Conmebol = new Object[]{"Bolivia"};
        Object[] seleccion3Conmebol = new Object[]{"Brasil"};
        Object[] seleccion4Conmebol = new Object[]{"Chile"};
        Object[] seleccion5Conmebol = new Object[]{"Colombia"};
        Object[] seleccion6Conmebol = new Object[]{"Ecuador"};
        Object[] seleccion7Conmebol = new Object[]{"Paraguay"};
        Object[] seleccion8Conmebol = new Object[]{"Perú"};
        Object[] seleccion9Conmebol = new Object[]{"Uruguay"};
        Object[] seleccion10Conmebol = new Object[]{"Venezuela"};

        SeleccionesCONMEBOL.add(seleccion1Conmebol);
        SeleccionesCONMEBOL.add(seleccion2Conmebol);
        SeleccionesCONMEBOL.add(seleccion3Conmebol);
        SeleccionesCONMEBOL.add(seleccion4Conmebol);
        SeleccionesCONMEBOL.add(seleccion5Conmebol);
        SeleccionesCONMEBOL.add(seleccion6Conmebol);
        SeleccionesCONMEBOL.add(seleccion7Conmebol);
        SeleccionesCONMEBOL.add(seleccion8Conmebol);
        SeleccionesCONMEBOL.add(seleccion9Conmebol);
        SeleccionesCONMEBOL.add(seleccion10Conmebol);

        for (Object[] SeleccioneCONMEBOL : SeleccionesCONMEBOL) {
            modeloCONMEBOL.addRow(SeleccioneCONMEBOL);
        }
        tblSeleccionCONMEBOL.setModel(modeloCONMEBOL);
    }
    
    private void cargarCAF() {
        ArrayList<Object> seleccionesCAF = new ArrayList<Object>();
        seleccionesCAF.add("Selecciones");
        for (Object columna : seleccionesCAF) {
            modeloCAF.addColumn(columna);
        }
        this.tblSeleccionCAF.setModel(modeloCAF);

        ArrayList<Object[]> SeleccionesCAF = new ArrayList<Object[]>();

        Object[] seleccion1CAF = new Object[]{"Angola"};
        Object[] seleccion2CAF = new Object[]{"Argelia"};
        Object[] seleccion3CAF = new Object[]{"Benín"};
        Object[] seleccion4CAF = new Object[]{"Botsuana"};
        Object[] seleccion5CAF = new Object[]{"Burkina Faso"};
        Object[] seleccion6CAF = new Object[]{"Burundi"};
        Object[] seleccion7CAF = new Object[]{"Cabo Verde"};
        Object[] seleccion8CAF = new Object[]{"Camerún"};
        Object[] seleccion9CAF = new Object[]{"Chad"};
        Object[] seleccion10CAF = new Object[]{"Comoras"};
        Object[] seleccion11CAF = new Object[]{"Congo"};
        Object[] seleccion12CAF = new Object[]{"Costa de Marfil"};
        Object[] seleccion13CAF = new Object[]{"Egipto"};
        Object[] seleccion14CAF = new Object[]{"Eritrea"};
        Object[] seleccion15CAF = new Object[]{"Esuatini"};
        Object[] seleccion16CAF = new Object[]{"Etiopía"};
        Object[] seleccion17CAF = new Object[]{"Gabón"};
        Object[] seleccion18CAF = new Object[]{"Gambia"};
        Object[] seleccion19CAF = new Object[]{"Ghana"};
        Object[] seleccion20CAF = new Object[]{"Guinea"};
        Object[] seleccion21CAF = new Object[]{"Guinea Ecuatorial"};
        Object[] seleccion22CAF = new Object[]{"Guinea-Bissáu"};
        Object[] seleccion23CAF = new Object[]{"Kenia"};
        Object[] seleccion24CAF = new Object[]{"Lesoto"};
        Object[] seleccion25CAF = new Object[]{"Liberia"};
        Object[] seleccion26CAF = new Object[]{"Libia"};
        Object[] seleccion27CAF = new Object[]{"Madagascar"};
        Object[] seleccion28CAF = new Object[]{"Malaui"};
        Object[] seleccion29CAF = new Object[]{"Mali"};
        Object[] seleccion30CAF = new Object[]{"Marruecos"};
        Object[] seleccion31CAF = new Object[]{"Mauricio"};
        Object[] seleccion32CAF = new Object[]{"Mauritania"};
        Object[] seleccion33CAF = new Object[]{"Mozambique"};
        Object[] seleccion34CAF = new Object[]{"Namibia"};
        Object[] seleccion35CAF = new Object[]{"Níger"};
        Object[] seleccion36CAF = new Object[]{"Nigeria"};
        Object[] seleccion37CAF = new Object[]{"RD del Congo"};
        Object[] seleccion38CAF = new Object[]{"República Centroafricana"};
        Object[] seleccion39CAF = new Object[]{"Ruanda"};
        Object[] seleccion40CAF = new Object[]{"Santo Tomé y Príncipe"};
        Object[] seleccion41CAF = new Object[]{"Senegal"};
        Object[] seleccion42CAF = new Object[]{"Seychelles"};
        Object[] seleccion43CAF = new Object[]{"Sierra Leona"};
        Object[] seleccion44CAF = new Object[]{"Somalia"};
        Object[] seleccion45CAF = new Object[]{"Sudáfrica"};
        Object[] seleccion46CAF = new Object[]{"Sudán"};
        Object[] seleccion47CAF = new Object[]{"Sudán del Sur"};
        Object[] seleccion48CAF = new Object[]{"Tanzania"};
        Object[] seleccion49CAF = new Object[]{"Togo"};
        Object[] seleccion50CAF = new Object[]{"Túnez"};
        Object[] seleccion51CAF = new Object[]{"Uganda"};
        Object[] seleccion52CAF = new Object[]{"Yibuti"};
        Object[] seleccion53CAF = new Object[]{"Zambia"};


        SeleccionesCAF.add(seleccion1CAF);
        SeleccionesCAF.add(seleccion2CAF);
        SeleccionesCAF.add(seleccion3CAF);
        SeleccionesCAF.add(seleccion4CAF);
        SeleccionesCAF.add(seleccion5CAF);
        SeleccionesCAF.add(seleccion6CAF);
        SeleccionesCAF.add(seleccion7CAF);
        SeleccionesCAF.add(seleccion8CAF);
        SeleccionesCAF.add(seleccion9CAF);
        SeleccionesCAF.add(seleccion10CAF);
        SeleccionesCAF.add(seleccion11CAF);
        SeleccionesCAF.add(seleccion12CAF);
        SeleccionesCAF.add(seleccion13CAF);
        SeleccionesCAF.add(seleccion14CAF);
        SeleccionesCAF.add(seleccion15CAF);
        SeleccionesCAF.add(seleccion16CAF);
        SeleccionesCAF.add(seleccion17CAF);
        SeleccionesCAF.add(seleccion18CAF);
        SeleccionesCAF.add(seleccion19CAF);
        SeleccionesCAF.add(seleccion20CAF);
        SeleccionesCAF.add(seleccion21CAF);
        SeleccionesCAF.add(seleccion22CAF);
        SeleccionesCAF.add(seleccion23CAF);
        SeleccionesCAF.add(seleccion24CAF);
        SeleccionesCAF.add(seleccion25CAF);
        SeleccionesCAF.add(seleccion26CAF);
        SeleccionesCAF.add(seleccion27CAF);
        SeleccionesCAF.add(seleccion28CAF);
        SeleccionesCAF.add(seleccion29CAF);
        SeleccionesCAF.add(seleccion30CAF);
        SeleccionesCAF.add(seleccion31CAF);
        SeleccionesCAF.add(seleccion32CAF);
        SeleccionesCAF.add(seleccion33CAF);
        SeleccionesCAF.add(seleccion34CAF);
        SeleccionesCAF.add(seleccion35CAF);
        SeleccionesCAF.add(seleccion36CAF);
        SeleccionesCAF.add(seleccion37CAF);
        SeleccionesCAF.add(seleccion38CAF);
        SeleccionesCAF.add(seleccion39CAF);
        SeleccionesCAF.add(seleccion40CAF);
        SeleccionesCAF.add(seleccion41CAF);
        SeleccionesCAF.add(seleccion42CAF);
        SeleccionesCAF.add(seleccion43CAF);
        SeleccionesCAF.add(seleccion44CAF);
        SeleccionesCAF.add(seleccion45CAF);
        SeleccionesCAF.add(seleccion46CAF);
        SeleccionesCAF.add(seleccion47CAF);
        SeleccionesCAF.add(seleccion48CAF);
        SeleccionesCAF.add(seleccion49CAF);
        SeleccionesCAF.add(seleccion50CAF);
        SeleccionesCAF.add(seleccion51CAF);
        SeleccionesCAF.add(seleccion52CAF);
        SeleccionesCAF.add(seleccion53CAF);

        for (Object[] SeleccioneCAF : SeleccionesCAF) {
            modeloCAF.addRow(SeleccioneCAF);
        }
        tblSeleccionCAF.setModel(modeloCAF);
    }

    private void cargarUEFA() {
        ArrayList<Object> seleccionesUEFA = new ArrayList<Object>();
        seleccionesUEFA.add("Selecciones");
        for (Object columna : seleccionesUEFA) {
            modeloUEFA.addColumn(columna);
        }
        this.tblSeleccionUEFA.setModel(modeloUEFA);

        ArrayList<Object[]> SeleccionesUEFA = new ArrayList<Object[]>();

        Object[] seleccion1UEFA = new Object[]{"Albania"};
        Object[] seleccion2UEFA = new Object[]{"Alemania"};
        Object[] seleccion3UEFA = new Object[]{"Andorra"};
        Object[] seleccion4UEFA = new Object[]{"Armenia"};
        Object[] seleccion5UEFA = new Object[]{"Austria"};
        Object[] seleccion6UEFA = new Object[]{"Azerbaiyán"};
        Object[] seleccion7UEFA = new Object[]{"Bélgica"};
        Object[] seleccion8UEFA = new Object[]{"Bielorrusia"};
        Object[] seleccion9UEFA = new Object[]{"Bosnia y Herzegovina"};
        Object[] seleccion10UEFA = new Object[]{"Bulgaria"};
        Object[] seleccion11UEFA = new Object[]{"Chipre"};
        Object[] seleccion12UEFA = new Object[]{"Croacia"};
        Object[] seleccion13UEFA = new Object[]{"Dinamarca"};
        Object[] seleccion14UEFA = new Object[]{"Escocia"};
        Object[] seleccion15UEFA = new Object[]{"Eslovaquia"};
        Object[] seleccion16UEFA = new Object[]{"Eslovenia"};
        Object[] seleccion17UEFA = new Object[]{"España"};
        Object[] seleccion18UEFA = new Object[]{"Estonia"};
        Object[] seleccion19UEFA = new Object[]{"Finlandia"};
        Object[] seleccion20UEFA = new Object[]{"Francia"};
        Object[] seleccion21UEFA = new Object[]{"Gales"};
        Object[] seleccion22UEFA = new Object[]{"Georgia"};
        Object[] seleccion23UEFA = new Object[]{"Gibraltar"};
        Object[] seleccion24UEFA = new Object[]{"Hungría"};
        Object[] seleccion25UEFA = new Object[]{"Inglaterra"};
        Object[] seleccion26UEFA = new Object[]{"Irlanda"};
        Object[] seleccion27UEFA = new Object[]{"Irlanda del Norte"};
        Object[] seleccion28UEFA = new Object[]{"Islandia"};
        Object[] seleccion29UEFA = new Object[]{"Islas Feroe"};
        Object[] seleccion30UEFA = new Object[]{"Israel"};
        Object[] seleccion31UEFA = new Object[]{"Italia"};
        Object[] seleccion32UEFA = new Object[]{"Kazajistán"};
        Object[] seleccion33UEFA = new Object[]{"Kosovo"};
        Object[] seleccion34UEFA = new Object[]{"Letonia"};
        Object[] seleccion35UEFA = new Object[]{"Liechtenstein"};
        Object[] seleccion36UEFA = new Object[]{"Lituania"};
        Object[] seleccion37UEFA = new Object[]{"Luxemburgo"};
        Object[] seleccion38UEFA = new Object[]{"Macedonia del Norte"};
        Object[] seleccion39UEFA = new Object[]{"Malta"};
        Object[] seleccion40UEFA = new Object[]{"Moldavia"};
        Object[] seleccion41UEFA = new Object[]{"Montenegro"};
        Object[] seleccion42UEFA = new Object[]{"Noruega"};
        Object[] seleccion43UEFA = new Object[]{"Paises Bajos"};
        Object[] seleccion44UEFA = new Object[]{"Polonia"};
        Object[] seleccion45UEFA = new Object[]{"Portugal"};
        Object[] seleccion46UEFA = new Object[]{"Republica Checa"};
        Object[] seleccion47UEFA = new Object[]{"Rumania"};
        Object[] seleccion48UEFA = new Object[]{"Rusia"};
        Object[] seleccion49UEFA = new Object[]{"San Marino"};
        Object[] seleccion50UEFA = new Object[]{"Serbia"};
        Object[] seleccion51UEFA = new Object[]{"Suecia"};
        Object[] seleccion52UEFA = new Object[]{"Suiza"};
        Object[] seleccion53UEFA = new Object[]{"Turquia"};
        Object[] seleccion54UEFA = new Object[]{"Ucrania"};

        SeleccionesUEFA.add(seleccion1UEFA);
        SeleccionesUEFA.add(seleccion2UEFA);
        SeleccionesUEFA.add(seleccion3UEFA);
        SeleccionesUEFA.add(seleccion4UEFA);
        SeleccionesUEFA.add(seleccion5UEFA);
        SeleccionesUEFA.add(seleccion6UEFA);
        SeleccionesUEFA.add(seleccion7UEFA);
        SeleccionesUEFA.add(seleccion8UEFA);
        SeleccionesUEFA.add(seleccion9UEFA);
        SeleccionesUEFA.add(seleccion10UEFA);
        SeleccionesUEFA.add(seleccion11UEFA);
        SeleccionesUEFA.add(seleccion12UEFA);
        SeleccionesUEFA.add(seleccion13UEFA);
        SeleccionesUEFA.add(seleccion14UEFA);
        SeleccionesUEFA.add(seleccion15UEFA);
        SeleccionesUEFA.add(seleccion16UEFA);
        SeleccionesUEFA.add(seleccion17UEFA);
        SeleccionesUEFA.add(seleccion18UEFA);
        SeleccionesUEFA.add(seleccion19UEFA);
        SeleccionesUEFA.add(seleccion20UEFA);
        SeleccionesUEFA.add(seleccion21UEFA);
        SeleccionesUEFA.add(seleccion22UEFA);
        SeleccionesUEFA.add(seleccion23UEFA);
        SeleccionesUEFA.add(seleccion24UEFA);
        SeleccionesUEFA.add(seleccion25UEFA);
        SeleccionesUEFA.add(seleccion26UEFA);
        SeleccionesUEFA.add(seleccion27UEFA);
        SeleccionesUEFA.add(seleccion28UEFA);
        SeleccionesUEFA.add(seleccion29UEFA);
        SeleccionesUEFA.add(seleccion30UEFA);
        SeleccionesUEFA.add(seleccion31UEFA);
        SeleccionesUEFA.add(seleccion32UEFA);
        SeleccionesUEFA.add(seleccion33UEFA);
        SeleccionesUEFA.add(seleccion34UEFA);
        SeleccionesUEFA.add(seleccion35UEFA);
        SeleccionesUEFA.add(seleccion36UEFA);
        SeleccionesUEFA.add(seleccion37UEFA);
        SeleccionesUEFA.add(seleccion38UEFA);
        SeleccionesUEFA.add(seleccion39UEFA);
        SeleccionesUEFA.add(seleccion40UEFA);
        SeleccionesUEFA.add(seleccion41UEFA);
        SeleccionesUEFA.add(seleccion42UEFA);
        SeleccionesUEFA.add(seleccion43UEFA);
        SeleccionesUEFA.add(seleccion44UEFA);
        SeleccionesUEFA.add(seleccion45UEFA);
        SeleccionesUEFA.add(seleccion46UEFA);
        SeleccionesUEFA.add(seleccion47UEFA);
        SeleccionesUEFA.add(seleccion48UEFA);
        SeleccionesUEFA.add(seleccion49UEFA);
        SeleccionesUEFA.add(seleccion50UEFA);
        SeleccionesUEFA.add(seleccion51UEFA);
        SeleccionesUEFA.add(seleccion52UEFA);
        SeleccionesUEFA.add(seleccion53UEFA);
        SeleccionesUEFA.add(seleccion54UEFA);

        for (Object[] SeleccioneUEFA : SeleccionesUEFA) {
            modeloUEFA.addRow(SeleccioneUEFA);
        }
        tblSeleccionUEFA.setModel(modeloUEFA);
    }
    public Eliminatoria() {
        initComponents();
        cargaConca();
        cargarCONMEBOL();
        cargarAFC();
        cargarCAF();
        cargarUEFA();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblConfederaciones = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeleccionAFC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPuntajeAFC = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSeleccionCAF = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPuntajeCAF = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSeleccionCONCACAF = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPuntajeCONCACAF = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSeleccionCONMEBOL = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblPuntajeCONMEBOL = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSeleccionOFC = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblPuntajeOFC = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblSeleccionUEFA = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblPuntajeUEFA = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSeleccionAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccion AFC"
            }
        ));
        jScrollPane1.setViewportView(tblSeleccionAFC);

        tblPuntajeAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane2.setViewportView(tblPuntajeAFC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("AFC", jPanel1);

        tblSeleccionCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccion CAF"
            }
        ));
        jScrollPane3.setViewportView(tblSeleccionCAF);

        tblPuntajeCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane4.setViewportView(tblPuntajeCAF);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("CAF", jPanel2);

        tblSeleccionCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccion CONCACAF"
            }
        ));
        jScrollPane5.setViewportView(tblSeleccionCONCACAF);

        tblPuntajeCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane6.setViewportView(tblPuntajeCONCACAF);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("CONCACAF", jPanel3);

        tblSeleccionCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones CONMEBOL"
            }
        ));
        jScrollPane7.setViewportView(tblSeleccionCONMEBOL);

        tblPuntajeCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Selección", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane8.setViewportView(tblPuntajeCONMEBOL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("CONMEBOL", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        tblSeleccionOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones OFC"
            }
        ));
        jScrollPane9.setViewportView(tblSeleccionOFC);

        tblPuntajeOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Selección", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        tblPuntajeOFC.setOpaque(false);
        jScrollPane10.setViewportView(tblPuntajeOFC);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("OFC", jPanel5);

        tblSeleccionUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones UEFA"
            }
        ));
        jScrollPane11.setViewportView(tblSeleccionUEFA);

        tblPuntajeUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Selección", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane12.setViewportView(tblPuntajeUEFA);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("UEFA", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        tblConfederaciones.addTab("PANTALLA PRINCIPAL", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblConfederaciones)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblConfederaciones, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eliminatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Eliminatoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane tblConfederaciones;
    private javax.swing.JTable tblPuntajeAFC;
    private javax.swing.JTable tblPuntajeCAF;
    private javax.swing.JTable tblPuntajeCONCACAF;
    private javax.swing.JTable tblPuntajeCONMEBOL;
    private javax.swing.JTable tblPuntajeOFC;
    private javax.swing.JTable tblPuntajeUEFA;
    private javax.swing.JTable tblSeleccionAFC;
    private javax.swing.JTable tblSeleccionCAF;
    private javax.swing.JTable tblSeleccionCONCACAF;
    private javax.swing.JTable tblSeleccionCONMEBOL;
    private javax.swing.JTable tblSeleccionOFC;
    private javax.swing.JTable tblSeleccionUEFA;
    // End of variables declaration//GEN-END:variables

}
