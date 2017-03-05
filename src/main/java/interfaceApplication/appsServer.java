/**
 * 
 */
/**
 * @author Administrator
 *
 */
package interfaceApplication;

import common.DBHelper;
public class appsServer extends DBHelper{
	//private db serviceServer;
	public appsServer(){
		super("localDB","services","id");
		//serviceServer = getDB();
	}
}
