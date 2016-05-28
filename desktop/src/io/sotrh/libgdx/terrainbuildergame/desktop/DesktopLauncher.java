package io.sotrh.libgdx.terrainbuildergame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.sotrh.libgdx.terrainbuildergame.TerrainBuilderGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TerrainBuilderGame(), config);
	}
}
