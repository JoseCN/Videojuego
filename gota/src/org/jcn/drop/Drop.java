package org.jcn.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Clase principal del proyecto principal del juego
 * 
 * Ejemplo de juego de la Wiki oficial de libgdx (https://github.com/libgdx/libgdx/wiki/A-simple-game)
 * Los recursos utilizados son propiedad de sus respectivos due�os:
 * audio waterdrop.wav, de junggle (http://www.freesound.org/people/junggle/sounds/30341/)
 * audio undertreeinrain.mp3, de acclivity (http://www.freesound.org/people/acclivity/sounds/28283/)
 * sprite droplet.png, de mvdv (https://www.box.com/s/peqrdkwjl6guhpm48nit)
 * sprite bucket.png sprite, de mvdv (https://www.box.com/s/605bvdlwuqubtutbyf4x )
 * 
 * @author Jose
 *
 */
public class Drop extends Game {

	OrthographicCamera camara;
	SpriteBatch spriteBatch;
	BitmapFont fuente;
	//aki no hacen private public ni nada, pero si no pongo nada los atbutos osn publicos en el mismo pakete
	//si kiero cogerlos desde otro paquete les tgo q poner el public delante.
	
	/*
	 * M�todo invocado en el momento de crearse la aplicaci�n
	 * @see com.badlogic.gdx.ApplicationListener#create()
	 */
	@Override
	public void create() {
		
		spriteBatch = new SpriteBatch();
		fuente = new BitmapFont();
		setScreen(new MainMenuScreen(this));
	}

	/*
	 * M�todo que se invoca cada vez que hay que renderizar, pintar el juego
	 * Es el m�todo donde se actualiza tambi�n la l�gica del juego
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void render() {
		//esto es como un bucle q no para de ejecutarse (fps) frame por segundo
		//se trata de q lo haga cto mas rapido mejor,ctas mas cosas ponga aki va mas lento el juego
		//dependiendo del procesador
		//y que se quiere hacer en cada frame
		super.render();
	}
	
	/*
	 * M�todo invocado cuando se destruye la aplicaci�n
	 * Siempre va precedido de una llamada a 'pause()'
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void dispose() {
		
		spriteBatch.dispose();
		fuente.dispose();
	}
}
