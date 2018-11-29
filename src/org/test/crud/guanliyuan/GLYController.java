package org.test.crud.guanliyuan;

import com.jfinal.core.Controller;

public class GLYController extends Controller {
	
	public void index(){
		setAttr("list", GuanLiYuanDomain.dao.queryAll());
		
		render("/gly/list.jsp");
	}
	
	public void form(){
		System.out.println("form method");
		Integer id = getParaToInt(0);
		if (id!=null&&id>0) {
			setAttr("guanliyuan", GuanLiYuanDomain.dao.findById(id)) ;
		}
		render("/gly/form.jsp");
	}
	
	public void save(){
		GuanLiYuanDomain gly = getModel(GuanLiYuanDomain.class,"guanliyuan");
		gly.remove("guanliyuanid");
		gly.save();
		redirect("/gly");
	}
	
	public void update(){
		GuanLiYuanDomain gly = getModel(GuanLiYuanDomain.class,"guanliyuan");
		gly.update();
		redirect("/gly");
	}
	
	public void del(){
		GuanLiYuanDomain.dao.deleteById(getPara(0));
		redirect("/gly");
	}
}
