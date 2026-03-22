package com.spmenais.paincare.Models;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuestionsTest {

    @Test
    public void constructeur_assigneTousLesChamps() {
        Questions q = new Questions("Qu'est-ce que l'endométriose ?", "Une maladie chronique", false);
        assertEquals("Qu'est-ce que l'endométriose ?", q.getTitle());
        assertEquals("Une maladie chronique", q.getAnswer());
        assertFalse(q.isExpandable());
    }

    @Test
    public void setExpandable_true_rendExpandable() {
        Questions q = new Questions("Titre", "Réponse", false);
        q.setExpandable(true);
        assertTrue(q.isExpandable());
    }

    @Test
    public void setExpandable_false_rendNonExpandable() {
        Questions q = new Questions("Titre", "Réponse", true);
        q.setExpandable(false);
        assertFalse(q.isExpandable());
    }

    @Test
    public void toString_contientTitreEtAnswer() {
        Questions q = new Questions("Mon titre", "Ma réponse", false);
        String result = q.toString();
        assertTrue(result.contains("Mon titre"));
        assertTrue(result.contains("Ma réponse"));
    }

    @Test
    public void constructeur_avecExpandableTrue() {
        Questions q = new Questions("Titre", "Réponse", true);
        assertTrue(q.isExpandable());
    }
}
