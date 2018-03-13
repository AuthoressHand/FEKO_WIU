/*
 * This class is the Map GUI.
 */
package feko_steffensmeierdoty;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import objects.*;

/**
 *
 * @author rms130
 */
public class MapGUI extends javax.swing.JFrame {

    private static CharacterModGUI cmGUI;
    private final JToggleButton[] characters = new JToggleButton[8];
    private Point mouseLocation;
    private Point componentLocation;
    private Rectangle bounds;
    private Point charInitialPoint;
    private Party allyParty;
    private Party enemyParty = new Party();
    private static GridTile[] grid;
    private boolean turn = true;
    private int damage;
    private Thread startPhaseAnimationThread;
    private Thread applyDamageAnimationThread;
    private Thread stageClearedAnimationThread;
    private String[] damageFonts;
    
    
    public MapGUI() {
        initComponents();
    }
    
    public MapGUI(Party party, CharacterModGUI cmGUI) {
        this.damageFonts = new String[]{"red0.png", "red1.png", "red2.png", "red3.png", "red4.png", "red5.png", "red6.png", "red7.png", "red8.png", "red9.png"};
        this.cmGUI = cmGUI;
        this.allyParty = party;
        initComponents();
        initMapGUI(party);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JLayeredPane();
        StageClearText = new javax.swing.JLabel();
        StageClearLogo = new javax.swing.JLabel();
        StageClearButton = new javax.swing.JLabel();
        PhaseLabel = new javax.swing.JLabel();
        MapLayer = new javax.swing.JLayeredPane();
        DamageLabel = new javax.swing.JLabel();
        EnemyCharacter4 = new javax.swing.JToggleButton();
        EnemyCharacter3 = new javax.swing.JToggleButton();
        EnemyCharacter2 = new javax.swing.JToggleButton();
        EnemyCharacter1 = new javax.swing.JToggleButton();
        AllyCharacter4 = new javax.swing.JToggleButton();
        AllyCharacter3 = new javax.swing.JToggleButton();
        AllyCharacter2 = new javax.swing.JToggleButton();
        AllyCharacter1 = new javax.swing.JToggleButton();
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
        LevelText = new javax.swing.JTextField();
        LevelProgresBar = new javax.swing.JProgressBar();
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
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(540, 925));
        setUndecorated(true);
        setResizable(false);

        MainContainer.setForeground(new java.awt.Color(255, 255, 255));
        MainContainer.setMaximumSize(new java.awt.Dimension(540, 925));
        MainContainer.setMinimumSize(new java.awt.Dimension(540, 925));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StageClearText.setVisible(false);
        StageClearText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StageClearText.setForeground(new java.awt.Color(255, 255, 255));
        StageClearText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stageClearText.png"))); // NOI18N
        StageClearText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StageClearTextMouseClicked(evt);
            }
        });
        MainContainer.add(StageClearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 490, 160));

        StageClearLogo.setVisible(false);
        StageClearLogo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StageClearLogo.setForeground(new java.awt.Color(255, 255, 255));
        StageClearLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stageClearLogo.png"))); // NOI18N
        StageClearLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StageClearLogoMouseClicked(evt);
            }
        });
        MainContainer.add(StageClearLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 220, 300));

        StageClearButton.setVisible(false);
        StageClearButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StageClearButton.setForeground(new java.awt.Color(255, 255, 255));
        StageClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StageClearButtonMouseClicked(evt);
            }
        });
        MainContainer.add(StageClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 930));

        PhaseLabel.setVisible(false);
        PhaseLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainContainer.add(PhaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        MapLayer.setEnabled(false);

        PhaseLabel.setVisible(false);
        DamageLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DamageLabel.setForeground(new java.awt.Color(255, 255, 255));
        MapLayer.add(DamageLabel);
        DamageLabel.setBounds(490, 870, 50, 60);

        EnemyCharacter4.setVisible(false);
        EnemyCharacter4.setBorderPainted(false);
        EnemyCharacter4.setContentAreaFilled(false);
        EnemyCharacter4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EnemyCharacter4.setFocusPainted(false);
        EnemyCharacter4.setHideActionText(true);
        EnemyCharacter4.setMaximumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter4.setMinimumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter4.setPreferredSize(new java.awt.Dimension(90, 90));
        EnemyCharacter4.setRequestFocusEnabled(false);
        EnemyCharacter4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EnemyCharacter4MouseDragged(evt);
            }
        });
        EnemyCharacter4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnemyCharacter4MouseReleased(evt);
            }
        });
        EnemyCharacter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnemyCharacter4ActionPerformed(evt);
            }
        });
        MapLayer.add(EnemyCharacter4);
        EnemyCharacter4.setBounds(180, 660, 90, 90);

        EnemyCharacter3.setVisible(false);
        EnemyCharacter3.setBorderPainted(false);
        EnemyCharacter3.setContentAreaFilled(false);
        EnemyCharacter3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EnemyCharacter3.setFocusPainted(false);
        EnemyCharacter3.setHideActionText(true);
        EnemyCharacter3.setMaximumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter3.setMinimumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter3.setPreferredSize(new java.awt.Dimension(90, 90));
        EnemyCharacter3.setRequestFocusEnabled(false);
        EnemyCharacter3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EnemyCharacter3MouseDragged(evt);
            }
        });
        EnemyCharacter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnemyCharacter3MouseReleased(evt);
            }
        });
        MapLayer.add(EnemyCharacter3);
        EnemyCharacter3.setBounds(0, 570, 90, 90);

        EnemyCharacter2.setVisible(false);
        EnemyCharacter2.setBorderPainted(false);
        EnemyCharacter2.setContentAreaFilled(false);
        EnemyCharacter2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EnemyCharacter2.setFocusPainted(false);
        EnemyCharacter2.setHideActionText(true);
        EnemyCharacter2.setMaximumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter2.setMinimumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter2.setPreferredSize(new java.awt.Dimension(90, 90));
        EnemyCharacter2.setRequestFocusEnabled(false);
        EnemyCharacter2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EnemyCharacter2MouseDragged(evt);
            }
        });
        EnemyCharacter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnemyCharacter2MouseReleased(evt);
            }
        });
        MapLayer.add(EnemyCharacter2);
        EnemyCharacter2.setBounds(0, 660, 90, 90);

        EnemyCharacter1.setVisible(false);
        EnemyCharacter1.setBorderPainted(false);
        EnemyCharacter1.setContentAreaFilled(false);
        EnemyCharacter1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EnemyCharacter1.setFocusPainted(false);
        EnemyCharacter1.setHideActionText(true);
        EnemyCharacter1.setMaximumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter1.setMinimumSize(new java.awt.Dimension(90, 90));
        EnemyCharacter1.setPreferredSize(new java.awt.Dimension(90, 90));
        EnemyCharacter1.setRequestFocusEnabled(false);
        EnemyCharacter1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EnemyCharacter1MouseDragged(evt);
            }
        });
        EnemyCharacter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EnemyCharacter1MouseReleased(evt);
            }
        });
        MapLayer.add(EnemyCharacter1);
        EnemyCharacter1.setBounds(90, 660, 90, 90);

        AllyCharacter4.setVisible(false);
        AllyCharacter4.setBorderPainted(false);
        AllyCharacter4.setContentAreaFilled(false);
        AllyCharacter4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        AllyCharacter4.setFocusPainted(false);
        AllyCharacter4.setHideActionText(true);
        AllyCharacter4.setMaximumSize(new java.awt.Dimension(90, 90));
        AllyCharacter4.setMinimumSize(new java.awt.Dimension(90, 90));
        AllyCharacter4.setPreferredSize(new java.awt.Dimension(90, 90));
        AllyCharacter4.setRequestFocusEnabled(false);
        AllyCharacter4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AllyCharacter4MouseDragged(evt);
            }
        });
        AllyCharacter4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllyCharacter4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AllyCharacter4MouseReleased(evt);
            }
        });
        MapLayer.add(AllyCharacter4);
        AllyCharacter4.setBounds(270, 210, 90, 90);

        AllyCharacter3.setVisible(false);
        AllyCharacter3.setBorderPainted(false);
        AllyCharacter3.setContentAreaFilled(false);
        AllyCharacter3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        AllyCharacter3.setFocusPainted(false);
        AllyCharacter3.setHideActionText(true);
        AllyCharacter3.setMaximumSize(new java.awt.Dimension(90, 90));
        AllyCharacter3.setMinimumSize(new java.awt.Dimension(90, 90));
        AllyCharacter3.setPreferredSize(new java.awt.Dimension(90, 90));
        AllyCharacter3.setRequestFocusEnabled(false);
        AllyCharacter3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AllyCharacter3MouseDragged(evt);
            }
        });
        AllyCharacter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllyCharacter3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AllyCharacter3MouseReleased(evt);
            }
        });
        MapLayer.add(AllyCharacter3);
        AllyCharacter3.setBounds(0, 210, 90, 90);

        AllyCharacter2.setVisible(false);
        AllyCharacter2.setBorderPainted(false);
        AllyCharacter2.setContentAreaFilled(false);
        AllyCharacter2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        AllyCharacter2.setFocusPainted(false);
        AllyCharacter2.setHideActionText(true);
        AllyCharacter2.setMaximumSize(new java.awt.Dimension(90, 90));
        AllyCharacter2.setMinimumSize(new java.awt.Dimension(90, 90));
        AllyCharacter2.setPreferredSize(new java.awt.Dimension(90, 90));
        AllyCharacter2.setRequestFocusEnabled(false);
        AllyCharacter2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AllyCharacter2MouseDragged(evt);
            }
        });
        AllyCharacter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllyCharacter2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AllyCharacter2MouseReleased(evt);
            }
        });
        AllyCharacter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllyCharacter2ActionPerformed(evt);
            }
        });
        MapLayer.add(AllyCharacter2);
        AllyCharacter2.setBounds(90, 300, 90, 90);

        AllyCharacter1.setVisible(false);
        AllyCharacter1.setBorderPainted(false);
        AllyCharacter1.setContentAreaFilled(false);
        AllyCharacter1.setFocusPainted(false);
        AllyCharacter1.setHideActionText(true);
        AllyCharacter1.setMaximumSize(new java.awt.Dimension(90, 90));
        AllyCharacter1.setMinimumSize(new java.awt.Dimension(90, 90));
        AllyCharacter1.setPreferredSize(new java.awt.Dimension(90, 90));
        AllyCharacter1.setRequestFocusEnabled(false);
        AllyCharacter1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                AllyCharacter1MouseDragged(evt);
            }
        });
        AllyCharacter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllyCharacter1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AllyCharacter1MouseReleased(evt);
            }
        });
        MapLayer.add(AllyCharacter1);
        AllyCharacter1.setBounds(0, 120, 90, 90);

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level1_map.png"))); // NOI18N
        Map.setToolTipText("");
        MapLayer.add(Map);
        Map.setBounds(0, 120, 540, 720);

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

        LevelText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LevelText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LevelText.setBorder(null);
        LevelText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LevelText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        LevelText.setEnabled(false);
        LevelText.setOpaque(false);
        StatsLayer.add(LevelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 20, 40));

        LevelProgresBar.setMaximumSize(new java.awt.Dimension(148, 35));
        LevelProgresBar.setMinimumSize(new java.awt.Dimension(148, 35));
        LevelProgresBar.setPreferredSize(new java.awt.Dimension(148, 35));
        StatsLayer.add(LevelProgresBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 10));
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

    private void EndTurnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseExited
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/endturn_button_idle.png")));
    }//GEN-LAST:event_EndTurnButtonMouseExited

    private void EndTurnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseEntered
        EndTurnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/endturn_button_active.png")));
    }//GEN-LAST:event_EndTurnButtonMouseEntered

    private void EndTurnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndTurnButtonMouseClicked

        for(JToggleButton jtb: characters) {
            jtb.setEnabled(true);
        }
        turn = turn != true;
        startPhaseAnimation();
    }//GEN-LAST:event_EndTurnButtonMouseClicked

    private void SettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseExited
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/settings_button_idle.png")));
    }//GEN-LAST:event_SettingsButtonMouseExited

    private void SettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseEntered
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/settings_button_hover.png")));
    }//GEN-LAST:event_SettingsButtonMouseEntered

    private void DangerAreaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseExited
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_idle.png")));
    }//GEN-LAST:event_DangerAreaButtonMouseExited

    private void DangerAreaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseEntered
        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_active.png")));
    }//GEN-LAST:event_DangerAreaButtonMouseEntered

    private void AllyCharacter1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter1MouseReleased
        if(turn == true && AllyCharacter1.isEnabled())
            performAction(Grid,AllyCharacter1, allyParty, 0);
    }//GEN-LAST:event_AllyCharacter1MouseReleased

    private void AllyCharacter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter1MousePressed
        charInitialPoint = AllyCharacter1.getLocation();
        updateCharacterStats(allyParty, 0);
    }//GEN-LAST:event_AllyCharacter1MousePressed

    private void AllyCharacter1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter1MouseDragged
        if(turn == true && AllyCharacter1.isEnabled())
            moveCharacter(AllyCharacter1);
    }//GEN-LAST:event_AllyCharacter1MouseDragged

    private void AllyCharacter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllyCharacter2ActionPerformed

    }//GEN-LAST:event_AllyCharacter2ActionPerformed

    private void AllyCharacter2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MouseReleased
        if(turn == true && AllyCharacter2.isEnabled())
            performAction(Grid,AllyCharacter2, allyParty, 1);
    }//GEN-LAST:event_AllyCharacter2MouseReleased

    private void AllyCharacter2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MousePressed
        charInitialPoint = AllyCharacter2.getLocation();
        updateCharacterStats(allyParty, 1);
    }//GEN-LAST:event_AllyCharacter2MousePressed

    private void AllyCharacter2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MouseDragged
        if(turn == true && AllyCharacter2.isEnabled())
            moveCharacter(AllyCharacter2);
    }//GEN-LAST:event_AllyCharacter2MouseDragged

    private void AllyCharacter3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MouseReleased
        if(turn == true && AllyCharacter3.isEnabled())
            performAction(Grid,AllyCharacter3, allyParty, 2);
    }//GEN-LAST:event_AllyCharacter3MouseReleased

    private void AllyCharacter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MousePressed
        charInitialPoint = AllyCharacter3.getLocation();
        updateCharacterStats(allyParty, 2);
    }//GEN-LAST:event_AllyCharacter3MousePressed

    private void AllyCharacter3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MouseDragged
        if(turn == true && AllyCharacter3.isEnabled())
            moveCharacter(AllyCharacter3);
    }//GEN-LAST:event_AllyCharacter3MouseDragged

    private void AllyCharacter4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MouseReleased
        if(turn == true && AllyCharacter4.isEnabled())
            performAction(Grid,AllyCharacter4, allyParty, 3);
    }//GEN-LAST:event_AllyCharacter4MouseReleased

    private void AllyCharacter4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MousePressed
        charInitialPoint = AllyCharacter4.getLocation();
        updateCharacterStats(allyParty, 3);
    }//GEN-LAST:event_AllyCharacter4MousePressed

    private void AllyCharacter4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MouseDragged
        if(turn == true && AllyCharacter4.isEnabled())
        moveCharacter(AllyCharacter4);
    }//GEN-LAST:event_AllyCharacter4MouseDragged

    private void EnemyCharacter1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter1MouseReleased
        if(turn == false && EnemyCharacter1.isEnabled())
            performAction(Grid,EnemyCharacter1, enemyParty, 0);
    }//GEN-LAST:event_EnemyCharacter1MouseReleased

    private void EnemyCharacter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter1MousePressed
        charInitialPoint = EnemyCharacter1.getLocation();
        updateCharacterStats(enemyParty, 0);
    }//GEN-LAST:event_EnemyCharacter1MousePressed

    private void EnemyCharacter1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter1MouseDragged
        if(turn == false && EnemyCharacter1.isEnabled()) {
            moveCharacter(EnemyCharacter1);
        }
    }//GEN-LAST:event_EnemyCharacter1MouseDragged

    private void EnemyCharacter2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter2MouseReleased
        if(turn == false && EnemyCharacter2.isEnabled())
            performAction(Grid,EnemyCharacter2, enemyParty, 1);
    }//GEN-LAST:event_EnemyCharacter2MouseReleased

    private void EnemyCharacter2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter2MousePressed
        charInitialPoint = EnemyCharacter2.getLocation();
        updateCharacterStats(enemyParty, 1);
    }//GEN-LAST:event_EnemyCharacter2MousePressed

    private void EnemyCharacter2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter2MouseDragged
        if(turn == false && EnemyCharacter2.isEnabled())
            moveCharacter(EnemyCharacter2);
    }//GEN-LAST:event_EnemyCharacter2MouseDragged

    private void EnemyCharacter3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter3MouseReleased
        if(turn == false && EnemyCharacter3.isEnabled())
            performAction(Grid,EnemyCharacter3, enemyParty, 2);
    }//GEN-LAST:event_EnemyCharacter3MouseReleased

    private void EnemyCharacter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter3MousePressed
        charInitialPoint = EnemyCharacter3.getLocation();
        updateCharacterStats(enemyParty, 2);
    }//GEN-LAST:event_EnemyCharacter3MousePressed

    private void EnemyCharacter3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter3MouseDragged
        if(turn == false && EnemyCharacter3.isEnabled())
            moveCharacter(EnemyCharacter3);
    }//GEN-LAST:event_EnemyCharacter3MouseDragged

    private void EnemyCharacter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnemyCharacter4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnemyCharacter4ActionPerformed

    private void EnemyCharacter4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter4MouseReleased
        if(turn == false && EnemyCharacter4.isEnabled())
            performAction(Grid,EnemyCharacter4, enemyParty, 3);
    }//GEN-LAST:event_EnemyCharacter4MouseReleased

    private void EnemyCharacter4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter4MousePressed
        charInitialPoint = EnemyCharacter4.getLocation();
        updateCharacterStats(enemyParty, 3);
    }//GEN-LAST:event_EnemyCharacter4MousePressed

    private void EnemyCharacter4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter4MouseDragged
        if(turn == false && EnemyCharacter4.isEnabled())
            moveCharacter(EnemyCharacter4);
    }//GEN-LAST:event_EnemyCharacter4MouseDragged

    private void StageClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearButtonMouseClicked
        cmGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_StageClearButtonMouseClicked

    private void StageClearLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StageClearLogoMouseClicked

    private void StageClearTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StageClearTextMouseClicked
       
    //Checks to see whether the current mouse position is inside a specific component
    private boolean isMouseWithinComponent(Component c) {
        try {    
            mouseLocation = MouseInfo.getPointerInfo().getLocation();
            bounds = c.getBounds();
            bounds.setLocation(c.getLocationOnScreen());
            return bounds.contains(mouseLocation);
        } catch(IllegalComponentStateException e) {
            return false;
        }
    }
    
    //Checks to see whether a character is in a specific grid tile
    private boolean isCharacterWithinTile(Component character, Component tile) {
        bounds = tile.getBounds();
        bounds.setBounds((int)bounds.getX(), (int)bounds.getY() + TopBorderStats.getHeight(), (int)bounds.getWidth(), (int)bounds.getWidth());
        return character.getX()==bounds.getX() && character.getY()==bounds.getY() && character.getWidth()==bounds.getWidth() && character.getHeight()==bounds.getHeight();
    }
    
    //Checks if the character has made a valid move
    private void performAction(Component mapBoundary, Component character, Party party, int armyPos) {
        //Checks if the mouse location is within the boundaries of the Map.
        if(isMouseWithinComponent(mapBoundary)) {
            //Iterates through and evaluates every GridTile
            for(GridTile grid1 : grid) {
                //If the mouse is within the GridTile and it is accessible, move Character to the GridTile and clean up its trace
                if(isMouseWithinComponent(grid1.getTile()) && grid1.isAccessible()) {
                    //Sets Character location and adds Character to the GridTile
                    character.setLocation(grid1.getTile().getX(), grid1.getTile().getY() + TopBorderStats.getHeight());
                    grid1.addCharacter(party.getArmyChar(armyPos));
                    
                    //Cleans up Character trace
                    for(GridTile grid2: grid) {
                        if(grid2.getTile().getX() == charInitialPoint.x && grid2.getTile().getY() + TopBorderStats.getHeight() == charInitialPoint.y) {
                            grid2.removeCharacter();
                        }
                    }
                    break;
                } 
                //If the mouse is within the GridTile, not accessible, and is occupied, check for damage, death, and stage over.
                else if((isMouseWithinComponent(grid1.getTile())) && grid1.isAccessible() == false && grid1.isOccupied()) {
                    checkCharacterDamage(party, grid1, character, armyPos);
                    checkCharacterDeath(grid1, party, party.getArmyChar(armyPos), armyPos);
                    checkStageOver();
                    character.setLocation(charInitialPoint);
                } 
                //Last Condition: If the GridTile is not accessible, reset the position of the Character.
                else if(grid1.isAccessible() == false){
                    character.setLocation(charInitialPoint);
                }
            }
        } 
        //If mouse location is not within the boundaries of the Map, reset Character position.
        else {
            character.setLocation(charInitialPoint);
        }
    }
    
    //Changes the position of the character button relative to the mouse position
    private void moveCharacter(Component character) {
        MapLayer.moveToFront(character);
        if(isMouseWithinComponent(MainContainer)) {
            mouseLocation = MouseInfo.getPointerInfo().getLocation();
            componentLocation = MainContainer.getLocationOnScreen();
            mouseLocation.x = mouseLocation.x - componentLocation.x - character.getWidth() / 2;
            mouseLocation.y = mouseLocation.y - componentLocation.y - character.getHeight() / 2;

            character.setLocation(mouseLocation);
        }
    }
    
    //Checks if either the allyParty or enemyParty is empty. If so, ends the stage with corresponding result(Win/Lose).
    private void checkStageOver() {
        int i = 0;
        int allyCounter = 0;
        int enemyCounter = 0;
        for(JToggleButton jtb: characters) {
            if(jtb.isVisible() && i<4){
                allyCounter++;
            } else if(jtb.isVisible() && i>3) {
                enemyCounter++;
            }
            if(i==4 && allyCounter == 0) {
                for(int j = 0; j < allyParty.getArmySize(); j++) {
                    allyParty.getArmyChar(j).resetHP();
                }
                GameOverGUI goGUI= new GameOverGUI(cmGUI);
                goGUI.setVisible(true);
                dispose();
            }
            if(i==7 && enemyCounter == 0) {
                for(int j = 0; j < allyParty.getArmySize(); j++) {
                    allyParty.getArmyChar(j).resetHP();
                }
                stageClearedAnimation();
            }
            i++;
        }
    }
    
    //Checks if the current Character's HP is below 1. If so, make character not visible and reset GridTile for accessible and not occupied.
    private void checkCharacterDeath(GridTile grid1, Party party, Char damageDealer, int armyPos) {
        if(grid1.getCharacter().getCurrentHP() < 1) {
            if(party.equals(allyParty)) {
                AllyChar allyChar = (AllyChar)damageDealer;
                allyChar.gainExperience(100);
                
                updateCharacterStats(party, armyPos);
                //Add LEVEL UP Animation
            }
            for(JToggleButton jtb: characters) {
                if(jtb.getIcon() != null && grid1.getCharacter() != null && jtb.getIcon().toString().equals(grid1.getCharacter().getImg().toString())) {
                    jtb.setVisible(false);
                    grid1.setAccessible(true);
                    grid1.setOccupied(null);
                }
            }
        }
    }
    
    //Checks whether a Character should deal damage or not.
    private void checkCharacterDamage(Party party, GridTile grid1, Component character, int armyPos) {
        //Checks if Character is own teammate. If so, return and don't do damage.
        for(int i=0; i < party.getArmySize(); i++) {
            if(grid1.getCharacter() == party.getArmyChar(i)) {
                character.setLocation(charInitialPoint);
                return;
            }
        }
        
        //Checks if Character is not own Character. If so, deal damage and check if turn has ended.
        if(!grid1.getCharacter().equals(party.getArmyChar(armyPos))) {
            //Apply damage and disable damage-dealer character
            grid1.getCharacter().changeHP(party.getArmyChar(armyPos).getTotalAtk());
            applyDamageAnimation(grid1.getCharacter(), grid1);
            character.setEnabled(false);
            
            checkForEndTurn(party);
        }
    }
    
    //Checks whether the turn should be automatically give up.
    private void checkForEndTurn(Party party) {
        int i = 0;
        for(JToggleButton jtb: characters) {
            if(party.equals(allyParty) && i < 4 && jtb.isVisible()) {
                if(jtb.isEnabled() == true) {
                    i = -1;
                    break;
                }
            }
            if(party.equals(enemyParty) && i > 3 && jtb.isVisible()) {
                if(jtb.isEnabled() == true) {
                    i = -1;
                    break;
                }
            }
            i++;
        }
        //If no characters in party have a turn left, the turn is given over automically. 
        if(i != -1) {
            for(JToggleButton jtbs: characters) {
                jtbs.setEnabled(true);
            }
            turn = turn != true;
            startPhaseAnimation();
        }
    }
    
    //Updates characters stats in Stats Layer once clicked on. Also gets the characters initial position when first clicked on
    private void updateCharacterStats(Party party, int partyPosition) {
        StatsLayer.setVisible(true);
        CharacterPortrait.setIcon(party.getArmyChar(partyPosition).getBattlePortrait());
        LevelText.setText(party.getArmyChar(partyPosition).getLevel() + "");
        NamePlateText.setText(party.getArmyChar(partyPosition).getName());
        CurrentHP.setText(party.getArmyChar(partyPosition).getCurrentHP() + "");
        MaxHP.setText(party.getArmyChar(partyPosition).getMaxHP() + "");
        AttackLevel.setText(party.getArmyChar(partyPosition).getTotalAtk()+ "");
        AttackLevel1.setText(party.getArmyChar(partyPosition).getTotalDef()+ "");
    }
    
    //Initializes MapGUI variables before user input
    private void initMapGUI(Party party) {
        
        //Creates Level 1 Grid
        MapGUI.grid = new GridTile[]{new GridTile(pos00,true), new GridTile(pos01,false), new GridTile(pos02,false), new GridTile(pos03,true), new GridTile(pos04,true), new GridTile(pos05,false), 
                                   new GridTile(pos10,true), new GridTile(pos11,true), new GridTile(pos12,false), new GridTile(pos13,true), new GridTile(pos14,true), new GridTile(pos15,false), 
                                   new GridTile(pos20,true), new GridTile(pos21,true), new GridTile(pos22,true), new GridTile(pos23,true), new GridTile(pos24,false), new GridTile(pos25,true), 
                                   new GridTile(pos30,false), new GridTile(pos31,false), new GridTile(pos32,true), new GridTile(pos33,true), new GridTile(pos34,true), new GridTile(pos35,true), 
                                   new GridTile(pos40,true), new GridTile(pos41,true), new GridTile(pos42,true), new GridTile(pos43,true), new GridTile(pos44,true), new GridTile(pos45,true), 
                                   new GridTile(pos50,true), new GridTile(pos51,true), new GridTile(pos52,false), new GridTile(pos53,false), new GridTile(pos54,true), new GridTile(pos55,true), 
                                   new GridTile(pos60,true), new GridTile(pos61,true), new GridTile(pos62,true), new GridTile(pos63,false), new GridTile(pos64,false), new GridTile(pos65,true), 
                                   new GridTile(pos70,false), new GridTile(pos71,false), new GridTile(pos72,false), new GridTile(pos73,true), new GridTile(pos74,true), new GridTile(pos75,true)};
        
        //Connects the character array with the character buttons
        characters[0] = AllyCharacter1;
        characters[1] = AllyCharacter2;
        characters[2] = AllyCharacter3;
        characters[3] = AllyCharacter4;
        characters[4] = EnemyCharacter1;
        characters[5] = EnemyCharacter2;
        characters[6] = EnemyCharacter3;
        characters[7] = EnemyCharacter4;
        
        //Adds Level 1 enemies into enemy party
        enemyParty.addToArmy(new EnemyChar("Zephiel"));
        enemyParty.addToArmy(new EnemyChar("Black Knight"));
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
            
            //Updates grid for the character positions
            for(GridTile gt: grid) {
                if(isCharacterWithinTile(characters[i], gt.getTile())) {
                    if(i < 4) {
                        gt.addCharacter(allyParty.getArmyChar(i));
                    }else {
                        gt.addCharacter(enemyParty.getArmyChar(i-4));
                    }
                }
            }
        }
        startPhaseAnimation();
    }
    
    //Begins the damage Animation
    private void applyDamageAnimation(Char damageDealer, GridTile gridTile) {
        applyDamageAnimationThread = new Thread(){
        @Override
        public void run() {
            try {
                MapLayer.moveToFront(DamageLabel);
                DamageLabel.setLocation(gridTile.getTile().getX() + AllyCharacter1.getWidth()/3, gridTile.getTile().getY() + TopBorderStats.getHeight() + AllyCharacter1.getHeight()/3);
                damage = damageDealer.getTotalAtk();
                DamageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + damageFonts[damage])));
                DamageLabel.setVisible(true);
                Thread.sleep(750);
                DamageLabel.setVisible(false);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }};
        applyDamageAnimationThread.start();
    }

    //Begins the phase animation
    private void startPhaseAnimation() {
        startPhaseAnimationThread = new Thread(){
        @Override
        public void run() {
            try {
                PhaseLabel.setVisible(true);
                if(turn == true) {
                    PhaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/playerPhase.png")));
                } else {
                    PhaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPhase.png")));
                }
                Thread.sleep(1500);
                PhaseLabel.setVisible(false);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }};
        startPhaseAnimationThread.start();
    }
    
    private void stageClearedAnimation() {
        MainContainer.moveToFront(StageClearLogo);
        MainContainer.moveToFront(StageClearText);
        MainContainer.moveToFront(StageClearButton);
        stageClearedAnimationThread = new Thread(){
        @Override
        public void run() {
            try {
                StageClearButton.setVisible(true);
                StageClearLogo.setVisible(true);
                Thread.sleep(750);
                StageClearText.setVisible(true);
                System.out.println("StageClearedRan");
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }};
        stageClearedAnimationThread.start();
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
    private javax.swing.JToggleButton AllyCharacter1;
    private javax.swing.JToggleButton AllyCharacter2;
    private javax.swing.JToggleButton AllyCharacter3;
    private javax.swing.JToggleButton AllyCharacter4;
    private javax.swing.JTextField AttackLevel;
    private javax.swing.JTextField AttackLevel1;
    private javax.swing.JLabel BattleWheel;
    private javax.swing.JLabel BottomBorder;
    private javax.swing.JLabel CharacterPortrait;
    private javax.swing.JTextField CurrentHP;
    private javax.swing.JLabel DamageLabel;
    private javax.swing.JButton DangerAreaButton;
    private javax.swing.JButton EndTurnButton;
    private javax.swing.JToggleButton EnemyCharacter1;
    private javax.swing.JToggleButton EnemyCharacter2;
    private javax.swing.JToggleButton EnemyCharacter3;
    private javax.swing.JToggleButton EnemyCharacter4;
    private javax.swing.JPanel Grid;
    private javax.swing.JProgressBar LevelProgresBar;
    private javax.swing.JTextField LevelText;
    private javax.swing.JLayeredPane MainContainer;
    private javax.swing.JLabel Map;
    private javax.swing.JLayeredPane MapLayer;
    private javax.swing.JTextField MaxHP;
    private javax.swing.JLayeredPane MenuButtonLayer;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateDecor;
    private javax.swing.JTextField NamePlateText;
    private javax.swing.JLabel PhaseLabel;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StageClearButton;
    private javax.swing.JLabel StageClearLogo;
    private javax.swing.JLabel StageClearText;
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