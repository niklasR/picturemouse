/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import javax.swing.JOptionPane;
import picturemouse.backend.BEDatabase;
import picturemouse.backend.BEModifyFilmDetails;
/**
 *
 * @author John
 */
public class FEModifyFilm extends javax.swing.JFrame {

    BEModifyFilmDetails action = new BEModifyFilmDetails();
    BEDatabase d1 = BEDatabase.getInstance();
    String filmName;
    String filmSynopsis;
    int filmId;
    String trailerURL;
    
    @SuppressWarnings("empty-statement")
    public FEModifyFilm() {
        initComponents();
        this.filmId = FEBrowseFilms.selectedFilmID;
        this.filmName = FEBrowseFilms.selectedFilmName;
        this.filmSynopsis = FEBrowseFilms.selectedFilmSynopsis;
        this.trailerURL = FEBrowseFilms.selectedFilmTrailerURL;
        //Debug code
        System.out.println("Name:" + this.filmName);
        System.out.println("Synopsis:" + this.filmSynopsis);
        System.out.println("TrailerURl:" + this.trailerURL);
        
        this.tbxModifyFilmName.setText(this.filmName);
        this.tbxModifySynopsis.setText(this.filmSynopsis);
        this.tbxModifyTrailerURL.setText(this.trailerURL);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblModifyFilm = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        lblModifyFilmName = new javax.swing.JLabel();
        lblModifySynopsis = new javax.swing.JLabel();
        lblModifyTrailerURL = new javax.swing.JLabel();
        tbxModifyFilmName = new javax.swing.JTextField();
        tbxModifyTrailerURL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbxModifySynopsis = new javax.swing.JTextArea();
        btnBrowseScreenings = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        btnSaveModifications = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRemoveFilm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N
        topPanel.setPreferredSize(new java.awt.Dimension(430, 80));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello Administrator!");
        lblWelcome.setAlignmentX(0.5F);

        lblModifyFilm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifyFilm.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyFilm.setText("You are editing film with name <<filmName>>.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblWelcome))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblModifyFilm)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(lblModifyFilm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(430, 300));

        lblModifyFilmName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifyFilmName.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyFilmName.setText("Name:");

        lblModifySynopsis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifySynopsis.setForeground(new java.awt.Color(255, 255, 255));
        lblModifySynopsis.setText("Synopsis:");

        lblModifyTrailerURL.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifyTrailerURL.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyTrailerURL.setText("Trailer URL:");

        tbxModifyFilmName.setText("Currently held data for all.");

        tbxModifySynopsis.setColumns(20);
        tbxModifySynopsis.setRows(5);
        jScrollPane1.setViewportView(tbxModifySynopsis);

        btnBrowseScreenings.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowseScreenings.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBrowseScreenings.setText("Browse Screenings");
        btnBrowseScreenings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseScreeningsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centrePanelLayout.createSequentialGroup()
                        .addComponent(lblModifyFilmName)
                        .addGap(63, 63, 63)
                        .addComponent(tbxModifyFilmName, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(centrePanelLayout.createSequentialGroup()
                        .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModifySynopsis)
                            .addComponent(lblModifyTrailerURL))
                        .addGap(34, 34, 34)
                        .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbxModifyTrailerURL, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(centrePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnBrowseScreenings, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModifyFilmName)
                    .addComponent(tbxModifyFilmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centrePanelLayout.createSequentialGroup()
                        .addComponent(lblModifySynopsis)
                        .addGap(152, 152, 152))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxModifyTrailerURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModifyTrailerURL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnBrowseScreenings, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(430, 120));

        btnSaveModifications.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveModifications.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSaveModifications.setText("Save Modifications");
        btnSaveModifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveModificationsActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRemoveFilm.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveFilm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRemoveFilm.setText("Remove Film");
        btnRemoveFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSaveModifications, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnRemoveFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnRemoveFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveModifications, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveModificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveModificationsActionPerformed
        // TODO add your handling code here:
        this.filmName = this.tbxModifyFilmName.getText();
        this.filmSynopsis = this.tbxModifySynopsis.getText();
        this.trailerURL = this.tbxModifyTrailerURL.getText();
        // Modify fields of old film in database as defined by user but keep 
        // filmId the same.
        action.doIt(this.filmId, this.filmName, this.trailerURL, this.filmSynopsis, null);
        // Show confirmation to Administrator
        JOptionPane.showMessageDialog(this, "Film has been permanently modified.");
        // Hide windows and go back to BrowseFilms.
        this.setVisible(false);
        new FEBrowseFilms(true).setVisible(true);
    }//GEN-LAST:event_btnSaveModificationsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.out.println("Cancel modifications of Film");
        int result = JOptionPane.showConfirmDialog(this, " All changes to the "
                + "screening will be lost, are you sure that you want to "
                + "cancel?", "Cancel modification of film Confirmation", 
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            new FEBrowseFilms(true).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBrowseScreeningsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseScreeningsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FEBrowseScreenings().setVisible(true);
    }//GEN-LAST:event_btnBrowseScreeningsActionPerformed

    private void btnRemoveFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFilmActionPerformed
        // TODO add your handling code here:
        System.out.println("Removing Film");
        int result = JOptionPane.showConfirmDialog(this, "Are you sure that "
                + "you want to remove the film selected?", "Remove Film Confirmation", 
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            if (d1.lookupFilm(this.filmId, true) == null)
            {
                JOptionPane.showMessageDialog(this, "There was a problem and the film has not been deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "The film has been successfully deleted.");
            }
            new FEBrowseFilms(true).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRemoveFilmActionPerformed

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
            java.util.logging.Logger.getLogger(FEModifyFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEModifyFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEModifyFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEModifyFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // For testing purposes.
                new FEModifyFilm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBrowseScreenings;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemoveFilm;
    private javax.swing.JButton btnSaveModifications;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModifyFilm;
    private javax.swing.JLabel lblModifyFilmName;
    private javax.swing.JLabel lblModifySynopsis;
    private javax.swing.JLabel lblModifyTrailerURL;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField tbxModifyFilmName;
    private javax.swing.JTextArea tbxModifySynopsis;
    private javax.swing.JTextField tbxModifyTrailerURL;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
