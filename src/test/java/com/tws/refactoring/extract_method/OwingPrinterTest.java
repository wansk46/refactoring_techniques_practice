package com.tws.refactoring.extract_method;

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.beans.binding.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//      Given
        OwingPrinter printer = new OwingPrinter();
        String name = "Anthony";
        List<Order> orders = new ArrayList<Order>();
        Order element = new Order(2.5);
        Order element1 = new Order(0.5);
        orders.add(element);
        orders.add(element1);

//      When
        printer.printOwing(name,orders);

        String expectedResult = "";
        expectedResult += "*****************************\n";
        expectedResult += "****** Customer totals ******\n";
        expectedResult += "*****************************\n";
        expectedResult += "name: Anthony\n";
        expectedResult += "amount: 3.0\n";

        assertEquals(expectedResult, outContent.toString());
    }
}