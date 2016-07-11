
function close(){
    $("#option1").hide();
    $("#option2").hide();
    $("#option3").hide();
    $("#option4").hide();
    $("#option5").hide();
}
function page_list(url, params, success, error) {
    $.getJSON(url, params, function (json) {
        var data = {
            total: json.total,
            rows: json.data
        };
        success(data);
    });
}
function listLoader(param, success, error) {
    var params = {
        opt1:$("#option1").val(),
        opt2:$("#option2").val(),
        opt3:$("#option3").val(),
        opt4:$("#option4").val(),
        opt5: $("#option5").val(),
        modl:$("#modl").val(),
        timer:$("#timer").val(),
        starttime:$("#starttime").val(),
        endtime:$("#endtime").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('../config/easyuimenu', params, success, error);
}
function getDataGrid(template) {
    var param={
        opt1:$("#option1").val(),
        opt2:$("#option2").val(),
        opt3:$("#option3").val(),
        opt4:$("#option4").val(),
        opt5: $("#option5").val(),
        modl:$("#modl").val(),
        timer:$("#timer").val(),
        starttime:$("#starttime").val(),
        endtime:$("#endtime").val()
    }

    template.url="../config/easyuimenu";
    template.method="POST";

    var a = new Array();
    a.push( template.columns[0]);
    var pagination =JSON.parse(template.pagination);
    var pageSize= pagination.pageSize;
    console.log(pagination);
    $('#disgrid').datagrid({
        loader:listLoader,
        type: template.method,
        columns:a,
        nowrap: template.nowrap,
        striped: template.striped,
        title:template.title,
        fit:template.fit,
        width:template.width,
        height:template.height,
        data:template.data,
        url:template.url,
        fitColumns: true,
        pageList:pagination.pageList,
        remoteSort: template.remoteSort,
        pagination:pagination,
        singleSelect:template.singleSelect

   });

}

$(document).ready(function(){
    var modl= $("#modl").val();
    var username = getCookie("userName");
    var param={
        modl:modl
    };
    $.ajax({
        async : false,
        cache:false,
        type: 'POST',
        data:param,
        dataType : "json",
        url: "../config/easyuimenu",//请求的action路径
        error:function(XMLHttpRequest, textStatus, errorThrown) {

            alert(errorThrown);
        },
        success:function(template){ //请求成功后处理函数。
             getDataGrid(template);
            //获取查询条件
            getOptions(template.otherOption);
            getTime(template.reportKind,template.timer,template.starttime,template.endtime);
        }
    });
    $("#sumit").click(function(){

        $('#disgrid').datagrid("reload");
    })

});
function getOptions(otherOption){
    if(otherOption==null){
        close();
    }
}