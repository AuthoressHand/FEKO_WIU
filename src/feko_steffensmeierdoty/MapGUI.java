/*
 * This class is the Map GUI.
 */
package feko_steffensmeierdoty;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rms130
 */
public class MapGUI extends javax.swing.JFrame {

    private static Point mouseLocation;
    private static Point componentLocation;
    private static Rectangle bounds;
    private static Point charInitialPoint;
    private final JLabel[] grid;

    public MapGUI() {
        
        initComponents();
        
        this.grid = new JLabel[]{pos00, pos01, pos02, pos03, pos04, pos05, 
                                 pos10, pos11, pos12, pos13, pos14, pos15, 
                                 pos20, pos21, pos22, pos23, pos24, pos25, 
                                 pos30, pos31, pos32, pos33, pos34, pos35, 
                                 pos40, pos41, pos42, pos43, pos44, pos45, 
                                 pos50, pos51, pos52, pos53, pos54, pos55, 
                                 pos60, pos61, pos62, pos63, pos64, pos65, 
                                 pos70, pos71, pos72, pos73, pos74, pos75};

    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JLayeredPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        DangerAreaButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        EndTurnButton = new javax.swing.JButton();
        BattleWheel = new javax.swing.JLabel();
        NamePlateText = new javax.swing.JLabel();
        NamePlate = new javax.swing.JLabel();
        Map = new javax.swing.JLabel();
        CharacterPortrait = new javax.swing.JLabel();
        StatsInterface = new javax.swing.JLabel();
        TopBorder = new javax.swing.JLabel();
        BottomBorder = new javax.swing.JLabel();
        Grid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setResizable(false);

        MainContainer.setForeground(new java.awt.Color(255, 255, 255));
        MainContainer.setMaximumSize(new java.awt.Dimension(540, 925));
        MainContainer.setMinimumSize(new java.awt.Dimension(540, 925));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/anna.png"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setHideActionText(true);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(90, 90));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(90, 90));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(90, 90));
        jToggleButton1.setRequestFocusEnabled(false);
        jToggleButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseDragged(evt);
            }
        });
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseReleased(evt);
            }
        });
        MainContainer.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 90));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/zeph.png"))); // NOI18N
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jToggleButton2.setFocusPainted(false);
        jToggleButton2.setHideActionText(true);
        jToggleButton2.setMaximumSize(new java.awt.Dimension(90, 90));
        jToggleButton2.setMinimumSize(new java.awt.Dimension(90, 90));
        jToggleButton2.setPreferredSize(new java.awt.Dimension(90, 90));
        jToggleButton2.setRequestFocusEnabled(false);
        jToggleButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseDragged(evt);
            }
        });
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseReleased(evt);
            }
        });
        MainContainer.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, 90));

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
        MainContainer.add(DangerAreaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 840, 90, 90));

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
        MainContainer.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 90, 90));

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
        MainContainer.add(EndTurnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 840, 90, 90));

        BattleWheel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/battle_wheel.png"))); // NOI18N
        MainContainer.add(BattleWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 850, -1, -1));

        NamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NamePlateText.setForeground(new java.awt.Color(255, 255, 255));
        NamePlateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlateText.setFocusable(false);
        NamePlateText.setRequestFocusEnabled(false);
        MainContainer.add(NamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 30));

        NamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/name_plate.png"))); // NOI18N
        MainContainer.add(NamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/game_background.png"))); // NOI18N
        Map.setToolTipText("");
        MainContainer.add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, -1));
        MainContainer.add(CharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/stats_border.png"))); // NOI18N
        MainContainer.add(StatsInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        TopBorder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopBorder.setForeground(new java.awt.Color(255, 255, 255));
        TopBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/top_banner_empty.png"))); // NOI18N
        MainContainer.add(TopBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        BottomBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/bottom_banner.png"))); // NOI18N
        MainContainer.add(BottomBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, -1, -1));

        Grid.setLayout(new java.awt.GridLayout(8, 6));

        pos00.setText("jLabel1");
        Grid.add(pos00);

        pos01.setText("jLabel1");
        Grid.add(pos01);

        pos02.setText("jLabel1");
        Grid.add(pos02);

        pos03.setText("jLabel1");
        Grid.add(pos03);

        pos04.setText("jLabel1");
        Grid.add(pos04);

        pos05.setText("jLabel1");
        Grid.add(pos05);

        pos10.setText("jLabel1");
        Grid.add(pos10);

        pos11.setText("jLabel1");
        Grid.add(pos11);

        pos12.setText("jLabel1");
        Grid.add(pos12);

        pos13.setText("jLabel1");
        Grid.add(pos13);

        pos14.setText("jLabel1");
        Grid.add(pos14);

        pos15.setText("jLabel1");
        Grid.add(pos15);

        pos20.setText("jLabel1");
        Grid.add(pos20);

        pos21.setText("jLabel1");
        Grid.add(pos21);

        pos22.setText("jLabel1");
        Grid.add(pos22);

        pos23.setText("jLabel1");
        Grid.add(pos23);

        pos24.setText("jLabel1");
        Grid.add(pos24);

        pos25.setText("jLabel1");
        Grid.add(pos25);

        pos30.setText("jLabel1");
        Grid.add(pos30);

        pos31.setText("jLabel1");
        Grid.add(pos31);

        pos32.setText("jLabel1");
        Grid.add(pos32);

        pos33.setText("jLabel1");
        Grid.add(pos33);

        pos34.setText("jLabel1");
        Grid.add(pos34);

        pos35.setText("jLabel1");
        Grid.add(pos35);

        pos40.setText("jLabel1");
        Grid.add(pos40);

        pos41.setText("jLabel1");
        Grid.add(pos41);

        pos42.setText("jLabel1");
        Grid.add(pos42);

        pos43.setText("jLabel1");
        Grid.add(pos43);

        pos44.setText("jLabel1");
        Grid.add(pos44);

        pos45.setText("jLabel1");
        Grid.add(pos45);

        pos50.setText("jLabel1");
        Grid.add(pos50);

        pos51.setText("jLabel1");
        Grid.add(pos51);

        pos52.setText("jLabel1");
        Grid.add(pos52);

        pos53.setText("jLabel1");
        Grid.add(pos53);

        pos54.setText("jLabel1");
        Grid.add(pos54);

        pos55.setText("jLabel1");
        Grid.add(pos55);

        pos60.setText("jLabel1");
        Grid.add(pos60);

        pos61.setText("jLabel1");
        Grid.add(pos61);

        pos62.setText("jLabel1");
        Grid.add(pos62);

        pos63.setText("jLabel1");
        Grid.add(pos63);

        pos64.setText("jLabel1");
        Grid.add(pos64);

        pos65.setText("jLabel1");
        Grid.add(pos65);

        pos70.setText("jLabel1");
        Grid.add(pos70);

        pos71.setText("jLabel1");
        Grid.add(pos71);

        pos72.setText("jLabel1");
        Grid.add(pos72);

        pos73.setText("jLabel1");
        Grid.add(pos73);

        pos74.setText("jLabel1");
        Grid.add(pos74);

        pos75.setText("jLabel1");
        Grid.add(pos75);

        MainContainer.add(Grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
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
   
    private void jToggleButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseDragged
        moveCharacter(jToggleButton1);
    }//GEN-LAST:event_jToggleButton1MouseDragged

    private void jToggleButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseDragged
        moveCharacter(jToggleButton2);
    }//GEN-LAST:event_jToggleButton2MouseDragged

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MousePressed
        charInitialPoint = jToggleButton1.getLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/Sharena_portrait.png")));
        NamePlateText.setText("Sharena");
    }//GEN-LAST:event_jToggleButton1MousePressed

    private void jToggleButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MousePressed
        charInitialPoint = jToggleButton2.getLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/Tharja_portrait.png")));
        NamePlateText.setText("Tharja");
    }//GEN-LAST:event_jToggleButton2MousePressed

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseReleased
        checkForValidMove(Grid,jToggleButton1);        
    }//GEN-LAST:event_jToggleButton1MouseReleased

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseReleased
        checkForValidMove(Grid,jToggleButton2);
    }//GEN-LAST:event_jToggleButton2MouseReleased

    private boolean isMouseWithinComponent(Component c) {
        mouseLocation = MouseInfo.getPointerInfo().getLocation();
        bounds = c.getBounds();
        bounds.setLocation(c.getLocationOnScreen());
        return bounds.contains(mouseLocation);
    }
    
    private void checkForValidMove(Component boundary, Component character) {
        if (isMouseWithinComponent(boundary)) {
            for (JLabel jl : grid) {
                if (isMouseWithinComponent(jl)) {
                    character.setLocation(jl.getX(), jl.getY() + TopBorder.getHeight());
                    break;
                }
            }
        } else {
            character.setLocation(charInitialPoint);
        }
    }
    
    private void moveCharacter(Component character) {
        if (isMouseWithinComponent(MainContainer)) {
            mouseLocation = MouseInfo.getPointerInfo().getLocation();
            componentLocation = MainContainer.getLocationOnScreen();
            mouseLocation.x = mouseLocation.x - componentLocation.x - character.getWidth() / 2;
            mouseLocation.y = mouseLocation.y - componentLocation.y - character.getHeight() / 2;

            character.setLocation(mouseLocation);
        }
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
    private javax.swing.JPanel Grid;
    private javax.swing.JLayeredPane MainContainer;
    private javax.swing.JLabel Map;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateText;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StatsInterface;
    private javax.swing.JLabel TopBorder;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private static final javax.swing.JLabel pos00 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos01 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos02 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos03 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos04 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos05 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos10 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos11 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos12 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos13 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos14 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos15 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos20 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos21 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos22 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos23 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos24 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos25 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos30 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos31 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos32 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos33 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos34 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos35 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos40 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos41 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos42 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos43 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos44 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos45 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos50 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos51 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos52 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos53 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos54 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos55 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos60 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos61 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos62 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos63 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos64 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos65 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos70 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos71 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos72 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos73 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos74 = new javax.swing.JLabel();
    private final javax.swing.JLabel pos75 = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
