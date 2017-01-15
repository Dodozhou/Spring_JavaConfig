package com.star.config;

import com.star.soundsystem.CDPlayer;
import com.star.soundsystem.CompackDisc;
import com.star.soundsystem.MediaPlayer;
import com.star.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hp on 2017/1/15.
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompackDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(CompackDisc cd){
        CDPlayer player=new CDPlayer();
        player.setCd(cd);
        return player;
    }

}
