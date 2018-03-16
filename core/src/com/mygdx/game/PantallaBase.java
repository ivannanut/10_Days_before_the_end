package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;



/**
 * Created by admincenec on 16/03/2018.
 */

public abstract class PantallaBase implements Screen {

    private Game game;

    public PantallaBase(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
