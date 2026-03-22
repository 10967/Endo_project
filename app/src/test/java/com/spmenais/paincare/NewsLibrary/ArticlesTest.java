package com.spmenais.paincare.NewsLibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArticlesTest {

    @Test
    public void constructeur_assigneTousLesChamps() {
        Articles a = new Articles("Titre", "Description", "http://img.jpg", "http://url.com", "Contenu");
        assertEquals("Titre", a.getTitle());
        assertEquals("Description", a.getDescription());
        assertEquals("http://img.jpg", a.getUrlToImage());
        assertEquals("http://url.com", a.getUrl());
        assertEquals("Contenu", a.getContent());
    }

    @Test
    public void setTitle_modifieLeTitre() {
        Articles a = new Articles("Titre", "Desc", "img", "url", "content");
        a.setTitle("Nouveau titre");
        assertEquals("Nouveau titre", a.getTitle());
    }

    @Test
    public void setDescription_modifieLaDescription() {
        Articles a = new Articles("Titre", "Desc", "img", "url", "content");
        a.setDescription("Nouvelle description");
        assertEquals("Nouvelle description", a.getDescription());
    }

    @Test
    public void setUrlToImage_modifieLUrl() {
        Articles a = new Articles("Titre", "Desc", "img", "url", "content");
        a.setUrlToImage("http://nouvelle-image.jpg");
        assertEquals("http://nouvelle-image.jpg", a.getUrlToImage());
    }

    @Test
    public void setUrl_modifieLUrl() {
        Articles a = new Articles("Titre", "Desc", "img", "url", "content");
        a.setUrl("http://nouvel-article.com");
        assertEquals("http://nouvel-article.com", a.getUrl());
    }

    @Test
    public void setContent_modifieLContenu() {
        Articles a = new Articles("Titre", "Desc", "img", "url", "content");
        a.setContent("Nouveau contenu");
        assertEquals("Nouveau contenu", a.getContent());
    }
}
