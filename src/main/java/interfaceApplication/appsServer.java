/**
 * 
 */
/**
 * @author Administrator
 *
 */
package interfaceApplication;

import java.util.UUID;
import org.json.simple.JSONObject;

import common.DBHelper;
import common.JSONHelper;
import security.md5;
public class appsServer extends DBHelper{
	//private db serviceServer;
	public appsServer(){
		super("localDB","services","id");
		//serviceServer = getDB();
	}
	@SuppressWarnings("unchecked")
	@Override
	public String insert(String appJSON){
		JSONObject JSONObject = JSONHelper.string2json(appJSON);
		JSONObject.put("appid",getAppid());
		if( JSONObject.containsKey("id")){
			JSONObject.remove("id");
		}
		return super.insert(JSONObject);
	}
	private String getAppid(){
		return md5.getMD5(UUID.randomUUID().toString());
	}
}
