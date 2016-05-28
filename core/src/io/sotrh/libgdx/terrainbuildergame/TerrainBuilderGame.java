package io.sotrh.libgdx.terrainbuildergame;

import com.badlogic.gdx.Game;
import io.sotrh.libgdx.terrainbuildergame.screens.TestScreen;

public class TerrainBuilderGame extends Game {
	@Override
	public void create() {
		setScreen(new TestScreen());
	}
}
