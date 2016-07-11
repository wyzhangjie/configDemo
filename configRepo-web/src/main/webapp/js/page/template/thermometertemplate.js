var myChart;

//-------------------函数区

function getEcharts(template){

    require.config({
        paths: {
            echarts: '../js/echarts-2.2.7/build/dist/'
        }
    });
    require([
            'echarts',
            'echarts/chart/bar' ,// 使用柱状图就加载bar模块，按需加载
            'echarts/chart/line'
        ],
        function (ec) {
            // 基于准备好的dom，初始化echarts图表
            myChart = ec.init(document.getElementById("main"),'helianthus');
            //图表显示提示信息
            myChart.showLoading({
                text: "图表数据正在努力加载..."
            });
            //定义图表options
            var options = {
                title: {

            x:'center'

        },
        tooltip: {

        trigger: 'axis',
            formatter:function(params)
        {
            var relVal = "";
            var count=params.length;
            relVal=params[0].name+"<br/>";
            for(var i=0;i<count;i++){
                relVal+=params[i].seriesName+":";
                relVal+=params[i].data+"%<br/>";
            }
            return relVal;
        }
    },

    legend: {
        x:'center',
            y:'bottom',


            data: []
    },
    toolbox: {
        show : true,
            feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            // magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
        xAxis: [
        {
            type: 'category',
            data: [],
            axisLabel : {
                show:true,
                interval: 'auto',    // {number}
                rotate: 20,
                margin: 8,
                textStyle: {
                    color: 'black',
                    fontFamily: 'sans-serif',
                    fontSize: 10,
                    fontStyle: 'italic',
                    fontWeight: 'bold'
                }

            }

        }
    ],
        grid: {
        x: 55,
            x2: 55,
            y2: 90
    },
    yAxis: [
        {
            type: 'value',
            nameLocation:'start',
            splitArea: { show: true },
            axisLabel: {
                show: true,
                interval: 'auto',
                formatter: '{value} %'
            }
        }
    ],
        series: [

        {
            name:'',
            type:'bar',
            stack: 'sum',
            barCategoryGap: '50%',
            itemStyle: {
                normal: {

                    label : {
                        show: true, position: 'inside',formatter:'{c}%'
                    }
                }
            },
            markPoint : {
                itemStyle:{normal:{label:{show:true,formatter: '{c}%'}}},
                data : []
            },
            markLine : {
                itemStyle:{normal:{label:{show:true,position:'end',formatter: '{c}%'}}},
                data : []
            },
            data:[]
        },
        {
            name:'',
            type:'bar',
            stack: 'sum',
            itemStyle: {
                normal: {

                    barBorderRadius:0,
                    label : {
                        show: true,
                        position: 'top',
                        formatter: function (params) {
                            for (var i = 0, l = options.xAxis[0].data.length; i < l; i++) {
                                if (options.xAxis[0].data[i] == params.name) {
                                    return ((options.series[0].data[i] /(options.series[0].data[i] + params.value))*100).toFixed(2)+'%';
                                }
                            }
                        },
                        textStyle: {
                            color: 'black'
                        }
                    }
                }
            },
            markPoint : {
                itemStyle:{normal:{label:{show:true,formatter: '{c}%'}}},
                data : []
            },
            markLine : {
                itemStyle:{normal:{label:{show:true,position:'end',formatter: '{c}%'}}},
                data : []
            },
            data:[]
        }


    ]
};

            //通过Ajax获取数据
            options.title.text= template.title;
            options.title.subtext=template.subtitle;
            options.legend.data =template.dataVelodity.legendList; //头标
            options.xAxis[0].data =template.dataVelodity.categoryList;; //是横轴的汉字
            options.series[0].data = template.dataVelodity.seriesList[0].data;//series信息
            options.series[1].data = template.dataVelodity.seriesList[1].data;
            options.series[0].name = template.dataVelodity.seriesList[0].name;
            options.series[1].name = template.dataVelodity.seriesList[1].name;
            options.series[0].markPoint.data = template.seriesMarkPoint0==null?"":template.seriesMarkPoint0;
            options.series[1].markPoint.data = template.seriesMarkPoint1==null?"":template.seriesMarkPoint1;
            options.series[0].markLine.data =  template.seriesMarkLine0==undefined?"":template.seriesMarkLine0;
            options.series[1].markLine.data = template.seriesMarkLine1==undefined?"":template.seriesMarkLine0;
            myChart.hideLoading();
            myChart.setOption(options);

// myChart.addMarkPoint(###markPoint###);
//myChart.addMarkLine ( ###markLine###) ;
/*  $(".zr-element").css("width","1053px"); */

}
);
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


