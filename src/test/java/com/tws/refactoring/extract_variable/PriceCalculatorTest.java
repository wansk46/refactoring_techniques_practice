package com.tws.refactoring.extract_variable;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void getPrice(){
        PriceCalculator priceCalculator = new PriceCalculator();
        int quantity = 5;
        int itemPrice = 5;

        assertEquals(27.5, priceCalculator.getPrice(quantity, itemPrice), 0.1);
    }
}