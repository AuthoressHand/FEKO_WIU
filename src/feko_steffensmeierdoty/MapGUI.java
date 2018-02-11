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
    private final JButton[] grid;

    public MapGUI() {
        
        initComponents();
        
        this.grid = new JButton[]{pos00, pos01, pos02, pos03, pos04, pos05, 
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
        MapLayer = new javax.swing.JLayeredPane();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        Grid = new javax.swing.JPanel();
        pos00 = new javax.swing.JButton();
        pos01 = new javax.swing.JButton();
        pos02 = new javax.swing.JButton();
        pos03 = new javax.swing.JButton();
        pos04 = new javax.swing.JButton();
        pos05 = new javax.swing.JButton();
        pos10 = new javax.swing.JButton();
        pos11 = new javax.swing.JButton();
        pos12 = new javax.swing.JButton();
        pos13 = new javax.swing.JButton();
        pos14 = new javax.swing.JButton();
        pos15 = new javax.swing.JButton();
        pos20 = new javax.swing.JButton();
        pos21 = new javax.swing.JButton();
        pos22 = new javax.swing.JButton();
        pos23 = new javax.swing.JButton();
        pos24 = new javax.swing.JButton();
        pos25 = new javax.swing.JButton();
        pos30 = new javax.swing.JButton();
        pos31 = new javax.swing.JButton();
        pos32 = new javax.swing.JButton();
        pos33 = new javax.swing.JButton();
        pos34 = new javax.swing.JButton();
        pos35 = new javax.swing.JButton();
        pos40 = new javax.swing.JButton();
        pos41 = new javax.swing.JButton();
        pos42 = new javax.swing.JButton();
        pos43 = new javax.swing.JButton();
        pos44 = new javax.swing.JButton();
        pos45 = new javax.swing.JButton();
        pos50 = new javax.swing.JButton();
        pos51 = new javax.swing.JButton();
        pos52 = new javax.swing.JButton();
        pos53 = new javax.swing.JButton();
        pos54 = new javax.swing.JButton();
        pos55 = new javax.swing.JButton();
        pos60 = new javax.swing.JButton();
        pos61 = new javax.swing.JButton();
        pos62 = new javax.swing.JButton();
        pos63 = new javax.swing.JButton();
        pos64 = new javax.swing.JButton();
        pos65 = new javax.swing.JButton();
        pos70 = new javax.swing.JButton();
        pos71 = new javax.swing.JButton();
        pos72 = new javax.swing.JButton();
        pos73 = new javax.swing.JButton();
        pos74 = new javax.swing.JButton();
        pos75 = new javax.swing.JButton();
        Map = new javax.swing.JLabel();
        MenuButtonLayer = new javax.swing.JLayeredPane();
        DangerAreaButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        EndTurnButton = new javax.swing.JButton();
        BattleWheel = new javax.swing.JLabel();
        BottomBorder = new javax.swing.JLabel();
        StatsLayer = new javax.swing.JLayeredPane();
        CharacterPortrait = new javax.swing.JLabel();
        NamePlateText = new javax.swing.JLabel();
        NamePlate = new javax.swing.JLabel();
        StatsInterface = new javax.swing.JLabel();
        TopBorderStats = new javax.swing.JLabel();
        WaitingStatsLayer = new javax.swing.JLayeredPane();
        TopBorderWaiting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setResizable(false);

        MainContainer.setForeground(new java.awt.Color(255, 255, 255));
        MainContainer.setMaximumSize(new java.awt.Dimension(540, 925));
        MainContainer.setMinimumSize(new java.awt.Dimension(540, 925));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MapLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        MapLayer.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, 90));

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
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        MapLayer.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 90));

        MainContainer.add(MapLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 930));

        Grid.setOpaque(false);
        Grid.setLayout(new java.awt.GridLayout(8, 6));

        pos00.setBorderPainted(false);
        pos00.setContentAreaFilled(false);
        Grid.add(pos00);

        pos01.setBorderPainted(false);
        pos01.setContentAreaFilled(false);
        Grid.add(pos01);

        pos02.setBorderPainted(false);
        pos02.setContentAreaFilled(false);
        Grid.add(pos02);

        pos03.setBorderPainted(false);
        pos03.setContentAreaFilled(false);
        Grid.add(pos03);

        pos04.setBorderPainted(false);
        pos04.setContentAreaFilled(false);
        Grid.add(pos04);

        pos05.setBorderPainted(false);
        pos05.setContentAreaFilled(false);
        Grid.add(pos05);

        pos10.setBorderPainted(false);
        pos10.setContentAreaFilled(false);
        Grid.add(pos10);

        pos11.setBorderPainted(false);
        pos11.setContentAreaFilled(false);
        Grid.add(pos11);

        pos12.setBorderPainted(false);
        pos12.setContentAreaFilled(false);
        Grid.add(pos12);

        pos13.setBorderPainted(false);
        pos13.setContentAreaFilled(false);
        Grid.add(pos13);

        pos14.setBorderPainted(false);
        pos14.setContentAreaFilled(false);
        Grid.add(pos14);

        pos15.setBorderPainted(false);
        pos15.setContentAreaFilled(false);
        Grid.add(pos15);

        pos20.setBorderPainted(false);
        pos20.setContentAreaFilled(false);
        Grid.add(pos20);

        pos21.setBorderPainted(false);
        pos21.setContentAreaFilled(false);
        Grid.add(pos21);

        pos22.setBorderPainted(false);
        pos22.setContentAreaFilled(false);
        Grid.add(pos22);

        pos23.setBorderPainted(false);
        pos23.setContentAreaFilled(false);
        Grid.add(pos23);

        pos24.setBorderPainted(false);
        pos24.setContentAreaFilled(false);
        Grid.add(pos24);

        pos25.setBorderPainted(false);
        pos25.setContentAreaFilled(false);
        Grid.add(pos25);

        pos30.setBorderPainted(false);
        pos30.setContentAreaFilled(false);
        Grid.add(pos30);

        pos31.setBorderPainted(false);
        pos31.setContentAreaFilled(false);
        Grid.add(pos31);

        pos32.setBorderPainted(false);
        pos32.setContentAreaFilled(false);
        Grid.add(pos32);

        pos33.setBorderPainted(false);
        pos33.setContentAreaFilled(false);
        Grid.add(pos33);

        pos34.setBorderPainted(false);
        pos34.setContentAreaFilled(false);
        Grid.add(pos34);

        pos35.setBorderPainted(false);
        pos35.setContentAreaFilled(false);
        Grid.add(pos35);

        pos40.setBorderPainted(false);
        pos40.setContentAreaFilled(false);
        Grid.add(pos40);

        pos41.setBorderPainted(false);
        pos41.setContentAreaFilled(false);
        Grid.add(pos41);

        pos42.setBorderPainted(false);
        pos42.setContentAreaFilled(false);
        Grid.add(pos42);

        pos43.setBorderPainted(false);
        pos43.setContentAreaFilled(false);
        Grid.add(pos43);

        pos44.setBorderPainted(false);
        pos44.setContentAreaFilled(false);
        Grid.add(pos44);

        pos45.setBorderPainted(false);
        pos45.setContentAreaFilled(false);
        Grid.add(pos45);

        pos50.setBorderPainted(false);
        pos50.setContentAreaFilled(false);
        Grid.add(pos50);

        pos51.setBorderPainted(false);
        pos51.setContentAreaFilled(false);
        pos51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos51ActionPerformed(evt);
            }
        });
        Grid.add(pos51);

        pos52.setBorderPainted(false);
        pos52.setContentAreaFilled(false);
        Grid.add(pos52);

        pos53.setBorderPainted(false);
        pos53.setContentAreaFilled(false);
        Grid.add(pos53);

        pos54.setBorderPainted(false);
        pos54.setContentAreaFilled(false);
        Grid.add(pos54);

        pos55.setBorderPainted(false);
        pos55.setContentAreaFilled(false);
        Grid.add(pos55);

        pos60.setBorderPainted(false);
        pos60.setContentAreaFilled(false);
        Grid.add(pos60);

        pos61.setBorderPainted(false);
        pos61.setContentAreaFilled(false);
        Grid.add(pos61);

        pos62.setBorderPainted(false);
        pos62.setContentAreaFilled(false);
        Grid.add(pos62);

        pos63.setBorderPainted(false);
        pos63.setContentAreaFilled(false);
        Grid.add(pos63);

        pos64.setBorderPainted(false);
        pos64.setContentAreaFilled(false);
        Grid.add(pos64);

        pos65.setBorderPainted(false);
        pos65.setContentAreaFilled(false);
        Grid.add(pos65);

        pos70.setBorderPainted(false);
        pos70.setContentAreaFilled(false);
        Grid.add(pos70);

        pos71.setBorderPainted(false);
        pos71.setContentAreaFilled(false);
        Grid.add(pos71);

        pos72.setBorderPainted(false);
        pos72.setContentAreaFilled(false);
        Grid.add(pos72);

        pos73.setBorderPainted(false);
        pos73.setContentAreaFilled(false);
        Grid.add(pos73);

        pos74.setBorderPainted(false);
        pos74.setContentAreaFilled(false);
        Grid.add(pos74);

        pos75.setBorderPainted(false);
        pos75.setContentAreaFilled(false);
        Grid.add(pos75);

        MainContainer.add(Grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, 720));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/game_background.png"))); // NOI18N
        Map.setToolTipText("");
        MainContainer.add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, -1));

        MenuButtonLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_idle.png"))); // NOI18N
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
        MenuButtonLayer.add(DangerAreaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 90, 90));

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/settings_button_idle.png"))); // NOI18N
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
        MenuButtonLayer.add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 90));

        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/endturn_button_idle.png"))); // NOI18N
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
        MenuButtonLayer.add(EndTurnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 90, 90));

        BattleWheel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/battle_wheel.png"))); // NOI18N
        MenuButtonLayer.add(BattleWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        BottomBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/bottom_banner.png"))); // NOI18N
        MenuButtonLayer.add(BottomBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 90));

        MainContainer.add(MenuButtonLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 540, 90));

        StatsLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        StatsLayer.add(CharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NamePlateText.setForeground(new java.awt.Color(255, 255, 255));
        NamePlateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlateText.setFocusable(false);
        NamePlateText.setRequestFocusEnabled(false);
        StatsLayer.add(NamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 30));

        NamePlate.setForeground(new java.awt.Color(255, 255, 255));
        NamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/name_plate.png"))); // NOI18N
        StatsLayer.add(NamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/stats_border.png"))); // NOI18N
        StatsLayer.add(StatsInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        TopBorderStats.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopBorderStats.setForeground(new java.awt.Color(255, 255, 255));
        TopBorderStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/top_border_stats.png"))); // NOI18N
        StatsLayer.add(TopBorderStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        MainContainer.add(StatsLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 120));
        StatsLayer.setVisible(false);

        WaitingStatsLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopBorderWaiting.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopBorderWaiting.setForeground(new java.awt.Color(255, 255, 255));
        TopBorderWaiting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameplay/top_banner_waiting.png"))); // NOI18N
        WaitingStatsLayer.add(TopBorderWaiting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        MainContainer.add(WaitingStatsLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 120));

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
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/settings_button_hover.png")));
    }//GEN-LAST:event_SettingsButtonMouseEntered

    private void SettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseExited
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/settings_button_idle.png")));
    }//GEN-LAST:event_SettingsButtonMouseExited

    private void EndTurnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseEntered
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/endturn_button_active.png")));
    }//GEN-LAST:event_EndTurnButtonMouseEntered

    private void EndTurnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseExited
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/endturn_button_idle.png")));
    }//GEN-LAST:event_EndTurnButtonMouseExited

    private void DangerAreaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseEntered
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_active.png")));
    }//GEN-LAST:event_DangerAreaButtonMouseEntered

    private void DangerAreaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseExited
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_idle.png")));
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
        StatsLayer.setVisible(true);
        charInitialPoint = jToggleButton1.getLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/Tharja_portrait.png")));
        NamePlateText.setText("Sharena");
    }//GEN-LAST:event_jToggleButton1MousePressed

    private void jToggleButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MousePressed
        StatsLayer.setVisible(true);
        charInitialPoint = jToggleButton2.getLocation();
        CharacterPortrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/Tharja_portrait.png")));
        NamePlateText.setText("Tharja");
    }//GEN-LAST:event_jToggleButton2MousePressed

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseReleased
        checkForValidMove(Grid,jToggleButton1);        
    }//GEN-LAST:event_jToggleButton1MouseReleased

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseReleased
        checkForValidMove(Grid,jToggleButton2);
    }//GEN-LAST:event_jToggleButton2MouseReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void pos51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pos51ActionPerformed

    private boolean isMouseWithinComponent(Component c) {
        mouseLocation = MouseInfo.getPointerInfo().getLocation();
        bounds = c.getBounds();
        bounds.setLocation(c.getLocationOnScreen());
        return bounds.contains(mouseLocation);
    }
    
    private void checkForValidMove(Component boundary, Component character) {
        if (isMouseWithinComponent(boundary)) {
            for (JButton jl : grid) {
                if (isMouseWithinComponent(jl)) {
                    character.setLocation(jl.getX(), jl.getY() + TopBorderStats.getHeight());
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
    private javax.swing.JLayeredPane MapLayer;
    private javax.swing.JLayeredPane MenuButtonLayer;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateText;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StatsInterface;
    private javax.swing.JLayeredPane StatsLayer;
    private javax.swing.JLabel TopBorderStats;
    private javax.swing.JLabel TopBorderWaiting;
    private javax.swing.JLayeredPane WaitingStatsLayer;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton pos00;
    private javax.swing.JButton pos01;
    private javax.swing.JButton pos02;
    private javax.swing.JButton pos03;
    private javax.swing.JButton pos04;
    private javax.swing.JButton pos05;
    private javax.swing.JButton pos10;
    private javax.swing.JButton pos11;
    private javax.swing.JButton pos12;
    private javax.swing.JButton pos13;
    private javax.swing.JButton pos14;
    private javax.swing.JButton pos15;
    private javax.swing.JButton pos20;
    private javax.swing.JButton pos21;
    private javax.swing.JButton pos22;
    private javax.swing.JButton pos23;
    private javax.swing.JButton pos24;
    private javax.swing.JButton pos25;
    private javax.swing.JButton pos30;
    private javax.swing.JButton pos31;
    private javax.swing.JButton pos32;
    private javax.swing.JButton pos33;
    private javax.swing.JButton pos34;
    private javax.swing.JButton pos35;
    private javax.swing.JButton pos40;
    private javax.swing.JButton pos41;
    private javax.swing.JButton pos42;
    private javax.swing.JButton pos43;
    private javax.swing.JButton pos44;
    private javax.swing.JButton pos45;
    private javax.swing.JButton pos50;
    private javax.swing.JButton pos51;
    private javax.swing.JButton pos52;
    private javax.swing.JButton pos53;
    private javax.swing.JButton pos54;
    private javax.swing.JButton pos55;
    private javax.swing.JButton pos60;
    private javax.swing.JButton pos61;
    private javax.swing.JButton pos62;
    private javax.swing.JButton pos63;
    private javax.swing.JButton pos64;
    private javax.swing.JButton pos65;
    private javax.swing.JButton pos70;
    private javax.swing.JButton pos71;
    private javax.swing.JButton pos72;
    private javax.swing.JButton pos73;
    private javax.swing.JButton pos74;
    private javax.swing.JButton pos75;
    // End of variables declaration//GEN-END:variables
}
