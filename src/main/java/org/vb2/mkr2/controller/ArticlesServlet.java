package org.vb2.mkr2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.vb2.mkr2.model.Article;
import org.vb2.mkr2.model.ArticleRepository;

import java.io.IOException;
import java.util.List;

@WebServlet("/articles")
public class ArticlesServlet extends HttpServlet {
    private ArticleRepository articleRepository = new ArticleRepository();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Article> articles = articleRepository.getAllArticles();
        request.setAttribute("articles", articles);
        request.getRequestDispatcher("view/articles.jsp").forward(request, response);
    }
}
