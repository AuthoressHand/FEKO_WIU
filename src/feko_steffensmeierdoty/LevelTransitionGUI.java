/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feko_steffensmeierdoty;

import java.util.logging.Level;
import java.util.logging.Logger;
import objects.Party;

/**
 *
 * @author Justin
 */
public class LevelTransitionGUI extends javax.swing.JFrame {

    private Party party;
    private CharacterModGUI cmGUI;
    private int level;
    
    public LevelTransitionGUI() {
        initComponents();
        levelTransition();
    }
    
    public LevelTransitionGUI(int level, Party party, CharacterModGUI cmGUI) {
        this.level = level;
        this.party = party;
        this.cmGUI = cmGUI;
        initComponents();
        levelTransition();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        LevelTransition = new javax.swing.JLayeredPane();
        ChapterText = new javax.swing.JTextField();
        LevelNameText = new javax.swing.JTextField();
        ChapterPlatform = new javax.swing.JLabel();
        LevelNamePlatform = new javax.swing.JLabel();
        LevelTransitionBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 925));
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 925));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(540, 925));
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(540, 925));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 466, -1, -1));

        LevelTransition.setMaximumSize(new java.awt.Dimension(540, 930));
        LevelTransition.setMinimumSize(new java.awt.Dimension(540, 930));
        LevelTransition.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChapterText.setVisible(false);
        ChapterText.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ChapterText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ChapterText.setBorder(null);
        ChapterText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChapterText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ChapterText.setEnabled(false);
        ChapterText.setOpaque(false);
        ChapterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChapterTextActionPerformed(evt);
            }
        });
        LevelTransition.add(ChapterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 280, 60));

        LevelNameText.setVisible(false);
        LevelNameText.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LevelNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LevelNameText.setBorder(null);
        LevelNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LevelNameText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        LevelNameText.setEnabled(false);
        LevelNameText.setOpaque(false);
        LevelNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelNameTextActionPerformed(evt);
            }
        });
        LevelTransition.add(LevelNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 410, 60));

        ChapterPlatform.setVisible(false);
        ChapterPlatform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/chapterPlatform.png"))); // NOI18N
        LevelTransition.add(ChapterPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 330, 90));

        LevelNamePlatform.setVisible(false);
        LevelNamePlatform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/levelNamePlatform.png"))); // NOI18N
        LevelTransition.add(LevelNamePlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 520, 90));

        LevelTransitionBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/levelTransitionBackground.png"))); // NOI18N
        LevelTransitionBackground.setToolTipText("");
        LevelTransition.add(LevelTransitionBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, -1, 940));

        getContentPane().add(LevelTransition, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChapterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChapterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChapterTextActionPerformed

    private void LevelNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelNameTextActionPerformed

    private void levelTransition() {
        Thread levelTransitionThread = new Thread() {    
            public void run() {
                try {
                    LevelNamePlatform.setVisible(true);
                    ChapterPlatform.setVisible(true);
                    Thread.sleep(850);
                    ChapterText.setVisible(true);
                    ChapterText.setText("Stage 1");
                    Thread.sleep(1000);
                    LevelNameText.setVisible(true);
                    LevelNameText.setText("The Beginning");
                    Thread.sleep(1750);
                    LevelTransitionBackground.setVisible(false);
                    ChapterPlatform.setVisible(false);
                    ChapterText.setVisible(false);
                    LevelNamePlatform.setVisible(false);
                    LevelNameText.setVisible(false);
                    MapGUI mGUI = new MapGUI(level,party,cmGUI);
                    mGUI.setVisible(true);
                    setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }};
        levelTransitionThread.start();
    }
    
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
            java.util.logging.Logger.getLogger(LevelTransitionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelTransitionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelTransitionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelTransitionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelTransitionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChapterPlatform;
    private javax.swing.JTextField ChapterText;
    private javax.swing.JLabel LevelNamePlatform;
    private javax.swing.JTextField LevelNameText;
    private javax.swing.JLayeredPane LevelTransition;
    private javax.swing.JLabel LevelTransitionBackground;
    private javax.swing.JLayeredPane jLayeredPane2;
    // End of variables declaration//GEN-END:variables
}
