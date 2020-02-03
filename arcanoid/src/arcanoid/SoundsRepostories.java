package arcanoid;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;



public class SoundsRepostories {
	

	// Almacén de sonidos, se trata de un HashMap que tiene String como "claves" de los objetos y "AudioClip" como objetos
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();

	// Variable principal del patrón Singleton
	private static SoundsRepostories instance = null;
	
	// Carpeta en la que se encuentran los recursos: imágenes, sonidos, etc.
	private static String RESOURCES_FOLDER = "../resources/";
	
	// Posibles recursos de sonido a cargar
	
	
	
	/**
	 * Default constructor
	 */
	public SoundsRepostories() {
	}
	
	/**
	 * Método principal del patrón Singleton
	 * @return
	 */
	public static SoundsRepostories getInstance() {
		if (instance == null) {
			instance = new SoundsRepostories();
		}
		return instance;
	}
	
	/**
	 * Carga un sonido, en forma de AudioClip, desde el disco duro
	 * @param name
	 * @return
	 */
	private AudioClip loadResource(String name) {
		URL url=null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	/**
	 * Obtiene el AudioClip desde el almacén HashMap, si no existe lo carga desde el disco duro.
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip(String resourceName) {
		// En primera instancia intentamos obtener el objeto AudioClip a partir del HashMap.
		AudioClip clip = sounds.get(resourceName);
		
		// En caso de que el objeto AudioClip no exista dentro del HashMap, se carga desde el disco duro
		if (clip == null) {
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			// Una vez que cargo el recurso en la memoria, lo agrego al HashMap, así no habrá que volver a 
			// buscarlo en el disco duro. Como "clave" del objeto en el HashMap utilizo el nombre del fichero
			sounds.put(resourceName, clip);
		}
		return clip;	
	}
	
	/**
	 * Lanza un sonido, el sonido sólo se escuchará una vez
	 * @param name
	 */
	public void playSound(final String name) {
		getAudioClip(name).play();
	}
	
	/**
	 * Lanza un sonido en bucle.
	 * @param name
	 */
	public void loopSound(final String name) {
		getAudioClip(name).loop();
	}

}
