<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>게시글 작성</title>
</head>
<body>
<form action="write" method="post">
    <p>
        제목: <input type="text" name="title"> <br>
    </p>
    <p>
        작성자: <input type="text" name="writer"> <br>
    </p>
    <p>
        <textarea name="content" cols="60" rows="10"></textarea> <br>
    </p>
    <input type="submit" value="등록">
</form>
</body>
</html>