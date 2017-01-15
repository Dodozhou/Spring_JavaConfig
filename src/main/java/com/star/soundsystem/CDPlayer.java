package com.star.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hp on 2017/1/15.
 */
public class CDPlayer implements MediaPlayer{
    private CompackDisc cd;

    public void setCd(CompackDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
