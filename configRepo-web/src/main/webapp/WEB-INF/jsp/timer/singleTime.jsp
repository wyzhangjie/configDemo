<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>时间控件</title>

</head>
<body>
<div>
   <span>

       <span>时间：</span> <input id="timer" name="timer" type="text"/>
       <input type="hidden" id="kind" name="kind" value=""/>


    </span>
    <span>

	<select style="width:180px"
           name="option1" id="option1"  class=" hidden"   style="display:none">
        </select>
    </span>
     <span>

	<select style="width:180px"
           name="option2" id="option2"  class=" hidden"  >
        </select>
    </span>
    <span>

	<select  style="width:180px"
           name="option3" id="option3"  class=" hidden"  >
        </select>
    </span>
     <span>

	<select  style="width:180px"
           name="option4" id="option4"   class=" hidden" >
        </select>
    </span>
     <span>

	<select  style="width:180px"
           name="option5" id="option5"   class=" hidden" >
        </select>
    </span>
    <span>
          <input type="button" id="sumit" value="提交" name="button" readonly="readonly"/>

    </span>
</div>

</body>
</html>
