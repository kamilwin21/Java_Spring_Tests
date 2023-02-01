package poly;

import java.util.ArrayList;

public class Poly {

    ArrayList<Double> coefficients;

    public void trimTrailingZeroCoefficients() {
        ArrayList<Double> helpArray = coefficients;

        for (int i = helpArray.size() - 1; i >= 0; i--) {
            if (helpArray.get(i) == 0.0) {
                helpArray.remove(i);
            }else if (helpArray.get(i) != 0.0){
                break;
            }


        }

    }

    public double evaluatePoly(double x) {
        return 0.0;
    }


    public Double zero(Double a, Double b, Double epsilon) {
        //input will always s.t. f(a) >0 , f(b)<0 holds

        //program me
        return 0.0;
    }

    //------------------------------------------------------
    public Poly(double[] c) {
        this.coefficients = new ArrayList<>();
        for (int i = 0; i < c.length; i++)
            coefficients.add(c[i]);

        trimTrailingZeroCoefficients();

        if (coefficients.size() == 0)
            coefficients.add(0.0);

    }

    public Poly(ArrayList<Double> coeff) {
        this.coefficients = coeff;
        trimTrailingZeroCoefficients();
    }

    public ArrayList<Double> getCoefficients() {
        return coefficients;
    }


}
