package main;

import org.test.crud.guanliyuan.GLYController;
import org.test.crud.guanliyuan.GuanLiYuanDomain;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect;
import com.jfinal.plugin.activerecord.dialect.SqlServerDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

public class MainConfig extends  JFinalConfig{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		loadPropertyFile("/res/configtext.txt");
		me.setDevMode(getPropertyToBoolean("devMode",false));
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		me.add("/gly", GLYController.class,"/gly");
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		C3p0Plugin cp=new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"), getProperty("driverClass"));
		me.add(cp);
		
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
		me.add(arp);
		
		arp.addMapping("guanliyuan" , "guanliyuanid",GuanLiYuanDomain.class);
		arp.setDialect(new SqlServerDialect());
		arp.setDialect(new AnsiSqlDialect());
		arp.setShowSql(true);
		arp.setContainerFactory(new CaseInsensitiveContainerFactory());
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

}
