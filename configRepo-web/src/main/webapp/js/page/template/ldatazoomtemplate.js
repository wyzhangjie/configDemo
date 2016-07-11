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
                    text: "",
                    subtext:"",
                    x:'center'

                },
                tooltip: {

                    trigger: 'axis'
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
                        magicType : {show: true, type: ['line', 'bar']},
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
                        splitArea: { show: true }
                    }
                ],
                series: []
            };


            options.title.text= template.title;
            options.title.subtext=template.subtitle;
            options.legend.data =template.dataVelodity.legendList ; //头标
            options.xAxis[0].data =template.dataVelodity.categoryList; //是横轴的汉字
            options.series =template.dataVelodity.seriesList;//series信息
            myChart.hideLoading();
            myChart.setOption(options);
        })



    require([
            'echarts',
            'echarts/chart/bar' ,// 使用柱状图就加载bar模块，按需加载
            'echarts/chart/line'
        ],
        function (ec) {
            // 基于准备好的dom，初始化echarts图表
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
                    x:'left',
                    y:'top',


                    data: []
                },
                dataZoom: {
                    show: true,
                    start: 30,
                    end:70
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {show: true, type: ['line', 'bar']},
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
                    x: 50,
                    x2: 60,
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
                series: []
            };

//通过Ajax获取数据
            options.title.text= template.title;
            options.title.subtext=template.subtitle;
            options.legend.data =template.dataVelodity.legendList ; //头标
            options.xAxis[0].data =template.dataVelodity.categoryList; //是横轴的汉字
            options.series =template.dataVelodity.seriesList;//series信息
            myChart.hideLoading();
            myChart.setOption(options);


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


