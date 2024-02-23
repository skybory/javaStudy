package com.taeyoun.application;

import com.taeyoun.resource.Player;
import com.taeyoun.unit.Unit;
import com.taeyoun.unit.Scv;

public class Application {
	public static void main(String[] args) {
		//StartGame game = new StartGame();
	//	game.showGameStatus();			//게임 끝나면 실행함

		Player player = new Player("김태연");
		Player player2 = new Player("컴퓨터");
		Scv Scv = new Scv(player, 1, 2);
		Scv Scv2 = new Scv(player, 2, 3);
		Scv Scv3 = new Scv(player2, 2, 3);
		Scv.attack(Scv3);
		Scv.gatherMineral();
		player.showGameStatus();
	}
}