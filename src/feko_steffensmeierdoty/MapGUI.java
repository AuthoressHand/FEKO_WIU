/*
 * This class is the Map GUI.
 */
package feko_steffensmeierdoty;
import business.ActionManager;
import common.DamageType;
import common.WeaponType;
import java.awt.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.*;
import objects.*;

/**
 *
 * @author Justin Doty
 * @dateUpdated - 4/1/2018 - adding AI to map, calculating distance to nearest ally character, modified other methods so that it would run - Rose
 * @dateUpdated - 4/20/2018 - optimizing the code for readability, removing methods from Enemy buttons, adding extra difficulty to levels by grabbing ally level - Rose
 * @dateUpdated - 4/24/2018 - moving some of the code to ActionManager for optimization purposes - Rose
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
    private static GridTile[] lowerGrid;
    private static GridTile[] upperGrid;
    private final JLayeredPane[] charactersHP = new JLayeredPane[8];
    private final JLabel[] charactersHPOnes = new JLabel[8];
    private final JLabel[] charactersHPTens = new JLabel[8];
    private final JProgressBar[] characterHPBars = new JProgressBar[8];
    private boolean dangerArea = true;
    private boolean turn = true;
    private boolean positionMarker = false;
    private Thread startPhaseAnimationThread;
    private Thread applyDamageAnimationThread;
    private Thread stageClearedAnimationThread;
    private Thread fogAnimationThread;
    private Thread deathSound;
    private String[] damageFonts;
    private String[] enemyHPFonts;
    private String[] allyHPFonts;
    private int level;
    private ActionManager manager;
    private Media songFile;
    private MediaPlayer mediaPlayer;
    private MediaPlayer damagePlayer;
    private MediaPlayer phasePlayer;
    private MediaPlayer stageClearPlayer;
    private MediaPlayer selectPlayer;
    private MediaPlayer tilePlayer;
    private MediaPlayer endTurnPlayer;
    private MediaPlayer deathPlayer;
    
    
    public MapGUI() {
        initComponents();
    }
    
    public MapGUI(int level, Party party, CharacterModGUI cmGUI) {
        this.damageFonts = new String[]{"red0Dmg.png", "red1Dmg.png", "red2Dmg.png", "red3Dmg.png", "red4Dmg.png", "red5Dmg.png", "red6Dmg.png", "red7Dmg.png", "red8Dmg.png", "red9Dmg.png"};
        this.allyHPFonts = new String[]{"blue0HP.png", "blue1HP.png", "blue2HP.png", "blue3HP.png", "blue4HP.png", "blue5HP.png", "blue6HP.png", "blue7HP.png", "blue8HP.png", "blue9HP.png"};
        this.enemyHPFonts = new String[]{"red0HP.png", "red1HP.png", "red2HP.png", "red3HP.png", "red4HP.png", "red5HP.png", "red6HP.png", "red7HP.png", "red8HP.png", "red9HP.png"};
        this.level = level;
        this.cmGUI = cmGUI;
        this.allyParty = party;
        this.manager = new ActionManager();
        initSong();
        initComponents();
        initMapGUI();
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
        StageClearOrb = new javax.swing.JLabel();
        StageClearButton = new javax.swing.JLabel();
        MapLayer = new javax.swing.JLayeredPane();
        PhaseLabel = new javax.swing.JLabel();
        AttackPopUp = new javax.swing.JLabel();
        PhaseSeperator = new javax.swing.JLabel();
        DamageLabelTens = new javax.swing.JLabel();
        DamageLabelOnes = new javax.swing.JLabel();
        DamageSeperator = new javax.swing.JLabel();
        EnemyChar4HP = new javax.swing.JLayeredPane();
        EnemyChar4DmgTens = new javax.swing.JLabel();
        EnemyChar4DmgOnes = new javax.swing.JLabel();
        EnemyChar4HPBar = new javax.swing.JProgressBar();
        EnemyCharacter4 = new javax.swing.JToggleButton();
        EnemyChar3HP = new javax.swing.JLayeredPane();
        EnemyChar3DmgTens = new javax.swing.JLabel();
        EnemyChar3DmgOnes = new javax.swing.JLabel();
        EnemyChar3HPBar = new javax.swing.JProgressBar();
        EnemyCharacter3 = new javax.swing.JToggleButton();
        EnemyChar2HP = new javax.swing.JLayeredPane();
        EnemyChar2DmgTens = new javax.swing.JLabel();
        EnemyChar2DmgOnes = new javax.swing.JLabel();
        EnemyChar2HPBar = new javax.swing.JProgressBar();
        EnemyCharacter2 = new javax.swing.JToggleButton();
        EnemyChar1HP = new javax.swing.JLayeredPane();
        EnemyChar1DmgTens = new javax.swing.JLabel();
        EnemyChar1DmgOnes = new javax.swing.JLabel();
        EnemyChar1HPBar = new javax.swing.JProgressBar();
        EnemyCharacter1 = new javax.swing.JToggleButton();
        AllyChar4HP = new javax.swing.JLayeredPane();
        AllyChar4DmgTens = new javax.swing.JLabel();
        AllyChar4DmgOnes = new javax.swing.JLabel();
        AllyChar4HPBar = new javax.swing.JProgressBar();
        AllyCharacter4 = new javax.swing.JToggleButton();
        AllyChar3HP = new javax.swing.JLayeredPane();
        AllyChar3DmgTens = new javax.swing.JLabel();
        AllyChar3DmgOnes = new javax.swing.JLabel();
        AllyChar3HPBar = new javax.swing.JProgressBar();
        AllyCharacter3 = new javax.swing.JToggleButton();
        AllyChar2HP = new javax.swing.JLayeredPane();
        AllyChar2DmgTens = new javax.swing.JLabel();
        AllyChar2DmgOnes = new javax.swing.JLabel();
        AllyChar2HPBar = new javax.swing.JProgressBar();
        AllyCharacter2 = new javax.swing.JToggleButton();
        AllyChar1HP = new javax.swing.JLayeredPane();
        AllyChar1DmgTens = new javax.swing.JLabel();
        AllyChar1DmgOnes = new javax.swing.JLabel();
        AllyChar1HPBar = new javax.swing.JProgressBar();
        AllyCharacter1 = new javax.swing.JToggleButton();
        Fog2 = new javax.swing.JLabel();
        Fog1 = new javax.swing.JLabel();
        UpperGrid = new javax.swing.JPanel();
        pos1 = new javax.swing.JButton();
        pos2 = new javax.swing.JButton();
        pos3 = new javax.swing.JButton();
        pos4 = new javax.swing.JButton();
        pos5 = new javax.swing.JButton();
        pos6 = new javax.swing.JButton();
        pos16 = new javax.swing.JButton();
        pos17 = new javax.swing.JButton();
        pos18 = new javax.swing.JButton();
        pos19 = new javax.swing.JButton();
        pos26 = new javax.swing.JButton();
        pos27 = new javax.swing.JButton();
        pos28 = new javax.swing.JButton();
        pos29 = new javax.swing.JButton();
        pos36 = new javax.swing.JButton();
        pos37 = new javax.swing.JButton();
        pos38 = new javax.swing.JButton();
        pos39 = new javax.swing.JButton();
        pos46 = new javax.swing.JButton();
        pos47 = new javax.swing.JButton();
        pos48 = new javax.swing.JButton();
        pos49 = new javax.swing.JButton();
        pos56 = new javax.swing.JButton();
        pos57 = new javax.swing.JButton();
        pos58 = new javax.swing.JButton();
        pos59 = new javax.swing.JButton();
        pos66 = new javax.swing.JButton();
        pos67 = new javax.swing.JButton();
        pos68 = new javax.swing.JButton();
        pos69 = new javax.swing.JButton();
        pos76 = new javax.swing.JButton();
        pos77 = new javax.swing.JButton();
        pos78 = new javax.swing.JButton();
        pos79 = new javax.swing.JButton();
        pos80 = new javax.swing.JButton();
        pos81 = new javax.swing.JButton();
        pos82 = new javax.swing.JButton();
        pos83 = new javax.swing.JButton();
        pos84 = new javax.swing.JButton();
        pos85 = new javax.swing.JButton();
        pos86 = new javax.swing.JButton();
        pos87 = new javax.swing.JButton();
        pos88 = new javax.swing.JButton();
        pos89 = new javax.swing.JButton();
        pos90 = new javax.swing.JButton();
        pos91 = new javax.swing.JButton();
        pos92 = new javax.swing.JButton();
        pos93 = new javax.swing.JButton();
        LowerGrid = new javax.swing.JPanel();
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
        BattleStatsLayer = new javax.swing.JLayeredPane();
        EnemyAttack = new javax.swing.JTextField();
        AllyAttack = new javax.swing.JTextField();
        EnemyCurrentHP = new javax.swing.JTextField();
        EnemyEndHP = new javax.swing.JTextField();
        AllyEndHP = new javax.swing.JTextField();
        AllyCurrentHP = new javax.swing.JTextField();
        EnemyNamePlateText = new javax.swing.JTextField();
        EnemyNamePlateDecor = new javax.swing.JLabel();
        EnemyNamePlate = new javax.swing.JLabel();
        AllyNamePlateText = new javax.swing.JTextField();
        AllyNamePlateDecor = new javax.swing.JLabel();
        AllyNamePlate = new javax.swing.JLabel();
        BattleStatsInterface = new javax.swing.JLabel();
        EnemyCharacterPortrait = new javax.swing.JLabel();
        AllyCharacterPortrait = new javax.swing.JLabel();
        TopBattleBorderStats = new javax.swing.JLabel();
        StatsLayer = new javax.swing.JLayeredPane();
        LevelText = new javax.swing.JTextField();
        LevelProgressBar = new javax.swing.JProgressBar();
        CharacterPortrait = new javax.swing.JLabel();
        WeaponNameText = new javax.swing.JTextField();
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
        MainContainer.add(StageClearLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 190, 300));

        StageClearOrb.setVisible(false);
        StageClearOrb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StageClearOrb.setForeground(new java.awt.Color(255, 255, 255));
        StageClearOrb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/clearStageOrb.png"))); // NOI18N
        StageClearOrb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StageClearOrbMouseClicked(evt);
            }
        });
        MainContainer.add(StageClearOrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 570, 760));

        StageClearButton.setVisible(false);
        StageClearButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StageClearButton.setForeground(new java.awt.Color(255, 255, 255));
        StageClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/blackFilter.png"))); // NOI18N
        StageClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StageClearButtonMouseClicked(evt);
            }
        });
        MainContainer.add(StageClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 930));

        MapLayer.setEnabled(false);

        PhaseLabel.setVisible(false);
        PhaseLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPhase.png"))); // NOI18N
        MapLayer.add(PhaseLabel);
        PhaseLabel.setBounds(-540, 360, 500, 120);

        AttackPopUp.setVisible(false);
        AttackPopUp.setForeground(new java.awt.Color(255, 255, 255));
        AttackPopUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttackPopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/attackPopUp.png"))); // NOI18N
        MapLayer.add(AttackPopUp);
        AttackPopUp.setBounds(490, 880, 46, 45);

        PhaseSeperator.setVisible(false);
        PhaseSeperator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhaseSeperator.setForeground(new java.awt.Color(255, 255, 255));
        PhaseSeperator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/blackFilter.png"))); // NOI18N
        PhaseSeperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhaseSeperatorMouseClicked(evt);
            }
        });
        MapLayer.add(PhaseSeperator);
        PhaseSeperator.setBounds(0, 0, 540, 930);

        PhaseLabel.setVisible(false);
        DamageLabelTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DamageLabelTens.setForeground(new java.awt.Color(255, 255, 255));
        MapLayer.add(DamageLabelTens);
        DamageLabelTens.setBounds(490, 870, 50, 60);

        PhaseLabel.setVisible(false);
        DamageLabelOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DamageLabelOnes.setForeground(new java.awt.Color(255, 255, 255));
        MapLayer.add(DamageLabelOnes);
        DamageLabelOnes.setBounds(490, 870, 50, 60);

        DamageSeperator.setVisible(false);
        DamageSeperator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DamageSeperator.setForeground(new java.awt.Color(255, 255, 255));
        DamageSeperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DamageSeperatorMouseClicked(evt);
            }
        });
        MapLayer.add(DamageSeperator);
        DamageSeperator.setBounds(0, 0, 540, 930);

        EnemyChar4HP.setVisible(false);
        EnemyChar4HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyChar4DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar4DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar4DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar4HP.add(EnemyChar4DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        EnemyChar4DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar4DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar4DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar4HP.add(EnemyChar4DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        EnemyChar4HPBar.setBackground(new java.awt.Color(0, 0, 0));
        EnemyChar4HPBar.setForeground(new java.awt.Color(255, 51, 51));
        EnemyChar4HPBar.setBorderPainted(false);
        EnemyChar4HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        EnemyChar4HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        EnemyChar4HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        EnemyChar4HP.add(EnemyChar4HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(EnemyChar4HP);
        EnemyChar4HP.setBounds(0, 0, 90, 20);

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
        EnemyCharacter4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter4MousePressed(evt);
            }
        });
        MapLayer.add(EnemyCharacter4);
        EnemyCharacter4.setBounds(180, 660, 90, 90);

        EnemyChar3HP.setVisible(false);
        EnemyChar3HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyChar3DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar3DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar3DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar3HP.add(EnemyChar3DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        EnemyChar3DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar3DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar3DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar3HP.add(EnemyChar3DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        EnemyChar3HPBar.setBackground(new java.awt.Color(0, 0, 0));
        EnemyChar3HPBar.setForeground(new java.awt.Color(255, 51, 51));
        EnemyChar3HPBar.setBorderPainted(false);
        EnemyChar3HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        EnemyChar3HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        EnemyChar3HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        EnemyChar3HP.add(EnemyChar3HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(EnemyChar3HP);
        EnemyChar3HP.setBounds(0, 0, 90, 20);

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
        EnemyCharacter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter3MousePressed(evt);
            }
        });
        MapLayer.add(EnemyCharacter3);
        EnemyCharacter3.setBounds(0, 570, 90, 90);

        EnemyChar2HP.setVisible(false);
        EnemyChar2HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyChar2DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar2DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar2DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar2HP.add(EnemyChar2DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        EnemyChar2DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar2DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar2DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar2HP.add(EnemyChar2DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        EnemyChar2HPBar.setBackground(new java.awt.Color(0, 0, 0));
        EnemyChar2HPBar.setForeground(new java.awt.Color(255, 51, 51));
        EnemyChar2HPBar.setBorderPainted(false);
        EnemyChar2HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        EnemyChar2HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        EnemyChar2HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        EnemyChar2HP.add(EnemyChar2HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(EnemyChar2HP);
        EnemyChar2HP.setBounds(0, 0, 90, 20);

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
        EnemyCharacter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter2MousePressed(evt);
            }
        });
        MapLayer.add(EnemyCharacter2);
        EnemyCharacter2.setBounds(0, 660, 90, 90);

        EnemyChar1HP.setVisible(false);
        EnemyChar1HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyChar1DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar1DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar1DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar1HP.add(EnemyChar1DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        EnemyChar1DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnemyChar1DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        EnemyChar1DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        EnemyChar1HP.add(EnemyChar1DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        EnemyChar1HPBar.setBackground(new java.awt.Color(0, 0, 0));
        EnemyChar1HPBar.setForeground(new java.awt.Color(255, 51, 51));
        EnemyChar1HPBar.setBorderPainted(false);
        EnemyChar1HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        EnemyChar1HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        EnemyChar1HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        EnemyChar1HP.add(EnemyChar1HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(EnemyChar1HP);
        EnemyChar1HP.setBounds(0, 0, 90, 20);

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
        EnemyCharacter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnemyCharacter1MousePressed(evt);
            }
        });
        MapLayer.add(EnemyCharacter1);
        EnemyCharacter1.setBounds(90, 660, 90, 90);

        AllyChar4HP.setVisible(false);
        AllyChar4HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllyChar4DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar4DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar4DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar4HP.add(AllyChar4DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        AllyChar4DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar4DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar4DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar4HP.add(AllyChar4DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        AllyChar4HPBar.setBackground(new java.awt.Color(0, 0, 0));
        AllyChar4HPBar.setForeground(new java.awt.Color(102, 204, 255));
        AllyChar4HPBar.setBorderPainted(false);
        AllyChar4HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        AllyChar4HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        AllyChar4HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        AllyChar4HP.add(AllyChar4HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(AllyChar4HP);
        AllyChar4HP.setBounds(0, 0, 90, 20);

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

        AllyChar3HP.setVisible(false);
        AllyChar3HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllyChar3DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar3DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar3DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar3HP.add(AllyChar3DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        AllyChar3DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar3DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar3DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar3HP.add(AllyChar3DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        AllyChar3HPBar.setBackground(new java.awt.Color(0, 0, 0));
        AllyChar3HPBar.setForeground(new java.awt.Color(102, 204, 255));
        AllyChar3HPBar.setBorderPainted(false);
        AllyChar3HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        AllyChar3HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        AllyChar3HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        AllyChar3HP.add(AllyChar3HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(AllyChar3HP);
        AllyChar3HP.setBounds(0, 0, 90, 20);

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

        AllyChar2HP.setVisible(false);
        AllyChar2HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllyChar2DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar2DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar2DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar2HP.add(AllyChar2DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        AllyChar2DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar2DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar2DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar2HP.add(AllyChar2DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        AllyChar2HPBar.setBackground(new java.awt.Color(0, 0, 0));
        AllyChar2HPBar.setForeground(new java.awt.Color(102, 204, 255));
        AllyChar2HPBar.setBorderPainted(false);
        AllyChar2HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        AllyChar2HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        AllyChar2HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        AllyChar2HP.add(AllyChar2HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(AllyChar2HP);
        AllyChar2HP.setBounds(0, 0, 90, 20);

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
        MapLayer.add(AllyCharacter2);
        AllyCharacter2.setBounds(90, 300, 90, 90);

        AllyChar1HP.setVisible(false);
        AllyChar1HP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllyChar1DmgTens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar1DmgTens.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar1DmgTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar1HP.add(AllyChar1DmgTens, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 20));

        AllyChar1DmgOnes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AllyChar1DmgOnes.setForeground(new java.awt.Color(255, 255, 255));
        AllyChar1DmgOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png"))); // NOI18N
        AllyChar1HP.add(AllyChar1DmgOnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 20));

        AllyChar1HPBar.setBackground(new java.awt.Color(0, 0, 0));
        AllyChar1HPBar.setForeground(new java.awt.Color(102, 204, 255));
        AllyChar1HPBar.setBorderPainted(false);
        AllyChar1HPBar.setMaximumSize(new java.awt.Dimension(148, 35));
        AllyChar1HPBar.setMinimumSize(new java.awt.Dimension(148, 35));
        AllyChar1HPBar.setPreferredSize(new java.awt.Dimension(148, 35));
        AllyChar1HP.add(AllyChar1HPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 60, 10));

        MapLayer.add(AllyChar1HP);
        AllyChar1HP.setBounds(0, 0, 90, 20);

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

        Fog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/fog.png"))); // NOI18N
        Fog2.setToolTipText("");
        MapLayer.add(Fog2);
        Fog2.setBounds(0, 120, 540, 720);

        Fog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/fog.png"))); // NOI18N
        Fog1.setToolTipText("");
        MapLayer.add(Fog1);
        Fog1.setBounds(-540, 120, 540, 720);

        MainContainer.add(MapLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 930));

        UpperGrid.setOpaque(false);
        UpperGrid.setLayout(new java.awt.GridLayout(8, 6));

        pos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos1.setBorderPainted(false);
        pos1.setContentAreaFilled(false);
        UpperGrid.add(pos1);

        pos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos2.setBorderPainted(false);
        pos2.setContentAreaFilled(false);
        UpperGrid.add(pos2);

        pos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos3.setBorderPainted(false);
        pos3.setContentAreaFilled(false);
        UpperGrid.add(pos3);

        pos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos4.setBorderPainted(false);
        pos4.setContentAreaFilled(false);
        UpperGrid.add(pos4);

        pos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos5.setBorderPainted(false);
        pos5.setContentAreaFilled(false);
        UpperGrid.add(pos5);

        pos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos6.setBorderPainted(false);
        pos6.setContentAreaFilled(false);
        UpperGrid.add(pos6);

        pos16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos16.setBorderPainted(false);
        pos16.setContentAreaFilled(false);
        UpperGrid.add(pos16);

        pos17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos17.setBorderPainted(false);
        pos17.setContentAreaFilled(false);
        UpperGrid.add(pos17);

        pos18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos18.setBorderPainted(false);
        pos18.setContentAreaFilled(false);
        UpperGrid.add(pos18);

        pos19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos19.setBorderPainted(false);
        pos19.setContentAreaFilled(false);
        UpperGrid.add(pos19);

        pos26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos26.setBorderPainted(false);
        pos26.setContentAreaFilled(false);
        UpperGrid.add(pos26);

        pos27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos27.setBorderPainted(false);
        pos27.setContentAreaFilled(false);
        UpperGrid.add(pos27);

        pos28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos28.setBorderPainted(false);
        pos28.setContentAreaFilled(false);
        UpperGrid.add(pos28);

        pos29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos29.setBorderPainted(false);
        pos29.setContentAreaFilled(false);
        UpperGrid.add(pos29);

        pos36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos36.setBorderPainted(false);
        pos36.setContentAreaFilled(false);
        UpperGrid.add(pos36);

        pos37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos37.setBorderPainted(false);
        pos37.setContentAreaFilled(false);
        UpperGrid.add(pos37);

        pos38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos38.setBorderPainted(false);
        pos38.setContentAreaFilled(false);
        UpperGrid.add(pos38);

        pos39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos39.setBorderPainted(false);
        pos39.setContentAreaFilled(false);
        UpperGrid.add(pos39);

        pos46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos46.setBorderPainted(false);
        pos46.setContentAreaFilled(false);
        UpperGrid.add(pos46);

        pos47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos47.setBorderPainted(false);
        pos47.setContentAreaFilled(false);
        UpperGrid.add(pos47);

        pos48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos48.setBorderPainted(false);
        pos48.setContentAreaFilled(false);
        UpperGrid.add(pos48);

        pos49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos49.setBorderPainted(false);
        pos49.setContentAreaFilled(false);
        UpperGrid.add(pos49);

        pos56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos56.setBorderPainted(false);
        pos56.setContentAreaFilled(false);
        UpperGrid.add(pos56);

        pos57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos57.setBorderPainted(false);
        pos57.setContentAreaFilled(false);
        UpperGrid.add(pos57);

        pos58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos58.setBorderPainted(false);
        pos58.setContentAreaFilled(false);
        UpperGrid.add(pos58);

        pos59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos59.setBorderPainted(false);
        pos59.setContentAreaFilled(false);
        UpperGrid.add(pos59);

        pos66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos66.setBorderPainted(false);
        pos66.setContentAreaFilled(false);
        UpperGrid.add(pos66);

        pos67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos67.setBorderPainted(false);
        pos67.setContentAreaFilled(false);
        UpperGrid.add(pos67);

        pos68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos68.setBorderPainted(false);
        pos68.setContentAreaFilled(false);
        UpperGrid.add(pos68);

        pos69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos69.setBorderPainted(false);
        pos69.setContentAreaFilled(false);
        UpperGrid.add(pos69);

        pos76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos76.setBorderPainted(false);
        pos76.setContentAreaFilled(false);
        UpperGrid.add(pos76);

        pos77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos77.setBorderPainted(false);
        pos77.setContentAreaFilled(false);
        UpperGrid.add(pos77);

        pos78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos78.setBorderPainted(false);
        pos78.setContentAreaFilled(false);
        UpperGrid.add(pos78);

        pos79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos79.setBorderPainted(false);
        pos79.setContentAreaFilled(false);
        UpperGrid.add(pos79);

        pos80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos80.setBorderPainted(false);
        pos80.setContentAreaFilled(false);
        UpperGrid.add(pos80);

        pos81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos81.setBorderPainted(false);
        pos81.setContentAreaFilled(false);
        UpperGrid.add(pos81);

        pos82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos82.setBorderPainted(false);
        pos82.setContentAreaFilled(false);
        UpperGrid.add(pos82);

        pos83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos83.setBorderPainted(false);
        pos83.setContentAreaFilled(false);
        UpperGrid.add(pos83);

        pos84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos84.setBorderPainted(false);
        pos84.setContentAreaFilled(false);
        UpperGrid.add(pos84);

        pos85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos85.setBorderPainted(false);
        pos85.setContentAreaFilled(false);
        UpperGrid.add(pos85);

        pos86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos86.setBorderPainted(false);
        pos86.setContentAreaFilled(false);
        UpperGrid.add(pos86);

        pos87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos87.setBorderPainted(false);
        pos87.setContentAreaFilled(false);
        UpperGrid.add(pos87);

        pos88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos88.setBorderPainted(false);
        pos88.setContentAreaFilled(false);
        UpperGrid.add(pos88);

        pos89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos89.setBorderPainted(false);
        pos89.setContentAreaFilled(false);
        UpperGrid.add(pos89);

        pos90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos90.setBorderPainted(false);
        pos90.setContentAreaFilled(false);
        UpperGrid.add(pos90);

        pos91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos91.setBorderPainted(false);
        pos91.setContentAreaFilled(false);
        UpperGrid.add(pos91);

        pos92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos92.setBorderPainted(false);
        pos92.setContentAreaFilled(false);
        UpperGrid.add(pos92);

        pos93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos93.setBorderPainted(false);
        pos93.setContentAreaFilled(false);
        UpperGrid.add(pos93);

        MainContainer.add(UpperGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, 720));

        LowerGrid.setOpaque(false);
        LowerGrid.setLayout(new java.awt.GridLayout(8, 6));

        pos00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos00.setBorderPainted(false);
        pos00.setContentAreaFilled(false);
        LowerGrid.add(pos00);

        pos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos01.setBorderPainted(false);
        pos01.setContentAreaFilled(false);
        LowerGrid.add(pos01);

        pos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos02.setBorderPainted(false);
        pos02.setContentAreaFilled(false);
        LowerGrid.add(pos02);

        pos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos03.setBorderPainted(false);
        pos03.setContentAreaFilled(false);
        LowerGrid.add(pos03);

        pos04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos04.setBorderPainted(false);
        pos04.setContentAreaFilled(false);
        LowerGrid.add(pos04);

        pos05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos05.setBorderPainted(false);
        pos05.setContentAreaFilled(false);
        LowerGrid.add(pos05);

        pos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos10.setBorderPainted(false);
        pos10.setContentAreaFilled(false);
        LowerGrid.add(pos10);

        pos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos11.setBorderPainted(false);
        pos11.setContentAreaFilled(false);
        LowerGrid.add(pos11);

        pos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos12.setBorderPainted(false);
        pos12.setContentAreaFilled(false);
        LowerGrid.add(pos12);

        pos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos13.setBorderPainted(false);
        pos13.setContentAreaFilled(false);
        LowerGrid.add(pos13);

        pos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos14.setBorderPainted(false);
        pos14.setContentAreaFilled(false);
        LowerGrid.add(pos14);

        pos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos15.setBorderPainted(false);
        pos15.setContentAreaFilled(false);
        LowerGrid.add(pos15);

        pos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos20.setBorderPainted(false);
        pos20.setContentAreaFilled(false);
        LowerGrid.add(pos20);

        pos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos21.setBorderPainted(false);
        pos21.setContentAreaFilled(false);
        LowerGrid.add(pos21);

        pos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos22.setBorderPainted(false);
        pos22.setContentAreaFilled(false);
        LowerGrid.add(pos22);

        pos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos23.setBorderPainted(false);
        pos23.setContentAreaFilled(false);
        LowerGrid.add(pos23);

        pos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos24.setBorderPainted(false);
        pos24.setContentAreaFilled(false);
        LowerGrid.add(pos24);

        pos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos25.setBorderPainted(false);
        pos25.setContentAreaFilled(false);
        LowerGrid.add(pos25);

        pos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos30.setBorderPainted(false);
        pos30.setContentAreaFilled(false);
        LowerGrid.add(pos30);

        pos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos31.setBorderPainted(false);
        pos31.setContentAreaFilled(false);
        LowerGrid.add(pos31);

        pos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos32.setBorderPainted(false);
        pos32.setContentAreaFilled(false);
        LowerGrid.add(pos32);

        pos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos33.setBorderPainted(false);
        pos33.setContentAreaFilled(false);
        LowerGrid.add(pos33);

        pos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos34.setBorderPainted(false);
        pos34.setContentAreaFilled(false);
        LowerGrid.add(pos34);

        pos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos35.setBorderPainted(false);
        pos35.setContentAreaFilled(false);
        LowerGrid.add(pos35);

        pos40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos40.setBorderPainted(false);
        pos40.setContentAreaFilled(false);
        LowerGrid.add(pos40);

        pos41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos41.setBorderPainted(false);
        pos41.setContentAreaFilled(false);
        LowerGrid.add(pos41);

        pos42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos42.setBorderPainted(false);
        pos42.setContentAreaFilled(false);
        LowerGrid.add(pos42);

        pos43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos43.setBorderPainted(false);
        pos43.setContentAreaFilled(false);
        LowerGrid.add(pos43);

        pos44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos44.setBorderPainted(false);
        pos44.setContentAreaFilled(false);
        LowerGrid.add(pos44);

        pos45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos45.setBorderPainted(false);
        pos45.setContentAreaFilled(false);
        LowerGrid.add(pos45);

        pos50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos50.setBorderPainted(false);
        pos50.setContentAreaFilled(false);
        LowerGrid.add(pos50);

        pos51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos51.setBorderPainted(false);
        pos51.setContentAreaFilled(false);
        LowerGrid.add(pos51);

        pos52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos52.setBorderPainted(false);
        pos52.setContentAreaFilled(false);
        LowerGrid.add(pos52);

        pos53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos53.setBorderPainted(false);
        pos53.setContentAreaFilled(false);
        LowerGrid.add(pos53);

        pos54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos54.setBorderPainted(false);
        pos54.setContentAreaFilled(false);
        LowerGrid.add(pos54);

        pos55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos55.setBorderPainted(false);
        pos55.setContentAreaFilled(false);
        LowerGrid.add(pos55);

        pos60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos60.setBorderPainted(false);
        pos60.setContentAreaFilled(false);
        LowerGrid.add(pos60);

        pos61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos61.setBorderPainted(false);
        pos61.setContentAreaFilled(false);
        LowerGrid.add(pos61);

        pos62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos62.setBorderPainted(false);
        pos62.setContentAreaFilled(false);
        LowerGrid.add(pos62);

        pos63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos63.setBorderPainted(false);
        pos63.setContentAreaFilled(false);
        LowerGrid.add(pos63);

        pos64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos64.setBorderPainted(false);
        pos64.setContentAreaFilled(false);
        LowerGrid.add(pos64);

        pos65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos65.setBorderPainted(false);
        pos65.setContentAreaFilled(false);
        LowerGrid.add(pos65);

        pos70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos70.setBorderPainted(false);
        pos70.setContentAreaFilled(false);
        LowerGrid.add(pos70);

        pos71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos71.setBorderPainted(false);
        pos71.setContentAreaFilled(false);
        LowerGrid.add(pos71);

        pos72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos72.setBorderPainted(false);
        pos72.setContentAreaFilled(false);
        LowerGrid.add(pos72);

        pos73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos73.setBorderPainted(false);
        pos73.setContentAreaFilled(false);
        LowerGrid.add(pos73);

        pos74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos74.setBorderPainted(false);
        pos74.setContentAreaFilled(false);
        LowerGrid.add(pos74);

        pos75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png"))); // NOI18N
        pos75.setBorderPainted(false);
        pos75.setContentAreaFilled(false);
        LowerGrid.add(pos75);

        MainContainer.add(LowerGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 540, 720));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level1_map.png"))); // NOI18N
        Map.setToolTipText("");
        MainContainer.add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        MenuButtonLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DangerAreaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/dangerarea_button_idle.png"))); // NOI18N
        DangerAreaButton.setBorderPainted(false);
        DangerAreaButton.setContentAreaFilled(false);
        DangerAreaButton.setFocusPainted(false);
        DangerAreaButton.setMaximumSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.setMinimumSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.setPreferredSize(new java.awt.Dimension(90, 90));
        DangerAreaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangerAreaButtonMouseClicked(evt);
            }
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

        BattleStatsLayer.setVisible(false);
        BattleStatsLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnemyAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnemyAttack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnemyAttack.setBorder(null);
        EnemyAttack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnemyAttack.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        EnemyAttack.setEnabled(false);
        EnemyAttack.setOpaque(false);
        BattleStatsLayer.add(EnemyAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 40, 30));

        AllyAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AllyAttack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AllyAttack.setBorder(null);
        AllyAttack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AllyAttack.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AllyAttack.setEnabled(false);
        AllyAttack.setOpaque(false);
        BattleStatsLayer.add(AllyAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 40, 30));

        EnemyCurrentHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnemyCurrentHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnemyCurrentHP.setBorder(null);
        EnemyCurrentHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnemyCurrentHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        EnemyCurrentHP.setEnabled(false);
        EnemyCurrentHP.setOpaque(false);
        BattleStatsLayer.add(EnemyCurrentHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 40, 25));

        EnemyEndHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnemyEndHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnemyEndHP.setBorder(null);
        EnemyEndHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnemyEndHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        EnemyEndHP.setEnabled(false);
        EnemyEndHP.setOpaque(false);
        BattleStatsLayer.add(EnemyEndHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, 25));

        AllyEndHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AllyEndHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AllyEndHP.setBorder(null);
        AllyEndHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AllyEndHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AllyEndHP.setEnabled(false);
        AllyEndHP.setOpaque(false);
        BattleStatsLayer.add(AllyEndHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 40, 25));

        AllyCurrentHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AllyCurrentHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AllyCurrentHP.setBorder(null);
        AllyCurrentHP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AllyCurrentHP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AllyCurrentHP.setEnabled(false);
        AllyCurrentHP.setOpaque(false);
        BattleStatsLayer.add(AllyCurrentHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 40, 25));

        EnemyNamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnemyNamePlateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnemyNamePlateText.setBorder(null);
        EnemyNamePlateText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnemyNamePlateText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        EnemyNamePlateText.setEnabled(false);
        EnemyNamePlateText.setOpaque(false);
        BattleStatsLayer.add(EnemyNamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, 25));

        EnemyNamePlateDecor.setForeground(new java.awt.Color(255, 255, 255));
        EnemyNamePlateDecor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyNamePlateDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemy_name_plate_decor.png"))); // NOI18N
        BattleStatsLayer.add(EnemyNamePlateDecor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        EnemyNamePlate.setForeground(new java.awt.Color(255, 255, 255));
        EnemyNamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyNamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate_red.png"))); // NOI18N
        BattleStatsLayer.add(EnemyNamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        AllyNamePlateText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AllyNamePlateText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AllyNamePlateText.setBorder(null);
        AllyNamePlateText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AllyNamePlateText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        AllyNamePlateText.setEnabled(false);
        AllyNamePlateText.setOpaque(false);
        BattleStatsLayer.add(AllyNamePlateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 25));

        AllyNamePlateDecor.setForeground(new java.awt.Color(255, 255, 255));
        AllyNamePlateDecor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AllyNamePlateDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate_decor.png"))); // NOI18N
        BattleStatsLayer.add(AllyNamePlateDecor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        AllyNamePlate.setForeground(new java.awt.Color(255, 255, 255));
        AllyNamePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AllyNamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate.png"))); // NOI18N
        BattleStatsLayer.add(AllyNamePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        BattleStatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stats_border_3.png"))); // NOI18N
        BattleStatsLayer.add(BattleStatsInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));
        BattleStatsLayer.add(EnemyCharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));
        BattleStatsLayer.add(AllyCharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, -1));

        TopBattleBorderStats.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TopBattleBorderStats.setForeground(new java.awt.Color(255, 255, 255));
        TopBattleBorderStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/top_battle_border_stats.png"))); // NOI18N
        BattleStatsLayer.add(TopBattleBorderStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        MainContainer.add(BattleStatsLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 120));
        StatsLayer.setVisible(false);

        StatsLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LevelText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LevelText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LevelText.setBorder(null);
        LevelText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LevelText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        LevelText.setEnabled(false);
        LevelText.setOpaque(false);
        StatsLayer.add(LevelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 20, 40));

        LevelProgressBar.setBackground(new java.awt.Color(0, 0, 0));
        LevelProgressBar.setForeground(new java.awt.Color(102, 204, 255));
        LevelProgressBar.setMaximumSize(new java.awt.Dimension(148, 35));
        LevelProgressBar.setMinimumSize(new java.awt.Dimension(148, 35));
        LevelProgressBar.setPreferredSize(new java.awt.Dimension(148, 35));
        StatsLayer.add(LevelProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 10));
        StatsLayer.add(CharacterPortrait, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, -1));

        WeaponNameText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        WeaponNameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WeaponNameText.setBorder(null);
        WeaponNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WeaponNameText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        WeaponNameText.setEnabled(false);
        WeaponNameText.setOpaque(false);
        StatsLayer.add(WeaponNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 35, 140, 30));

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

        StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stats_border_1.png"))); // NOI18N
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
        this.endTurn();
        this.enemyAI();
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
        mouseReleased(AllyCharacter1, AllyChar1HP, 0);
    }//GEN-LAST:event_AllyCharacter1MouseReleased

    private void AllyCharacter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter1MousePressed
        mousePressed(AllyCharacter1, allyParty, 0);
    }//GEN-LAST:event_AllyCharacter1MousePressed

    private void AllyCharacter1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter1MouseDragged
        mouseDragged(AllyCharacter1, AllyChar1HP, 0);
    }//GEN-LAST:event_AllyCharacter1MouseDragged

    private void AllyCharacter3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MouseReleased
        mouseReleased(AllyCharacter3, AllyChar3HP, 2);
    }//GEN-LAST:event_AllyCharacter3MouseReleased

    private void AllyCharacter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MousePressed
        mousePressed(AllyCharacter3, allyParty, 2);
    }//GEN-LAST:event_AllyCharacter3MousePressed

    private void AllyCharacter3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter3MouseDragged
        mouseDragged(AllyCharacter3, AllyChar3HP, 2);
    }//GEN-LAST:event_AllyCharacter3MouseDragged

    private void AllyCharacter4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MouseReleased
        mouseReleased(AllyCharacter4, AllyChar4HP, 3);
    }//GEN-LAST:event_AllyCharacter4MouseReleased

    private void AllyCharacter4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MousePressed
        mousePressed(AllyCharacter4, allyParty, 3);
    }//GEN-LAST:event_AllyCharacter4MousePressed

    private void AllyCharacter4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter4MouseDragged
        mouseDragged(AllyCharacter4, AllyChar4HP, 3);
    }//GEN-LAST:event_AllyCharacter4MouseDragged

    private void EnemyCharacter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter1MousePressed
        mousePressed(EnemyCharacter1, enemyParty, 0);
    }//GEN-LAST:event_EnemyCharacter1MousePressed

    private void EnemyCharacter2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter2MousePressed
        mousePressed(EnemyCharacter2, enemyParty, 1);
    }//GEN-LAST:event_EnemyCharacter2MousePressed

    private void EnemyCharacter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter3MousePressed
        mousePressed(EnemyCharacter3, enemyParty, 2);
    }//GEN-LAST:event_EnemyCharacter3MousePressed

    private void EnemyCharacter4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnemyCharacter4MousePressed
        mousePressed(EnemyCharacter4, enemyParty, 3);
    }//GEN-LAST:event_EnemyCharacter4MousePressed

    private void StageClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearButtonMouseClicked
        cmGUI.initSong();
        cmGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_StageClearButtonMouseClicked

    private void StageClearLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearLogoMouseClicked
        cmGUI.initSong();
        cmGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_StageClearLogoMouseClicked

    private void StageClearTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearTextMouseClicked
        cmGUI.initSong();
        cmGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_StageClearTextMouseClicked

    private void DangerAreaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangerAreaButtonMouseClicked
        selectSound();
        if(dangerArea == true) {
            for(int i = 0; i < characters.length; i++) {
               if(i > 3 && characters[i].isVisible()) {
                   showPossibleMoves(enemyParty, i - 4, false);
               }
            }
            for(GridTile gt: lowerGrid) {
                if(!gt.getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")).toString()) && !gt.getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")).toString())) {
                    gt.getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")));
                }
            }
            dangerArea = false;
        } else {
            resetPositionMarkers();
            dangerArea = true;
        }
    }//GEN-LAST:event_DangerAreaButtonMouseClicked

    private void AllyCharacter2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MouseReleased
        mouseReleased(AllyCharacter2, AllyChar2HP, 1);
    }//GEN-LAST:event_AllyCharacter2MouseReleased

    private void AllyCharacter2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MousePressed
        mousePressed(AllyCharacter2, allyParty, 1);
    }//GEN-LAST:event_AllyCharacter2MousePressed

    private void AllyCharacter2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllyCharacter2MouseDragged
        mouseDragged(AllyCharacter2, AllyChar2HP, 1);
    }//GEN-LAST:event_AllyCharacter2MouseDragged

    private void PhaseSeperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhaseSeperatorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PhaseSeperatorMouseClicked

    private void DamageSeperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DamageSeperatorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DamageSeperatorMouseClicked

    private void StageClearOrbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StageClearOrbMouseClicked
        cmGUI.initSong();
        cmGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_StageClearOrbMouseClicked
       
    //ends the current turn
    private void endTurn() {
        for(JToggleButton jtb: characters) {
            jtb.setEnabled(true);
        }
        turn = turn != true;
        resetPositionMarkers();
        //startPhaseAnimation();
    }

    //AI for the EnemyChar
    private void enemyAI() {
        //loop through all of the characters and find their buttons
        for (int h = 4; h < 8; h++) {
            //get current character and current button
            JToggleButton currentButton = characters[h];
            Char currentChar = enemyParty.getArmyChar(h - 4);
            
            //if the current enemy character is null, then go to the next one
            if (currentChar == null || currentChar.getCurrentHP() <= 0)
                continue;
            
            //get the GridTile that the character will move to
            int square = -1;
            int currentSpace = 0;
            
            for (int i = 0; i < lowerGrid.length; i++)
                if (lowerGrid[i].getCharacter() == currentChar) {
                    currentSpace = i;
                    square = this.calculateNewPlace(currentChar, currentSpace);
                }
            
            //if the number returned is equal to the current space, the character will not move
            if (square == currentSpace)
                continue;
            
            //attack if the distance = 0
            if (lowerGrid[square].getDistance() == 0) {
                //attack the closest character, then update everything
                this.checkCharacterDamage(enemyParty, lowerGrid[square], characters[h], charactersHP[h], h-4);
                this.resetPositionMarkers();
                this.checkCharacterDeath(square, enemyParty, currentChar, h-4);
                
                //check to see if there is a game over
                this.checkStageOver();
                
                //update the lables of the characters' stats
                this.updateCharactersHP();
                
                //update location of ally characters if it died
                this.recalculateLocationOfAllyChars();
            }
            else {
                //get the right coordinate
                Point goToHere = new Point();
                JButton goHere = lowerGrid[square].getTile();
                goToHere.x = goHere.getX();
                goToHere.y = goHere.getY() + 120;
                
                //move the character
                currentButton.setLocation(goToHere);
                charactersHP[h].setLocation(new Point(goToHere.x, goToHere.y + 70));
                
                //reset to the closest square
                lowerGrid[square].addCharacter(currentChar, enemyParty);
                lowerGrid[currentSpace].removeCharacter();
                
                //just to be on the safe side, clean up the enemy trace
                this.cleanUpEnemyTrace(currentSpace);
            }
        }
        
        this.endTurn();
    }
    
    //used to calculate which square the character will move to
    private int calculateNewPlace(Char currentChar, int currentSpace) {
        return manager.calculateNewPlace(lowerGrid, currentChar, currentSpace);
    }
    
    //Recalculates the GridTiles based on where the 
    private void recalculateLocationOfAllyChars() {
        //resets all of the distances starting at the newest location and working around from there if the character inside a GridTile is a 
        manager.recalculateLocationOfAllyChars(lowerGrid);
        
        //set all values to upperGrid as well
        for (int i = 0; i < lowerGrid.length; i++)
            upperGrid[i].setDistance(lowerGrid[i].getDistance());
    }
    
    //shoots off code when mouse is pressed on any of the character buttons
    private void mousePressed(JToggleButton currentButton, Party currentParty, int currentCharacter) {
        charInitialPoint = currentButton.getLocation();
        updateCharacterStats(currentParty, currentCharacter);
        showPossibleMoves(currentParty, currentCharacter, true);
    }
    
    //shoots off code when mouse draggs an ally character button
    private void mouseDragged(JToggleButton currentButton, JLayeredPane currentPane, int currentCharacter) {
        if(turn == true && currentButton.isEnabled())
        moveCharacter(currentButton,  currentPane, allyParty, currentCharacter);
    }
    
    //shoots off code when mouse releases an ally character button
    private void mouseReleased(JToggleButton currentButton, JLayeredPane currentPane, int currentCharacter) {
        if(turn == true && currentButton.isEnabled())
        performAction(LowerGrid, currentButton, currentPane, allyParty, currentCharacter);
    }
    
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
    private void performAction(Component mapBoundary, Component character, JLayeredPane characterHP, Party party, int armyPos) {
        
        AttackPopUp.setVisible(false);
        BattleStatsLayer.setVisible(false);
        
        //Checks if the mouse location is within the boundaries of the Map.
        if(isMouseWithinComponent(mapBoundary)) {
            //Iterates through and evaluates every GridTile
            for(int j = 0; j < lowerGrid.length; j++) {
                cleanUpEnemyTrace(j);
                //If the mouse is within the GridTile and it is accessible, move Character to the GridTile and clean up its trace
                if(isMouseWithinComponent(lowerGrid[j].getTile()) && lowerGrid[j].isAccessible() && lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/bluePositionMarker.png")).toString())) {
                    //Sets Character location and adds Character to the GridTile
                    checkForEndTurn(party);
                    character.setLocation(lowerGrid[j].getTile().getX(), lowerGrid[j].getTile().getY() + TopBorderStats.getHeight());
                    characterHP.setLocation(lowerGrid[j].getTile().getX(), lowerGrid[j].getTile().getY() + TopBorderStats.getHeight() + 70);
                    
                    if(character.getLocation() == charInitialPoint) {
                        break;
                    }
                    lowerGrid[j].addCharacter(party.getArmyChar(armyPos), party);
                    
                    //Cleans up Character trace
                    for(GridTile grid2: lowerGrid) {
                        if(grid2.getTile().getX() == charInitialPoint.x && grid2.getTile().getY() + TopBorderStats.getHeight() == charInitialPoint.y) {
                            grid2.removeCharacter();
                        }
                    }
                    resetPositionMarkers();
                    character.setEnabled(false);
                    endTurnSound();
                    checkForEndTurn(party);
                    break;
                } 
                //If the mouse is within the GridTile, not accessible, and is occupied, check for damage, death, and stage over.
                else if((isMouseWithinComponent(lowerGrid[j].getTile())) && lowerGrid[j].isAccessible() == false && lowerGrid[j].isOccupied() && !lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")).toString()) && !lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")).toString())) {
                    checkCharacterDamage(party, lowerGrid[j], character, characterHP, armyPos);
                    resetPositionMarkers();
                    checkCharacterDeath(j, party, party.getArmyChar(armyPos), armyPos);
                    checkStageOver();   
                    checkForEndTurn(party);
                } 
                //Last Condition: If the GridTile is not accessible, reset the position of the Character.
                else if(lowerGrid[j].isAccessible() == false){
                    character.setLocation(charInitialPoint);
                    characterHP.setLocation(new Point((int)charInitialPoint.getX(), (int)charInitialPoint.getY() + 70));
                }
            }
            updateCharactersHP();
            cleanUpAllyTrace(character, party, armyPos);
                    
        } 
        //If mouse location is not within the boundaries of the Map, reset Character position.
        else {
            character.setLocation(charInitialPoint);
            characterHP.setLocation(new Point((int)charInitialPoint.getX(), (int)charInitialPoint.getY() + 70));
            cleanUpAllyTrace(character, party, armyPos);
        }
    }
    
    private void cleanUpAllyTrace(Component character, Party party, int armyPos) {
        if(party == allyParty) {
            for(int i = 0; i < upperGrid.length - 1; i++) {
                if(upperGrid[i].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")).toString()) && upperGrid[i].getCharacter() != null && upperGrid[i].getCharacter().equals(party.getArmyChar(armyPos))) {
                    upperGrid[i].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                    upperGrid[i].removeCharacter();
                }
            }
            for(int i = 0; i < upperGrid.length - 1; i++) {
                if(upperGrid[i].getTile().getLocation().equals(new Point(character.getX(), character.getY() - TopBorderStats.getHeight()))) {
                    upperGrid[i].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")));
                    return;
                }
            }
        }
    }
    
    private void cleanUpEnemyTrace(int j) {
        if(upperGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPositionMarker.png")).toString())) {
            upperGrid[j].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
        }
    }
    
    private void resetPositionMarkers() {
        for(GridTile gt1: lowerGrid) {
            if(!gt1.getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")).toString())) {
                gt1.getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
            }
        }
        this.recalculateLocationOfAllyChars();
    }
    
    //Changes the position of the character button relative to the mouse position
    private void moveCharacter(Component character, JLayeredPane characterHP,Party party, int armyPos) {
        AttackPopUp.setVisible(false);
        BattleStatsLayer.setVisible(false);
        MapLayer.moveToFront(character);
        MapLayer.moveToFront(characterHP);
        if(isMouseWithinComponent(MainContainer)) {
            mouseLocation = MouseInfo.getPointerInfo().getLocation();
            componentLocation = MainContainer.getLocationOnScreen();
            mouseLocation.x = mouseLocation.x - componentLocation.x - character.getWidth() / 2;
            mouseLocation.y = mouseLocation.y - componentLocation.y - character.getHeight() / 2;

            //Updates GridTile to show blue marker wherever character goes to
            if(party == allyParty) {    
                for(int j = 0; j < upperGrid.length - 1; j++) {
                    cleanUpEnemyTrace(j);
                    //Moves ally marker
                    if(upperGrid[j].getTile().getBounds().contains(mouseLocation.x + character.getWidth()/2, mouseLocation.y - TopBorderStats.getHeight() + character.getHeight()/2) && upperGrid[j].isAccessible() && lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/bluePositionMarker.png")).toString())) {
                        upperGrid[j].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")));
                        upperGrid[j].addCharacter(party.getArmyChar(armyPos), party);
                        tileSound();
                        
                        //Cleans up character trace
                        for(int i = 0; i < upperGrid.length - 1; i++) {
                            if((upperGrid[i].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPositionMarker.png")).toString())||upperGrid[i].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")).toString())) && !lowerGrid[i].getTile().equals(lowerGrid[j].getTile()) && upperGrid[i].getCharacter() != null && upperGrid[i].getCharacter().equals(party.getArmyChar(armyPos))) {
                                upperGrid[i].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                                upperGrid[i].removeCharacter();
                            }
                        }
                    }
                    //Adds battle icon above enemies when hovered over
                    else if(upperGrid[j].getTile().getBounds().contains(mouseLocation.x + character.getWidth()/2, mouseLocation.y - TopBorderStats.getHeight() + character.getHeight()/2) && lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/darkRedPositionMarker.png")).toString())) {
                        for(GridTile gt: upperGrid) {
                            if(gt.getTile().getLocation().equals(new Point(charInitialPoint.x,charInitialPoint.y - TopBorderStats.getHeight()))) {
                                gt.getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")));
                                gt.addCharacter(party.getArmyChar(armyPos), party);
                                break;
                            }
                        }
                        BattleStatsLayer.setVisible(true);
                        updateBattleStatsLayer(party.getArmyChar(armyPos),lowerGrid[j].getCharacter());
                        MapLayer.moveToFront(AttackPopUp);
                        AttackPopUp.setVisible(true);
                        AttackPopUp.setLocation(new Point(upperGrid[j].getTile().getX() + character.getWidth()/4, upperGrid[j].getTile().getY() + TopBorderStats.getHeight() - character.getHeight()/2));
                        upperGrid[j].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPositionMarker.png")));
                        
                        //Cleans up character trace
                        for(int i = 0; i < upperGrid.length - 1; i++) {
                            if(!upperGrid[i].getTile().getLocation().equals(new Point(charInitialPoint.x,charInitialPoint.y - TopBorderStats.getHeight())) && upperGrid[i].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")).toString()) && !lowerGrid[i].getTile().equals(lowerGrid[j].getTile()) && upperGrid[i].getCharacter() != null && upperGrid[i].getCharacter().equals(party.getArmyChar(armyPos))) {
                                upperGrid[i].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                                upperGrid[i].removeCharacter();
                            }
                        }
                    } 
                    //Resets ally marker to character initial point when the mouse cursor is outside of valid positions to move
                    else if(upperGrid[j].getTile().getBounds().contains(mouseLocation.x + character.getWidth()/2, mouseLocation.y - TopBorderStats.getHeight() + character.getHeight()/2) && (lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")).toString()) || lowerGrid[j].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")).toString()))) {
                        for(GridTile gt: upperGrid) {
                            if(gt.getTile().getLocation().equals(new Point(charInitialPoint.x,charInitialPoint.y - TopBorderStats.getHeight()))) {
                                gt.getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")));
                                gt.addCharacter(party.getArmyChar(armyPos), party);
                                break;
                            }
                        }
                        
                        //Cleans up character trace
                        for(int i = 0; i < upperGrid.length - 1; i++) {
                            if(!upperGrid[i].getTile().getLocation().equals(new Point(charInitialPoint.x,charInitialPoint.y - TopBorderStats.getHeight())) && upperGrid[i].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")).toString()) && !lowerGrid[i].getTile().equals(lowerGrid[j].getTile()) && upperGrid[i].getCharacter() != null && upperGrid[i].getCharacter().equals(party.getArmyChar(armyPos))) {
                                upperGrid[i].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                                upperGrid[i].removeCharacter();
                            }
                        }
                    } 
                }
            }
            character.setLocation(mouseLocation);
            characterHP.setLocation(new Point((int)mouseLocation.getX(), (int)mouseLocation.getY() + 70));
        }
    }
    
    private void updateBattleStatsLayer(Char ally, Char enemy) {
        AllyCharacterPortrait.setIcon(ally.getBattlePortrait());
        AllyNamePlateText.setText(ally.getName());
        AllyCurrentHP.setText(ally.getCurrentHP() + "");
        AllyEndHP.setText(ally.getCurrentHP() + "");
        AllyAttack.setText(ally.getTotalAtk() + "");
        
        EnemyCharacterPortrait.setIcon(enemy.getBattlePortrait());
        EnemyNamePlateText.setText(enemy.getName());
        EnemyCurrentHP.setText(enemy.getCurrentHP() + "");
        if(enemy.getCurrentHP() - ally.getTotalAtk() > 0)
            EnemyEndHP.setText((enemy.getCurrentHP() - ally.getTotalAtk()) + enemy.getTotalDef() + "");
        else
            EnemyEndHP.setText("0");
        EnemyAttack.setText("0");
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
                gameOverThread();
            }
            if(i==7 && enemyCounter == 0) {
                for(int j = 0; j < allyParty.getArmySize(); j++) {
                    allyParty.getArmyChar(j).resetHP();
                }
                for(JToggleButton jtb1: characters) {
                    jtb1.setEnabled(true);
                }
                PhaseLabel.setVisible(false);
                resetPositionMarkers();
                stageClearedAnimation();
                mediaPlayer.stop();
            }
            i++;
        }
    }
    
    //Checks if the current Character's HP is below 1. If so, make character not visible and reset GridTile for accessible and not occupied.
    private void checkCharacterDeath(int gridPos, Party party, Char damageDealer, int armyPos) {
        if(lowerGrid[gridPos].getCharacter().getCurrentHP() < 1) {
            if(party.equals(allyParty)) {
                AllyChar allyChar = (AllyChar)damageDealer;
                allyChar.gainExperience(75);
                
                updateCharacterStats(party, armyPos);
                //Add LEVEL UP Animation
            }
            for(int i = 0; i < characters.length; i++) {
                if(characters[i].getIcon() != null && lowerGrid[gridPos].getCharacter() != null && characters[i].getIcon().toString().equals(lowerGrid[gridPos].getCharacter().getImg().toString())) {
                    deathSound();
                    characters[i].setVisible(false);
                    charactersHP[i].setVisible(false);
                    lowerGrid[gridPos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                    upperGrid[gridPos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/empty.png")));
                    lowerGrid[gridPos].removeCharacter();
                    this.recalculateLocationOfAllyChars();
                }
            }
        }
    }
    
    //Checks whether a Character should deal damage or not.
    private void checkCharacterDamage(Party party, GridTile grid1, Component character, JLayeredPane characterHP, int armyPos) {
        //Checks if Character is own teammate. If so, return and don't do damage.
        for(int i=0; i < party.getArmySize(); i++) {
            if(grid1.getCharacter() == party.getArmyChar(i)) {
                character.setLocation(charInitialPoint);
                characterHP.setLocation(new Point((int)charInitialPoint.getX(), (int)charInitialPoint.getY() + 70));
                return;
            }
        }
        
        //Checks if Character is not own Character. If so, deal damage and check if turn has ended.
        if(!grid1.getCharacter().equals(party.getArmyChar(armyPos))) {
            //Apply damage and disable damage-dealer character
            applyDamageAnimation(party.getArmyChar(armyPos), grid1);
            grid1.getCharacter().changeHP(party.getArmyChar(armyPos).getTotalAtk() - grid1.getCharacter().getTotalDef());
            character.setEnabled(false);
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
            this.endTurn();
            /*for(JToggleButton jtbs: characters) {
                jtbs.setEnabled(true);
            }
            turn = turn != true;
            resetPositionMarkers();
            //startPhaseAnimation();*/
            enemyAI();
        }
    }
    
    
    private void updateCharactersHP() {
        int currHP;
        for(int i = 0; i < characters.length; i++) {
            if(characters[i].isVisible() && i < 4) {
                currHP = allyParty.getArmyChar(i).getCurrentHP();
                if(currHP < 10) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + allyHPFonts[currHP])));
                    charactersHPTens[i].setIcon(null);
                }else if(currHP > 9 && currHP < 20) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + allyHPFonts[currHP-10])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue1HP.png")));
                }
                else if(currHP > 19 && currHP < 30) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + allyHPFonts[currHP-20])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue2HP.png")));
                } else if(currHP > 29 && currHP < 40) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + allyHPFonts[currHP-30])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/blue3HP.png")));
                }
                
                 characterHPBars[i].setMaximum(allyParty.getArmyChar(i).getMaxHP());
                 characterHPBars[i].setValue(allyParty.getArmyChar(i).getCurrentHP());
                    
            } else if(characters[i].isVisible() && i > 3) {
                
                currHP = enemyParty.getArmyChar(i-4).getCurrentHP();
                if(currHP < 10) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + enemyHPFonts[currHP])));
                    charactersHPTens[i].setIcon(null);
                }else if(currHP > 9 && currHP < 20) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + enemyHPFonts[currHP-10])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/red1HP.png")));
                }
                else if(currHP > 19 && currHP < 30) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + enemyHPFonts[currHP-20])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/red2HP.png")));
                } else if(currHP > 29 && currHP < 40) {
                    charactersHPOnes[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + enemyHPFonts[currHP-30])));
                    charactersHPTens[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/red3HP.png")));
                }
                
                characterHPBars[i].setMaximum(enemyParty.getArmyChar(i-4).getMaxHP());
                characterHPBars[i].setValue(enemyParty.getArmyChar(i-4).getCurrentHP());
            }
        }
    }
    
    //Updates characters stats in Stats Layer once clicked on. Also gets the characters initial position when first clicked on
    private void updateCharacterStats(Party party, int partyPosition) {
        
        if(party == allyParty) {
            LevelProgressBar.setValue((((AllyChar)allyParty.getArmyChar(partyPosition)).getExperience()));
            NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate.png")));
            NamePlateDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate_decor.png")));
            StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stats_border_1.png")));
            TopBorderStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/top_border_stats.png")));
        }else {
            LevelProgressBar.setValue(0);
            NamePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/name_plate_red.png")));
            NamePlateDecor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemy_name_plate_decor.png")));
            StatsInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/stats_border_2.png")));
            TopBorderStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/top_border_stats_enemy.png")));
        }
        
        StatsLayer.setVisible(true);
        CharacterPortrait.setIcon(party.getArmyChar(partyPosition).getBattlePortrait());
        WeaponNameText.setText(party.getArmyChar(partyPosition).getWeapon().getName() + "");
        LevelText.setText(party.getArmyChar(partyPosition).getLevel() + "");
        NamePlateText.setText(party.getArmyChar(partyPosition).getName());
        CurrentHP.setText(party.getArmyChar(partyPosition).getCurrentHP() + "");
        MaxHP.setText(party.getArmyChar(partyPosition).getMaxHP() + "");
        AttackLevel.setText(party.getArmyChar(partyPosition).getTotalAtk()+ "");
        AttackLevel1.setText(party.getArmyChar(partyPosition).getTotalDef()+ "");
    }
    
    //Very tedious way of showing characters possible moves
    private void showPossibleMoves(Party party, int partyPosition, boolean reset) {
        if(reset == true) {
            if(positionMarker == true) {
                resetPositionMarkers();
            }
        }
        
        int initialGridTile = 0;
        for(int i = 0; i < lowerGrid.length ; i++) {
            if(lowerGrid[i].getCharacter() != null && lowerGrid[i].getCharacter().equals(party.getArmyChar(partyPosition))) {
                initialGridTile = i;
            }
        }
        
        //Not very efficient (hard-coded)
        int walkRange = party.getArmyChar(partyPosition).getWalkRange();
        
        lowerGrid[initialGridTile].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/bluePositionMarker.png")));
        
        if(walkRange == 1 || walkRange == 2) {
            if(/*initialGridTile != 5 && initialGridTile != 11 && initialGridTile != 17 && initialGridTile != 23 && initialGridTile != 29 
               && initialGridTile != 35 && initialGridTile != 41 && initialGridTile != 47*/ initialGridTile % 6 != 5 && initialGridTile + 1 > -1 && initialGridTile + 1 < 48) {
                setPositionMarker(party, initialGridTile + 1, 0);
            }
            if(/*initialGridTile != 0 && initialGridTile != 6 && initialGridTile != 12 && initialGridTile != 18 && initialGridTile != 24 
               && initialGridTile != 30 && initialGridTile != 36 && initialGridTile != 42*/ initialGridTile % 6 != 0 && initialGridTile - 1 > -1 && initialGridTile - 1 < 48) {
                setPositionMarker(party, initialGridTile - 1, 0);
            }
            if(initialGridTile - 6 > -1 && initialGridTile - 6 < 48) {
                setPositionMarker(party, initialGridTile - 6, 0);
            }
            if(initialGridTile + 6 > -1 && initialGridTile + 6 < 48) {
                setPositionMarker(party, initialGridTile + 6, 0);
            }
        }
        
        //Not very efficient (hard-coded)
        if(walkRange == 2) {
            if(/*initialGridTile != 5 && initialGridTile != 11 && initialGridTile != 17 && initialGridTile != 23 && initialGridTile != 29 
               && initialGridTile != 35 && initialGridTile != 41 && initialGridTile != 47 && initialGridTile != 4 && initialGridTile != 10 
               && initialGridTile != 16 && initialGridTile != 22 && initialGridTile != 28 && initialGridTile != 34 && initialGridTile != 40 
               && initialGridTile != 46*/ initialGridTile % 6 != 5 && initialGridTile % 6 != 4 && initialGridTile + 2 > -1 && initialGridTile + 2 < 48) {
                setPositionMarker(party, initialGridTile + 2, -1);
            }
            if(/*initialGridTile != 0 && initialGridTile != 6 && initialGridTile != 12 && initialGridTile != 18 && initialGridTile != 24 
               && initialGridTile != 30 && initialGridTile != 36 && initialGridTile != 42 && initialGridTile != 1 && initialGridTile != 7 
               && initialGridTile != 13 && initialGridTile != 19 && initialGridTile != 25 && initialGridTile != 31 && initialGridTile != 37 
               && initialGridTile != 43*/ initialGridTile % 6 != 0 && initialGridTile % 6 != 1 && initialGridTile - 2 > -1 && initialGridTile - 2 < 48) {
                setPositionMarker(party, initialGridTile - 2, 1);
            }
            if(/*initialGridTile != 5 && initialGridTile != 11 && initialGridTile != 17 && initialGridTile != 23 && initialGridTile != 29 
               && initialGridTile != 35 && initialGridTile != 41 && initialGridTile != 47*/ initialGridTile % 6 != 5 && initialGridTile + 7 > -1 && initialGridTile + 7 < 48) {
                setPositionMarker(party, initialGridTile + 7, 0);
            }
            if(/*initialGridTile != 0 && initialGridTile != 6 && initialGridTile != 12 && initialGridTile != 18 && initialGridTile != 24 
               && initialGridTile != 30 && initialGridTile != 36 && initialGridTile != 42*/ initialGridTile % 6 != 0 && initialGridTile - 7 > -1 && initialGridTile - 7 < 48) {
                setPositionMarker(party, initialGridTile - 7, 0);
            }
            if(/*initialGridTile != 0 && initialGridTile != 6 && initialGridTile != 12 && initialGridTile != 18 && initialGridTile != 24 
               && initialGridTile != 30 && initialGridTile != 36 && initialGridTile != 42 &&*/ initialGridTile % 6 != 0 && initialGridTile + 5 > -1 && initialGridTile + 5 < 48) {
                setPositionMarker(party, initialGridTile + 5, 0);
            }
            if(/*initialGridTile != 5 && initialGridTile != 11 && initialGridTile != 17 && initialGridTile != 23 && initialGridTile != 29 
               && initialGridTile != 35 && initialGridTile != 41 && initialGridTile != 47*/ initialGridTile % 6 != 5 && initialGridTile - 5 > -1 && initialGridTile - 5 < 48) {
                setPositionMarker(party, initialGridTile - 5, 0);
            }
            if(initialGridTile + 12 > -1 && initialGridTile + 12 < 48) {
                setPositionMarker(party, initialGridTile + 12, -6);
            }
            if(initialGridTile - 12 > -1 && initialGridTile - 12 < 48) {
                setPositionMarker(party, initialGridTile - 12, 6);
            }
        }
        if(reset == true) {
            positionMarker = true;
        }
    }
    
    //Sets the specific gridtile corresponding to the move type of the gridtile
    private void setPositionMarker(Party party, int pos, int posRange) {
        Party otherParty;
        if(party == allyParty) {
            otherParty = enemyParty;
        } else {
            otherParty = allyParty;
        }
        if(lowerGrid[pos].isAccessible() && lowerGrid[pos].getCharacter() == null) {
            if(!lowerGrid[pos+posRange].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")).toString()) && !lowerGrid[pos+posRange].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/darkRedPositionMarker.png")).toString()))
                lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/bluePositionMarker.png")));
            else
                lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")));
        } else if(!lowerGrid[pos].isAccessible() && lowerGrid[pos].getParty() != null && lowerGrid[pos].getParty().equals(otherParty)) {
            if(!lowerGrid[pos+posRange].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")).toString()) && !lowerGrid[pos+posRange].getTile().getIcon().toString().equals(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/darkRedPositionMarker.png")).toString()))
                lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/darkRedPositionMarker.png")));
            else
                lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")));
            
        } else if(!lowerGrid[pos].isAccessible() && lowerGrid[pos].getParty() != null && lowerGrid[pos].getParty().equals(party)) {
            lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/darkBluePositionMarker.png")));
        } else if(!lowerGrid[pos].isAccessible() && lowerGrid[pos].getCharacter() == null){
            lowerGrid[pos].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/redPositionMarker.png")));
        }
    }
    
    //Initializes MapGUI variables before user input
    private void initMapGUI() {
        
        setLevelValues();
        
        //Connects the character array with the character buttons
        characters[0] = AllyCharacter1;
        characters[1] = AllyCharacter2;
        characters[2] = AllyCharacter3;
        characters[3] = AllyCharacter4;
        characters[4] = EnemyCharacter1;
        characters[5] = EnemyCharacter2;
        characters[6] = EnemyCharacter3;
        characters[7] = EnemyCharacter4;
        
        charactersHP[0] = AllyChar1HP;
        charactersHP[1] = AllyChar2HP;
        charactersHP[2] = AllyChar3HP;
        charactersHP[3] = AllyChar4HP;
        charactersHP[4] = EnemyChar1HP;
        charactersHP[5] = EnemyChar2HP;
        charactersHP[6] = EnemyChar3HP;
        charactersHP[7] = EnemyChar4HP;
        
        charactersHPOnes[0] = AllyChar1DmgOnes;
        charactersHPOnes[1] = AllyChar2DmgOnes;
        charactersHPOnes[2] = AllyChar3DmgOnes;
        charactersHPOnes[3] = AllyChar4DmgOnes;
        charactersHPOnes[4] = EnemyChar1DmgOnes;
        charactersHPOnes[5] = EnemyChar2DmgOnes;
        charactersHPOnes[6] = EnemyChar3DmgOnes;
        charactersHPOnes[7] = EnemyChar4DmgOnes;
        
        charactersHPTens[0] = AllyChar1DmgTens;
        charactersHPTens[1] = AllyChar2DmgTens;
        charactersHPTens[2] = AllyChar3DmgTens;
        charactersHPTens[3] = AllyChar4DmgTens;
        charactersHPTens[4] = EnemyChar1DmgTens;
        charactersHPTens[5] = EnemyChar2DmgTens;
        charactersHPTens[6] = EnemyChar3DmgTens;
        charactersHPTens[7] = EnemyChar4DmgTens;
        
        characterHPBars[0] = AllyChar1HPBar;
        characterHPBars[1] = AllyChar2HPBar;
        characterHPBars[2] = AllyChar3HPBar;
        characterHPBars[3] = AllyChar4HPBar;
        characterHPBars[4] = EnemyChar1HPBar;
        characterHPBars[5] = EnemyChar2HPBar;
        characterHPBars[6] = EnemyChar3HPBar;
        characterHPBars[7] = EnemyChar4HPBar;
        
        //Displays the current ally team and enemy team
        for(int i = 0; i < 8; i++) {
            if(i < 4 && i < allyParty.getArmySize()) {
                characters[i].setIcon(allyParty.getArmyChar(i).getImg());
                characters[i].setVisible(true);
                charactersHP[i].setVisible(true);
                charactersHP[i].setLocation(characters[i].getX(), characters[i].getY() + 70);
            } else if(i > 3 && (i-4) < enemyParty.getArmySize()) {
                characters[i].setIcon(enemyParty.getArmyChar(i-4).getImg());
                characters[i].setVisible(true);
                charactersHP[i].setVisible(true);
                charactersHP[i].setLocation(characters[i].getX(), characters[i].getY() + 70);
            } else {
                continue;
            }
            
            //Updates grid for the character positions
            for(int j = 0; j < lowerGrid.length; j++) {
                if(isCharacterWithinTile(characters[i], lowerGrid[j].getTile())) {
                    if(i < 4) {
                        upperGrid[j].getTile().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/allyPositionMarker.png")));
                        lowerGrid[j].addCharacter(allyParty.getArmyChar(i), allyParty);
                        this.recalculateLocationOfAllyChars();
                    }else {
                        lowerGrid[j].addCharacter(enemyParty.getArmyChar(i-4), enemyParty);
                    }
                }
            }
        }
        updateCharactersHP();
        startPhaseAnimation();
        fogAnimation();
    }
    
    private void setLevelValues() {
        //finds the highest level among the allies that have been brought into the level
        int add = 0;
        int characters = 0;
        for (Char ally : allyParty.getArmy()) {
            if (ally == null)
                continue;
            add += ally.getLevel();
            characters += 1;
        }
        
        add /= characters;
        
        if(level == 1) {
            Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level1_map.png")));
            
            AllyCharacter1.setLocation(0, 120);
            AllyCharacter2.setLocation(90, 300);
            AllyCharacter3.setLocation(0, 210);
            AllyCharacter4.setLocation(270, 210);
            
            EnemyCharacter1.setLocation(90, 660);
            EnemyCharacter2.setLocation(0, 660);
            EnemyCharacter3.setLocation(0, 570);
            EnemyCharacter4.setLocation(0, 480);
            
            //Creates Level 1 Grids
            MapGUI.lowerGrid = new GridTile[]{new GridTile(pos00,true), new GridTile(pos01,false), new GridTile(pos02,false), new GridTile(pos03,true), new GridTile(pos04,true), new GridTile(pos05,false), 
                                         new GridTile(pos10,true), new GridTile(pos11,true), new GridTile(pos12,false), new GridTile(pos13,true), new GridTile(pos14,true), new GridTile(pos15,false), 
                                         new GridTile(pos20,true), new GridTile(pos21,true), new GridTile(pos22,true), new GridTile(pos23,true), new GridTile(pos24,false), new GridTile(pos25,true), 
                                         new GridTile(pos30,false), new GridTile(pos31,false), new GridTile(pos32,true), new GridTile(pos33,true), new GridTile(pos34,true), new GridTile(pos35,true), 
                                         new GridTile(pos40,true), new GridTile(pos41,true), new GridTile(pos42,true), new GridTile(pos43,true), new GridTile(pos44,true), new GridTile(pos45,true), 
                                         new GridTile(pos50,true), new GridTile(pos51,true), new GridTile(pos52,false), new GridTile(pos53,false), new GridTile(pos54,true), new GridTile(pos55,true), 
                                         new GridTile(pos60,true), new GridTile(pos61,true), new GridTile(pos62,true), new GridTile(pos63,false), new GridTile(pos64,false), new GridTile(pos65,true), 
                                         new GridTile(pos70,false), new GridTile(pos71,false), new GridTile(pos72,false), new GridTile(pos73,true), new GridTile(pos74,true), new GridTile(pos75,true)};

            MapGUI.upperGrid = new GridTile[]{new GridTile(pos1,true), new GridTile(pos2,false), new GridTile(pos3,false), new GridTile(pos4,true), new GridTile(pos5,true), new GridTile(pos6,false), 
                                         new GridTile(pos16,true), new GridTile(pos17,true), new GridTile(pos18,false), new GridTile(pos19,true), new GridTile(pos26,true), new GridTile(pos27,false), 
                                         new GridTile(pos28,true), new GridTile(pos29,true), new GridTile(pos36,true), new GridTile(pos37,true), new GridTile(pos38,false), new GridTile(pos39,true), 
                                         new GridTile(pos46,false), new GridTile(pos47,false), new GridTile(pos48,true), new GridTile(pos49,true), new GridTile(pos56,true), new GridTile(pos57,true), 
                                         new GridTile(pos58,true), new GridTile(pos59,true), new GridTile(pos66,true), new GridTile(pos67,true), new GridTile(pos68,true), new GridTile(pos69,true), 
                                         new GridTile(pos76,true), new GridTile(pos77,true), new GridTile(pos78,false), new GridTile(pos79,false), new GridTile(pos80,true), new GridTile(pos81,true), 
                                         new GridTile(pos82,true), new GridTile(pos83,true), new GridTile(pos84,true), new GridTile(pos85,false), new GridTile(pos86,false), new GridTile(pos87,true), 
                                         new GridTile(pos88,false), new GridTile(pos89,false), new GridTile(pos90,false), new GridTile(pos91,true), new GridTile(pos92,true), new GridTile(pos93,true)};

            //Adds Level 1 enemies into enemy party
            Weapon weapon = new Weapon(null, 0, "Bronze Sword", 0, "Basic Sword, starting equipment", WeaponType.Sword, 5, 1, DamageType.Physical);
            enemyParty.addToArmy(new EnemyChar("Zephiel", add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Black Knight", add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Hawkeye", add, 2, weapon));
        }
        
        if(level == 2) {
            Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level2_map.png")));
            
            AllyCharacter1.setLocation(180, 120);
            AllyCharacter2.setLocation(270, 120);
            AllyCharacter3.setLocation(90, 120);
            AllyCharacter4.setLocation(360, 120);
            
            EnemyCharacter1.setLocation(180 , 750);
            EnemyCharacter2.setLocation(180, 480);
            EnemyCharacter3.setLocation(360, 480);
            
            //Creates Level 2 Grids
            MapGUI.lowerGrid = new GridTile[]{new GridTile(pos00,false), new GridTile(pos01,true), new GridTile(pos02,true), new GridTile(pos03,true), new GridTile(pos04,true), new GridTile(pos05,false), 
                                         new GridTile(pos10,true), new GridTile(pos11,true), new GridTile(pos12,true), new GridTile(pos13,true), new GridTile(pos14,true), new GridTile(pos15,true), 
                                         new GridTile(pos20,true), new GridTile(pos21,true), new GridTile(pos22,true), new GridTile(pos23,true), new GridTile(pos24,true), new GridTile(pos25,true), 
                                         new GridTile(pos30,true), new GridTile(pos31,true), new GridTile(pos32,true), new GridTile(pos33,true), new GridTile(pos34,true), new GridTile(pos35,true), 
                                         new GridTile(pos40,true), new GridTile(pos41,true), new GridTile(pos42,true), new GridTile(pos43,true), new GridTile(pos44,true), new GridTile(pos45,true), 
                                         new GridTile(pos50,true), new GridTile(pos51,false), new GridTile(pos52,false), new GridTile(pos53,true), new GridTile(pos54,false), new GridTile(pos55,true), 
                                         new GridTile(pos60,true), new GridTile(pos61,false), new GridTile(pos62,true), new GridTile(pos63,true), new GridTile(pos64,false), new GridTile(pos65,true), 
                                         new GridTile(pos70,false), new GridTile(pos71,false), new GridTile(pos72,true), new GridTile(pos73,false), new GridTile(pos74,false), new GridTile(pos75,false)};

            MapGUI.upperGrid = new GridTile[]{new GridTile(pos1,false), new GridTile(pos2,true), new GridTile(pos3,true), new GridTile(pos4,true), new GridTile(pos5,true), new GridTile(pos6,false), 
                                         new GridTile(pos16,true), new GridTile(pos17,true), new GridTile(pos18,true), new GridTile(pos19,true), new GridTile(pos26,true), new GridTile(pos27,true), 
                                         new GridTile(pos28,true), new GridTile(pos29,true), new GridTile(pos36,true), new GridTile(pos37,true), new GridTile(pos38,true), new GridTile(pos39,true), 
                                         new GridTile(pos46,true), new GridTile(pos47,true), new GridTile(pos48,true), new GridTile(pos49,true), new GridTile(pos56,true), new GridTile(pos57,true), 
                                         new GridTile(pos58,true), new GridTile(pos59,true), new GridTile(pos66,true), new GridTile(pos67,true), new GridTile(pos68,true), new GridTile(pos69,true), 
                                         new GridTile(pos76,true), new GridTile(pos77,false), new GridTile(pos78,false), new GridTile(pos79,true), new GridTile(pos80,false), new GridTile(pos81,true), 
                                         new GridTile(pos82,true), new GridTile(pos83,false), new GridTile(pos84,true), new GridTile(pos85,true), new GridTile(pos86,false), new GridTile(pos87,true), 
                                         new GridTile(pos88,false), new GridTile(pos89,false), new GridTile(pos90,true), new GridTile(pos91,false), new GridTile(pos92,false), new GridTile(pos93,false)};

            //Adds Level 2 enemies into enemy party
            Weapon weapon = new Weapon(null, 0, "Iron Sword", 0, "Stronger Sword", WeaponType.Sword, 6, 1, DamageType.Physical);
            enemyParty.addToArmy(new EnemyChar("Hawkeye", 1 + add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Black Knight", 1 + add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Zephiel", 1 + add, 2, weapon));
        }
        
        if(level == 3) {
            Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/level3_map.png")));
            
            AllyCharacter1.setLocation(180, 120);
            AllyCharacter2.setLocation(270, 120);
            AllyCharacter3.setLocation(90, 120);
            AllyCharacter4.setLocation(360, 120);
            
            EnemyCharacter1.setLocation(270, 660);
            EnemyCharacter2.setLocation(180, 570);
            EnemyCharacter3.setLocation(360, 480);
            EnemyCharacter3.setLocation(360, 570);
            
            //Creates Level 3 Grids
            MapGUI.lowerGrid = new GridTile[]{new GridTile(pos00,true), new GridTile(pos01,true), new GridTile(pos02,true), new GridTile(pos03,true), new GridTile(pos04,true), new GridTile(pos05,true), 
                                         new GridTile(pos10,true), new GridTile(pos11,true), new GridTile(pos12,true), new GridTile(pos13,true), new GridTile(pos14,true), new GridTile(pos15,true), 
                                         new GridTile(pos20,true), new GridTile(pos21,true), new GridTile(pos22,true), new GridTile(pos23,true), new GridTile(pos24,true), new GridTile(pos25,true), 
                                         new GridTile(pos30,true), new GridTile(pos31,true), new GridTile(pos32,true), new GridTile(pos33,true), new GridTile(pos34,true), new GridTile(pos35,true), 
                                         new GridTile(pos40,true), new GridTile(pos41,true), new GridTile(pos42,true), new GridTile(pos43,true), new GridTile(pos44,true), new GridTile(pos45,true), 
                                         new GridTile(pos50,true), new GridTile(pos51,true), new GridTile(pos52,true), new GridTile(pos53,true), new GridTile(pos54,true), new GridTile(pos55,true), 
                                         new GridTile(pos60,true), new GridTile(pos61,true), new GridTile(pos62,true), new GridTile(pos63,true), new GridTile(pos64,true), new GridTile(pos65,true), 
                                         new GridTile(pos70,true), new GridTile(pos71,true), new GridTile(pos72,true), new GridTile(pos73,true), new GridTile(pos74,true), new GridTile(pos75,true)};

            MapGUI.upperGrid = new GridTile[]{new GridTile(pos1,true), new GridTile(pos2,true), new GridTile(pos3,true), new GridTile(pos4,true), new GridTile(pos5,true), new GridTile(pos6,true), 
                                         new GridTile(pos16,true), new GridTile(pos17,true), new GridTile(pos18,true), new GridTile(pos19,true), new GridTile(pos26,true), new GridTile(pos27,true), 
                                         new GridTile(pos28,true), new GridTile(pos29,true), new GridTile(pos36,true), new GridTile(pos37,true), new GridTile(pos38,true), new GridTile(pos39,true), 
                                         new GridTile(pos46,true), new GridTile(pos47,true), new GridTile(pos48,true), new GridTile(pos49,true), new GridTile(pos56,true), new GridTile(pos57,true), 
                                         new GridTile(pos58,true), new GridTile(pos59,true), new GridTile(pos66,true), new GridTile(pos67,true), new GridTile(pos68,true), new GridTile(pos69,true), 
                                         new GridTile(pos76,true), new GridTile(pos77,true), new GridTile(pos78,true), new GridTile(pos79,true), new GridTile(pos80,true), new GridTile(pos81,true), 
                                         new GridTile(pos82,true), new GridTile(pos83,true), new GridTile(pos84,true), new GridTile(pos85,true), new GridTile(pos86,true), new GridTile(pos87,true), 
                                         new GridTile(pos88,true), new GridTile(pos89,true), new GridTile(pos90,true), new GridTile(pos91,true), new GridTile(pos92,true), new GridTile(pos93,true)};

            //Adds Level 3 enemies into enemy party
            Weapon weapon = new Weapon(null, 0, "Silver Sword", 0, "Strongest Sword", WeaponType.Sword, 7, 1, DamageType.Physical);
            enemyParty.addToArmy(new EnemyChar("Surtr", 4 + add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Black Knight", 2 + add, 2, weapon));
            enemyParty.addToArmy(new EnemyChar("Axe Man", 3 + add, 2, weapon));
        }
    }
    
    //Begins the damage Animation
    private void applyDamageAnimation(Char damageDealer, GridTile gridTile) {
        damageSound();
        applyDamageAnimationThread = new Thread(){
        @Override
        public void run() {
            try {
                DamageSeperator.setVisible(true);
                MapLayer.moveToFront(DamageLabelOnes);
                MapLayer.moveToFront(DamageLabelTens);
                MapLayer.moveToFront(DamageSeperator);
                Integer damage = damageDealer.getTotalAtk();
                
                if(damage < 10) {
                    DamageLabelOnes.setLocation(gridTile.getTile().getX() + AllyCharacter1.getWidth()/3 + 5, gridTile.getTile().getY() + TopBorderStats.getHeight() + AllyCharacter1.getHeight()/3 - 10);
                    DamageLabelOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + damageFonts[damage])));
                    DamageLabelOnes.setVisible(true);
                } else if( damage < 20){
                    DamageLabelOnes.setLocation(gridTile.getTile().getX() + AllyCharacter1.getWidth()/2, gridTile.getTile().getY() + TopBorderStats.getHeight() + AllyCharacter1.getHeight()/3);
                    DamageLabelOnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + damageFonts[damage - 10])));
                    DamageLabelTens.setLocation(gridTile.getTile().getX() + AllyCharacter1.getWidth()/4, gridTile.getTile().getY() + TopBorderStats.getHeight() + AllyCharacter1.getHeight()/3);
                    DamageLabelTens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fonts/" + damageFonts[1])));
                    
                    DamageLabelOnes.setVisible(true);
                    DamageLabelTens.setVisible(true);
                }
                
                Thread.sleep(750);
                DamageLabelOnes.setVisible(false);
                DamageLabelTens.setVisible(false);
                DamageSeperator.setVisible(false);
                
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
                    
                    if(applyDamageAnimationThread != null)
                        while(applyDamageAnimationThread.isAlive()) {}
                    if(deathSound != null)
                        while(deathSound.isAlive()) {}
                    if(stageClearedAnimationThread != null)
                        return;
                    phaseSound();
                    PhaseSeperator.setVisible(true);
                    MapLayer.moveToFront(PhaseSeperator);
                    MapLayer.moveToFront(PhaseLabel);
                    PhaseLabel.setVisible(true);
                    if(turn == true) {
                        PhaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/playerPhase.png")));
                        PhaseLabel.setLocation(new Point(-540, PhaseLabel.getY()));
                        while(PhaseLabel.getX() != 10) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() + 2, PhaseLabel.getY()));
                            Thread.sleep(1);
                        }
                        while(PhaseLabel.getX() != 40) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() + 1, PhaseLabel.getY()));
                            Thread.sleep(36);
                        }
                        while(PhaseLabel.getX() != 540) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() + 2, PhaseLabel.getY()));
                            Thread.sleep(1);
                        }
                    } else {
                        PhaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/enemyPhase.png")));
                        PhaseLabel.setLocation(new Point(1080, PhaseLabel.getY()));
                        while(PhaseLabel.getX() != 40) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() - 2, PhaseLabel.getY()));
                            Thread.sleep(1);
                        }
                        while(PhaseLabel.getX() != 10) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() - 1, PhaseLabel.getY()));
                            Thread.sleep(36);
                        }
                        while(PhaseLabel.getX() != -540) {
                            PhaseLabel.setLocation(new Point(PhaseLabel.getX() - 2, PhaseLabel.getY()));
                            Thread.sleep(1);
                        }
                    }
                        
                    PhaseLabel.setVisible(false);
                    PhaseSeperator.setVisible(false);

                } catch (InterruptedException ex) {
                    Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }};
        startPhaseAnimationThread.start();
    }
    
    //Begins the stage cleared animation
    private void stageClearedAnimation() {
        PhaseSeperator.setVisible(false);
        MainContainer.moveToFront(StageClearButton);
        MainContainer.moveToFront(StageClearOrb); 
        MainContainer.moveToFront(StageClearLogo);
        MainContainer.moveToFront(StageClearText);
        
        stageClearedAnimationThread = new Thread(){
        @Override
        public void run() {
            if(applyDamageAnimationThread != null)
                    while(applyDamageAnimationThread.isAlive()) {}
            stageClearSound();
            StageClearButton.setVisible(true);
            StageClearLogo.setVisible(true);
            StageClearText.setVisible(true);
            StageClearOrb.setVisible(true);
        }};
        stageClearedAnimationThread.start();
    }
    
    private void fogAnimation() {
        fogAnimationThread = new Thread(){
        @Override
        public void run() {
            try {
                
                if(level==3) {
                    Fog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/boss_fog.png")));
                    Fog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/boss_fog.png")));
                } else {
                    Fog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/fog.png")));
                    Fog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/fog.png")));
                }
                
                while(true) {
                    Fog2.setLocation(new Point(Fog2.getX() + 1, Fog2.getY()));
                    Fog1.setLocation(new Point(Fog1.getX() + 1, Fog1.getY()));

                    Thread.sleep(60);

                    if(Fog1.getX() == 540) {
                        Fog1.setLocation(-540, Fog1.getY());
                    }
                    if(Fog2.getX() == 540) {
                        Fog2.setLocation(-540, Fog2.getY());
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }};
        fogAnimationThread.start();
    }
    
    private void damageSound() {
        Thread damageSound = new Thread(){
        @Override
        public void run() {
            songFile = new Media(new File("src\\audio\\damage.mp3").toURI().toString());
            damagePlayer = new MediaPlayer(songFile);
            damagePlayer.setVolume(.7);
            damagePlayer.play();
        }};
        damageSound.start();
    }
    
    private void phaseSound() {
        Thread phaseSound = new Thread(){
        @Override
        public void run() {
            if(turn == true)
                songFile = new Media(new File("src\\audio\\playerPhase.mp3").toURI().toString());
            else
                songFile = new Media(new File("src\\audio\\enemyPhase.mp3").toURI().toString());
            phasePlayer = new MediaPlayer(songFile);
            phasePlayer.setVolume(.9);
            phasePlayer.play();
        }};
        phaseSound.start();
    }
    
    private void stageClearSound() {
        Thread stageClear = new Thread(){
        @Override
        public void run() {
            songFile = new Media(new File("src\\audio\\stageClear.mp3").toURI().toString());
            stageClearPlayer = new MediaPlayer(songFile);
            stageClearPlayer.setVolume(.9);
            stageClearPlayer.play();
        }};
        stageClear.start();
    }
    
    private void initSong() {
        if(level == 1) {
            songFile = new Media(new File("src\\audio\\map1.mp3").toURI().toString());
        } else if(level == 2) {
            songFile = new Media(new File("src\\audio\\map2.mp3").toURI().toString());
        } else if(level == 3) {
            songFile = new Media(new File("src\\audio\\map3.mp3").toURI().toString());
        }
        
        mediaPlayer = new MediaPlayer(songFile);
        mediaPlayer.setVolume(.4);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }
    
    private void gameOverThread() {
        Thread gameOverThread = new Thread(){
        @Override
        public void run() {
            while(applyDamageAnimationThread.isAlive()){}
            GameOverGUI goGUI= new GameOverGUI(cmGUI);
            goGUI.setVisible(true);
            mediaPlayer.stop();
            dispose();
        }};
        gameOverThread.start();
    }
    
    private void selectSound() {
        Thread selectSound = new Thread(){
        @Override
        public void run() {
            songFile = new Media(new File("src\\audio\\select.mp3").toURI().toString());
            selectPlayer = new MediaPlayer(songFile);
            selectPlayer.setVolume(.4);
            selectPlayer.play();
        }};
        selectSound.start();
    }
    
    private void tileSound() {
        Thread tileSound = new Thread(){
        @Override
        public void run() {
            songFile = new Media(new File("src\\audio\\tile.mp3").toURI().toString());
            tilePlayer = new MediaPlayer(songFile);
            tilePlayer.setVolume(.4);
            tilePlayer.play();
        }};
        tileSound.start();
    }
    
    private void endTurnSound() {
        Thread endTurnSound = new Thread(){
        @Override
        public void run() {
            songFile = new Media(new File("src\\audio\\endTurn.mp3").toURI().toString());
            endTurnPlayer = new MediaPlayer(songFile);
            endTurnPlayer.setVolume(.6);
            endTurnPlayer.play();
        }};
        endTurnSound.start();
    }
    
    private void deathSound() {
        deathSound = new Thread(){
        @Override
        public void run() {
            while(applyDamageAnimationThread.isAlive()){}
            songFile = new Media(new File("src\\audio\\death.mp3").toURI().toString());
            deathPlayer = new MediaPlayer(songFile);
            deathPlayer.setVolume(.6);
            deathPlayer.play();
        }};
        deathSound.start();
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
    private javax.swing.JTextField AllyAttack;
    private javax.swing.JLabel AllyChar1DmgOnes;
    private javax.swing.JLabel AllyChar1DmgTens;
    private javax.swing.JLayeredPane AllyChar1HP;
    private javax.swing.JProgressBar AllyChar1HPBar;
    private javax.swing.JLabel AllyChar2DmgOnes;
    private javax.swing.JLabel AllyChar2DmgTens;
    private javax.swing.JLayeredPane AllyChar2HP;
    private javax.swing.JProgressBar AllyChar2HPBar;
    private javax.swing.JLabel AllyChar3DmgOnes;
    private javax.swing.JLabel AllyChar3DmgTens;
    private javax.swing.JLayeredPane AllyChar3HP;
    private javax.swing.JProgressBar AllyChar3HPBar;
    private javax.swing.JLabel AllyChar4DmgOnes;
    private javax.swing.JLabel AllyChar4DmgTens;
    private javax.swing.JLayeredPane AllyChar4HP;
    private javax.swing.JProgressBar AllyChar4HPBar;
    private javax.swing.JToggleButton AllyCharacter1;
    private javax.swing.JToggleButton AllyCharacter2;
    private javax.swing.JToggleButton AllyCharacter3;
    private javax.swing.JToggleButton AllyCharacter4;
    private javax.swing.JLabel AllyCharacterPortrait;
    private javax.swing.JTextField AllyCurrentHP;
    private javax.swing.JTextField AllyEndHP;
    private javax.swing.JLabel AllyNamePlate;
    private javax.swing.JLabel AllyNamePlateDecor;
    private javax.swing.JTextField AllyNamePlateText;
    private javax.swing.JTextField AttackLevel;
    private javax.swing.JTextField AttackLevel1;
    private javax.swing.JLabel AttackPopUp;
    private javax.swing.JLabel BattleStatsInterface;
    private javax.swing.JLayeredPane BattleStatsLayer;
    private javax.swing.JLabel BattleWheel;
    private javax.swing.JLabel BottomBorder;
    private javax.swing.JLabel CharacterPortrait;
    private javax.swing.JTextField CurrentHP;
    private javax.swing.JLabel DamageLabelOnes;
    private javax.swing.JLabel DamageLabelTens;
    private javax.swing.JLabel DamageSeperator;
    private javax.swing.JButton DangerAreaButton;
    private javax.swing.JButton EndTurnButton;
    private javax.swing.JTextField EnemyAttack;
    private javax.swing.JLabel EnemyChar1DmgOnes;
    private javax.swing.JLabel EnemyChar1DmgTens;
    private javax.swing.JLayeredPane EnemyChar1HP;
    private javax.swing.JProgressBar EnemyChar1HPBar;
    private javax.swing.JLabel EnemyChar2DmgOnes;
    private javax.swing.JLabel EnemyChar2DmgTens;
    private javax.swing.JLayeredPane EnemyChar2HP;
    private javax.swing.JProgressBar EnemyChar2HPBar;
    private javax.swing.JLabel EnemyChar3DmgOnes;
    private javax.swing.JLabel EnemyChar3DmgTens;
    private javax.swing.JLayeredPane EnemyChar3HP;
    private javax.swing.JProgressBar EnemyChar3HPBar;
    private javax.swing.JLabel EnemyChar4DmgOnes;
    private javax.swing.JLabel EnemyChar4DmgTens;
    private javax.swing.JLayeredPane EnemyChar4HP;
    private javax.swing.JProgressBar EnemyChar4HPBar;
    private javax.swing.JToggleButton EnemyCharacter1;
    private javax.swing.JToggleButton EnemyCharacter2;
    private javax.swing.JToggleButton EnemyCharacter3;
    private javax.swing.JToggleButton EnemyCharacter4;
    private javax.swing.JLabel EnemyCharacterPortrait;
    private javax.swing.JTextField EnemyCurrentHP;
    private javax.swing.JTextField EnemyEndHP;
    private javax.swing.JLabel EnemyNamePlate;
    private javax.swing.JLabel EnemyNamePlateDecor;
    private javax.swing.JTextField EnemyNamePlateText;
    private javax.swing.JLabel Fog1;
    private javax.swing.JLabel Fog2;
    private javax.swing.JProgressBar LevelProgressBar;
    private javax.swing.JTextField LevelText;
    private javax.swing.JPanel LowerGrid;
    private javax.swing.JLayeredPane MainContainer;
    private javax.swing.JLabel Map;
    private javax.swing.JLayeredPane MapLayer;
    private javax.swing.JTextField MaxHP;
    private javax.swing.JLayeredPane MenuButtonLayer;
    private javax.swing.JLabel NamePlate;
    private javax.swing.JLabel NamePlateDecor;
    private javax.swing.JTextField NamePlateText;
    private javax.swing.JLabel PhaseLabel;
    private javax.swing.JLabel PhaseSeperator;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel StageClearButton;
    private javax.swing.JLabel StageClearLogo;
    private javax.swing.JLabel StageClearOrb;
    private javax.swing.JLabel StageClearText;
    private javax.swing.JLabel StatsInterface;
    private javax.swing.JLayeredPane StatsLayer;
    private javax.swing.JLabel TopBattleBorderStats;
    private javax.swing.JLabel TopBorderStats;
    private javax.swing.JLabel TopBorderWaiting;
    private javax.swing.JPanel UpperGrid;
    private javax.swing.JLayeredPane WaitingStatsLayer;
    private javax.swing.JTextField WeaponNameText;
    private javax.swing.JButton pos00;
    private javax.swing.JButton pos01;
    private javax.swing.JButton pos02;
    private javax.swing.JButton pos03;
    private javax.swing.JButton pos04;
    private javax.swing.JButton pos05;
    private javax.swing.JButton pos1;
    private javax.swing.JButton pos10;
    private javax.swing.JButton pos11;
    private javax.swing.JButton pos12;
    private javax.swing.JButton pos13;
    private javax.swing.JButton pos14;
    private javax.swing.JButton pos15;
    private javax.swing.JButton pos16;
    private javax.swing.JButton pos17;
    private javax.swing.JButton pos18;
    private javax.swing.JButton pos19;
    private javax.swing.JButton pos2;
    private javax.swing.JButton pos20;
    private javax.swing.JButton pos21;
    private javax.swing.JButton pos22;
    private javax.swing.JButton pos23;
    private javax.swing.JButton pos24;
    private javax.swing.JButton pos25;
    private javax.swing.JButton pos26;
    private javax.swing.JButton pos27;
    private javax.swing.JButton pos28;
    private javax.swing.JButton pos29;
    private javax.swing.JButton pos3;
    private javax.swing.JButton pos30;
    private javax.swing.JButton pos31;
    private javax.swing.JButton pos32;
    private javax.swing.JButton pos33;
    private javax.swing.JButton pos34;
    private javax.swing.JButton pos35;
    private javax.swing.JButton pos36;
    private javax.swing.JButton pos37;
    private javax.swing.JButton pos38;
    private javax.swing.JButton pos39;
    private javax.swing.JButton pos4;
    private javax.swing.JButton pos40;
    private javax.swing.JButton pos41;
    private javax.swing.JButton pos42;
    private javax.swing.JButton pos43;
    private javax.swing.JButton pos44;
    private javax.swing.JButton pos45;
    private javax.swing.JButton pos46;
    private javax.swing.JButton pos47;
    private javax.swing.JButton pos48;
    private javax.swing.JButton pos49;
    private javax.swing.JButton pos5;
    private javax.swing.JButton pos50;
    private javax.swing.JButton pos51;
    private javax.swing.JButton pos52;
    private javax.swing.JButton pos53;
    private javax.swing.JButton pos54;
    private javax.swing.JButton pos55;
    private javax.swing.JButton pos56;
    private javax.swing.JButton pos57;
    private javax.swing.JButton pos58;
    private javax.swing.JButton pos59;
    private javax.swing.JButton pos6;
    private javax.swing.JButton pos60;
    private javax.swing.JButton pos61;
    private javax.swing.JButton pos62;
    private javax.swing.JButton pos63;
    private javax.swing.JButton pos64;
    private javax.swing.JButton pos65;
    private javax.swing.JButton pos66;
    private javax.swing.JButton pos67;
    private javax.swing.JButton pos68;
    private javax.swing.JButton pos69;
    private javax.swing.JButton pos70;
    private javax.swing.JButton pos71;
    private javax.swing.JButton pos72;
    private javax.swing.JButton pos73;
    private javax.swing.JButton pos74;
    private javax.swing.JButton pos75;
    private javax.swing.JButton pos76;
    private javax.swing.JButton pos77;
    private javax.swing.JButton pos78;
    private javax.swing.JButton pos79;
    private javax.swing.JButton pos80;
    private javax.swing.JButton pos81;
    private javax.swing.JButton pos82;
    private javax.swing.JButton pos83;
    private javax.swing.JButton pos84;
    private javax.swing.JButton pos85;
    private javax.swing.JButton pos86;
    private javax.swing.JButton pos87;
    private javax.swing.JButton pos88;
    private javax.swing.JButton pos89;
    private javax.swing.JButton pos90;
    private javax.swing.JButton pos91;
    private javax.swing.JButton pos92;
    private javax.swing.JButton pos93;
    // End of variables declaration//GEN-END:variables
}