package grape.app.GrpaeApps;

import http.booter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	booter booter = new booter();
        System.out.println( "GrapeApps!" );
        try {
			booter.start(108);
		} catch (Exception e) {
			
		}
    }
}
