package grape.app.GrpaeApps;

import httpServer.booter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		booter booter = new booter();
		System.out.println("GrapeApps!");
		try {
			System.setProperty("AppName", "GrapeApps");
			booter.start(108);
		} catch (Exception e) {

		}
	}
}
