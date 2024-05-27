package org.vb2.mkr2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.vb2.mkr2.model.Article;
import org.vb2.mkr2.model.ArticleRepository;

import java.io.IOException;
import java.util.Date;

@WebServlet("/addArticle")
public class AddArticleServlet extends HttpServlet {
    private ArticleRepository articleRepository = new ArticleRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Date publicationDate = new Date();

        Article article = new Article(title, content, publicationDate);
        articleRepository.addArticle(article);

        response.sendRedirect( "view/articles.jsp");
    }

}
