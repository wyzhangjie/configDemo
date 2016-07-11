package com.framework.demo.dto.jqgrid;


public class ColModel {


	private String label;

	private String index;

	private String name;

	private String sorttype;

	//left, center, right.
	private String align;

	//设置列的css。多个class之间用空格分隔，如：'class1 class2' 。表格默认的css属性是ui-ellipsis
	private String classes;

	//”/”, ”-”, and ”.”都是有效的日期分隔符。y,Y,yyyy 年YY, yy 月m,mm for monthsd,dd 日.
	private String datefmt;

	//查询字段的默认值
	private String defval;

	//单元格是否可编辑
	private boolean editable;

	//编辑的一系列选项。{name:’__department_id’,index:’__department_id’,width:200,editable:true,edittype:’select’,editoptions: {dataUrl:”/jqGrid/admin/deplistforstu.action”}},这个是演示动态从服务器端获取数据。
	private String[] editoptions;

	//编辑的规则{name:’age’,index:’age’, width:90,editable:true,editrules: {edithidden:true,required:true,number:true,minValue:10,maxValue:100}},设定 年龄的最大值为100，最小值为10，而且为数字类型，并且为必输字段。
    private String[] editrules;

	//可以编辑的类型。可选值：text, textarea, select, checkbox, password, button, image and file.
	private String edittype;

	//列宽度是否要固定不可变
	private boolean fixed;

	//对于form进行编辑时的属性设置
	private String[] formoptions;

	//对某些列进行格式化的设置
	private String[] formatoptions;

	//formatter
	private Object formatter;

	//是否显示或者隐藏此列
	private boolean hidedlg;

	//当从服务器端返回的数据中没有id时，将此作为唯一rowid使用只有一个列可以做这项设置。如果设置多于一个，那么只选取第一个，其他被忽略
    private boolean key =true;

	//是否可以被resizable
	private boolean resizable;
   //给单元格添加属性
	private Object cellattr;

	//定义搜索元素的类型
	private String stype;

	//搜索数据时的url
	private String surl;

	//默认列的宽度，只能是象素值，不能是百分比
	private Integer width;

	//定义当前列跟返回的xml数据之间的映射关系
	private String xmlmap;

	private  Object function;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Object getFunction() {
		return function;
	}

	public void setFunction(Object function) {
		this.function = function;
	}

	public String getXmlmap() {
		return xmlmap;
	}

	public void setXmlmap(String xmlmap) {
		this.xmlmap = xmlmap;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public String getSurl() {
		return surl;
	}

	public void setSurl(String surl) {
		this.surl = surl;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}


	public boolean isResizable() {
		return resizable;
	}

	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}

	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
	}

	public boolean isHidedlg() {
		return hidedlg;
	}

	public void setHidedlg(boolean hidedlg) {
		this.hidedlg = hidedlg;
	}

	public Object getFormatter() {
		return formatter;
	}

	public void setFormatter(Object formatter) {
		this.formatter = formatter;
	}

	public String[] getFormatoptions() {
		return formatoptions;
	}

	public void setFormatoptions(String[] formatoptions) {
		this.formatoptions = formatoptions;
	}

	public String[] getFormoptions() {
		return formoptions;
	}

	public void setFormoptions(String[] formoptions) {
		this.formoptions = formoptions;
	}

	public boolean isFixed() {
		return fixed;
	}

	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	public String getEdittype() {
		return edittype;
	}

	public void setEdittype(String edittype) {
		this.edittype = edittype;
	}

	public String[] getEditrules() {
		return editrules;
	}

	public void setEditrules(String[] editrules) {
		this.editrules = editrules;
	}

	public String[] getEditoptions() {
		return editoptions;
	}

	public void setEditoptions(String[] editoptions) {
		this.editoptions = editoptions;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getDefval() {
		return defval;
	}

	public void setDefval(String defval) {
		this.defval = defval;
	}

	public String getDatefmt() {
		return datefmt;
	}

	public void setDatefmt(String datefmt) {
		this.datefmt = datefmt;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getSorttype() {
		return sorttype;
	}

	public void setSorttype(String sorttype) {
		this.sorttype = sorttype;
	}


	public Object getCellattr() {
		return cellattr;
	}

	public void setCellattr(Object cellattr) {
		this.cellattr = cellattr;
	}
}
