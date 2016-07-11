var colModel = [[
    {
        field: 'ck',
        checkbox: true
    },
    {
        field: 'name',
        title: '用户名',
        width: 50
    },
    {
        field: 'email',
        title: '邮箱',
        width: 50
    },
    {
        field: 'phone',
        title: '手机号',
        width: 50
    },
    {
        field: 'sex',
        title: '性别',
        width: 50,
        formatter: function (value, row, index) {
            if (value == '1') {
                return '男';
            } else if (value == '2') {
                return '女';
            } else {
                return value;
            }
        }
    },
    {
        field: 'roleName',
        title: '角色',
        width: 50
    },
    {
        field: 'createTime',
        title: '创建时间',
        width: 50
    },
    {
        field: 'status',
        title: '状态',
        width: 50,
        formatter: function (value, row, index) {
            if (value == '1') {
                return '可用';
            } else if (value == '2') {
                return '禁用';
            } else {
                return value;
            }
        }
    }
]];