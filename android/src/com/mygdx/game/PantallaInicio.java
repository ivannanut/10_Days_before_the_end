package com.mygdx.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by admincenec on 16/03/2018.
 */

public class PantallaInicio extends Activity{

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);
    }

    public void startGame(View v){
        Intent i=new Intent(this,AndroidLauncher.class);
        startActivity(i);
    }
}
