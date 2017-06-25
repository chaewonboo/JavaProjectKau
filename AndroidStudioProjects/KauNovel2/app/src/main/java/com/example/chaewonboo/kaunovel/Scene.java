package com.example.chaewonboo.kaunovel;

import android.graphics.drawable.Drawable;

/**
 * Created by chaewonboo on 2017. 6. 12..
 */

//매장면마다 씬 으로 클래스를 만듬.
public class Scene {
    String text;
    Drawable background;
    Drawable character;

    Scene(String text, Drawable background, Drawable character) {
        this.text= text;
        this.background= background;
        this.character=character;
    }
}
