package grape.app.GrpaeApps;

import esayhelper.DBHelper;
import esayhelper.JSONHelper;
import interfaceApplication.appsServer;
import interfaceApplication.insServer;
import interfaceApplication.serviceServer;

public class testapps {
	public static void main(String[] args) {
		String appInfo = "{\"name\":\"123\",\"desp\":123,\"domain\":\"123\"}";
//		System.out.println(new appsServer().appInsert(appInfo));  
		
//		System.out.println(new appsServer().appUpdate("4", appInfo));
//		System.out.println(new appsServer().appSearch(appInfo));
//		String string = new appsServer().appPageBy(1, 2,appInfo);
//		System.out.println(string);
//		System.out.println(new appsServer().appUpdateMeta("1", "3"));
//		System.out.println(new appsServer().appDeleteBatch("2,3")); //批量删除异常
//		System.out.println(new appsServer().appPage(1, 1));
//		System.out.println(new DBHelper("localdb", "apps").page(1, 1));
//		System.out.println(new serviceServer().servicesPage(1, 1));
//		System.out.println(new insServer().insPage(1, 3));
//		System.out.println(new insServer().insInsert(appInfo));
//		DBHelper dbHelper=new DBHelper("mysql","test"); 
//		String string="{\"name\":\"test008\",\"age\":18}";
//		System.out.println(dbHelper.data(JSONHelper.string2json(string)).insertOnce());
		String appInfos = "{\"configName\":\"123\",\"sid\":\"1\"}";
		System.out.println(new insServer().insInsert(appInfos));
	}
}
