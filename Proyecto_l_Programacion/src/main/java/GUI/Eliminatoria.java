package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
      private void cargarModeloAFC() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeAFC.setModel(modelo);
        modeloCargado = true;
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeAFC.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 8) ? new Color(0, 255, 0) : ((posicion == 9 || posicion == 10) ? new Color(240, 70, 70) : table.getBackground());
                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }

    //------------------------------------------Carga modelo CAF------------------------------------------------------------------------------------------
    private void cargarModeloCAF() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeCAF.setModel(modelo);
        modeloCargado = true;
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeCAF.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 9) ? new Color(0, 255, 0) : ((posicion == 10) ? new Color(240, 70, 70) : table.getBackground());
                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }

    //------------------------------------------Carga modelo CONMEBOL------------------------------------------------------------------------------------------
    private void cargarModeloCONMEBOL() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeCONMEBOL.setModel(modelo);
        modeloCargado = true;
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeCONMEBOL.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 6) ? new Color(0, 255, 0) : ((posicion == 7) ? new Color(240, 70, 70) : table.getBackground());
                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }

    //------------------------------------------Carga modelo OFC------------------------------------------------------------------------------------------
    private void cargarModeloOFC() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeOFC.setModel(modelo);
        modeloCargado = true;
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeOFC.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 1) ? new Color(0, 255, 0) : ((posicion == 2) ? new Color(240, 70, 70) : table.getBackground());
                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }

    //------------------------------------------Carga modelo UEFA------------------------------------------------------------------------------------------
    private void cargarModeloUEFA() {
        String[] columnas = {"Posición", "Bandera", "Selecciones", "PTS", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblPuntajeUEFA.setModel(modelo);
        modeloCargado = true;
        // Asignar el renderizador personalizado a todas las columnas
        tblPuntajeUEFA.setDefaultRenderer(Object.class, (table, value, isSelected, hasFocus, row, column) -> {
            Component cellComponent = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Verificar si el modelo ha sido cargado
            if (modeloCargado) {
                int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
                Color color = (posicion <= 16) ? new Color(0, 255, 0) : table.getBackground();

                cellComponent.setBackground(color);
            } else {
                cellComponent.setBackground(table.getBackground());
            }

            return cellComponent;
        });
    }
//------------------------------------------Espacios para cargar Selecciones------------------------------------------------------------------------------------------

    private void cargarSeleccionesConca() {
        String[] nombresSelecciones = {"Anguila", "Antigua y Barbuda", "Aruba", "Bahamas", "Barbados", "Belice", "Bermudas", "Canadá", "Costa Rica", "Cuba", "Curazao", "Dominica", "EEUU", "El Salvador", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Islas Caimán", "Islas Vírgenes Británicas", "Islas Vírgenes Estadounidenses", "Jamaica", "México", "Montserrat", "Nicaragua", "Panamá", "Puerto Rico", "República Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", "Trinidad y Tobago", "Turcas y Caicos"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeCONCACAF.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    private void cargarSeleccionesAFC() {
        String[] nombresSelecciones = {"Afganistán", "Arabia Saudí", "Australia", "Bahréin", "Bangladesh", "Brunéi Darussalam", "Bután ", "Camboya", "Chinese Taipei", "Emiratos Árabes Unidos", "Filipinas",
            "Guam", "Hong Kong China", "India ", "Indonesia", "Irak", "Japón", "Jordania", "Kuwait", "Laos", "Líbano", "Macao", "Malasia", "Maldivas", "Mongolia", "Myanmar", "Nepal", "Omán", "Pakistán",
            "Palestina", "Qatar", "RDP de Corea", "República de Corea", "República Kirguisa", "Rl de Irán", "RP China", "Singapur", "Siria", "Sri Lanka", "Tailandia", "Tayikistán", "Timor Oriental",
            "Turkmenistán", "Uzbekistán", "Vietnam", "Yemen"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeAFC.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    private void cargarSeleccionesCAF() {
        String[] nombresSelecciones = {"Angola", "Argelia", "Benín", "Botsuana", "Botsuana", "Burkina Faso", "Burundi", "Cabo Verde", "Camerún", "Chad", "Comoras", "Congo", "Costa de Marfil", "Egipto", "Eritrea",
            "Esuatini", "Etiopía", "Gabón", "Gambia", "Ghana", "Guinea", "Guinea Ecuatorial", "Guinea-Bissáu", "Kenia", "Lesoto", "Liberia", "Libia", "Madagascar", "Malaui", "Mali", "Marruecos", "Mauricio",
            "Mauritania", "Mozambique", "Namibia", "Níger", "Nigeria", "RD del Congo", "República Centroafricana", "Ruanda", "Santo Tomé y Príncipe", "Senegal", "Seychelles", "Sierra Leona", "Somalia",
            "Sudáfrica", "Sudán", "Sudán del Sur", "Tanzania", "Togo", "Túnez", "Uganda", "Yibuti", "Zambia"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeCAF.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    private void cargarSeleccionesCONMEBOL() {
        String[] nombresSelecciones = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeCONMEBOL.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    private void cargarSeleccionesOFC() {
        String[] nombresSelecciones = {"Fiyi", "Islas Cook", "Islas Salomón", "Nueva Caledonia", "Nueva Zelanda", "Papúa Nueva Guinea", "Samoa", "Samoa Americana", "Tahití", "Tonga", "Vanuatu", "islas Kiribati", "Tuvalu"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeCAF.getModel();

        for (String nombre : nombresSelecciones) {
            modelo.addRow(new Object[]{0, null, nombre, 0, 0, 0, 0, 0, 0, 0, 0});
        }
    }

    private void cargarSeleccionesUEFA() {
        String[] nombresSelecciones = {"Albania", "Alemania", "Andorra", "Armenia", "Austria", "Azerbaiyán", "Bélgica", "Bielorrusia", "Bosnia y Herzegovina", "Bulgaria", "Chipre", "Croacia", "Dinamarca",
            "Escocia" + "Eslovaqui", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Gales", "Georgia", "Gibraltar", "Hungría", "Inglaterra", "Irlanda", "Irlanda del Norte",
            "Islandia", "Islas Feroe", "Israel", "Italia", "Kazajistán", "Kosovo", "Letonia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Malta", "Moldavia", "Montenegro", "Noruega", "Paises Bajos",
            "Polonia", "Portugal", "Republica Checa", "Rumania", "Rusia", "San Marino", "Serbia", "Suecia", "Suiza", "Turquia", "Ucrania"};
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeUEFA.getModel();

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

    private void actualizarPuntosPartidosJugados(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            int partidosJugados = (int) modelo.getValueAt(i, 5) + (int) modelo.getValueAt(i, 6) + (int) modelo.getValueAt(i, 7);
            int puntos = 3 * (int) modelo.getValueAt(i, 6) + (int) modelo.getValueAt(i, 7);

            modelo.setValueAt(partidosJugados, i, 4);
            modelo.setValueAt(puntos, i, 3);
        }
    }

    //---------------------------------Metodo Actualizar Diferencia Goles------------------------------------------------------------------------------------------
    private void actualizarDiferenciaGoles(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            int golesFavor = (int) modelo.getValueAt(i, 8);
            int golesContra = (int) modelo.getValueAt(i, 9);
            int diferenciaGoles = golesFavor - golesContra;

            modelo.setValueAt(diferenciaGoles, i, 10);

            // Evitar valores negativos en la columna de diferencia de goles
            if (diferenciaGoles < 0) {
                modelo.setValueAt(0, i, 10); // Establecer la diferencia de goles como 0
                modelo.setValueAt(golesFavor, i, 8); // Actualizar los goles a favor
                modelo.setValueAt(golesContra, i, 9); // Actualizar los goles en contra
            }
        }
    }

    //---------------------------------Metodo Ordenar Posiciones------------------------------------------------------------------------------------------
    private void ordenarPosiciones(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        // Crear un comparador personalizado para ordenar las filas según el puntaje PTS en forma descendente
        Comparator<Object[]> comparador = (fila1, fila2) -> {
            int pts1 = (int) fila1[3];
            int pts2 = (int) fila2[3];
            return Integer.compare(pts2, pts1);
        };

        // Obtener la cantidad de filas del modelo
        int rowCount = modelo.getRowCount();

        // Ordenar las filas según el puntaje PTS en forma descendente
        List<Object[]> filas = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fila[j] = modelo.getValueAt(i, j);
            }
            filas.add(fila);
        }
        filas.sort(comparador);

        // Actualizar las posiciones en la tabla de posiciones
        for (int i = 0; i < filas.size(); i++) {
            Object[] fila = filas.get(i);
            fila[0] = i + 1; // Actualizar la posición
            modelo.removeRow(i);
            modelo.insertRow(i, fila);
        }
    }

    //--------------------------------------------Desactivar botones---------------------------------------------------
    private void desactivarBotones(JButton simularPartido, JButton botonPartido, JButton botonResultado) {
        btnSimularTodoConca.setEnabled(false);
        btnPartidoConca.setEnabled(false);
        btnResultadoConca.setEnabled(true);
    }

    //--------------------------------------------Cargar los metodos---------------------------------------------------
    //---------------------------------------------Concacaf-----------------------------------------------------------
    private void cargarConca() {
        cargarModeloConca();
        cargarSeleccionesConca();
        simularPartidos(tblPuntajeCONCACAF);
        actualizarPuntosPartidosJugados(tblPuntajeCONCACAF);
        actualizarDiferenciaGoles(tblPuntajeCONCACAF);
        ordenarPosiciones(tblPuntajeCONCACAF);
        desactivarBotones(btnSimularTodoConca, btnPartidoConca, btnResultadoConca);
    }

    //---------------------------------------------AFC-----------------------------------------------------------
    private void cargarAFC() {
        cargarModeloAFC();
        cargarSeleccionesAFC();
        simularPartidos(tblPuntajeAFC);
        actualizarPuntosPartidosJugados(tblPuntajeAFC);
        actualizarDiferenciaGoles(tblPuntajeAFC);
        ordenarPosiciones(tblPuntajeAFC);
        desactivarBotones(btnSimularTodoAFC, btnPartidoAFC, btnResultadoAFC);
    }

    //---------------------------------------------CAF-----------------------------------------------------------
    private void cargarCAF() {
        cargarModeloCAF();
        cargarSeleccionesCAF();
        simularPartidos(tblPuntajeCAF);
        actualizarPuntosPartidosJugados(tblPuntajeCAF);
        actualizarDiferenciaGoles(tblPuntajeCAF);
        ordenarPosiciones(tblPuntajeCAF);
        desactivarBotones(btnSimularTodoCAF, btnPartidoCAF, btnResultadoCAF);
    }
    //---------------------------------------------OFC-----------------------------------------------------------

    private void cargarOFC() {
        cargarModeloOFC();
        cargarSeleccionesOFC();
        simularPartidos(tblPuntajeOFC);
        actualizarPuntosPartidosJugados(tblPuntajeOFC);
        actualizarDiferenciaGoles(tblPuntajeOFC);
        ordenarPosiciones(tblPuntajeOFC);
        desactivarBotones(btnSimularTodoOFC, btnPartidoOFC, btnResultadoOFC);
    }

    //---------------------------------------------CONMEBOL-----------------------------------------------------------
    private void cargarCONMEBOL() {
        cargarModeloCONMEBOL();
        cargarSeleccionesCONMEBOL();
        simularPartidos(tblPuntajeCONMEBOL);
        actualizarPuntosPartidosJugados(tblPuntajeCONMEBOL);
        actualizarDiferenciaGoles(tblPuntajeCONMEBOL);
        ordenarPosiciones(tblPuntajeCONMEBOL);
        desactivarBotones(btnSimularTodoCONMEBOL, btnPartidoCONMEBOL, btnResultadoCONMEBOL);
    }

    //---------------------------------------------UEFA-----------------------------------------------------------
    private void cargarUEFA() {
        cargarModeloUEFA();
        cargarSeleccionesUEFA();
        simularPartidos(tblPuntajeUEFA);
        actualizarPuntosPartidosJugados(tblPuntajeUEFA);
        actualizarDiferenciaGoles(tblPuntajeUEFA);
        ordenarPosiciones(tblPuntajeUEFA);
        desactivarBotones(btnSimularTodoUEFA, btnPartidoUEFA, btnResultadoUEFA);
    }

//-----------------------------------------------Mensajes--------------------------------------------------------------
    private void mensajeTodo() {
        JOptionPane.showMessageDialog(this, "Se a jugado todos los partidos");
    }

    private void mensajeUno() {
        JOptionPane.showMessageDialog(this, "Se a jugado todos los partidos" + "\nPrecionar el boton (Ver resultados) para ver los encuentros.");
    }

//---------------------------------------------Eliminatoria---------------------------------------------------
    public Eliminatoria() {
        initComponents();
        //------------Cargar modelos-------------------------------------
        //----------Concacaf------------
        cargarModeloConca();
        cargarSeleccionesConca();
        //-----------AFC--------------
        cargarModeloAFC();
        cargarSeleccionesAFC();
        //-----------CAF--------------
        cargarModeloCAF();
        cargarSeleccionesCAF();
        //-----------OFC--------------
        cargarModeloOFC();
        cargarSeleccionesOFC();
        //-----------CONMEBOL---------
        cargarModeloCONMEBOL();
        cargarSeleccionesCONMEBOL();
        //-----------UEFA-------------
        cargarModeloUEFA();
        cargarSeleccionesUEFA();
    }
//-----------------------------------------SedeEncuentros----------------------------------------------------

    public class SedesEncuentros {

        private String identificador;
        private String paisSede;
        private String sede;
        private String[] paisesEncuentro;
        private String marcador;

        public SedesEncuentros(String identificador, String paisSede, String sede, String[] paisesEncuentro, String marcador) {
            this.identificador = identificador;
            this.paisSede = paisSede;
            this.sede = sede;
            this.paisesEncuentro = paisesEncuentro;
            this.marcador = marcador;
        }

        public String getIdentificador() {
            return identificador;
        }

        public void setIdentificador(String identificador) {
            this.identificador = identificador;
        }

        public String getPaisSede() {
            return paisSede;
        }

        public void setPaisSede(String paisSede) {
            this.paisSede = paisSede;
        }

        public String getSede() {
            return sede;
        }

        public void setSede(String sede) {
            this.sede = sede;
        }

        public String[] getPaisesEncuentro() {
            return paisesEncuentro;
        }

        public void setPaisesEncuentro(String[] paisesEncuentro) {
            this.paisesEncuentro = paisesEncuentro;
        }

        public String getMarcador() {
            return marcador;
        }

        public void setMarcador(String marcador) {
            this.marcador = marcador;
        }

        // Método para obtener dos equipos al azar de una confederación, EL ERROR ESTÁ EN OBTENER INFORMACION DE LA CLASE CONFEDERACION 
        private List<String> obtenerEquiposAlAzar(Confederacion confederacion, Random random) {
            String[] equiposArray = confederacion.getCONCACAF();
            List<String> equipos = new ArrayList<>(Arrays.asList(equiposArray));

            int numEquipos = equipos.size();

            // Obtener dos índices aleatorios distintos para los equipos
            int indexEquipo1 = random.nextInt(numEquipos);
            int indexEquipo2 = random.nextInt(numEquipos - 1);
            if (indexEquipo2 >= indexEquipo1) {
                indexEquipo2++; // Asegurar que el segundo índice sea distinto del primero
            }

            String equipo1 = equipos.get(indexEquipo1);
            String equipo2 = equipos.get(indexEquipo2);

            return Arrays.asList(equipo1, equipo2);
        }

        private static String generarPaisSede(Random random) {
            String[] paisesSede = {"Estados Unidos", "México", "Canadá"};
            int index = random.nextInt(paisesSede.length);
            return paisesSede[index];
        }

        private static String generarSede(Random random, String paisSede) {
            String sede;
            switch (paisSede) {
                case "Estados Unidos":
                    String[] sedesEstadosUnidos = {"Atlanta", "Boston", "Dallas", "Houston", "Kansas City", "Los Ángeles",
                        "Miami", "Nueva York/Nueva Jersey", "Filadelfia", "San Francisco", "Seattle"};
                    int indexUsa = random.nextInt(sedesEstadosUnidos.length);
                    sede = sedesEstadosUnidos[indexUsa];
                    break;
                case "México":
                    String[] sedesMexico = {"Guadalajara", "Ciudad de México", "Monterrey"};
                    int indexMexico = random.nextInt(sedesMexico.length);
                    sede = sedesMexico[indexMexico];
                    break;
                case "Canadá":
                    String[] sedesCanada = {"Toronto", "Vancouver"};
                    int indexCanada = random.nextInt(sedesCanada.length);
                    sede = sedesCanada[indexCanada];
                    break;
                default:
                    sede = "";
                    break;
            }
            return sede;
        }

        public SedesEncuentros generarSedeEncuentro(String identificador, String[] paisesEncuentro) {
            Random random = new Random();
            String paisSede = generarPaisSede(random);
            String sede = generarSede(random, paisSede);
            String marcador = " - ";

            return new SedesEncuentros(identificador, paisSede, sede, paisesEncuentro, marcador);
        }

        //METODO PARA GENERAR UN MARCADOR EN VER RESULTADOS
        private String generarMarcador(Random random) {
            int golesEquipoA = random.nextInt(11); // Generar un número aleatorio entre 0 y 10 para los goles del equipo A
            int golesEquipoB = random.nextInt(11); // Generar un número aleatorio entre 0 y 10 para los goles del equipo B

            return golesEquipoA + "-" + golesEquipoB; // Retornar el marcador en el formato "golesEquipoA-golesEquipoB"
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Identificador: ").append(identificador).append("\n");
            sb.append("País de la sede: ").append(paisSede).append("\n");
            sb.append("Sede: ").append(sede).append("\n");
            sb.append("Países del encuentro: ").append(String.join(" vs ", paisesEncuentro)).append("\n");
            sb.append("Marcador: ").append(marcador).append("\n");
            return sb.toString();
        }

        private String generarIdentificador() {

            String identificador = "ID-" + identificadorIterativo;
            identificadorIterativo++; // Incrementar el identificador iterativo
            return identificador;
        }

        // Método para obtener el resultado como String
        private void obtenerResultadoSedeEncuentro() {
            Random random = new Random();
            String[] equipos = obtenerEquiposAlAzar(confederacion, random).toArray(new String[0]);
            String paisSede = generarPaisSede(random);
            String sede = generarSede(random, paisSede);
            String marcador = generarMarcador(random);
            String identificador = generarIdentificador();

            SedesEncuentros sedeEncuentro = new SedesEncuentros(identificador, paisSede, sede, equipos, marcador);
            txtResultadoAFC.append(sedeEncuentro.toString() + "\n");
        }

        public void mostrarResultados() {
            for (int i = 0; i < 160; i++) {
                obtenerResultadoSedeEncuentro();
            }
        }
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
        jScrollPane16 = new javax.swing.JScrollPane();
        tblPuntajeAFC = new javax.swing.JTable();
        btnPartidoAFC = new javax.swing.JButton();
        btnSimularTodoAFC = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtResultadoAFC = new javax.swing.JTextArea();
        btnResultadoAFC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblPuntajeCAF = new javax.swing.JTable();
        btnPartidoCAF = new javax.swing.JButton();
        btnSimularTodoCAF = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtResultadoCAF = new javax.swing.JTextArea();
        btnResultadoCAF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPuntajeCONCACAF = new javax.swing.JTable();
        btnPartidoConca = new javax.swing.JButton();
        btnSimularTodoConca = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtResultadoCONCACAF = new javax.swing.JTextArea();
        btnResultadoConca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblPuntajeCONMEBOL = new javax.swing.JTable();
        btnPartidoCONMEBOL = new javax.swing.JButton();
        btnSimularTodoCONMEBOL = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtResultadoCONMEBOL = new javax.swing.JTextArea();
        btnResultadoCONMEBOL = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblPuntajeOFC = new javax.swing.JTable();
        btnPartidoOFC = new javax.swing.JButton();
        btnSimularTodoOFC = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtResultadoOFC = new javax.swing.JTextArea();
        btnResultadoOFC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnResultadoUEFA = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblPuntajeUEFA = new javax.swing.JTable();
        btnPartidoUEFA = new javax.swing.JButton();
        btnSimularTodoUEFA = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtResultadoUEFA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuntajeAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        tblPuntajeAFC.setOpaque(false);
        jScrollPane16.setViewportView(tblPuntajeAFC);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 440));

        btnPartidoAFC.setText("Simular partido");
        btnPartidoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartidoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        btnSimularTodoAFC.setText("Simular todos ");
        btnSimularTodoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularTodoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 112, -1));

        txtResultadoAFC.setColumns(20);
        txtResultadoAFC.setRows(5);
        jScrollPane17.setViewportView(txtResultadoAFC);

        jPanel1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 161, 440));

        btnResultadoAFC.setText("Ver resultados");
        btnResultadoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultadoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 111, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/AFC.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1500, 840));

        tblConfederaciones.addTab("AFC", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuntajeCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane18.setViewportView(tblPuntajeCAF);

        jPanel2.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, 710, 380));

        btnPartidoCAF.setText("Simular partido");
        btnPartidoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnPartidoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, 160, 70));

        btnSimularTodoCAF.setText("Simular todos ");
        btnSimularTodoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimularTodoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 160, 70));

        txtResultadoCAF.setColumns(20);
        txtResultadoCAF.setRows(5);
        jScrollPane19.setViewportView(txtResultadoCAF);

        jPanel2.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 380));

        btnResultadoCAF.setText("Ver resultados");
        btnResultadoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnResultadoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/CAF.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 840));

        tblConfederaciones.addTab("CAF", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuntajeCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane7.setViewportView(tblPuntajeCONCACAF);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 450));

        btnPartidoConca.setText("Simular partido");
        btnPartidoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnPartidoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 730, -1, -1));

        btnSimularTodoConca.setText("Simular todos ");
        btnSimularTodoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimularTodoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 771, 112, -1));

        txtResultadoCONCACAF.setColumns(20);
        txtResultadoCONCACAF.setRows(5);
        jScrollPane13.setViewportView(txtResultadoCONCACAF);

        jPanel3.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 440));

        btnResultadoConca.setText("Ver resultados");
        btnResultadoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnResultadoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 689, 111, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Concacaf.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1500, 850));

        tblConfederaciones.addTab("CONCACAF", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuntajeCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane20.setViewportView(tblPuntajeCONMEBOL);

        jPanel4.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, 740, 370));

        btnPartidoCONMEBOL.setText("Simular partido");
        btnPartidoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnPartidoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        btnSimularTodoCONMEBOL.setText("Simular todos ");
        btnSimularTodoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnSimularTodoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 112, -1));

        txtResultadoCONMEBOL.setColumns(20);
        txtResultadoCONMEBOL.setRows(5);
        jScrollPane21.setViewportView(txtResultadoCONMEBOL);

        jPanel4.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 360));

        btnResultadoCONMEBOL.setText("Ver resultados");
        btnResultadoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnResultadoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 111, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Conmebol.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1500, 840));

        tblConfederaciones.addTab("CONMEBOL", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPuntajeOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane22.setViewportView(tblPuntajeOFC);

        jPanel8.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, 630, 350));

        btnPartidoOFC.setText("Simular partido");
        btnPartidoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnPartidoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 730, -1, -1));

        btnSimularTodoOFC.setText("Simular todos ");
        btnSimularTodoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnSimularTodoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 771, 112, -1));

        txtResultadoOFC.setColumns(20);
        txtResultadoOFC.setRows(5);
        jScrollPane23.setViewportView(txtResultadoOFC);

        jPanel8.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 350));

        btnResultadoOFC.setText("Ver resultados");
        btnResultadoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnResultadoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 689, 111, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/OFC.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1500, 840));

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

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResultadoUEFA.setText("Ver resultados");
        btnResultadoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnResultadoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 111, -1));

        tblPuntajeUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane24.setViewportView(tblPuntajeUEFA);

        jPanel6.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 600, 480));

        btnPartidoUEFA.setText("Simular partido");
        btnPartidoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnPartidoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        btnSimularTodoUEFA.setText("Simular todos ");
        btnSimularTodoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnSimularTodoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 112, -1));

        txtResultadoUEFA.setColumns(20);
        txtResultadoUEFA.setRows(5);
        jScrollPane25.setViewportView(txtResultadoUEFA);

        jPanel6.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 161, 470));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/UEFA.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 840));

        tblConfederaciones.addTab("UEFA", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Mundial.jpg"))); // NOI18N
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 830));

        tblConfederaciones.addTab("PANTALLA PRINCIPAL", jPanel7);

        getContentPane().add(tblConfederaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 //---------------------------Concacaf------------------------------------------------------
    private void btnPartidoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoConcaActionPerformed
        cargarConca();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoConcaActionPerformed

    private void btnSimularTodoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoConcaActionPerformed
        cargarConca();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoConcaActionPerformed

    private void btnResultadoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoConcaActionPerformed

    }//GEN-LAST:event_btnResultadoConcaActionPerformed
//---------------------------AFC------------------------------------------------------
    private void btnPartidoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoAFCActionPerformed

    private void btnSimularTodoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoAFCActionPerformed

    private void btnResultadoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoAFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoAFCActionPerformed
//---------------------------CAF------------------------------------------------------
    private void btnPartidoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCAFActionPerformed
        cargarCAF();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoCAFActionPerformed

    private void btnSimularTodoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoCAFActionPerformed
        cargarCAF();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoCAFActionPerformed

    private void btnResultadoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoCAFActionPerformed
//---------------------------CONMEBOL------------------------------------------------------
    private void btnPartidoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCONMEBOLActionPerformed
        cargarCONMEBOL();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoCONMEBOLActionPerformed

    private void btnSimularTodoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoCONMEBOLActionPerformed
        cargarCONMEBOL();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoCONMEBOLActionPerformed

    private void btnResultadoCONMEBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoCONMEBOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoCONMEBOLActionPerformed
//---------------------------OFC------------------------------------------------------
    private void btnPartidoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoOFCActionPerformed

    private void btnSimularTodoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimularTodoOFCActionPerformed

    private void btnResultadoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoOFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoOFCActionPerformed
//---------------------------UEFA------------------------------------------------------
    private void btnResultadoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoUEFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoUEFAActionPerformed

    private void btnPartidoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoUEFAActionPerformed
        cargarUEFA();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoUEFAActionPerformed

    private void btnSimularTodoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoUEFAActionPerformed
        cargarUEFA();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoUEFAActionPerformed

    /**
     * @param args the command line arguments
     */

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane tblConfederaciones;
    private javax.swing.JTable tblPuntajeAFC;
    private javax.swing.JTable tblPuntajeCAF;
    private javax.swing.JTable tblPuntajeCONCACAF;
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
