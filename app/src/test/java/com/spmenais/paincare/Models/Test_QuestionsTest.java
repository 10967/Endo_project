package com.spmenais.paincare.Models;

import org.junit.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class Test_QuestionsTest {

    @Test
    public void constructeurVide_creeObjetSansErreur() {
        Test_Questions t = new Test_Questions();
        assertNull(t.getText());
        assertNull(t.getOptions());
    }

    @Test
    public void constructeurComplet_assigneTousLesChamps() {
        List<String> options = Arrays.asList("Jamais", "Parfois", "Souvent");
        Map<String, Long> scores = new HashMap<>();
        scores.put("Jamais", 0L);
        scores.put("Parfois", 1L);
        scores.put("Souvent", 2L);
        Test_Questions t = new Test_Questions("Avez-vous des douleurs ?", options, scores, "single");
        assertEquals("Avez-vous des douleurs ?", t.getText());
        assertEquals(options, t.getOptions());
        assertEquals(scores, t.getOptionScores());
        assertEquals("single", t.getType());
    }

    @Test
    public void setText_modifieLTexte() {
        Test_Questions t = new Test_Questions();
        t.setText("Nouvelle question");
        assertEquals("Nouvelle question", t.getText());
    }

    @Test
    public void setOptions_modifieLesOptions() {
        Test_Questions t = new Test_Questions();
        List<String> options = Arrays.asList("Oui", "Non");
        t.setOptions(options);
        assertEquals(options, t.getOptions());
    }

    @Test
    public void setType_modifieLType() {
        Test_Questions t = new Test_Questions();
        t.setType("multiple");
        assertEquals("multiple", t.getType());
    }

    @Test
    public void setOptionScores_modifieLesScores() {
        Test_Questions t = new Test_Questions();
        Map<String, Long> scores = new HashMap<>();
        scores.put("Oui", 3L);
        scores.put("Non", 0L);
        t.setOptionScores(scores);
        assertEquals(scores, t.getOptionScores());
        assertEquals(Long.valueOf(3L), t.getOptionScores().get("Oui"));
    }
}
