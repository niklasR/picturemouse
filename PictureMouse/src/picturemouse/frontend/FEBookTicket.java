/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import picturemouse.frontend.FESignOn;
import picturemouse.backend.BEDatabase;

/**
 *
 * @author Jake Carr
 */
public class FEBookTicket extends javax.swing.JFrame {

    
    /**
     * Variables
     */
    int screeningID; //to be assigned when chosen in GUI
    int seat; //to be assigned when chosen in GUI
    String username; //somehow get username of current user
    String[] screenings;
    String[] availableSeats;
    int filmID;
    DefaultComboBoxModel screeningCBXModel;
    DefaultComboBoxModel seatsCBXModel;
    BEDatabase database = BEDatabase.getInstance();
    boolean screeningSelected;
    boolean seatSelected;
    

    /**
     * Creates new form SignOn
     */
    @SuppressWarnings("unchecked")
    public FEBookTicket() {
        initComponents();
        //Loading in previously defined variables
        this.filmID = FEBrowseFilms.selectedFilmID;
        this.username = FESignOn.username;
        //Setting flags
        screeningSelected = false;
        seatSelected = false;
        
        //Changing title
        //lblWelcome.setText("Hello " + database.lookupAccount(FESignOn.username, false).getFirstName());
        
        //Displaying all screenings for the film in the combo box
        //Creating instance of the backend BookTicket class
        picturemouse.backend.BEBookTicket action = new picturemouse.backend.BEBookTicket();
        screenings = action.findScreenings(filmID);
        
        //NEED TO CHANGE THIS AFTER IT IS LINKED TO A DATABASE
        
        //screenings = new String[]{"12, 2014-06-04, 2:00", "45, 2014-06-04, 6:00",
        //    "32, 2014-06-05, 3:00"}; //This is sample data
        
        //Creating new model with new elements
        screeningCBXModel = new DefaultComboBoxModel();
        for (String screening: screenings){
            screeningCBXModel.addElement(screening);
        }
        cbxChooseScreening.setModel(screeningCBXModel); //Setting model
        
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
        lblCustomerOptions = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        cbxChooseScreening = new javax.swing.JComboBox();
        cbxChooseSeat = new javax.swing.JComboBox();
        bottomPanel = new javax.swing.JPanel();
        btnBook = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(421, 350));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N
        topPanel.setPreferredSize(new java.awt.Dimension(421, 50));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello <<NAME>>!");
        lblWelcome.setAlignmentX(0.5F);

        lblCustomerOptions.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCustomerOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerOptions.setText("Please select your preferences.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblWelcome))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblCustomerOptions)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerOptions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));
        centrePanel.setPreferredSize(new java.awt.Dimension(421, 220));

        cbxChooseScreening.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a screening..." }));
        cbxChooseScreening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChooseScreeningActionPerformed(evt);
            }
        });

        cbxChooseSeat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a seat number..." }));
        cbxChooseSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChooseSeatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxChooseSeat, 0, 0, Short.MAX_VALUE)
                    .addComponent(cbxChooseScreening, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centrePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cbxChooseScreening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(cbxChooseSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(421, 60));

        btnBook.setBackground(new java.awt.Color(255, 255, 255));
        btnBook.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBook.setText("Book");
        btnBook.setPreferredSize(new java.awt.Dimension(59, 25));
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(61, 25));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(btnBook, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // Making form invisible and then new form visible
        this.setVisible(false);
        new FEFilm().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        if (screeningSelected && seatSelected){ //checking that selections are made
            int result = JOptionPane.showConfirmDialog(this, "Do you wish to book this Ticket?",
                    "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                picturemouse.backend.BEBookTicket action = new picturemouse.backend.BEBookTicket();
                action.doIt(this.filmID, this.screeningID, this.seat, this.username);
            }
        } else {
            //Tell user to make selections
        }
    }//GEN-LAST:event_btnBookActionPerformed

    /**
     * Method for when an element is selected in the screening combo box.
     * This them changes the seat combo box.
     * @param evt 
     */
    @SuppressWarnings("unchecked")
    private void cbxChooseScreeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChooseScreeningActionPerformed
        
        //Setting the flags
        screeningSelected = true;
        seatSelected = false;
        
        //Set contents of the seat number combo box
        
        //Find screening
        int selectedScreeningIndex = cbxChooseScreening.getSelectedIndex();
        String selectedScreeningString = screenings[selectedScreeningIndex];
        //spliting string to seperate the ScreeningId
        String[] splitSelectedScreening = selectedScreeningString.split(",");
        int selectedScreeningID = Integer.parseInt(splitSelectedScreening[0].trim());
        screeningID = selectedScreeningID;
        
        //Getting availible seats
        //Creating instance of the backend BookTicket class
        picturemouse.backend.BEBookTicket action = new picturemouse.backend.BEBookTicket();
        availableSeats = action.findSeats(filmID, selectedScreeningID);
        
        //Creating new combobox model
        seatsCBXModel = new DefaultComboBoxModel();
        for (String seatElement: availableSeats){
            seatsCBXModel.addElement(seatElement);
        }
        cbxChooseSeat.setModel(seatsCBXModel); //Setting model
        
    }//GEN-LAST:event_cbxChooseScreeningActionPerformed

    private void cbxChooseSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChooseSeatActionPerformed
        
        //Setting the flags
        screeningSelected = true;
        seatSelected = true;
        
        //Finding seat number
        int selectedSeatIndex = cbxChooseSeat.getSelectedIndex();
        String selectedSeatString = availableSeats[selectedSeatIndex];
        
        seat = Integer.parseInt(selectedSeatString);
    }//GEN-LAST:event_cbxChooseSeatActionPerformed

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
            java.util.logging.Logger.getLogger(FEBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEBookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEBookTicket().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox cbxChooseScreening;
    private javax.swing.JComboBox cbxChooseSeat;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JLabel lblCustomerOptions;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
