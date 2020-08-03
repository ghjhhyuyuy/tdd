package com.twu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_do_nothing_when_vowels_less_than_30_percents() throws Exception {
        String vowelsLessThan30 = "hello";
        String vowelsLessThan30WithContinuousVowels = "gosss";
        Mommifier mommifier = new Mommifier();
        assertEquals(vowelsLessThan30, mommifier.momifierString(vowelsLessThan30));
        assertEquals(vowelsLessThan30WithContinuousVowels, mommifier.momifierString(vowelsLessThan30WithContinuousVowels));
    }

    @Test
    void should_do_nothing_when_vowels_more_than_30_percents_but_no_continuous_vowels() throws Exception {
        String vowelsMoreThan30WithoutContinuousVowels = "gose";
        Mommifier mommifier = new Mommifier();
        assertEquals(vowelsMoreThan30WithoutContinuousVowels, mommifier.momifierString(vowelsMoreThan30WithoutContinuousVowels));
    }

    @Test
    void should_insert_mommy_between_continuous_vowels_when_vowels_more_than_30_percents() throws Exception {
        String vowelsMoreThan30WithContinuousVowels = "goes";
        Mommifier mommifier = new Mommifier();
        String exceptString = "gomommyes";
        assertEquals(exceptString, mommifier.momifierString(vowelsMoreThan30WithContinuousVowels));
    }

    @Test
    void should_throw_exception_when_input_null_or_empty() {
        Mommifier mommifier = new Mommifier();
        Throwable exceptionInputEmpty = assertThrows(Exception.class, () -> mommifier.momifierString(""));
        Throwable exceptionInputNull = assertThrows(Exception.class, () -> mommifier.momifierString(null));
        assertEquals("input is wrong", exceptionInputEmpty.getMessage());
        assertEquals("input is wrong", exceptionInputNull.getMessage());
    }
}
