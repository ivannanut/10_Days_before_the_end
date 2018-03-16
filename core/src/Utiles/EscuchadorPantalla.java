package Utiles;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;

import actores.Personaje;

/**
 * Created by admincenec on 16/03/2018.
 */

public class EscuchadorPantalla extends ApplicationAdapter implements InputProcessor {

    Personaje personaje;

    public EscuchadorPantalla(Personaje personaje) {
        this.personaje=personaje;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if(screenX<= Gdx.graphics.getWidth()/3){
            MoveToAction movimiento = new MoveToAction();
            movimiento.setPosition(0, Gdx.graphics.getHeight());
            movimiento.setDuration(2);
            personaje.addAction(movimiento);
        }
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }


}
