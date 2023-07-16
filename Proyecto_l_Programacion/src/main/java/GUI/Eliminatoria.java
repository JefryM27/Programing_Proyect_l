package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import logica.Confederacion;

/**
 *
 * @author 50672
 */
public class Eliminatoria extends javax.swing.JFrame {

    Confederacion confederacion = new Confederacion();
    int identificadorIterativo = 1;

    DefaultTableModel modelo = new DefaultTableModel();//Se crean los objetos DefaultTableModel vacíos con los nombres modeloConca, modeloAFC, modeloCAF, modeloCONMEBOL, modeloOFC, modeloUEFA
    DefaultTableModel PuntajeCONCACAF = new DefaultTableModel();

    private boolean modeloCargado = false;
//------------------------------------------Espacios para cargar modelos------------------------------------------------------------------------------------------
    //------------------------------------------Carga modelo Conca------------------------------------------------------------------------------------------
    private void cargarModeloConca() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeCONCACAF.setModel(modelo);
        modeloCargado = true;
        btnResultadoConca.setEnabled(false);
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeCONCACAF.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 6) ? new Color(0, 255, 0) : ((posicion == 7 || posicion == 8) ? new Color(240, 70, 70) : table.getBackground());
                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }
    //------------------------------------------Carga modelo AFC------------------------------------------------------------------------------------------
    
    
    //------------------------------------------Carga modelo CAF------------------------------------------------------------------------------------------
    
    
    //------------------------------------------Carga modelo CONMEBOL------------------------------------------------------------------------------------------
    
    
    //------------------------------------------Carga modelo OFC------------------------------------------------------------------------------------------
    
    
    //------------------------------------------Carga modelo UEFA------------------------------------------------------------------------------------------
    
    
//------------------------------------------Espacios para cargar Selecciones------------------------------------------------------------------------------------------
    private void cargarSeleccionesConca() {
        String[] nombresSelecciones = {"Anguila", "Antigua y Barbuda", "Aruba", "Bahamas", "Barbados", "Belice", "Bermudas", "Canadá", "Costa Rica", "Cuba", "Curazao", "Dominica", "EEUU", "El Salvador", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Islas Caimán", "Islas Vírgenes Británicas", "Islas Vírgenes Estadounidenses", "Jamaica", "México", "Montserrat", "Nicaragua", "Panamá", "Puerto Rico", "República Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Turcas y Caicos"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeCONCACAF.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    //---------------------------------Metodo Simular Partidos------------------------------------------------------------------------------------------
    private void simularPartidos(JTable tabla) {
        Random rand = new Random();
        int maxGoles = 10;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = i + 1; j < modelo.getRowCount(); j++) {
                int golesLocal = rand.nextInt(maxGoles + 1);
                int golesVisitante = rand.nextInt(maxGoles + 1);

                int golesLocalAntes = (int) modelo.getValueAt(i, 8);
                int golesVisitanteAntes = (int) modelo.getValueAt(j, 8);
                int golesLocalContraAntes = (int) modelo.getValueAt(i, 9);
                int golesVisitanteContraAntes = (int) modelo.getValueAt(j, 9);

                int golesLocalDespues = golesLocalAntes + golesLocal;
                int golesVisitanteDespues = golesVisitanteAntes + golesVisitante;
                int golesLocalContraDespues = golesLocalContraAntes + golesVisitante;
                int golesVisitanteContraDespues = golesVisitanteContraAntes + golesLocal;

                modelo.setValueAt(golesLocalDespues, i, 8);
                modelo.setValueAt(golesVisitanteDespues, j, 8);
                modelo.setValueAt(golesLocalContraDespues, i, 9);
                modelo.setValueAt(golesVisitanteContraDespues, j, 9);

                int puntosLocal = (int) modelo.getValueAt(i, 3);
                int puntosVisitante = (int) modelo.getValueAt(j, 3);

                if (golesLocal == golesVisitante) {
                    puntosLocal += 1;
                    puntosVisitante += 1;
                    modelo.setValueAt(puntosLocal, i, 3);
                    modelo.setValueAt(puntosVisitante, j, 3);

                    int empatesLocal = (int) modelo.getValueAt(i, 6);
                    int empatesVisitante = (int) modelo.getValueAt(j, 6);
                    modelo.setValueAt(empatesLocal + 1, i, 6);
                    modelo.setValueAt(empatesVisitante + 1, j, 6);
                } else if (golesLocal > golesVisitante) {
                    puntosLocal += 3;
                    modelo.setValueAt(puntosLocal, i, 3);

                    int victoriasLocal = (int) modelo.getValueAt(i, 5);
                    int derrotasVisitante = (int) modelo.getValueAt(j, 7);
                    modelo.setValueAt(victoriasLocal + 1, i, 5);
                    modelo.setValueAt(derrotasVisitante + 1, j, 7);
                } else {
                    puntosVisitante += 3;
                    modelo.setValueAt(puntosVisitante, j, 3);

                    int victoriasVisitante = (int) modelo.getValueAt(j, 5);
                    int derrotasLocal = (int) modelo.getValueAt(i, 7);
                    modelo.setValueAt(victoriasVisitante + 1, j, 5);
                    modelo.setValueAt(derrotasLocal + 1, i, 7);
                }
            }
        }
    }
    //---------------------------------Metodo actualizar Putnos Partidos Jugados------------------------------------------------------------------------------------------

    //---------------------------------Metodo Actualizar Diferencia Goles------------------------------------------------------------------------------------------
    
    //---------------------------------Metodo Ordenar Posiciones------------------------------------------------------------------------------------------
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblPuntajeAFC = new javax.swing.JTable();
        btnPartidoAFC = new javax.swing.JButton();
        btnSimularTodoAFC = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtResultadoAFC = new javax.swing.JTextArea();
        btnResultadoAFC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblPuntajeCAF = new javax.swing.JTable();
        btnPartidoCAF = new javax.swing.JButton();
        btnSimularTodoCAF = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtResultadoCAF = new javax.swing.JTextArea();
        btnResultadoCAF = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPuntajeCONCACAF1 = new javax.swing.JTable();
        btnPartidoConca = new javax.swing.JButton();
        btnSimularTodoConca = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtResultadoCONCACAF = new javax.swing.JTextArea();
        btnResultadoConca = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblPuntajeCONMEBOL = new javax.swing.JTable();
        btnPartidoCONMEBOL = new javax.swing.JButton();
        btnSimularTodoCONMEBOL = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtResultadoCONMEBOL = new javax.swing.JTextArea();
        btnResultadoCONMEBOL = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblPuntajeOFC = new javax.swing.JTable();
        btnPartidoOFC = new javax.swing.JButton();
        btnSimularTodoOFC = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtResultadoOFC = new javax.swing.JTextArea();
        btnResultadoOFC = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnResultadoUEFA = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblPuntajeUEFA = new javax.swing.JTable();
        btnPartidoUEFA = new javax.swing.JButton();
        btnSimularTodoUEFA = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtResultadoUEFA = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();

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

        tblPuntajeAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane16.setViewportView(tblPuntajeAFC);

        btnPartidoAFC.setText("Simular partido");
        btnPartidoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoAFCActionPerformed(evt);
            }
        });

        btnSimularTodoAFC.setText("Simular todos ");
        btnSimularTodoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoAFCActionPerformed(evt);
            }
        });

        txtResultadoAFC.setColumns(20);
        txtResultadoAFC.setRows(5);
        jScrollPane17.setViewportView(txtResultadoAFC);

        btnResultadoAFC.setText("Ver resultados");
        btnResultadoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoAFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoAFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoAFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoAFC)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoAFC)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoAFC)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane16)
        );

        tblConfederaciones.addTab("AFC", jPanel1);

        tblPuntajeCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane18.setViewportView(tblPuntajeCAF);

        btnPartidoCAF.setText("Simular partido");
        btnPartidoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCAFActionPerformed(evt);
            }
        });

        btnSimularTodoCAF.setText("Simular todos ");
        btnSimularTodoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCAFActionPerformed(evt);
            }
        });

        txtResultadoCAF.setColumns(20);
        txtResultadoCAF.setRows(5);
        jScrollPane19.setViewportView(txtResultadoCAF);

        btnResultadoCAF.setText("Ver resultados");
        btnResultadoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCAFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoCAF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoCAF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoCAF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoCAF)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoCAF)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoCAF)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane18)
        );

        tblConfederaciones.addTab("CAF", jPanel2);

        tblPuntajeCONCACAF1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane7.setViewportView(tblPuntajeCONCACAF1);

        btnPartidoConca.setText("Simular partido");
        btnPartidoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoConcaActionPerformed(evt);
            }
        });

        btnSimularTodoConca.setText("Simular todos ");
        btnSimularTodoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoConcaActionPerformed(evt);
            }
        });

        txtResultadoCONCACAF.setColumns(20);
        txtResultadoCONCACAF.setRows(5);
        jScrollPane13.setViewportView(txtResultadoCONCACAF);

        btnResultadoConca.setText("Ver resultados");
        btnResultadoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoConcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoConca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoConca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoConca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoConca)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoConca)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoConca)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane7)
        );

        tblConfederaciones.addTab("CONCACAF", jPanel3);

        tblPuntajeCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane20.setViewportView(tblPuntajeCONMEBOL);

        btnPartidoCONMEBOL.setText("Simular partido");
        btnPartidoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCONMEBOLActionPerformed(evt);
            }
        });

        btnSimularTodoCONMEBOL.setText("Simular todos ");
        btnSimularTodoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCONMEBOLActionPerformed(evt);
            }
        });

        txtResultadoCONMEBOL.setColumns(20);
        txtResultadoCONMEBOL.setRows(5);
        jScrollPane21.setViewportView(txtResultadoCONMEBOL);

        btnResultadoCONMEBOL.setText("Ver resultados");
        btnResultadoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCONMEBOLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoCONMEBOL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoCONMEBOL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoCONMEBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoCONMEBOL)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoCONMEBOL)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoCONMEBOL)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane20)
        );

        tblConfederaciones.addTab("CONMEBOL", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        tblPuntajeOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane22.setViewportView(tblPuntajeOFC);

        btnPartidoOFC.setText("Simular partido");
        btnPartidoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoOFCActionPerformed(evt);
            }
        });

        btnSimularTodoOFC.setText("Simular todos ");
        btnSimularTodoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoOFCActionPerformed(evt);
            }
        });

        txtResultadoOFC.setColumns(20);
        txtResultadoOFC.setRows(5);
        jScrollPane23.setViewportView(txtResultadoOFC);

        btnResultadoOFC.setText("Ver resultados");
        btnResultadoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoOFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoOFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoOFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoOFC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoOFC)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoOFC)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoOFC)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane22)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblConfederaciones.addTab("OFC", jPanel5);

        btnResultadoUEFA.setText("Ver resultados");
        btnResultadoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoUEFAActionPerformed(evt);
            }
        });

        tblPuntajeUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane24.setViewportView(tblPuntajeUEFA);

        btnPartidoUEFA.setText("Simular partido");
        btnPartidoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoUEFAActionPerformed(evt);
            }
        });

        btnSimularTodoUEFA.setText("Simular todos ");
        btnSimularTodoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoUEFAActionPerformed(evt);
            }
        });

        txtResultadoUEFA.setColumns(20);
        txtResultadoUEFA.setRows(5);
        jScrollPane25.setViewportView(txtResultadoUEFA);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSimularTodoUEFA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPartidoUEFA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResultadoUEFA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResultadoUEFA)
                .addGap(18, 18, 18)
                .addComponent(btnPartidoUEFA)
                .addGap(18, 18, 18)
                .addComponent(btnSimularTodoUEFA)
                .addGap(45, 45, 45))
            .addComponent(jScrollPane24)
        );

        tblConfederaciones.addTab("UEFA", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );

        tblConfederaciones.addTab("PANTALLA PRINCIPAL", jPanel7);

        getContentPane().add(tblConfederaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPartidoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoConcaActionPerformed
        cargarConca();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoConcaActionPerformed

    private void btnSimularTodoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoConcaActionPerformed
        cargarConca();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoConcaActionPerformed

    private void btnResultadoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoConcaActionPerformed
        String paises[] = {"Costa Rica", "Nicaragua", "Honduras", "Panamá", "El Salvador", "Jamaica", "Trinidad y Tobago", "Guatemala"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

        // Obtener el resultado
        sedeEncuentro.mostrarResultados();

        // Configurar el resultado en el JTextArea

    }//GEN-LAST:event_btnResultadoConcaActionPerformed

    private void btnPartidoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoAFCActionPerformed

    private void btnSimularTodoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoAFCActionPerformed

    private void btnResultadoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoAFCActionPerformed

    private void btnPartidoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoCAFActionPerformed

    private void btnSimularTodoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoCAFActionPerformed

    private void btnResultadoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoCAFActionPerformed

    private void btnPartidoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCONMEBOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoCONMEBOLActionPerformed

    private void btnSimularTodoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoCONMEBOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoCONMEBOLActionPerformed

    private void btnResultadoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoCONMEBOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoCONMEBOLActionPerformed

    private void btnPartidoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoOFCActionPerformed

    private void btnSimularTodoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoOFCActionPerformed

    private void btnResultadoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoOFCActionPerformed

    private void btnResultadoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoUEFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoUEFAActionPerformed

    private void btnPartidoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoUEFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoUEFAActionPerformed

    private void btnSimularTodoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoUEFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoUEFAActionPerformed

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
    private javax.swing.JButton btnPartidoAFC;
    private javax.swing.JButton btnPartidoCAF;
    private javax.swing.JButton btnPartidoCONMEBOL;
    private javax.swing.JButton btnPartidoConca;
    private javax.swing.JButton btnPartidoOFC;
    private javax.swing.JButton btnPartidoUEFA;
    private javax.swing.JButton btnResultadoAFC;
    private javax.swing.JButton btnResultadoCAF;
    private javax.swing.JButton btnResultadoCONMEBOL;
    private javax.swing.JButton btnResultadoConca;
    private javax.swing.JButton btnResultadoOFC;
    private javax.swing.JButton btnResultadoUEFA;
    private javax.swing.JButton btnSimularTodoAFC;
    private javax.swing.JButton btnSimularTodoCAF;
    private javax.swing.JButton btnSimularTodoCONMEBOL;
    private javax.swing.JButton btnSimularTodoConca;
    private javax.swing.JButton btnSimularTodoOFC;
    private javax.swing.JButton btnSimularTodoUEFA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane tblConfederaciones;
    private javax.swing.JTable tblPuntajeAFC;
    private javax.swing.JTable tblPuntajeCAF;
    private javax.swing.JTable tblPuntajeCONCACAF;
    private javax.swing.JTable tblPuntajeCONCACAF1;
    private javax.swing.JTable tblPuntajeCONMEBOL;
    private javax.swing.JTable tblPuntajeOFC;
    private javax.swing.JTable tblPuntajeUEFA;
    private javax.swing.JTextArea txtResultadoAFC;
    private javax.swing.JTextArea txtResultadoCAF;
    private javax.swing.JTextArea txtResultadoCONCACAF;
    private javax.swing.JTextArea txtResultadoCONMEBOL;
    private javax.swing.JTextArea txtResultadoOFC;
    private javax.swing.JTextArea txtResultadoUEFA;
    // End of variables declaration//GEN-END:variables
}
