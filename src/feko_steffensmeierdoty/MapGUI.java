/*
 * This class is the Map GUI.
 */
package feko_steffensmeierdoty;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import javax.swing.JButton;

/**
 *
 * @author rms130
 */
public class MapGUI extends javax.swing.JFrame {

    private static PointerInfo pInfo;
    private static Point pInfoPoint;
    private static Point invalidPoint;
    private static String name;
    /**
     * Creates new form MapGUI
     */
    public MapGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        EnemyCharacter = new javax.swing.JButton();
        MainCharacter = new javax.swing.JButton();
        EndTurnButton = new javax.swing.JButton();
        DangerAreaButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        BattleWheel = new javax.swing.JLabel();
        NamePlateText = new javax.swing.JLabel();
        NamePlate = new javax.swing.JLabel();
        Map = new javax.swing.JLabel();
        CharacterPortrait = new javax.swing.JLabel();
        StatsInterface = new javax.swing.JLabel();
        TopBorder = new javax.swing.JLabel();
        BottomBorder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 925));
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 925));
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(540, 925));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(540, 925));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/enemy_char.png"))); // NOI18N
        EnemyCharacter.setBorderPainted(false);
        EnemyCharacter.setContentAreaFilled(false);
        EnemyCharacter.setFocusPainted(false);
        EnemyCharacter.setMaximumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter.setMinimumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter.setPreferredSize(new java.awt.Dimension(90, 90));
        EnemyCharacter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EnemyCharacterMouseDragged(evt);
            }
        });
        EnemyCharacter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnemyCharacterMouseReleased(evt);
            }
        });
        jLayeredPane1.add(EnemyCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 90, 90));

        MainCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/char.png"))); // NOI18N
        MainCharacter.setBorderPainted(false);
        MainCharacter.setContentAreaFilled(false);
        MainCharacter.setFocusPainted(false);
        MainCharacter.setMaximumSize(new java.awt.Dimension(90, 90));
        MainCharacter.setMinimumSize(new java.awt.Dimension(90, 90));
        MainCharacter.setPreferredSize(new java.awt.Dimension(90, 90));
        MainCharacter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainCharacterMouseDragged(evt);
            }
        });
        MainCharacter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainCharacterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MainCharacterMouseReleased(evt);
            }
        });
        jLayeredPane1.add(MainCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 90));

        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/endturn_button_idle.png"))); // NOI18N
        EndTurnButton.setBorderPainted(false);
        EndTurnButton.setContentAreaFilled(false);
        EndTurnButton.setFocusPainted(false);
        EndTurnButton.setMaximumSize(new java.awt.Dimension(90, 90));
        EndTurnButton.setMinimumSize(new java.awt.Dimension(90, 90));
        EndTurnButton.setPreferredSize(new java.awt.Dimension(90, 90));
        EndTurnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndTurnButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EndTurnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EndTurnButtonMouseExited(evt);
            }
        });
        jLayeredPane1.add(EndTurnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, 90, 90));

        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/dangerarea_button_idle.png"))); // NOI18N
        DangerAreaButton.setBorderPainted(false);
        DangerAreaButton.setContentAreaFilled(false);
        DangerAreaButton.setFocusPainted(false);
        DangerAreaButton.setMaximumSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.setMinimumSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.setPreferredSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DangerAreaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DangerAreaButtonMouseExited(evt);
            }
        });
        jLayeredPane1.add(DangerAreaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 840, 90, 90));

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/settings_button_idle.png"))); // NOI18N
        SettingsButton.setBorderPainted(false);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.setFocusPainted(false);
        SettingsButton.setMaximumSize(new java.awt.Dimension(90, 90));
        SettingsButton.setMinimumSize(new java.awt.Dimension(90, 90));
        SettingsButton.setPreferredSize(new java.awt.Dimension(90, 90));
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseExited(evt);
            }
        });
        jLayeredPane1.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 90, 90));

        BattleWheel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/battle_wheel.png"))); // NOI18N
        jLayeredPane1.add(BattleWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 850, -1, -1));

        NamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NamePlateText.setForeground(new java.awt.Color(255, 255, 255));
        NamePlateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane1.add(NamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 30));

        NamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/name_plate.png"))); // NOI18N
        jLayeredPane1.add(NamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/game_background.png"))); // NOI18N
        jLayeredPane1.add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, -1));
        jLayeredPane1.add(CharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/stats_border.png"))); // NOI18N
        jLayeredPane1.add(StatsInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        TopBorder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopBorder.setForeground(new java.awt.Color(255, 255, 255));
        TopBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/top_banner_empty.png"))); // NOI18N
        jLayeredPane1.add(TopBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        BottomBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/bottom_banner.png"))); // NOI18N
        jLayeredPane1.add(BottomBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnemyCharacterMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacterMouseDragged
        updateCharacterLocation();
        checkDragBoundary(EnemyCharacter);
    }//GEN-LAST:event_EnemyCharacterMouseDragged

    private void MainCharacterMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainCharacterMouseDragged
        updateCharacterLocation();
        checkDragBoundary(MainCharacter);
    }//GEN-LAST:event_MainCharacterMouseDragged

    private void SettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseEntered
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/settings_button_hover.png")));
    }//GEN-LAST:event_SettingsButtonMouseEntered

    private void SettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseExited
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/settings_button_idle.png")));
    }//GEN-LAST:event_SettingsButtonMouseExited

    private void EndTurnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseEntered
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/endturn_button_active.png")));
    }//GEN-LAST:event_EndTurnButtonMouseEntered

    private void EndTurnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseExited
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/endturn_button_idle.png")));
    }//GEN-LAST:event_EndTurnButtonMouseExited

    private void DangerAreaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseEntered
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/dangerarea_button_active.png")));
    }//GEN-LAST:event_DangerAreaButtonMouseEntered

    private void DangerAreaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseExited
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/dangerarea_button_idle.png")));
    }//GEN-LAST:event_DangerAreaButtonMouseExited

    private void EndTurnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseClicked
        EndGUI endGUI = new EndGUI();
        endGUI.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_EndTurnButtonMouseClicked

    private void EnemyCharacterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacterMousePressed
        updateCharacterLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/Tharja_portrait.png")));
        name = "Tharja";
        NamePlateText.setText(name);
    }//GEN-LAST:event_EnemyCharacterMousePressed

    private void MainCharacterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainCharacterMousePressed
        updateCharacterLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/Sharena_portrait.png")));
        name = "Sharena";
        NamePlateText.setText(name);
    }//GEN-LAST:event_MainCharacterMousePressed

    private void MainCharacterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainCharacterMouseReleased
        checkReleaseBoundary(MainCharacter);
    }//GEN-LAST:event_MainCharacterMouseReleased

    private void EnemyCharacterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacterMouseReleased
        checkReleaseBoundary(EnemyCharacter);
    }//GEN-LAST:event_EnemyCharacterMouseReleased

    private static void checkReleaseBoundary(JButton jButton){
        
        if(pInfoPoint.getY() < 120){
            invalidPoint = pInfo.getLocation();
            pInfoPoint.setLocation(pInfoPoint.getX(), (120 - invalidPoint.getY())+invalidPoint.getY());
            jButton.setLocation(pInfoPoint);
        }
        if(pInfoPoint.getY() > 750){
            invalidPoint = pInfo.getLocation();
            pInfoPoint.setLocation(pInfoPoint.getX(), invalidPoint.getY()-(invalidPoint.getY() - 750));
            jButton.setLocation(pInfoPoint);
        }
        if(pInfoPoint.getX() < 0){
            invalidPoint = pInfo.getLocation();
            pInfoPoint.setLocation((0 - invalidPoint.getX()) + invalidPoint.getX(), pInfoPoint.getY());
            jButton.setLocation(pInfoPoint);
        }
        if(pInfoPoint.getX() > 450){
            invalidPoint = pInfo.getLocation();
            pInfoPoint.setLocation(invalidPoint.getX()-(invalidPoint.getX() - 450), pInfoPoint.getY());
            jButton.setLocation(pInfoPoint);
        }
        
    }
    
    private static void updateCharacterLocation(){
        pInfo = MouseInfo.getPointerInfo();
        pInfoPoint = pInfo.getLocation();
        pInfoPoint.setLocation(pInfoPoint.getX() - 735, pInfoPoint.getY() - 100);
    }
    
    private static void checkDragBoundary(JButton jButton){
        if(pInfoPoint.getX() >= -70 && pInfoPoint.getX() <=520 && pInfoPoint.getY() >=-70 && pInfoPoint.getY() <= 880 )
            jButton.setLocation(pInfoPoint);
        
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
            java.util.logging.Logger.getLogger(MapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BattleWheel;
    private javax.swing.JLabel BottomBorder;
    private javax.swing.JLabel CharacterPortrait;
    private javax.swing.JButton DangerAreaButton;
    private javax.swing.JButton EndTurnButton;
    private javax.swing.JButton EnemyCharacter;
    private javax.swing.JButton MainCharacter;
    private javax.swing.JLabel Map;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateText;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StatsInterface;
    private javax.swing.JLabel TopBorder;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
