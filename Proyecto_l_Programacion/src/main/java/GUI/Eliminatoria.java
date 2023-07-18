package GUI;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
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
            Color color;
            if (posicion <= 3) {
                color = new Color(212, 237, 218); // Verde suave para las primeras 3 posiciones
            } else if (posicion <= 5) {
                color = new Color(255, 241, 171); // Amarillo suave para las posiciones 4 y 5
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
            Color color;
            if (posicion <= 8) {
                color = new Color(212, 237, 218); // Verde suave hasta la posición 8
            } else if (posicion <= 10) {
                color = new Color(255, 241, 171); // Amarillo suave para las posiciones 9 y 10
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
            Color color;
            if (posicion <= 9) {
                color = new Color(212, 237, 218); // Verde suave hasta la posición 8
            } else if (posicion == 10) {
                color = new Color(255, 241, 171); // Amarillo suave para las posiciones 9 y 10
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
           // Verificar si el modelo ha sido cargado
        if (modeloCargado) {
            int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
            Color color;
            if (posicion <= 6) {
                color = new Color(212, 237, 218); // Verde suave hasta la posición 8
            } else if (posicion == 7) {
                color = new Color(255, 241, 171); // Amarillo suave para las posiciones 9 y 10
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
            // Verificar si el modelo ha sido cargado
        if (modeloCargado) {
            int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
            Color color;
            if (posicion <= 1) {
                color = new Color(212, 237, 218); // Verde suave hasta la posición 8
            } else if (posicion == 2) {
                color = new Color(255, 241, 171); // Amarillo suave para las posiciones 9 y 10
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
         // Verificar si el modelo ha sido cargado
        if (modeloCargado) {
            int posicion = Integer.parseInt(table.getValueAt(row, 0).toString());
            Color color;
            if (posicion <= 16) {
                color = new Color(212, 237, 218); // Verde suave hasta la posición 8
            } else {
                color = new Color(255, 195, 195); // Rojo suave para el resto de las posiciones
            }
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
        DefaultTableModel modelo = (DefaultTableModel) tblPuntajeOFC.getModel();

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
        simularPartido.setEnabled(false);
        botonPartido.setEnabled(false);
        botonResultado.setEnabled(true);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lblFondoAFC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblPuntajeCAF = new javax.swing.JTable();
        btnPartidoCAF = new javax.swing.JButton();
        btnSimularTodoCAF = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtResultadoCAF = new javax.swing.JTextArea();
        btnResultadoCAF = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        lblFondoCAF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPuntajeCONCACAF = new javax.swing.JTable();
        btnPartidoConca = new javax.swing.JButton();
        btnSimularTodoConca = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtResultadoCONCACAF = new javax.swing.JTextArea();
        btnResultadoConca = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        lblFondoCONCACAF = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblPuntajeCONMEBOL = new javax.swing.JTable();
        btnPartidoCONMEBOL = new javax.swing.JButton();
        btnSimularTodoCONMEBOL = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtResultadoCONMEBOL = new javax.swing.JTextArea();
        btnResultadoCONMEBOL = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        lblFondoCONMEBOL = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblPuntajeOFC = new javax.swing.JTable();
        btnPartidoOFC = new javax.swing.JButton();
        btnSimularTodoOFC = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtResultadoOFC = new javax.swing.JTextArea();
        btnResultadoOFC = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        lblFondoOFC = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnResultadoUEFA = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblPuntajeUEFA = new javax.swing.JTable();
        btnPartidoUEFA = new javax.swing.JButton();
        btnSimularTodoUEFA = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtResultadoUEFA = new javax.swing.JTextArea();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        lblFondoUEFA = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblFondoPP = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 830, 440));

        btnPartidoAFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoAFC.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartidoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 150, 80));

        btnSimularTodoAFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoAFC.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimularTodoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, 80));

        txtResultadoAFC.setColumns(20);
        txtResultadoAFC.setRows(5);
        jScrollPane17.setViewportView(txtResultadoAFC);

        jPanel1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 440));

        btnResultadoAFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoAFC.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoAFCActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultadoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 80));

        jTextField1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Ver Resultados");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 150, 30));

        jTextField2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Simular Todos");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 140, 30));

        jTextField3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("Simular Partido");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 150, 30));

        lblFondoAFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\AFC.jpg")); // NOI18N
        jPanel1.add(lblFondoAFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1510, 820));

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

        jPanel2.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 840, 380));

        btnPartidoCAF.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoCAF.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoCAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnPartidoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 150, 80));

        btnSimularTodoCAF.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoCAF.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoCAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimularTodoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 160, 80));

        txtResultadoCAF.setColumns(20);
        txtResultadoCAF.setRows(5);
        jScrollPane19.setViewportView(txtResultadoCAF);

        jPanel2.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 290, 390));

        btnResultadoCAF.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoCAF.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoCAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCAFActionPerformed(evt);
            }
        });
        jPanel2.add(btnResultadoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 650, 150, 80));

        jTextField4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setText("Simular Partido");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 740, 150, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("Simular Todos");
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 730, 140, 30));

        jTextField6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setText("Ver Resultados");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 730, 150, -1));

        lblFondoCAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\CAF.png")); // NOI18N
        lblFondoCAF.setText("jLabel1");
        jPanel2.add(lblFondoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1510, 840));

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

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 700, 450));

        btnPartidoConca.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoConca.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoConca.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnPartidoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 150, 80));

        btnSimularTodoConca.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoConca.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoConca.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimularTodoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 160, 80));

        txtResultadoCONCACAF.setColumns(20);
        txtResultadoCONCACAF.setRows(5);
        jScrollPane13.setViewportView(txtResultadoCONCACAF);

        jPanel3.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1241, 0, 240, 410));

        btnResultadoConca.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoConca.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoConca.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoConca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoConcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnResultadoConca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 530, 150, 80));

        jTextField7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setText("Simular Partido");
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 150, -1));

        jTextField8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setText("Simular Todos");
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 140, -1));

        jTextField9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setText("Ver Resultados");
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 610, 150, -1));

        lblFondoCONCACAF.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\Concacaf.jpg")); // NOI18N
        jPanel3.add(lblFondoCONCACAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 820));

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

        jPanel4.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 720, 200));

        btnPartidoCONMEBOL.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoCONMEBOL.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoCONMEBOL.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnPartidoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 150, 70));

        btnSimularTodoCONMEBOL.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoCONMEBOL.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoCONMEBOL.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnSimularTodoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 160, 70));

        txtResultadoCONMEBOL.setColumns(20);
        txtResultadoCONMEBOL.setRows(5);
        jScrollPane21.setViewportView(txtResultadoCONMEBOL);

        jPanel4.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 240, 360));

        btnResultadoCONMEBOL.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoCONMEBOL.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoCONMEBOL.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoCONMEBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoCONMEBOLActionPerformed(evt);
            }
        });
        jPanel4.add(btnResultadoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 430, 160, 70));

        jTextField10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setText("Simular Partido");
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 150, -1));

        jTextField11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 0));
        jTextField11.setText("Simular Todos");
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 140, -1));

        jTextField12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));
        jTextField12.setText("Ver Resultados");
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, 140, -1));

        lblFondoCONMEBOL.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\Conmebol.jpg")); // NOI18N
        jPanel4.add(lblFondoCONMEBOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 820));

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

        jPanel8.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 630, 340));

        btnPartidoOFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoOFC.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnPartidoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 150, 70));

        btnSimularTodoOFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoOFC.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnSimularTodoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 160, 70));

        txtResultadoOFC.setColumns(20);
        txtResultadoOFC.setRows(5);
        jScrollPane23.setViewportView(txtResultadoOFC);

        jPanel8.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 340));

        btnResultadoOFC.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoOFC.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoOFC.setOpaque(true);
        btnResultadoOFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoOFCActionPerformed(evt);
            }
        });
        jPanel8.add(btnResultadoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 150, 80));

        jTextField13.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 0));
        jTextField13.setText("Ver Resultados");
        jPanel8.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 150, -1));

        jTextField14.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));
        jTextField14.setText("Simular Todos");
        jPanel8.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 140, -1));

        jTextField15.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(0, 0, 0));
        jTextField15.setText("Simular Partido");
        jPanel8.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 150, -1));

        lblFondoOFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\OFC.jpg")); // NOI18N
        jPanel8.add(lblFondoOFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 830));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblConfederaciones.addTab("OFC", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResultadoUEFA.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnResultadoUEFA.setForeground(new java.awt.Color(0, 0, 0));
        btnResultadoUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnResultadoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnResultadoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 150, 80));

        tblPuntajeUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Banderas", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane24.setViewportView(tblPuntajeUEFA);

        jPanel6.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 650, 390));

        btnPartidoUEFA.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnPartidoUEFA.setForeground(new java.awt.Color(0, 0, 0));
        btnPartidoUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnPartidoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnPartidoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 150, 80));

        btnSimularTodoUEFA.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnSimularTodoUEFA.setForeground(new java.awt.Color(0, 0, 0));
        btnSimularTodoUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\TodosLosBotones.jpg")); // NOI18N
        btnSimularTodoUEFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularTodoUEFAActionPerformed(evt);
            }
        });
        jPanel6.add(btnSimularTodoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 150, 80));

        txtResultadoUEFA.setColumns(20);
        txtResultadoUEFA.setRows(5);
        jScrollPane25.setViewportView(txtResultadoUEFA);

        jPanel6.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 380));

        jTextField16.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(0, 0, 0));
        jTextField16.setText("Ver Resultados");
        jPanel6.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jTextField17.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setText("Simular Todos");
        jPanel6.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 150, -1));

        jTextField18.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(0, 0, 0));
        jTextField18.setText("Simular Partido");
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 150, -1));

        lblFondoUEFA.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblFondoUEFA.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\UEFA.jpg")); // NOI18N
        jPanel6.add(lblFondoUEFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1520, 840));

        tblConfederaciones.addTab("UEFA", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFondoPP.setIcon(new javax.swing.ImageIcon("C:\\Users\\jefry\\OneDrive\\Desktop\\UTN\\2º Cuatrimestre\\Programacion I\\Proyectos\\Programing_Proyect_l\\Proyecto_l_Programacion\\Fondos\\Mundial2.jpg")); // NOI18N
        jPanel7.add(lblFondoPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1570, 840));

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
 String paises[] = {"Costa Rica", "Nicaragua", "Honduras", "Panamá", "El Salvador", "Jamaica", "Trinidad y Tobago", "Guatemala"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

    }//GEN-LAST:event_btnResultadoConcaActionPerformed
//---------------------------AFC------------------------------------------------------
    private void btnPartidoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoAFCActionPerformed
        cargarAFC();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoAFCActionPerformed

    private void btnSimularTodoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoAFCActionPerformed
        cargarAFC();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoAFCActionPerformed

    private void btnResultadoAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoAFCActionPerformed
         String paises[] = {"Afganistán", "Arabia Saudí", "Australia", "Bahréin", "Bangladesh", "Brunéi Darussalam", "Bután ", "Camboya", "Chinese Taipei", "Emiratos Árabes Unidos", "Filipinas",
            "Guam", "Hong Kong China", "India ", "Indonesia", "Irak", "Japón", "Jordania", "Kuwait", "Laos", "Líbano", "Macao", "Malasia", "Maldivas", "Mongolia", "Myanmar", "Nepal", "Omán", "Pakistán",
            "Palestina", "Qatar", "RDP de Corea", "República de Corea", "República Kirguisa", "Rl de Irán", "RP China", "Singapur", "Siria", "Sri Lanka", "Tailandia", "Tayikistán", "Timor Oriental",
            "Turkmenistán", "Uzbekistán", "Vietnam", "Yemen"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

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
          String paises[] = {"Angola", "Argelia", "Benín", "Botsuana", "Botsuana", "Burkina Faso", "Burundi", "Cabo Verde", "Camerún", "Chad", "Comoras", "Congo", "Costa de Marfil", "Egipto", "Eritrea",
            "Esuatini", "Etiopía", "Gabón", "Gambia", "Ghana", "Guinea", "Guinea Ecuatorial", "Guinea-Bissáu", "Kenia", "Lesoto", "Liberia", "Libia", "Madagascar", "Malaui", "Mali", "Marruecos", "Mauricio",
            "Mauritania", "Mozambique", "Namibia", "Níger", "Nigeria", "RD del Congo", "República Centroafricana", "Ruanda", "Santo Tomé y Príncipe", "Senegal", "Seychelles", "Sierra Leona", "Somalia",
            "Sudáfrica", "Sudán", "Sudán del Sur", "Tanzania", "Togo", "Túnez", "Uganda", "Yibuti", "Zambia"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

    
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
         String paises[] = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

    }//GEN-LAST:event_btnResultadoCONMEBOLActionPerformed
//---------------------------OFC------------------------------------------------------
    private void btnPartidoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoOFCActionPerformed
        cargarOFC();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoOFCActionPerformed

    private void btnSimularTodoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoOFCActionPerformed
       cargarOFC();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoOFCActionPerformed

    private void btnResultadoOFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoOFCActionPerformed
         String paises[] = {"Fiyi", "Islas Cook", "Islas Salomón", "Nueva Caledonia", "Nueva Zelanda", "Papúa Nueva Guinea", "Samoa", "Samoa Americana", "Tahití", "Tonga", "Vanuatu", "islas Kiribati", "Tuvalu"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "Estados Unidos", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

    }//GEN-LAST:event_btnResultadoOFCActionPerformed
//---------------------------UEFA------------------------------------------------------
    private void btnResultadoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoUEFAActionPerformed
          String paises[] = {"Albania", "Alemania", "Andorra", "Armenia", "Austria", "Azerbaiyán", "Bélgica", "Bielorrusia", "Bosnia y Herzegovina", "Bulgaria", "Chipre", "Croacia", "Dinamarca",
            "Escocia" + "Eslovaqui", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Gales", "Georgia", "Gibraltar", "Hungría", "Inglaterra", "Irlanda", "Irlanda del Norte",
            "Islandia", "Islas Feroe", "Israel", "Italia", "Kazajistán", "Kosovo", "Letonia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Malta", "Moldavia", "Montenegro", "Noruega", "Paises Bajos",
            "Polonia", "Portugal", "Republica Checa", "Rumania", "Rusia", "San Marino", "Serbia", "Suecia", "Suiza", "Turquia", "Ucrania"};
        // Crear instancia de SedesEncuentros
        SedesEncuentros sedeEncuentro = new SedesEncuentros("1", "México", "Boston", paises, "2-4");

// Obtener el resultado
       sedeEncuentro.mostrarResultados();

    }//GEN-LAST:event_btnResultadoUEFAActionPerformed

    private void btnPartidoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoUEFAActionPerformed
        cargarUEFA();
        mensajeUno();
    }//GEN-LAST:event_btnPartidoUEFAActionPerformed

    private void btnSimularTodoUEFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoUEFAActionPerformed
        cargarUEFA();
        mensajeTodo();
    }//GEN-LAST:event_btnSimularTodoUEFAActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblFondoAFC;
    private javax.swing.JLabel lblFondoCAF;
    private javax.swing.JLabel lblFondoCONCACAF;
    private javax.swing.JLabel lblFondoCONMEBOL;
    private javax.swing.JLabel lblFondoOFC;
    private javax.swing.JLabel lblFondoPP;
    private javax.swing.JLabel lblFondoUEFA;
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
