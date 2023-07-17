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

    }//GEN-LAST:event_btnPartidoConcaActionPerformed

    private void btnSimularTodoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularTodoConcaActionPerformed

    }//GEN-LAST:event_btnSimularTodoConcaActionPerformed

    private void btnResultadoConcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoConcaActionPerformed

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
