package com.star.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by hp on 2017/1/13.
 */

public class SgtPeppers implements CompackDisc {

    private String title="Sgt. Pepper's Lonely Hearts!";
    private String artist="The Beatles";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
