/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Gspr-bit
 */
public class jifWatchImage extends javax.swing.JInternalFrame {
    private Image icono;
    private String nombre;
    private int sizeH;
    private int sizeW;

    public Image getIcono() {
        return icono;
    }

    public void setIcono(Image icono) {
        this.icono = icono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSizeH() {
        return sizeH;
    }

    public void setSizeH(int sizeH) {
        this.sizeH = sizeH;
    }

    public int getSizeW() {
        return sizeW;
    }

    public void setSizeW(int sizeW) {
        this.sizeW = sizeW;
    }
    /**
     * Creates new form jifWatchImage
     * @param icono
     * @param nombre
     */
    public jifWatchImage(Image icono, String nombre) {
        this.icono = icono;
        this.nombre = nombre;
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        btnAcercar = new javax.swing.JButton();
        btnAlejar = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblFoto = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Open image");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Name");
        lblNombre.setToolTipText("");

        btnAcercar.setText("Zoom +");
        btnAcercar.setToolTipText("Acercar");
        btnAcercar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercarActionPerformed(evt);
            }
        });

        btnAlejar.setText("Zoom -");
        btnAlejar.setToolTipText("Alejar");
        btnAlejar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlejarActionPerformed(evt);
            }
        });

        btnDefault.setText("Resize");
        btnDefault.setToolTipText("Tamaño real");
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(btnDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlejar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcercar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblNombre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAcercar)
                    .addComponent(btnAlejar)
                    .addComponent(btnDefault))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFoto.setBackground(new java.awt.Color(0, 0, 0));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblFoto.setFocusable(false);
        jScrollPane1.setViewportView(lblFoto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcercarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercarActionPerformed
        // This method zooms in the current image
        setSizeH((int) (getSizeH() * 1.5));
        setSizeW((int) (getSizeW() * 1.5));

        ImageIcon foto = new ImageIcon(getIcono().getScaledInstance(getSizeW(), getSizeH(), Image.SCALE_SMOOTH));
        lblFoto.setIcon(foto);
    }//GEN-LAST:event_btnAcercarActionPerformed

    private void btnAlejarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlejarActionPerformed
        // This method zooms out the current image
        setSizeH((int) (getSizeH() / 1.5));
        setSizeW((int) (getSizeW() / 1.5));

        ImageIcon foto = new ImageIcon(getIcono().getScaledInstance(getSizeW(), getSizeH(), Image.SCALE_SMOOTH));
        lblFoto.setIcon(foto);
    }//GEN-LAST:event_btnAlejarActionPerformed

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
        // This method resizes the image to the original size
        ImageIcon foto = new ImageIcon(getIcono());
        lblFoto.setIcon(foto);
        setSizeH(foto.getIconHeight());
        setSizeW(foto.getIconWidth());
    }//GEN-LAST:event_btnDefaultActionPerformed

    /**
     * This method fills the label with an image and shows a title
     */
    private void myInitComponents() {
        ImageIcon foto = new ImageIcon(getIcono());
        lblFoto.setIcon(foto);
        lblNombre.setText(getNombre());
        
        setSizeH(foto.getIconHeight());
        setSizeW(foto.getIconWidth());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercar;
    private javax.swing.JButton btnAlejar;
    private javax.swing.JButton btnDefault;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
