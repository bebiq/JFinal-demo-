package org.test.crud.guanliyuan;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

public class GuanLiYuanDomain extends Model<GuanLiYuanDomain>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final GuanLiYuanDomain dao = new GuanLiYuanDomain();
	
	public List<GuanLiYuanDomain> queryAll(){
		try{
			String sql=" SELECT [guanliyuanid] ,[guanliyuanming] ,[dengluming],[mima] ,[quanxian] "+
  " FROM [houqin].[dbo].[guanliyuan] ";
			return dao.find(sql);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	 

}
