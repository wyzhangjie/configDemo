var myChart;

function getEcharts(template){

    require.config({
        paths: {
            echarts: '../js/echarts-2.2.7/build/dist/'
        }
    });
    require(
        [
            'echarts',
            'echarts/chart/pie',
            'echarts/chart/funnel'

        ],
        function (ec) {
            myChart = ec.init(document.getElementById("main"));
            //图表显示提示信息
            myChart.showLoading({
                text: "图表数据正在努力加载..."
            });
            //定义图表options
            var options = {
                title: {

            x:'center'
        },
        tooltip : {
        trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient : 'vertical',
            x : 'left',

            data: []
    },
    toolbox: {
        show : true,
            feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {
                show: true,
                    type: ['pie', 'funnel'],
                    option: {
                    funnel: {
                        x: '25%',
                            width: '50%',
                            funnelAlign: 'left',
                            max: 1548
                    }
                }
            },
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable: true,

        series: [{
        name:'',
        type:'pie',
        radius : '55%',
        center: ['50%', '60%'],
        data:[]
    }]
};

options.title.text= template.title;
options.title.subtext=template.subtitle;
options.legend.data =template.dataVelodity.legendList //头标
options.series[0].data =  template.dataVelodity.pieSeriesList;//series信息
myChart.hideLoading();
myChart.setOption(options);
});
}

function getCommitmentPrivlige(username) {
    if (username == "root") {

        $("#comitmentarea").removeAttr("readOnly");

        $("#save").css("display", "block");
    } else {
        $("#comitmentarea").attr("readOnly", "readOnly");
        $("#save").css("display", "none");

    }

}
//----------------------函数区结束-----------------------


