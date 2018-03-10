/*
 * This class is the Map GUI.
 */
package feko_steffensmeierdoty;
import java.awt.*;
import javax.swing.*;
import objects.*;

/**
 *
 * @author rms130
 */
public class MapGUI extends javax.swing.JFrame {

    private static Point mouseLocation;
    private static Point componentLocation;
    private static Rectangle bounds;
    private static Point charInitialPoint;
    private static Party allyParty;
    private static Party enemyParty = new Party();
    private GridTile[] grid;
    private final JToggleButton[] characters = new JToggleButton[8];

    public MapGUI() {
        initComponents();
    }
    
    public MapGUI(Party party) {
        initComponents();
        MapGUI.allyParty = party;
        initMapGUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JLayeredPane();
        MapLayer = new javax.swing.JLayeredPane();
        Character8 = new javax.swing.JToggleButton();
        Character7 = new javax.swing.JToggleButton();
        Character6 = new javax.swing.JToggleButton();
        Character5 = new javax.swing.JToggleButton();
        Character4 = new javax.swing.JToggleButton();
        Character3 = new javax.swing.JToggleButton();
        Character2 = new javax.swing.JToggleButton();
        Character1 = new javax.swing.JToggleButton();
        Map = new javax.swing.JLabel();
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
        MenuButtonLayer = new javax.swing.JLayeredPane();
        DangerAreaButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        EndTurnButton = new javax.swing.JButton();
        BattleWheel = new javax.swing.JLabel();
        BottomBorder = new javax.swing.JLabel();
        StatsLayer = new javax.swing.JLayeredPane();
        CharacterPortrait = new javax.swing.JLabel();
        AttackLevel1 = new javax.swing.JTextField();
        AttackLevel = new javax.swing.JTextField();
        MaxHP = new javax.swing.JTextField();
        CurrentHP = new javax.swing.JTextField();
        NamePlateText = new javax.swing.JTextField();
        NamePlateDecor = new javax.swing.JLabel();
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

        MapLayer.setEnabled(false);
        MapLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Character8.setVisible(false);
        Character8.setBorderPainted(false);
        Character8.setContentAreaFilled(false);
        Character8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character8.setFocusPainted(false);
        Character8.setHideActionText(true);
        Character8.setMaximumSize(new java.awt.Dimension(90, 90));
        Character8.setMinimumSize(new java.awt.Dimension(90, 90));
        Character8.setPreferredSize(new java.awt.Dimension(90, 90));
        Character8.setRequestFocusEnabled(false);
        Character8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character8MouseDragged(evt);
            }
        });
        Character8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character8MouseReleased(evt);
            }
        });
        Character8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Character8ActionPerformed(evt);
            }
        });
        MapLayer.add(Character8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 90, 90));

        Character7.setVisible(false);
        Character7.setBorderPainted(false);
        Character7.setContentAreaFilled(false);
        Character7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character7.setFocusPainted(false);
        Character7.setHideActionText(true);
        Character7.setMaximumSize(new java.awt.Dimension(90, 90));
        Character7.setMinimumSize(new java.awt.Dimension(90, 90));
        Character7.setPreferredSize(new java.awt.Dimension(90, 90));
        Character7.setRequestFocusEnabled(false);
        Character7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character7MouseDragged(evt);
            }
        });
        Character7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character7MouseReleased(evt);
            }
        });
        MapLayer.add(Character7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 90, 90));

        Character6.setVisible(false);
        Character6.setBorderPainted(false);
        Character6.setContentAreaFilled(false);
        Character6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character6.setFocusPainted(false);
        Character6.setHideActionText(true);
        Character6.setMaximumSize(new java.awt.Dimension(90, 90));
        Character6.setMinimumSize(new java.awt.Dimension(90, 90));
        Character6.setPreferredSize(new java.awt.Dimension(90, 90));
        Character6.setRequestFocusEnabled(false);
        Character6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character6MouseDragged(evt);
            }
        });
        Character6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character6MouseReleased(evt);
            }
        });
        MapLayer.add(Character6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 90, 90));

        Character5.setVisible(false);
        Character5.setBorderPainted(false);
        Character5.setContentAreaFilled(false);
        Character5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character5.setFocusPainted(false);
        Character5.setHideActionText(true);
        Character5.setMaximumSize(new java.awt.Dimension(90, 90));
        Character5.setMinimumSize(new java.awt.Dimension(90, 90));
        Character5.setPreferredSize(new java.awt.Dimension(90, 90));
        Character5.setRequestFocusEnabled(false);
        Character5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character5MouseDragged(evt);
            }
        });
        Character5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character5MouseReleased(evt);
            }
        });
        MapLayer.add(Character5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 90, 90));

        Character4.setVisible(false);
        Character4.setBorderPainted(false);
        Character4.setContentAreaFilled(false);
        Character4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character4.setFocusPainted(false);
        Character4.setHideActionText(true);
        Character4.setMaximumSize(new java.awt.Dimension(90, 90));
        Character4.setMinimumSize(new java.awt.Dimension(90, 90));
        Character4.setPreferredSize(new java.awt.Dimension(90, 90));
        Character4.setRequestFocusEnabled(false);
        Character4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character4MouseDragged(evt);
            }
        });
        Character4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character4MouseReleased(evt);
            }
        });
        MapLayer.add(Character4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 90));

        Character3.setVisible(false);
        Character3.setBorderPainted(false);
        Character3.setContentAreaFilled(false);
        Character3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character3.setFocusPainted(false);
        Character3.setHideActionText(true);
        Character3.setMaximumSize(new java.awt.Dimension(90, 90));
        Character3.setMinimumSize(new java.awt.Dimension(90, 90));
        Character3.setPreferredSize(new java.awt.Dimension(90, 90));
        Character3.setRequestFocusEnabled(false);
        Character3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character3MouseDragged(evt);
            }
        });
        Character3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character3MouseReleased(evt);
            }
        });
        MapLayer.add(Character3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 90, 90));

        Character2.setVisible(false);
        Character2.setBorderPainted(false);
        Character2.setContentAreaFilled(false);
        Character2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Character2.setFocusPainted(false);
        Character2.setHideActionText(true);
        Character2.setMaximumSize(new java.awt.Dimension(90, 90));
        Character2.setMinimumSize(new java.awt.Dimension(90, 90));
        Character2.setPreferredSize(new java.awt.Dimension(90, 90));
        Character2.setRequestFocusEnabled(false);
        Character2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character2MouseDragged(evt);
            }
        });
        Character2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character2MouseReleased(evt);
            }
        });
        Character2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Character2ActionPerformed(evt);
            }
        });
        MapLayer.add(Character2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 90, 90));

        Character1.setVisible(false);
        Character1.setBorderPainted(false);
        Character1.setContentAreaFilled(false);
        Character1.setFocusPainted(false);
        Character1.setHideActionText(true);
        Character1.setMaximumSize(new java.awt.Dimension(90, 90));
        Character1.setMinimumSize(new java.awt.Dimension(90, 90));
        Character1.setPreferredSize(new java.awt.Dimension(90, 90));
        Character1.setRequestFocusEnabled(false);
        Character1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Character1MouseDragged(evt);
            }
        });
        Character1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Character1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Character1MouseReleased(evt);
            }
        });
        Character1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Character1ActionPerformed(evt);
            }
        });
        MapLayer.add(Character1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 90));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level1_map.png"))); // NOI18N
        Map.setToolTipText("");
        MapLayer.add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, -1));

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
        StatsLayer.add(CharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, -1));

        AttackLevel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AttackLevel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AttackLevel1.setBorder(null);
        AttackLevel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AttackLevel1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AttackLevel1.setEnabled(false);
        AttackLevel1.setOpaque(false);
        StatsLayer.add(AttackLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 30));

        AttackLevel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AttackLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AttackLevel.setBorder(null);
        AttackLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AttackLevel.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AttackLevel.setEnabled(false);
        AttackLevel.setOpaque(false);
        StatsLayer.add(AttackLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 40, 30));

        MaxHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaxHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaxHP.setBorder(null);
        MaxHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MaxHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        MaxHP.setEnabled(false);
        MaxHP.setOpaque(false);
        StatsLayer.add(MaxHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 40, 25));

        CurrentHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CurrentHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CurrentHP.setBorder(null);
        CurrentHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CurrentHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        CurrentHP.setEnabled(false);
        CurrentHP.setOpaque(false);
        StatsLayer.add(CurrentHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 40, 25));

        NamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NamePlateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NamePlateText.setBorder(null);
        NamePlateText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NamePlateText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        NamePlateText.setEnabled(false);
        NamePlateText.setOpaque(false);
        StatsLayer.add(NamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 25));

        NamePlateDecor.setForeground(new java.awt.Color(255, 255, 255));
        NamePlateDecor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlateDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate_decor.png"))); // NOI18N
        StatsLayer.add(NamePlateDecor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        NamePlate.setForeground(new java.awt.Color(255, 255, 255));
        NamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate.png"))); // NOI18N
        StatsLayer.add(NamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stats_border.png"))); // NOI18N
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
        TopBorderWaiting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/top_banner_waiting.png"))); // NOI18N
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
   
    private void Character1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character1MouseDragged
        moveCharacter(Character1);
    }//GEN-LAST:event_Character1MouseDragged

    private void Character2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character2MouseDragged
        moveCharacter(Character2);
    }//GEN-LAST:event_Character2MouseDragged

    private void Character1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character1MousePressed
        updateCharacterStats(Character1,1);
        
    }//GEN-LAST:event_Character1MousePressed

    private void Character2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character2MousePressed
        updateCharacterStats(Character2,2);
    }//GEN-LAST:event_Character2MousePressed

    private void Character1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character1MouseReleased
        checkForValidMove(Grid,Character1);        
    }//GEN-LAST:event_Character1MouseReleased

    private void Character2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character2MouseReleased
        checkForValidMove(Grid,Character2);
    }//GEN-LAST:event_Character2MouseReleased

    private void Character3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character3MouseDragged
        moveCharacter(Character3);
    }//GEN-LAST:event_Character3MouseDragged

    private void Character3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character3MousePressed
        updateCharacterStats(Character3,3);
    }//GEN-LAST:event_Character3MousePressed

    private void Character3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character3MouseReleased
        checkForValidMove(Grid,Character3);
    }//GEN-LAST:event_Character3MouseReleased

    private void Character4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character4MouseDragged
        moveCharacter(Character4);
    }//GEN-LAST:event_Character4MouseDragged

    private void Character4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character4MousePressed
        updateCharacterStats(Character4,4);
    }//GEN-LAST:event_Character4MousePressed

    private void Character4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character4MouseReleased
        checkForValidMove(Grid,Character4);
    }//GEN-LAST:event_Character4MouseReleased

    private void Character2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Character2ActionPerformed
        
    }//GEN-LAST:event_Character2ActionPerformed

    private void Character5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character5MouseDragged
        moveCharacter(Character5);
    }//GEN-LAST:event_Character5MouseDragged

    private void Character5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character5MousePressed
        updateCharacterStats(Character5,5);
    }//GEN-LAST:event_Character5MousePressed

    private void Character5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character5MouseReleased
        checkForValidMove(Grid,Character5);
    }//GEN-LAST:event_Character5MouseReleased

    private void Character6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character6MouseDragged
        moveCharacter(Character6);
    }//GEN-LAST:event_Character6MouseDragged

    private void Character6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character6MousePressed
        updateCharacterStats(Character6,6);
    }//GEN-LAST:event_Character6MousePressed

    private void Character6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character6MouseReleased
        checkForValidMove(Grid,Character6);
    }//GEN-LAST:event_Character6MouseReleased

    private void Character7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character7MouseDragged
        moveCharacter(Character7);
    }//GEN-LAST:event_Character7MouseDragged

    private void Character7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character7MousePressed
        updateCharacterStats(Character7,7);
    }//GEN-LAST:event_Character7MousePressed

    private void Character7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character7MouseReleased
        checkForValidMove(Grid,Character7);
    }//GEN-LAST:event_Character7MouseReleased

    private void Character8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character8MouseDragged
        moveCharacter(Character8);
    }//GEN-LAST:event_Character8MouseDragged

    private void Character8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character8MousePressed
        updateCharacterStats(Character8,8);
    }//GEN-LAST:event_Character8MousePressed

    private void Character8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Character8MouseReleased
        checkForValidMove(Grid,Character8);
    }//GEN-LAST:event_Character8MouseReleased

    private void Character1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Character1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Character1ActionPerformed

    private void Character8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Character8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Character8ActionPerformed

    //Checks to see whether the current mouse position is inside a specific component
    private boolean isMouseWithinComponent(Component c) {
        mouseLocation = MouseInfo.getPointerInfo().getLocation();
        bounds = c.getBounds();
        bounds.setLocation(c.getLocationOnScreen());
        return bounds.contains(mouseLocation);
    }
    
    //Checks to see whether a character is in a specific grid tile
    private boolean isCharacterWithinTile(Component character, Component tile) {
        bounds = tile.getBounds();
        bounds.setBounds((int)bounds.getX(), (int)bounds.getY() + TopBorderStats.getHeight(), (int)bounds.getWidth(), (int)bounds.getWidth());
        return character.getX()==bounds.getX() && character.getY()==bounds.getY() && character.getWidth()==bounds.getWidth() && character.getHeight()==bounds.getHeight();
    }
    
    //Checks if the character has made a valid move
    private void checkForValidMove(Component boundary, Component character) {
        if (isMouseWithinComponent(boundary)) {
            for (GridTile grid1 : grid) {
                if(isMouseWithinComponent(grid1.getTile()) && grid1.isAccessible() == true) {
                    character.setLocation(grid1.getTile().getX(), grid1.getTile().getY() + TopBorderStats.getHeight());
                    grid1.setAccessible(false);
                    for(GridTile grid2: grid) {
                        if(grid2.getTile().getX() == charInitialPoint.x && grid2.getTile().getY() + TopBorderStats.getHeight() == charInitialPoint.y) {
                            grid2.setAccessible(true);
                        }
                    }
                    break;
                } else {
                    character.setLocation(charInitialPoint);
                }
            }
        } else {
            character.setLocation(charInitialPoint);
        }
    }
    
    //Changes the position of the character button relative to the mouse position
    private void moveCharacter(Component character) {
        if (isMouseWithinComponent(MainContainer)) {
            mouseLocation = MouseInfo.getPointerInfo().getLocation();
            componentLocation = MainContainer.getLocationOnScreen();
            mouseLocation.x = mouseLocation.x - componentLocation.x - character.getWidth() / 2;
            mouseLocation.y = mouseLocation.y - componentLocation.y - character.getHeight() / 2;

            character.setLocation(mouseLocation);
        }
    }
    
    //Updates characters stats in Stats Layer once clicked on. Also gets the characters initial position when first clicked on
    private void updateCharacterStats(JToggleButton jtb, int partyPosition) {
        StatsLayer.setVisible(true);
        MapLayer.moveToFront(jtb);
        charInitialPoint = jtb.getLocation();
        if(partyPosition < 5) {
            CharacterPortrait.setIcon(allyParty.getArmyChar(partyPosition - 1).getBattlePortrait());
            NamePlateText.setText(allyParty.getArmyChar(partyPosition - 1).getName());
            CurrentHP.setText(allyParty.getArmyChar(partyPosition-1).getCurrentHP() + "");
            MaxHP.setText(allyParty.getArmyChar(partyPosition-1).getMaxHP() + "");
            AttackLevel.setText(allyParty.getArmyChar(partyPosition-1).getTotalAtk()+ "");
            AttackLevel1.setText(allyParty.getArmyChar(partyPosition-1).getTotalDef()+ "");
        } else {
            CharacterPortrait.setIcon(enemyParty.getArmyChar(partyPosition - 5).getBattlePortrait());
            NamePlateText.setText(enemyParty.getArmyChar(partyPosition - 5).getName());
            NamePlateText.setText(enemyParty.getArmyChar(partyPosition - 5).getName());
            CurrentHP.setText(enemyParty.getArmyChar(partyPosition-5).getCurrentHP() + "");
            MaxHP.setText(enemyParty.getArmyChar(partyPosition-5).getMaxHP() + "");
            AttackLevel.setText(enemyParty.getArmyChar(partyPosition-5).getTotalAtk()+ "");
            AttackLevel1.setText(enemyParty.getArmyChar(partyPosition-5).getTotalDef()+ "");
        }
    }
    
    //Initializes MapGUI variables before user input
    private void initMapGUI() {
        
        //Creates Level 1 Grid
        this.grid = new GridTile[]{new GridTile(pos00,true), new GridTile(pos01,false), new GridTile(pos02,false), new GridTile(pos03,true), new GridTile(pos04,true), new GridTile(pos05,false), 
                                   new GridTile(pos10,true), new GridTile(pos11,true), new GridTile(pos12,false), new GridTile(pos13,true), new GridTile(pos14,true), new GridTile(pos15,false), 
                                   new GridTile(pos20,true), new GridTile(pos21,true), new GridTile(pos22,true), new GridTile(pos23,true), new GridTile(pos24,false), new GridTile(pos25,true), 
                                   new GridTile(pos30,false), new GridTile(pos31,false), new GridTile(pos32,true), new GridTile(pos33,true), new GridTile(pos34,true), new GridTile(pos35,true), 
                                   new GridTile(pos40,true), new GridTile(pos41,true), new GridTile(pos42,true), new GridTile(pos43,true), new GridTile(pos44,true), new GridTile(pos45,true), 
                                   new GridTile(pos50,true), new GridTile(pos51,true), new GridTile(pos52,false), new GridTile(pos53,false), new GridTile(pos54,true), new GridTile(pos55,true), 
                                   new GridTile(pos60,true), new GridTile(pos61,true), new GridTile(pos62,true), new GridTile(pos63,false), new GridTile(pos64,false), new GridTile(pos65,true), 
                                   new GridTile(pos70,false), new GridTile(pos71,false), new GridTile(pos72,false), new GridTile(pos73,true), new GridTile(pos74,true), new GridTile(pos75,true)};
        
        //Connects the character array with the character buttons
        characters[0] = Character1;
        characters[1] = Character2;
        characters[2] = Character3;
        characters[3] = Character4;
        characters[4] = Character5;
        characters[5] = Character6;
        characters[6] = Character7;
        characters[7] = Character8;
        
        //Adds Level 1 enemies into enemy party
        enemyParty.addToArmy(new EnemyChar("Zeph"));
        enemyParty.addToArmy(new EnemyChar("BlackKnight"));
        enemyParty.addToArmy(new EnemyChar("Hawkeye"));
        
        //Displays the current ally team and enemy team
        for(int i = 0; i < 8; i++) {
            if(i < 4 && i < allyParty.getArmySize()) {
                characters[i].setVisible(true);
                characters[i].setIcon(allyParty.getArmyChar(i).getImg());
            } else if(i > 3 && (i-4) < enemyParty.getArmySize()) {
                characters[i].setIcon(enemyParty.getArmyChar(i-4).getImg());
                characters[i].setVisible(true);
            } else {
                continue;
            }
            
            //Upates grid for the character positions
            for(GridTile gt: grid) {
                if(isCharacterWithinTile(characters[i], gt.getTile())) {
                    gt.setAccessible(false);
                }
            }
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
    private javax.swing.JTextField AttackLevel;
    private javax.swing.JTextField AttackLevel1;
    private javax.swing.JLabel BattleWheel;
    private javax.swing.JLabel BottomBorder;
    private javax.swing.JToggleButton Character1;
    private javax.swing.JToggleButton Character2;
    private javax.swing.JToggleButton Character3;
    private javax.swing.JToggleButton Character4;
    private javax.swing.JToggleButton Character5;
    private javax.swing.JToggleButton Character6;
    private javax.swing.JToggleButton Character7;
    private javax.swing.JToggleButton Character8;
    private javax.swing.JLabel CharacterPortrait;
    private javax.swing.JTextField CurrentHP;
    private javax.swing.JButton DangerAreaButton;
    private javax.swing.JButton EndTurnButton;
    private javax.swing.JPanel Grid;
    private javax.swing.JLayeredPane MainContainer;
    private javax.swing.JLabel Map;
    private javax.swing.JLayeredPane MapLayer;
    private javax.swing.JTextField MaxHP;
    private javax.swing.JLayeredPane MenuButtonLayer;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateDecor;
    private javax.swing.JTextField NamePlateText;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StatsInterface;
    private javax.swing.JLayeredPane StatsLayer;
    private javax.swing.JLabel TopBorderStats;
    private javax.swing.JLabel TopBorderWaiting;
    private javax.swing.JLayeredPane WaitingStatsLayer;
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
