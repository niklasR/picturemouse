/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package picturemouse.frontend;

import javax.swing.DefaultListModel;

/**
 *
 * @author John
 */
public class BrowseFilms extends javax.swing.JFrame {

    /**
     * Variables
     */
    String[] filmStrings;
    DefaultListModel listModel;
    boolean isAdmin;
    public static int selectedFilmID;
    public static String selectedFilmName;
    public static String selectedFilmSynopsis;
    public static String[] splitSelectedFilmString;
    
    
    /**
     * Creates new form SignOn
     * @param isAdmin
     */
    @SuppressWarnings("unchecked")
    public BrowseFilms(boolean isAdmin) {
        initComponents();
        this.isAdmin = isAdmin;
        
        //Loading in the films into the JList
        picturemouse.backend.BrowseFilms action = new picturemouse.backend.BrowseFilms();
        //filmStrings = action.doIt();
        
        //NEED TO CHANGE THIS AFTER IT IS LINKED TO A DATABASE
        
        filmStrings = new String[]{"123, Film name 1, Synopsis 1", "234, Film name 2, Synopsis 2",
            "345, Film name 3, Synopsis 3"}; //This is sample data
        listModel = new DefaultListModel<String>();
        for (String filmString: filmStrings){
            String[] splitFilmString = filmString.split(","); //spliting string up
            listModel.addElement(splitFilmString[1].trim()); //index [1] is the film name
        }
        lbxFilms.setModel(listModel);
        
        //Changing visibility of add film button according to admin setting
        btnAddFilm.setVisible(isAdmin);
        
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
        lblBrowseFilms = new javax.swing.JLabel();
        centrePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbxFilms = new javax.swing.JList<String>();
        bottomPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        btnAddFilm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 153));
        setName("signOn"); // NOI18N
        setPreferredSize(new java.awt.Dimension(421, 440));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setName("topPanel"); // NOI18N
        topPanel.setPreferredSize(new java.awt.Dimension(421, 50));

        lblWelcome.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello (username)!");
        lblWelcome.setAlignmentX(0.5F);

        lblBrowseFilms.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblBrowseFilms.setForeground(new java.awt.Color(255, 255, 255));
        lblBrowseFilms.setText("Please select a film.");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblBrowseFilms))
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBrowseFilms))
        );

        getContentPane().add(topPanel);
        topPanel.getAccessibleContext().setAccessibleName("topPanel");

        centrePanel.setBackground(new java.awt.Color(51, 102, 255));

        lbxFilms.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lbxFilms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lbxFilms.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lbxFilmsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lbxFilms);

        javax.swing.GroupLayout centrePanelLayout = new javax.swing.GroupLayout(centrePanel);
        centrePanel.setLayout(centrePanelLayout);
        centrePanelLayout.setHorizontalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centrePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        centrePanelLayout.setVerticalGroup(
            centrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centrePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(centrePanel);

        bottomPanel.setBackground(new java.awt.Color(51, 102, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(421, 100));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSelect.setBackground(new java.awt.Color(255, 255, 255));
        btnSelect.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnAddFilm.setBackground(new java.awt.Color(255, 255, 255));
        btnAddFilm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddFilm.setText("Add Film");
        btnAddFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnAddFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(btnAddFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(bottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //If the user is an admin, then the button leads to a different form
        if (isAdmin){
            // Making form invisible and then new form visible
            this.setVisible(false);
            new AdministratorOptions().setVisible(true);
        }
        else {
            // Making form invisible and then new form visible
            this.setVisible(false);
            new CustomerOptions().setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        //If the user is an admin, then the button leads to a different form
        if (isAdmin){
            // Making form invisible and then new form visible
            this.setVisible(false);
            new ModifyFilm().setVisible(true);
        }
        else {
            // Making form invisible and then new form visible
            this.setVisible(false);
            new Film().setVisible(true);
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnAddFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddFilmActionPerformed

    private void lbxFilmsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lbxFilmsValueChanged

        System.out.println("Value has changed"); //TEST
        
        //Finding the ID of the film selected using the index of the selected
        //element in the JList
        int selectedJListIndex = lbxFilms.getSelectedIndex();
        String filmString = filmStrings[selectedJListIndex]; //Finding string
        String[] splitFilmString = filmString.split(",");
        splitSelectedFilmString = splitFilmString; //Saving split string
        
        //Saving attributes as static variables
        selectedFilmID = Integer.parseInt(splitFilmString[0].trim());
        selectedFilmName = splitFilmString[1].trim();
        selectedFilmSynopsis = splitFilmString[2].trim();
        
        //TESTING:
        System.out.println("selectedFilmID:"+ selectedFilmID);
        System.out.println("selectedFilmName:"+ selectedFilmName);
        System.out.println("selectedFilmSynopsis:"+ selectedFilmSynopsis);
        
    }//GEN-LAST:event_lbxFilmsValueChanged

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
            java.util.logging.Logger.getLogger(BrowseFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowseFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowseFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowseFilms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrowseFilms(true).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnAddFilm;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelect;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrowseFilms;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JList<String> lbxFilms;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
