package org.jcn.drop;

import org.jcn.drop.Drop;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Clase principal para la versi�n Android del proyecto
 * @author Jose
 *
 */
public class AndroidDrop extends AndroidApplication {
	public void onCreate (android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration configuracion = new AndroidApplicationConfiguration();
		configuracion.useAccelerometer = false;
		configuracion.useCompass = false;
		
		initialize(new Drop(), configuracion);
	}
}