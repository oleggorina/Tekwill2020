package com.Java;

import java.util.Objects;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;

        ComplexNumber complexNumber = (ComplexNumber) o;

        return re == complexNumber.re && Objects.equals(im, complexNumber.im);
    }

    @Override
    public int hashCode(){
        return Objects.hash(re, im);
    }
}
