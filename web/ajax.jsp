<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--发起ajax请求--%>
    <script src="http://code.jquery.com/jquery-2.1.4.min.js" ></script>
    <script type="text/javascript">
        function f1() {
        //    type: 请求方式; dataType 参数类型;
        //    contextType: 请求的正文类型:"application/json;charset=utf-8"
            $.ajax({
                url:'${pageContext.request.contextPath}/studentControllerPage2/getData2.do',
                type:'POST',
                contextType:'application/json;charset=utf-8',
                success:function (a) {
                    // alert('请求成功:'+a);

                //    1、当服务器收到的响应对象为对象时，可以直接对象.属性
                //     alert(a+a.id+a.stuName);

                //    2、当服务器接受到的响应是集合时，需要遍历
                //     $(a).each(function(index,el){
                //         alert('遍历：'+el+el.id+el.stuName+el.age);
                //     })

                //    3、当服务器接收到的是JSON字符串时
                //    直接把字符串转换为JSON对象
                    var parseJSON = $.parseJSON(a);
                    alert("JSON对象："+parseJSON)

                },
                error:function (a) {
                    alert('请求失败:'+a);
                }
            });
        }
    </script>
</head>
<body>
<h1 onclick="f1()">点击响应</h1>
</body>
</html>
