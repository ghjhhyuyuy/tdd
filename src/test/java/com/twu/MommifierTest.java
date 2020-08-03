package com.twu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_do_nothing_when_vowels_less_than_30_percents() {
        String vowelsLessThan30 = "hello";
        String vowelsLessThan30WithContinuousVowels = "goess";
        Mommifier mommifier = new Mommifier();
        assertEquals(vowelsLessThan30,mommifier.momifierString(vowelsLessThan30));
        assertEquals(vowelsLessThan30WithContinuousVowels,mommifier.momifierString(vowelsLessThan30WithContinuousVowels));
    }
    @Test
    void should_do_nothing_when_vowels_more_than_30_percents_but_no_continuous_vowels(){
        String vowelsMoreThan30WithoutContinuousVowels = "gose";
        Mommifier mommifier = new Mommifier();
        assertEquals(vowelsMoreThan30WithoutContinuousVowels,mommifier.momifierString(vowelsMoreThan30WithoutContinuousVowels));
    }
    @Test
    void should_insert_mommy_between_continuous_vowels_when_vowels_more_than_30_percents(){
        String vowelsMoreThan30WithContinuousVowels = "goes";
        Mommifier mommifier = new Mommifier();
        String exceptString = "gomommyes";
        assertEquals(exceptString,mommifier.momifierString(vowelsMoreThan30WithContinuousVowels));
    }
}
