package org.vb2.mkr2.model;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private static List<Article> articles = new ArrayList<>();

    public static List<Article> getArticles() {
        return articles;
    }

    public void addArticle(Article article) {
        articles.add(article);
    }
    public List<Article> getAllArticles() {
        return articles;
    }
}
