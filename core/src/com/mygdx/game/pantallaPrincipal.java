package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;

import Utiles.EscuchadorPantalla;
import actores.Muñeco;
import actores.Personaje;
import actores.Señal;


public class pantallaPrincipal extends PantallaBase {
	SpriteBatch batch;

	Texture fondo;
	Stage escena;
	Group actores;
	Personaje personaje;
	Muñeco muñeco;
	InputMultiplexer multiplexer;

	public pantallaPrincipal(Game game) {
		super(game);
		batch = new SpriteBatch();
		escena = new Stage(new FillViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight()));
		actores = new Group();
		muñeco = new Muñeco();
		personaje = new Personaje();
		actores.addActor(personaje);
		actores.addActor(muñeco);
		escena.addActor(actores);
		EscuchadorPantalla escuchadorPantalla = new EscuchadorPantalla(personaje);
		fondo = new Texture(Gdx.files.internal("pradera.png"));

		Gdx.input.setInputProcessor(escuchadorPantalla);
	}




	@Override
	public void show() {

	}

	@Override
	public void render (float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		escena.getBatch().begin();
		escena.getBatch().draw(fondo,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		escena.getBatch().end();
		escena.act(delta);
		escena.draw();
	}

	@Override
	public void resize(int width, int height) {
		escena.getBatch().begin();
		escena.getBatch().draw(fondo,0,0,width,height);
		escena.getBatch().end();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose () {
		batch.dispose();

	}
}
