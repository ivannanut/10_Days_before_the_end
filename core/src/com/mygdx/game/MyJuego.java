package com.mygdx.game;

import com.badlogic.gdx.Game;

import Utiles.IgetFondo;

/**
 * Created by admincenec on 16/03/2018.
 */

public class MyJuego extends Game {
    private String fondo;


    public MyJuego(String fondo){
        this.fondo= fondo;
    }

    public String getFondo() {
        return fondo;
    }


    @Override
    public void create() {
         setScreen(new PantallaPrincipal());
    }


    @Override
    public void render() {
        super.render();
    }
}
