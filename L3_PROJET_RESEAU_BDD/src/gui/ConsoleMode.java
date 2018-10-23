/**
 * 
 */
package gui;

import game.Map;

/**
 * @author GILLES Anne-Sophie
 *
 */
public class ConsoleMode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int width = 20;
			int height = 10;
			int monsterPercentage = 50;
			int obstaclePercentage = 20;
		
		Map map = new Map(height, width, monsterPercentage, obstaclePercentage);
		map.printMap();

	}

}
