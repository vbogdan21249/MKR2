<%--
  Created by IntelliJ IDEA.
  User: vbogd
  Date: 27.05.2024
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Article</title>
</head>
<body>
<h1>Add New Article</h1>
<form action="addArticle" method="post">
    <div>
        <label for="title">Title:</label><br>
        <input type="text" id="title" name="title"><br>
    </div>
    <div>
        <label for="content">Content:</label><br>
        <textarea id="content" name="content"></textarea><br>
    </div>
    <input type="submit" value="Submit">
</form>
</body>
</html>
