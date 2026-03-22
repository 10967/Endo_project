package com.spmenais.paincare.Models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReminderTest {

    @Test
    public void constructeurSimple_assigneTitreTempsDays() {
        boolean[] days = {true, false, true, false, false, false, false};
        Reminder r = new Reminder("Médicament", "08:00", days);
        assertEquals("Médicament", r.getTitle());
        assertEquals("08:00", r.getTime());
        assertArrayEquals(days, r.getRepeatDays());
    }

    @Test
    public void constructeurComplet_assigneTousLesChamps() {
        boolean[] days = {true, true, false, false, false, false, false};
        Reminder r = new Reminder("id1", "Pilule", "09:00", true, days);
        assertEquals("id1", r.getId());
        assertEquals("Pilule", r.getTitle());
        assertEquals("09:00", r.getTime());
        assertTrue(r.isActive());
        assertArrayEquals(days, r.getRepeatDays());
    }

    @Test
    public void setActive_true_rendLeReminderActif() {
        Reminder r = new Reminder("id1", "Test", "10:00", false, new boolean[7]);
        r.setActive(true);
        assertTrue(r.isActive());
    }

    @Test
    public void setActive_false_desactiveLeReminder() {
        Reminder r = new Reminder("id1", "Test", "10:00", true, new boolean[7]);
        r.setActive(false);
        assertFalse(r.isActive());
    }

    @Test
    public void setTitle_modifieLeTitre() {
        Reminder r = new Reminder("Ancien titre", "10:00", new boolean[7]);
        r.setTitle("Nouveau titre");
        assertEquals("Nouveau titre", r.getTitle());
    }

    @Test
    public void setTime_modifieLHeure() {
        Reminder r = new Reminder("Test", "08:00", new boolean[7]);
        r.setTime("20:00");
        assertEquals("20:00", r.getTime());
    }

    @Test
    public void setId_modifieLId() {
        Reminder r = new Reminder("Test", "08:00", new boolean[7]);
        r.setId("id-nouveau");
        assertEquals("id-nouveau", r.getId());
    }

    @Test
    public void setRepeatDays_modifieLesDays() {
        Reminder r = new Reminder("Test", "08:00", new boolean[7]);
        boolean[] newDays = {true, true, true, true, true, false, false};
        r.setRepeatDays(newDays);
        assertArrayEquals(newDays, r.getRepeatDays());
    }
}
