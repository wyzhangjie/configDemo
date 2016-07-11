$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '用户列表',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModel,
        toolbar: '#toolbar'
    });
});

function listLoader(param, success, error) {
    var params = {
        keyword: $("#keyword").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/list', params, success, error);
}

function doSearch() {
    $('#list').datagrid('reload');
}

function submitForm(f, url, w) {
    if (!f.form("validate")) {
        return;
    }
    f.form('submit', {
        url: url,
        success: function(result) {
            if (successJsonToObject(result)) {
                f.form('clear');
                closeWindow(w);
                $('#list').datagrid('reload');
            }
        }
    });
}

function doAdd() {
    openWindow($('#a'));
    $.getJSON('../kv/hint?module=2&defaultValue=1', function(json) {
        $('#aRoleId').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text',
            panelHeight:'auto'
        });
    });
    $.getJSON('../kv/hint?module=1&defaultValue=1', function(json) {
        $('#aSex').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text',
            panelHeight:'auto'
        });
    });
}

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $('#ef').form('load', {
            id: row.id,
            name: row.name,
            email: row.email,
            phone: row.phone
        });
        $.getJSON('../kv/hint?module=2&defaultValue=' + row.roleId, function(json) {
            $('#eRoleId').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text',
                panelHeight:'auto'
            });
        });
        $.getJSON('../kv/hint?module=1&defaultValue=' + row.sex, function(json) {
            $('#eSex').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text',
                panelHeight:'auto'
            });
        });
        $.getJSON('../kv/hint?module=4&defaultValue=' + row.status, function(json) {
            $('#eStatus').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text',
                panelHeight:'auto'
            });
        });
    } else {
        $.messager.alert('温馨提示', '请选择用户信息!');
    }
}