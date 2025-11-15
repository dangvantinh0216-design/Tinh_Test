package lap2_6;

import junit.framework.TestCase;

public class PTB2Test extends TestCase {

    // Tạo 1 đối tượng PTB2 để test
    PTB2 pt = new PTB2();

    // Test trường hợp degenerate (a = 0)
    public void testWhatKind() {
        assertEquals("degenerate", pt.WhatKind(0, 2, 3));
    }

    // Test trường hợp có 2 nghiệm (delta > 0)
    public void testTwoSolutions() {
        assertEquals("two", pt.WhatKind(1, -3, 2));   // delta = 1 > 0
    }

    // Test trường hợp có 1 nghiệm (delta = 0)
    public void testOneSolution() {
        assertEquals("one", pt.WhatKind(1, 2, 1));    // delta = 0
    }

    // Test trường hợp vô nghiệm (delta < 0)
    public void testNoSolution() {
        assertEquals("none", pt.WhatKind(2, 1, 5));   // delta = -39 < 0
    }
}


