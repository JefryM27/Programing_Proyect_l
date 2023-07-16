
package GUI;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 50672
 */
public class Eliminatoria extends javax.swing.JFrame {

    DefaultTableModel modeloConca = new DefaultTableModel();//Se crean los objetos DefaultTableModel vacíos con los nombres modeloConca, modeloAFC, modeloCAF, modeloCONMEBOL, modeloOFC, modeloUEFA
    DefaultTableModel modeloPuntajeCONCACAF = new DefaultTableModel();//Implementacion del puntaje 
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

            String[] nombresSelecciones = {"Costa Rica", "Nicaragua", "Honduras", "Panamá", "El Salvador", "Jamaica", "Trinidad y Tobago", "Guatemala"};
ArrayList<Object[]> SeleccionesConca = new ArrayList<Object[]>();

for (String nombre : nombresSelecciones) {
    SeleccionesConca.add(new Object[]{nombre});
}
        for (Object []SeleccioneConca : SeleccionesConca){
            modeloConca.addRow(SeleccioneConca);
        }
            tblSeleccionCONCACAF.setModel(modeloConca);
             // Inicializa la tabla de posiciones con las columnas necesarias
        modeloPuntajeCONCACAF.addColumn("Imagen");
        modeloPuntajeCONCACAF.addColumn("Posición");
        modeloPuntajeCONCACAF.addColumn("Selecciones");
        modeloPuntajeCONCACAF.addColumn("PTS");
        modeloPuntajeCONCACAF.addColumn("PJ");
        modeloPuntajeCONCACAF.addColumn("PG");
        modeloPuntajeCONCACAF.addColumn("PE");
        modeloPuntajeCONCACAF.addColumn("PP");
        modeloPuntajeCONCACAF.addColumn("GF");
        modeloPuntajeCONCACAF.addColumn("GC");
        modeloPuntajeCONCACAF.addColumn("DIF");

        // Agregar los equipos y puntajes iniciales a la tabla de posiciones
        for (int i = 0; i < SeleccionesConca.size(); i++) {
            Object[] equipo = SeleccionesConca.get(i);
            Object[] filaPuntaje = new Object[modeloPuntajeCONCACAF.getColumnCount()];  // Crear una fila para almacenar los puntajes

            // Cargar la imagen de la bandera desde el paquete "imagenes"
            /* ImageIcon imagen = new ImageIcon(getClass().getResource("/img/Anguila.png"));*/
            // Añadir la imagen a la primera fila de la primera columna
            /*  modeloConca.setValueAt(imagen, 0, 0);*/
            filaPuntaje[0] = null;  // Agregar la columna de imagen (puede ser null o agregar una imagen en particular)
            filaPuntaje[1] = i + 1;  // Agregar la posición
            filaPuntaje[2] = equipo[0];  // Agregar el nombre del equipo

            // Establecer ceros en las columnas de puntajes
            for (int j = 3; j < modeloPuntajeCONCACAF.getColumnCount(); j++) {
                filaPuntaje[j] = 0;
            }

            // Agregar la fila a la tabla de puntajes
            modeloPuntajeCONCACAF.addRow(filaPuntaje);
        }

        tblPuntajeCONCACAF.setModel(modeloPuntajeCONCACAF);
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
    private void cargarOFC() {
        ArrayList<Object> seleccionesOFC = new ArrayList<Object>();
        seleccionesOFC.add("Selecciones");
        for (Object columna : seleccionesOFC) {
            modeloOFC.addColumn(columna);
        }
        this.tblSeleccionOFC.setModel(modeloOFC);

        ArrayList<Object[]> SeleccionesOFC = new ArrayList<Object[]>();

        Object[] seleccion1OFC = new Object[]{"Fiyi"};
        Object[] seleccion2OFC = new Object[]{"Islas Cook"};
        Object[] seleccion12OFC = new Object[]{"Islas Kiribati"};
        Object[] seleccion3OFC = new Object[]{"Islas Salomón"};
        Object[] seleccion4OFC = new Object[]{"Nueva Caledonia"};
        Object[] seleccion5OFC = new Object[]{"Nueva Zelanda"};
        Object[] seleccion6OFC = new Object[]{"Papúa Nueva Guinea"};
        Object[] seleccion8OFC = new Object[]{"Samoa Americana"};
        Object[] seleccion7OFC = new Object[]{"Samoa"};
        Object[] seleccion9OFC = new Object[]{"Tahiti"};
        Object[] seleccion10OFC = new Object[]{"Tonga"};
        Object[] seleccion11OFC = new Object[]{"Vanuatu"};
        Object[] seleccion13OFC = new Object[]{"Tuvalu"};

        SeleccionesOFC.add(seleccion1OFC);
        SeleccionesOFC.add(seleccion2OFC);
        SeleccionesOFC.add(seleccion3OFC);
        SeleccionesOFC.add(seleccion4OFC);
        SeleccionesOFC.add(seleccion5OFC);
        SeleccionesOFC.add(seleccion6OFC);
        SeleccionesOFC.add(seleccion7OFC);
        SeleccionesOFC.add(seleccion8OFC);
        SeleccionesOFC.add(seleccion9OFC);
        SeleccionesOFC.add(seleccion10OFC);
        SeleccionesOFC.add(seleccion11OFC);
        SeleccionesOFC.add(seleccion12OFC);
        SeleccionesOFC.add(seleccion13OFC);

        for (Object[] SeleccioneOFC : SeleccionesOFC) {
            modeloOFC.addRow(SeleccioneOFC);
        }
        tblSeleccionOFC.setModel(modeloOFC);
    }
    public Eliminatoria() {
        

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        tblPuntajeCONCACAF = new javax.swing.JTable();
        tblConfederaciones = new javax.swing.JTabbedPane();
        PanelCAF = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeleccionCAF = new javax.swing.JTable();
        lblImagenCAF = new javax.swing.JLabel();
        PanelCONCACAF = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSeleccionCONCACAF = new javax.swing.JTable();
        lblConcacaf = new javax.swing.JLabel();
        PanelCONMEBOL = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSeleccionCONMEBOL = new javax.swing.JTable();
        lblImagenCONMEBOL = new javax.swing.JLabel();
        PanelOFC = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSeleccionOFC = new javax.swing.JTable();
        lblImagenOFC = new javax.swing.JLabel();
        PanelUEFA = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblSeleccionUEFA = new javax.swing.JTable();
        lblIImagenUEFA = new javax.swing.JLabel();
        PanelAFC = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSeleccionAFC = new javax.swing.JTable();
        lblImagenAFC = new javax.swing.JLabel();
        JPanelPP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        tblPuntajeCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane6.setViewportView(tblPuntajeCONCACAF);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCAF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSeleccionCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Posicion", "Banderas", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane1.setViewportView(tblSeleccionCAF);

        PanelCAF.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 370));

        lblImagenCAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\CAF.png")); // NOI18N
        PanelCAF.add(lblImagenCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1149, 598));

        tblConfederaciones.addTab("CAF", PanelCAF);

        PanelCONCACAF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSeleccionCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Posicion", "Banderas", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane3.setViewportView(tblSeleccionCONCACAF);

        PanelCONCACAF.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 360));

        lblConcacaf.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\Concacaf.jpg")); // NOI18N
        PanelCONCACAF.add(lblConcacaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1173, 590));

        tblConfederaciones.addTab("CONCACAF", PanelCONCACAF);

        tblSeleccionCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Banderas", "Selección", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane8.setViewportView(tblSeleccionCONMEBOL);

        lblImagenCONMEBOL.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\Conmebol.jpg")); // NOI18N
        lblImagenCONMEBOL.setMinimumSize(new java.awt.Dimension(700, 700));
        lblImagenCONMEBOL.setOpaque(true);

        javax.swing.GroupLayout PanelCONMEBOLLayout = new javax.swing.GroupLayout(PanelCONMEBOL);
        PanelCONMEBOL.setLayout(PanelCONMEBOLLayout);
        PanelCONMEBOLLayout.setHorizontalGroup(
            PanelCONMEBOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCONMEBOLLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 537, Short.MAX_VALUE))
            .addGroup(PanelCONMEBOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCONMEBOLLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagenCONMEBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelCONMEBOLLayout.setVerticalGroup(
            PanelCONMEBOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCONMEBOLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(PanelCONMEBOLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCONMEBOLLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagenCONMEBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tblConfederaciones.addTab("CONMEBOL", PanelCONMEBOL);

        PanelOFC.setBackground(new java.awt.Color(102, 102, 102));

        tblSeleccionOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Banderas", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        tblSeleccionOFC.setOpaque(false);
        jScrollPane10.setViewportView(tblSeleccionOFC);

        lblImagenOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\OFC.jpg")); // NOI18N
        lblImagenOFC.setMinimumSize(new java.awt.Dimension(700, 700));
        lblImagenOFC.setOpaque(true);

        javax.swing.GroupLayout PanelOFCLayout = new javax.swing.GroupLayout(PanelOFC);
        PanelOFC.setLayout(PanelOFCLayout);
        PanelOFCLayout.setHorizontalGroup(
            PanelOFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOFCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
            .addGroup(PanelOFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelOFCLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagenOFC, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelOFCLayout.setVerticalGroup(
            PanelOFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOFCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(PanelOFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelOFCLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagenOFC, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tblConfederaciones.addTab("OFC", PanelOFC);

        tblSeleccionUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Banderas", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane12.setViewportView(tblSeleccionUEFA);

        lblIImagenUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\UEFA.jpg")); // NOI18N
        lblIImagenUEFA.setMinimumSize(new java.awt.Dimension(700, 700));
        lblIImagenUEFA.setOpaque(true);

        javax.swing.GroupLayout PanelUEFALayout = new javax.swing.GroupLayout(PanelUEFA);
        PanelUEFA.setLayout(PanelUEFALayout);
        PanelUEFALayout.setHorizontalGroup(
            PanelUEFALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUEFALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
            .addGroup(PanelUEFALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelUEFALayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIImagenUEFA, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)))
        );
        PanelUEFALayout.setVerticalGroup(
            PanelUEFALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUEFALayout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 296, Short.MAX_VALUE))
            .addGroup(PanelUEFALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelUEFALayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIImagenUEFA, javax.swing.GroupLayout.PREFERRED_SIZE, 667, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tblConfederaciones.addTab("UEFA", PanelUEFA);

        PanelAFC.setOpaque(false);
        PanelAFC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSeleccionAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Posicion", "Banderas", "Seleccion", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"
            }
        ));
        jScrollPane9.setViewportView(tblSeleccionAFC);

        PanelAFC.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 620, 290));

        lblImagenAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\AFC.jpg")); // NOI18N
        lblImagenAFC.setMaximumSize(new java.awt.Dimension(700, 700));
        lblImagenAFC.setMinimumSize(new java.awt.Dimension(700, 700));
        lblImagenAFC.setOpaque(true);
        PanelAFC.add(lblImagenAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1170, 593));

        tblConfederaciones.addTab("AFC", PanelAFC);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\src\\test\\java\\Fondos\\Mundial.jpg")); // NOI18N

        javax.swing.GroupLayout JPanelPPLayout = new javax.swing.GroupLayout(JPanelPP);
        JPanelPP.setLayout(JPanelPPLayout);
        JPanelPPLayout.setHorizontalGroup(
            JPanelPPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelPPLayout.setVerticalGroup(
            JPanelPPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblConfederaciones.addTab("Pantalla Principal", JPanelPP);

        getContentPane().add(tblConfederaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1160, 630));

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
    private javax.swing.JPanel JPanelPP;
    private javax.swing.JPanel PanelAFC;
    private javax.swing.JPanel PanelCAF;
    private javax.swing.JPanel PanelCONCACAF;
    private javax.swing.JPanel PanelCONMEBOL;
    private javax.swing.JPanel PanelOFC;
    private javax.swing.JPanel PanelUEFA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblConcacaf;
    private javax.swing.JLabel lblIImagenUEFA;
    private javax.swing.JLabel lblImagenAFC;
    private javax.swing.JLabel lblImagenCAF;
    private javax.swing.JLabel lblImagenCONMEBOL;
    private javax.swing.JLabel lblImagenOFC;
    private javax.swing.JTabbedPane tblConfederaciones;
    private javax.swing.JTable tblPuntajeCONCACAF;
    private javax.swing.JTable tblSeleccionAFC;
    private javax.swing.JTable tblSeleccionCAF;
    private javax.swing.JTable tblSeleccionCONCACAF;
    private javax.swing.JTable tblSeleccionCONMEBOL;
    private javax.swing.JTable tblSeleccionOFC;
    private javax.swing.JTable tblSeleccionUEFA;
    // End of variables declaration//GEN-END:variables
}
