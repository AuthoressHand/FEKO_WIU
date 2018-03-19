/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feko_steffensmeierdoty;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 *
 * @author 
 */
public class MainMenuGUI extends javax.swing.JFrame {
    
    private Media songFile;
    private MediaPlayer mediaPlayer;
    private MediaPlayer selectPlayer;
    
    public MainMenuGUI() {
        initComponents();
        initJavaFX();
        initSong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JLayeredPane();
        FireEmblemLogo = new javax.swing.JLabel();
        TheKnockOffLogo = new javax.swing.JLabel();
        LoadGameText = new javax.swing.JLabel();
        OptionsText = new javax.swing.JLabel();
        ExitGameText = new javax.swing.JLabel();
        LoadGameButton = new javax.swing.JButton();
        OptionsButton = new javax.swing.JButton();
        ExitGameButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 612));
        setMinimumSize(new java.awt.Dimension(1024, 612));
        setUndecorated(true);
        setResizable(false);

        MainMenu.setMaximumSize(new java.awt.Dimension(1024, 612));
        MainMenu.setMinimumSize(new java.awt.Dimension(1024, 612));
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FireEmblemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/logo.png"))); // NOI18N
        MainMenu.add(FireEmblemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        TheKnockOffLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIMenu/custom_logo.png"))); // NOI18N
        MainMenu.add(TheKnockOffLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        LoadGameText.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        LoadGameText.setForeground(new java.awt.Color(255, 255, 255));
        LoadGameText.setText("Load Game");
        MainMenu.add(LoadGameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        OptionsText.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        OptionsText.setForeground(new java.awt.Color(255, 255, 255));
        OptionsText.setText("Options");
        MainMenu.add(OptionsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        ExitGameText.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ExitGameText.setForeground(new java.awt.Color(255, 255, 255));
        ExitGameText.setText("Exit Game");
        MainMenu.add(ExitGameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        LoadGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png"))); // NOI18N
        LoadGameButton.setBorderPainted(false);
        LoadGameButton.setContentAreaFilled(false);
        LoadGameButton.setFocusPainted(false);
        LoadGameButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button1.png"))); // NOI18N
        LoadGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadGameButtonMouseExited(evt);
            }
        });
        LoadGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadGameButtonActionPerformed(evt);
            }
        });
        MainMenu.add(LoadGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 290, 60));

        OptionsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png"))); // NOI18N
        OptionsButton.setBorderPainted(false);
        OptionsButton.setContentAreaFilled(false);
        OptionsButton.setFocusPainted(false);
        OptionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OptionsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OptionsButtonMouseExited(evt);
            }
        });
        MainMenu.add(OptionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 290, 60));

        ExitGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png"))); // NOI18N
        ExitGameButton.setBorderPainted(false);
        ExitGameButton.setContentAreaFilled(false);
        ExitGameButton.setFocusPainted(false);
        ExitGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitGameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitGameButtonMouseExited(evt);
            }
        });
        ExitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitGameButtonActionPerformed(evt);
            }
        });
        MainMenu.add(ExitGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 290, 60));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrounds/main_menu_background.png"))); // NOI18N
        MainMenu.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGameButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitGameButtonActionPerformed

    private void ExitGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitGameButtonMouseExited
        ExitGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png")));
    }//GEN-LAST:event_ExitGameButtonMouseExited

    private void ExitGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitGameButtonMouseEntered
        selectSound();
        ExitGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button1.png")));
    }//GEN-LAST:event_ExitGameButtonMouseEntered

    private void OptionsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptionsButtonMouseExited
        OptionsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png")));
    }//GEN-LAST:event_OptionsButtonMouseExited

    private void OptionsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OptionsButtonMouseEntered
        selectSound();
        OptionsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button1.png")));
    }//GEN-LAST:event_OptionsButtonMouseEntered

    private void LoadGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadGameButtonActionPerformed
        CharacterModGUI charModGUI = new CharacterModGUI();
        charModGUI.setVisible(true);
        mediaPlayer.stop();
        dispose();
    }//GEN-LAST:event_LoadGameButtonActionPerformed

    private void LoadGameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadGameButtonMouseExited
        LoadGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button2.png")));
    }//GEN-LAST:event_LoadGameButtonMouseExited

    private void LoadGameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadGameButtonMouseEntered
        selectSound();
        LoadGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/main_menu_button1.png")));
    }//GEN-LAST:event_LoadGameButtonMouseEntered
  
    private void initJavaFX() {
        new JFXPanel();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });
    }
    
    private void initSong() {
        songFile = new Media(new File("src\\audio\\menuBackground.mp3").toURI().toString());
        mediaPlayer = new MediaPlayer(songFile);
        mediaPlayer.setVolume(.6);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
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
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ExitGameButton;
    private javax.swing.JLabel ExitGameText;
    private javax.swing.JLabel FireEmblemLogo;
    private javax.swing.JButton LoadGameButton;
    private javax.swing.JLabel LoadGameText;
    private javax.swing.JLayeredPane MainMenu;
    private javax.swing.JButton OptionsButton;
    private javax.swing.JLabel OptionsText;
    private javax.swing.JLabel TheKnockOffLogo;
    // End of variables declaration//GEN-END:variables
}
