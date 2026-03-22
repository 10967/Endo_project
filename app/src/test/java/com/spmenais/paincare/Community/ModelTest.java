package com.spmenais.paincare.Community;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void constructeurVide_creeObjetSansErreur() {
        Model m = new Model();
        assertNull(m.getTitle());
        assertNull(m.getDesc());
    }

    @Test
    public void setTitle_modifieLeTitre() {
        Model m = new Model();
        m.setTitle("Mon article");
        assertEquals("Mon article", m.getTitle());
    }

    @Test
    public void setDesc_modifieLaDescription() {
        Model m = new Model();
        m.setDesc("Description de l'article");
        assertEquals("Description de l'article", m.getDesc());
    }

    @Test
    public void setAuthor_modifieLAuteur() {
        Model m = new Model();
        m.setAuthor("Malak");
        assertEquals("Malak", m.getAuthor());
    }

    @Test
    public void setDate_modifieLaDate() {
        Model m = new Model();
        m.setDate("22/03/2026");
        assertEquals("22/03/2026", m.getDate());
    }

    @Test
    public void setImg_modifieLImage() {
        Model m = new Model();
        m.setImg("http://image.jpg");
        assertEquals("http://image.jpg", m.getImg());
    }

    @Test
    public void setId_modifieLId() {
        Model m = new Model();
        m.setId("post-123");
        assertEquals("post-123", m.getId());
    }

    @Test
    public void setOwnerId_modifieLOwnerId() {
        Model m = new Model();
        m.setOwnerId("user-456");
        assertEquals("user-456", m.getOwnerId());
    }

    @Test
    public void setShareCount_modifieLShareCount() {
        Model m = new Model();
        m.setShare_count("42");
        assertEquals("42", m.getShare_count());
    }

    @Test
    public void setTimestamp_modifieLTimestamp() {
        Model m = new Model();
        m.setTimestamp("1711234567");
        assertEquals("1711234567", m.getTimestamp());
    }

    @Test
    public void setComments_modifieLaListe() {
        Model m = new Model();
        List<Comment> comments = Arrays.asList(new Comment("Super article !"));
        m.setComments(comments);
        assertEquals(1, m.getComments().size());
    }
}
