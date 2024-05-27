<%@ page import="org.vb2.mkr2.model.ArticleRepository" %>
<%@ page import="org.vb2.mkr2.model.Article" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: vbogd
  Date: 27.05.2024
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Articles</title>
</head>
<body>
<h1>List of Articles</h1>
<%
    Object articlesObj = request.getAttribute("articles");
    if (articlesObj instanceof List<?>) {
        List<Article> articles = (List<Article>) articlesObj;
        if (articles.isEmpty()) { %>
<p>No articles available</p>
<% } else {
    for (Article article : articles) { %>
<div>
    <strong><%= article.getTitle() %>
    </strong><br>
    <em><%= article.getPublicationDate() %>
    </em><br>
    <%= article.getContent() %>
</div>
<hr>
<% }
}
} else { %>
<p>Error: Unable to retrieve articles</p>
<% } %>
<hr>
<h2>Add New Article</h2>
<form action="addArticle.jsp" method="get">
    <input type="submit" value="Add Article">
</form>
</body>
</html>