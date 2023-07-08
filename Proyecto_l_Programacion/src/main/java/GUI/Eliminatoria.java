
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

    public Eliminatoria() {
        initComponents();
        cargaConca();
        cargarCONMEBOL();


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
