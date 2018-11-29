<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function () {
        });
        function deleteUser(id) {
            if(confirm('确认删除！')){
                location.href='delete?id='+id;
            }
        }
    </script>
</head>
<body>
    <div class="text" style="border:2px solid darkorange;text-align: center;font-size: 30px">
        欢迎光临
    </div>
    <div class="container" style="margin-top: 50px">
        <table class="table table-bordered table-hover table-condensed">
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.userName}</td>
                    <td>${user.password}</td>
                    <td>
                        <button class="btn delete" type="button" onclick="deleteUser(${user.id})">删除</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
