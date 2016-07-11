package com.framework.demo.service.dbservice;


import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dto.page.Color;
import com.framework.demo.dto.page.OptionResult;
import com.framework.demo.exception.PageTempleteException;
import com.framework.demo.service.exception.MenuException;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

public interface DBService {
	public List<Map<String, Object>>  getData(String sql) throws Exception;
	
	public int menuInsert(String table, String pmenuName, String menuName, String urlInfo, String time, PageTemplete pageTemplete) throws MenuException, PageTempleteException;
	
	public PageTemplete getPageInfo(int pageTempNo) throws PageTempleteException;
	
	public int findMenu(String pmenuName, String menuName) throws DataAccessException;

	public PageTemplete findPageTemplate(String fileName) throws Exception;
	
	public int  getSort(String menuName);
	
	public int getSortById(String menuId);

	//更新拖拽节点的sort顺序

	public int[] updateSortById(String menuId);
   //寻找能够挂接图表的挂接项
	public List<Menu> findNoFirestMenu();
	
	public PageTemplete findTemplatePage(String pmenuname, String menuname);
	
	public List<Menu> findMenuChild(String pMenuId);
	
	public int updatepageTemplate(PageTemplete pageTemplete) throws Exception;
	
	public String getMenuNameByName(String menuname);
	
	public Menu findMenuByPmenandmen(String pmenuname, String menuname);

	public Menu findByPIdandId(String pmenuId, String menuId);
	
	public String getMenuNameByFilePath(String filePath);
	
	public PageTemplete getTempleteByFilePath(String filePath) throws Exception;

	public int updateTempletePage(PageTemplete pageTemplete) throws Exception;
	//更新母菜单和子菜单
	public int updateMenu(PageTemplete pageTemplate) throws Exception;
    //更新menuName

	public int updatepmenuName(String NewmenuName, String fileName);

	public int updatemenuName(String NewmenuName, String OldmenuName);

	public int updatePageTemplete(String parentName, String fileName);

	public int searchFileName(String fileName);
	/*public List<ClkUrlStat> getAllUrl()throws Exception ;*/

	public int searchIdByFileName(String fileName);

	public int updateRoleById(String id, SysRole role);

	public List<String> findColums(String tableName) throws Exception;

	public List<OptionResult> findOptions(String tableName, String colName) throws Exception;

	public List<OptionResult> findOption(String sql);

	public List<Map<String, Object>> findSqlInfo(String dbtype, String sql) throws DataAccessException;

	public List<SysUser> findUserByUserNameAndPassword(String userName, String password);

	public int saveComit(String comitmentarea, int pageTempNo) throws Exception;

	public String  findUserIdByUsername(String username) throws Exception;

	public String  findMenuIdByNameAndPageNo(String reportname, Integer pageTempNo) throws Exception;

	public int addCollect(String menuid, String userid);

	public int delCollect(String menuid, String userid);
	public int findByUserIdAndMenuId(String userid, String menuid);
	/*表格注释修改保存2016-2-19*/
	public int updateComit(int templeteId, String comitment);

	public List<Color> findColors() throws Exception;

	public String findFileNameByMenuId(int menuid) throws Exception;

}
