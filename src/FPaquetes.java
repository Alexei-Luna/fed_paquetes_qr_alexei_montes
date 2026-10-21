
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class FPaquetes extends javax.swing.JFrame {

    Webcam webcam;// Obtiene las imagenes de la camara
    WebcamPanel panelWC;// Muestra las imagenes de la camara
    //----------
    Queue<Paquete> preparando = new LinkedList();
    Queue<Paquete> enviando = new LinkedList();
    Queue<Paquete> entregados = new LinkedList();
    
    Paquete paq;

    public FPaquetes() {
        initComponents();
        inicializar();
        clock.start();

    }

    private void inicializar() {
        webcam = Webcam.getWebcams().get(0);//se conecta a la camara por defecto
        webcam.setViewSize(new Dimension(640, 480));//define la resolución de la camara
        panelWC = new WebcamPanel(webcam);//indica que la camara se va desplegar en este panel
        pCamara.add(panelWC); //Agrega el panel de la cámara al panel del dialogo

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LCodigo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BEscanear = new javax.swing.JButton();
        pCamara = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BEnviar = new javax.swing.JButton();
        BEntregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPreparando = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TEnviados = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TEntregados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LCodigo.setBackground(new java.awt.Color(204, 204, 255));
        LCodigo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        LCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO LEIDO:"));
        LCodigo.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema Paquetería");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        BEscanear.setText("ESCANEAR");
        BEscanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEscanearActionPerformed(evt);
            }
        });

        pCamara.setBackground(new java.awt.Color(0, 102, 153));
        pCamara.setMaximumSize(new java.awt.Dimension(480, 320));
        pCamara.setMinimumSize(new java.awt.Dimension(480, 320));
        pCamara.setPreferredSize(new java.awt.Dimension(480, 320));
        pCamara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCamaraMousePressed(evt);
            }
        });
        pCamara.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        BEnviar.setText("ENVIAR");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });
        jPanel4.add(BEnviar);

        BEntregar.setText("ENTREGAR");
        BEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntregarActionPerformed(evt);
            }
        });
        jPanel4.add(BEntregar);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PAQUETES EN PREPARACIÓN:"));

        TPreparando.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "REMITENTE", "DESTINATARIO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TPreparando);
        if (TPreparando.getColumnModel().getColumnCount() > 0) {
            TPreparando.getColumnModel().getColumn(0).setResizable(false);
            TPreparando.getColumnModel().getColumn(1).setResizable(false);
            TPreparando.getColumnModel().getColumn(2).setResizable(false);
            TPreparando.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("PAQUETES ENVIADOS:"));

        TEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "REMITENTE", "DESTINATARIO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TEnviados);
        if (TEnviados.getColumnModel().getColumnCount() > 0) {
            TEnviados.getColumnModel().getColumn(0).setResizable(false);
            TEnviados.getColumnModel().getColumn(1).setResizable(false);
            TEnviados.getColumnModel().getColumn(2).setResizable(false);
            TEnviados.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("PAQUETES ENTREGADOS:"));

        TEntregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "REMITENTE", "DESTINATARIO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TEntregados);
        if (TEntregados.getColumnModel().getColumnCount() > 0) {
            TEntregados.getColumnModel().getColumn(0).setResizable(false);
            TEntregados.getColumnModel().getColumn(1).setResizable(false);
            TEntregados.getColumnModel().getColumn(2).setResizable(false);
            TEntregados.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEscanear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BEscanear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void pCamaraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamaraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCamaraMousePressed

    private void BEscanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEscanearActionPerformed
        preparando.add(paq);
        verQueue(preparando, TPreparando);
        LCodigo.setText("");
    }//GEN-LAST:event_BEscanearActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        if (preparando.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay paquetes en preparación");
            return;
        }
        Paquete paq = preparando.poll();
        enviando.add(paq);

        verQueue(enviando, TEnviados);
        verQueue(preparando, TPreparando);
    }//GEN-LAST:event_BEnviarActionPerformed

    private void BEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntregarActionPerformed
        if (enviando.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay paquetes para entregar");
            return;
        }
        Paquete pak = enviando.poll();
        entregados.add(pak);
        
        verQueue(enviando, TEnviados);
        verQueue(entregados, TEntregados);
    }//GEN-LAST:event_BEntregarActionPerformed

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
            java.util.logging.Logger.getLogger(FPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPaquetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntregar;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BEscanear;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JTable TEntregados;
    private javax.swing.JTable TEnviados;
    private javax.swing.JTable TPreparando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pCamara;
    // End of variables declaration//GEN-END:variables

    Timer clock = new Timer(250, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Image imagen = webcam.getImage();//imagen de la camara
            try {

                BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                        new BufferedImageLuminanceSource((BufferedImage) imagen)));//convertir la imagen de la camara a otro formato

                Result qrCodigo = new MultiFormatReader().decode(binaryBitmap);//Pasar la imagen al decodificador para obtener el codigo
                String codigoLeido = qrCodigo.getText();
                empaquetar(codigoLeido);

            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

    });

    //----------------------
    public void empaquetar(String datos) {
        String[] info = datos.split(",");
        paq = new Paquete(
                info[0],
                info[1],
                info[2],
                info[3]
        );
        LCodigo.setText(paq.toString());
    }

    private void verQueue(Queue<Paquete> cola, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        for (Paquete paq : cola) {
            modelo.addRow(paq.toArray());
        }

    }
}
