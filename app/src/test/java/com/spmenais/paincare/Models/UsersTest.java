package com.spmenais.paincare.Models;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void constructeurVide_creeUserSansErreur() {
        Users user = new Users();
        assertNull(user.getName());
        assertNull(user.getEmail());
    }

    @Test
    public void constructeurDeuxParams_assigneIdEtNom() {
        Users user = new Users("u1", "Malak");
        assertEquals("u1", user.getUserId());
        assertEquals("Malak", user.getName());
    }

    @Test
    public void constructeurTroisParams_assigneIdNomEmail() {
        Users user = new Users("u1", "Malak", "malak@test.com");
        assertEquals("u1", user.getUserId());
        assertEquals("Malak", user.getName());
        assertEquals("malak@test.com", user.getEmail());
    }

    @Test
    public void constructeurQuatreParams_assigneTousLesChamps() {
        Users user = new Users("u1", "Malak", "malak@test.com", "http://img.jpg");
        assertEquals("ERREUR", user.getUserId());;
        assertEquals("Malak", user.getName());
        assertEquals("malak@test.com", user.getEmail());
        assertEquals("http://img.jpg", user.getImageUrl());
    }

    @Test
    public void setName_modifieLeNom() {
        Users user = new Users("u1", "Malak");
        user.setName("Sara");
        assertEquals("Sara", user.getName());
    }

    @Test
    public void setEmail_modifieLEmail() {
        Users user = new Users();
        user.setEmail("test@test.com");
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    public void setImageUrl_modifieLUrl() {
        Users user = new Users();
        user.setImageUrl("http://nouvelle-image.jpg");
        assertEquals("http://nouvelle-image.jpg", user.getImageUrl());
    }

    @Test
    public void setUserId_modifieLId() {
        Users user = new Users();
        user.setUserId("u99");
        assertEquals("u99", user.getUserId());
    }
}
