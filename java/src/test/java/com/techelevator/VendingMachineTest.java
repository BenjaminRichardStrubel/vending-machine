package com.techelevator;

import com.techelevator.view.Menu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class VendingMachineTest {
    private ByteArrayInputStream input;
    InputStream stdin = System.in;

    VendingMachineCLI vendingMachineCLI;

    @Before public void setup() {

        vendingMachineCLI = new VendingMachineCLI();
        vendingMachineCLI.currentBalance = 12.35;

    }

    @Test
    public void shouldReturn04910() {
        // Arrange
        int[] expectedResult = {0, 49, 1, 0};

        // Act
        int[] actualResult = vendingMachineCLI.subMenuOption3();

        // Assert
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturn16() {
        // Arrange
        int expectedResult = 16;

        // Act
        int actualResult = vendingMachineCLI.initializeMaps();

        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void shouldReturnInventoryDisplayed() {
        String expectedResult = "Inventory Displayed";

        String actualResult = vendingMachineCLI.mainMenuOption1();

        Assert.assertEquals(expectedResult, actualResult);
    }

}
