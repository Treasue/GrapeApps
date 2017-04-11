package interfaceApplication;

import org.json.simple.JSONObject;

import esayhelper.JSONHelper;
import model.AppModel;
@SuppressWarnings("unchecked")
public class appsServer {
	private AppModel model = new AppModel();
	private JSONObject _obj = new JSONObject();
	public String appInsert(String appInfo) {
		return model.resultMessage(model.insert(JSONHelper.string2json(appInfo)), "新增apps成功");
	}
	public String appUpdate(String appid,String appInfo) {
		return model.resultMessage(model.update(appid, JSONHelper.string2json(appInfo)), "修改apps成功");
	}
	public String appDelete(String appid) {
		return model.resultMessage(model.delete(appid), "删除apps成功");
	}
	public String appDeleteBatch(String ids) {
		return model.resultMessage(model.delete(ids.split(",")), "批量删除apps成功");
	}
	public String appSearch(String appInfo) {
		_obj.put("record", model.search(JSONHelper.string2json(appInfo)));
		return model.resultMessage(0, _obj.toString());
	}
	
	public String appPage(int idx,int pageSize) {
		_obj.put("record", model.page(idx, pageSize).toString());
		return model.resultMessage(0, _obj.toString());
	}
	public String appPageBy(int idx,int pageSize,String appInfo) {
		_obj.put("record", model.page(idx, pageSize,JSONHelper.string2json(appInfo)).toString());
		return model.resultMessage(0, _obj.toString());
	}
	public String appUpdateMeta(String appid,String ins) {
		return model.resultMessage(model.setMeta(appid, ins), "设置实例成功");
	}
}