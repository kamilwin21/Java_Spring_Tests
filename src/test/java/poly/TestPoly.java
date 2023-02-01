package poly;

import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestPoly {

    @Test
    public void testEvaluateFunction() {
        double limit =100.0;
        double start =-100.0;
        double[] i1= {0.0,0.0,1.0};//x^2
        double[] i2= {0.0,0.0,0.0,2.3};//2.3x^3
        double[] i3= {0.545,1.0,0.0,-1.0};//-x^3+x+0.545
        Poly p = new Poly(i1);
        Poly p2 = new Poly(i2);
        Poly p3 = new Poly(i3);
        for(double i=start;i<limit;i=i+0.2){
            assertEquals(p.evaluatePoly(i), Math.pow(i, 2),0.0005);
            assertEquals(p2.evaluatePoly(i), 2.3*Math.pow(i, 3),0.0005);
            assertEquals(p3.evaluatePoly(i), (-1*Math.pow(i, 3))+i+0.545,0.0005);
        }
    }

    @Test
    public void testTrimTrailingZeros() {
        double[] i1= {0.0,0.0,1.0,0.0,0.0,0.0};
        Double[] e1= {0.0,0.0,1.0};
        Double[] r1 = new Double[3];
        Poly p = new Poly(i1);
        p.getCoefficients().toArray(r1);
        assertArrayEquals(r1, e1);
    }

}