import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void hasSheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.print(10, 2);
        assertEquals(80, printer.getSheets());
        assertEquals(30, printer.getToner());
    }

    @Test
    public void canPrintToZero() {
        Printer printer3 = new Printer(100, 100);
        printer3.print(100, 1);
        assertEquals(0, printer3.getSheets());
        assertEquals(0, printer3.getToner());
    }

    @Test
    public void cannotPrintDueToToner() {
        printer.print(20, 3);
        assertEquals(100, printer.getSheets());
        assertEquals(50, printer.getToner());
    }

    @Test
    public void cannotPrintDueToSheets() {
        Printer printer2 = new Printer(100, 150);
        printer2.print(20, 6);
        assertEquals(100, printer2.getSheets());
        assertEquals(150, printer2.getToner());
    }
}

