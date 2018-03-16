package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

/**
 * Created by admincenec on 16/03/2018.
 */

public class MyJuego extends Game {
    Screen pantallaActual;


    @Override
    public void create() {
         pantallaPrincipal pantallaPrincipal = new pantallaPrincipal(this);
         pantallaActual=pantallaPrincipal;
         setScreen(pantallaActual);
    }
}
