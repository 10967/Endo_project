package com.spmenais.paincare.Models;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class Quiz_questionTest {

    @Test
    public void constructeurVide_creeObjetSansErreur() {
        Quiz_question q = new Quiz_question();
        assertNull(q.getQst());
        assertNull(q.getOpt1());
    }

    @Test
    public void constructeurComplet_assigneTousLesChamps() {
        List<String> answers = Arrays.asList("A", "B");
        Quiz_question q = new Quiz_question("Question ?", "Opt1", "Opt2", "Opt3", "Opt4", answers, "Justification");
        assertEquals("Question ?", q.getQst());
        assertEquals("Opt1", q.getOpt1());
        assertEquals("Opt2", q.getOpt2());
        assertEquals("Opt3", q.getOpt3());
        assertEquals("Opt4", q.getOpt4());
        assertEquals(answers, q.getAnswers());
        assertEquals("Justification", q.getJustif());
    }

    @Test
    public void setQst_modifieLaQuestion() {
        Quiz_question q = new Quiz_question();
        q.setQst("Nouvelle question");
        assertEquals("Nouvelle question", q.getQst());
    }

    @Test
    public void setOpt1_modifieLOption() {
        Quiz_question q = new Quiz_question();
        q.setOpt1("Option A");
        assertEquals("Option A", q.getOpt1());
    }

    @Test
    public void setOpt2_modifieLOption() {
        Quiz_question q = new Quiz_question();
        q.setOpt2("Option B");
        assertEquals("Option B", q.getOpt2());
    }

    @Test
    public void setOpt3_modifieLOption() {
        Quiz_question q = new Quiz_question();
        q.setOpt3("Option C");
        assertEquals("Option C", q.getOpt3());
    }

    @Test
    public void setOpt4_modifieLOption() {
        Quiz_question q = new Quiz_question();
        q.setOpt4("Option D");
        assertEquals("Option D", q.getOpt4());
    }

    @Test
    public void setJustif_modifieLaJustification() {
        Quiz_question q = new Quiz_question();
        q.setJustif("Parce que...");
        assertEquals("Parce que...", q.getJustif());
    }

    @Test
    public void setUserSelectedAnswer_modifieLaReponse() {
        Quiz_question q = new Quiz_question();
        q.setUserSelectedAnswer("Opt1");
        assertEquals("Opt1", q.getUserSelectedAnswer());
    }

    @Test
    public void setAnswers_modifieLaListe() {
        Quiz_question q = new Quiz_question();
        List<String> newAnswers = Arrays.asList("X", "Y", "Z");
        q.setAnswers(newAnswers);
        assertEquals(newAnswers, q.getAnswers());
    }
}
