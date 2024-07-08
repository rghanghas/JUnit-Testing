package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {

    Grader grader = new Grader();

    // JUnit 4 Exception Handling
    @Test(expected = IllegalArgumentException.class)
    public void negativeOneShouldThrowException()
    {
        grader.determineLetterGrade(-1);
    }

    // JUnit 5 Exception Handling
    /* @Test
    public void negativeOneShouldThrowException()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
    } */
    
    @Test
    public void fiftyNineShouldReturnF()
    {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD()
    {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC()
    {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB()
    {
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA()
    {
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    public void ninetyShouldReturnA()
    {
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    public void seventyShouldReturnC()
    {
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    public void sixtyShouldReturnD()
    {
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    public void zeroShouldReturnF()
    {
        assertEquals('F', grader.determineLetterGrade(0));
    }

}
