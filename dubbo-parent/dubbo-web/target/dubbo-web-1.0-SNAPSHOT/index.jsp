<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
<script>
    $("#btn").on("click",function(){
        $.post("register", $("form").serialize() ,function( result ){ },"json" );
    });
</script>
<form>
    <p>username: <input name="username"></p>
    <p>password: <input name="password"></p>
    <p>phone: <input name="phone"></p>
    <p><input type="button" id="btn" value="register"></p>
</form>
</body>
</html>
