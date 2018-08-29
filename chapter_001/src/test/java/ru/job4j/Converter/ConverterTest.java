package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(1);
        assertThat(result, is(68));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(1);
        assertThat(result, is(79));
    }
    @Test
    public void whenDollarTO1RubleThen68() {
        Converter converter = new Converter();
        int result = converter.DollarToruble(68);
        assertThat(result, is(1));
    }

    @Test
    public void whenEuro1ToRubleThen79() {
        Converter converter = new Converter();
        int result = converter.EuroToruble(79);
        assertThat(result, is(1));
    }
}