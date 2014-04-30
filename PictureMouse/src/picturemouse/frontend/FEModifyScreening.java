/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;
import picturemouse.backend.BEDatabase;
import picturemouse.backend.BEFilm;
import picturemouse.backend.BEModifyFilmDetails;

/**
 *
 * @author John
 */
public class FEModifyScreening extends javax.swing.JFrame {

    BEModifyFilmDetails action = new BEModifyFilmDetails();
    BEDatabase d1 = BEDatabase.getInstance();
    Time screeningTime;
    int screeningHour;
    int screeningMin;
    int screeningSec;
    Date screeningDate;
    int screeningYear;
    int screeningMonth;
    int screeningDay;
    /**
     * Creates new form SignOn
     */
    public FEModifyScreening() {
        initComponents();
        this.screeningTime = FEBrowseScreenings.selectedTime;
        screeningHour = this.screeningTime.getHours();
        screeningMin = this.screeningTime.getMinutes();
        screeningSec = this.screeningTime.getSeconds();
        this.screeningDate = FEBrowseScreenings.selectedDate;
        //Debug code
        System.out.println("Time Hour:" + this.screeningHour);
        System.out.println("Time Min:" + this.screeningMin);
        System.out.println("Time Sec:" + this.screeningSec);
        
        this.tbxDate.setText(this.screeningYear + "/" + this.screeningMonth + "/" + this.screeningDay);
        this.tbxHour.setText(Integer.toString(this.screeningHour));
        this.tbxMinute.setText(Integer.toString(this.screeningMin));
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
        lblModifyAccount = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        tbxDate = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        tbxHour = new javax.swing.JTextField();
        tbxMinute = new javax.swing.JTextField();
        lblDivision = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btnSaveModifications = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRemoveScreening = new javax.swing.JButton();

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

        lblModifyAccount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblModifyAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblModifyAccount.setText("You are editing a screening for <<Filmname>>.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lblWelcome)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModifyAccount)
                .addGap(82, 82, 82))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModifyAccount)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(430, 100));

        lblDate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");

        lblTime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time:");

        tbxDate.setText("Currently held data for all.");

        lblMin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("MM");

        lblHour.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHour.setForeground(new java.awt.Color(255, 255, 255));
        lblHour.setText("HH");

        lblDivision.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDivision.setForeground(new java.awt.Color(255, 255, 255));
        lblDivision.setText(":");

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTime)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(centrePanelLayout.createSequentialGroup()
                        .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHour))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDivision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMin)
                            .addComponent(tbxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(tbxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(tbxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin)
                    .addComponent(lblHour))
                .addContainerGap(13, Short.MAX_VALUE))
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

        btnRemoveScreening.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveScreening.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRemoveScreening.setText("Remove Screening");
        btnRemoveScreening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveScreeningActionPerformed(evt);
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
                .addGap(122, 122, 122)
                .addComponent(btnRemoveScreening, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnRemoveScreening, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.screeningHour = Integer.valueOf(this.tbxHour.getText());
        this.screeningMin = Integer.valueOf(this.tbxMinute.getText());
        this.screeningTime = new Time(this.screeningHour, this.screeningMin, this.screeningSec);
        
        this.screeningDay = Integer.valueOf(this.tbxDate.getText().split("/")[0]);
        this.screeningMonth = Integer.valueOf(this.tbxDate.getText().split("/")[1]);
        this.screeningYear = Integer.valueOf(this.tbxDate.getText().split("/")[2]);
        this.screeningDate = new Date(this.screeningYear, this.screeningMonth, this.screeningDay);
        
        // Modify fields of old screening in database as defined by user but 
        // keep screeningId the same. This is done by pulling out the current 
        // by looking it up, adapting it and pushing it back.
        
        action.modifyScreening(FEBrowseFilms.selectedFilmID, FEBrowseScreenings.selectedScreeningId, this.screeningTime, this.screeningDate);
        // Show confirmation to Administrator
        JOptionPane.showMessageDialog(this, "The screening has been permanently modified.");
        // Hide windows and go back to BrowseFilms.
        this.setVisible(false);
        new FEBrowseFilms(true).setVisible(true);
    }//GEN-LAST:event_btnSaveModificationsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.out.println("Cancel modifications of Screening");
        int result = JOptionPane.showConfirmDialog(this, " All changes to "
                + "this film will be lost, are you sure that you want to "
                + "cancel?", "Cancel modification of film Confirmation", 
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            new FEBrowseScreenings().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRemoveScreeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveScreeningActionPerformed
        // TODO add your handling code here:
        System.out.println("Removing Screening");
        int result = JOptionPane.showConfirmDialog(this, "Are you sure that "
                + "you want to permantly remove the screening selected?", "Remove Screening Confirmation", 
                JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            BEFilm currentFilm = d1.lookupFilm(FEBrowseFilms.selectedFilmID, true);
            if (currentFilm.lookupScreening(FEBrowseScreenings.selectedScreeningId, true) == null)
            {
                JOptionPane.showMessageDialog(this, "There was a problem and the screening has not been deleted");
            }
            else
            {
                d1.save(currentFilm);
                JOptionPane.showMessageDialog(this, "The screening has been successfully permantly deleted.");
            }
            new FEBrowseFilms(true).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRemoveScreeningActionPerformed

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
            java.util.logging.Logger.getLogger(FEModifyScreening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEModifyScreening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEModifyScreening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEModifyScreening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEModifyScreening().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemoveScreening;
    private javax.swing.JButton btnSaveModifications;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblModifyAccount;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField tbxDate;
    private javax.swing.JTextField tbxHour;
    private javax.swing.JTextField tbxMinute;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
