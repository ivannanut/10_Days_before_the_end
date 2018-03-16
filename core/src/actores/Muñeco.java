package actores;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by admincenec on 16/03/2018.
 */

public class Muñeco extends Actor {

    Texture t;
    Sprite sprite;

    public Muñeco() {


        float altoPantalla = Gdx.graphics.getHeight();
        float anchoPantalla = Gdx.graphics.getWidth();
        float altoMuñeco = altoPantalla /4;
        float anchoMuñeco = altoMuñeco;
        t = new Texture(Gdx.files.internal("dummy.png"));
        this.sprite = new
                Sprite(t);

        sprite.setBounds(0+anchoMuñeco/2, altoPantalla-altoMuñeco*1.5F, altoMuñeco, anchoMuñeco);
        setBounds(0+anchoMuñeco/2, altoPantalla-altoMuñeco*1.5F, altoMuñeco, anchoMuñeco);
    }

    public void draw(Batch batch, float alpha){
        super.draw(batch,alpha);
        sprite.setScale(getScaleX(),getScaleY());
        sprite.setRotation(getRotation());
        sprite.setPosition(getX(),getY());
        sprite.setColor(getColor().r,getColor().g,getColor().b,getColor().a);
        sprite.draw(batch);
    }
}
