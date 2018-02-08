/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Justin
 */
public class AudioPlayer {
    
    private String file;
    private Media media;
    private MediaPlayer mPlayer;
    
    public void play(String file) {
        this.file = file;
        media = new Media(new File(file).toURI().toString());
        mPlayer = new MediaPlayer(media);
        mPlayer.play();
    }
    
    public void stop(){
        
        mPlayer.stop();
        
    }
}
