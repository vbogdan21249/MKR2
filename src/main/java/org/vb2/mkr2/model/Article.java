package org.vb2.mkr2.model;

import java.util.Date;

public class Article {
    private String title;
    private String content;
    private Date publicationDate;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Article(String title, String content, Date publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }
}
