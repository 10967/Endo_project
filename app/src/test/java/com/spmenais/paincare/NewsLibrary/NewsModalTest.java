package com.spmenais.paincare.NewsLibrary;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class NewsModalTest {

    private List<Articles> creerArticles() {
        return Arrays.asList(
                new Articles("Titre1", "Desc1", "img1", "url1", "content1"),
                new Articles("Titre2", "Desc2", "img2", "url2", "content2")
        );
    }

    @Test
    public void constructeur_assigneTousLesChamps() {
        List<Articles> articles = creerArticles();
        NewsModal modal = new NewsModal(2, "ok", articles);
        assertEquals(2, modal.getTotalResults());
        assertEquals("ok", modal.getStatus());
        assertEquals(articles, modal.getArticles());
    }

    @Test
    public void setTotalResults_modifieLTotal() {
        NewsModal modal = new NewsModal(0, "ok", creerArticles());
        modal.setTotalResults(10);
        assertEquals(10, modal.getTotalResults());
    }

    @Test
    public void setStatus_modifieLStatus() {
        NewsModal modal = new NewsModal(2, "ok", creerArticles());
        modal.setStatus("error");
        assertEquals("error", modal.getStatus());
    }

    @Test
    public void setArticles_modifieLaListe() {
        NewsModal modal = new NewsModal(2, "ok", creerArticles());
        List<Articles> newArticles = Arrays.asList(
                new Articles("New", "New desc", "img", "url", "content")
        );
        modal.setArticles(newArticles);
        assertEquals(1, modal.getArticles().size());
        assertEquals("New", modal.getArticles().get(0).getTitle());
    }
}