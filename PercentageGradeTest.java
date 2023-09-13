import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PercentageGradeTest {
    PercentageGrade pg;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getStudentName() {
    }

    @Test
    void setStudentName() {
    }

    @Test
    void getModuleName() {
    }

    @Test
    void setModuleName() {
    }

    @Test
    void setGrade() {
        pg.setGrade(70);
        assertEquals(70,pg.getGrade(-1));
        assertThrows(IllegalStateException.class, ()->pg.getGrade(-1));
    }

    @Test
    void classifyGrade() {
    }

    @Test
    void getGrade() {
        assertTrue(pg.getGrade(-1)==50);
    }
}