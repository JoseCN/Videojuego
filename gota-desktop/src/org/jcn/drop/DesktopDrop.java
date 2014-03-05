package org.jcn.drop;

import org.jcn.drop.Drop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Clase principal de la versión de escritorio (PC) del juego
 * @author Jose
 *
 */
public class DesktopDrop {

	public static void main(String[] args) {
		
		LwjglApplicationConfiguration configuracion = new LwjglApplicationConfiguration();
		configuracion.title = "Drop";
		configuracion.width = 1024;
		configuracion.height = 768;
				
		new LwjglApplication(new Drop(), configuracion);
	}
}
