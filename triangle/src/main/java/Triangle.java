class Triangle {
    double side1, side2, side3;
    double longerSide;


    Triangle(double side1, double side2, double side3) throws TriangleException {
        longerSide = Double.max(side1, side2);
        longerSide = Double.max(longerSide, side3);

        if (longerSide >= side1 + side2 || longerSide >= side1 + side3 || longerSide >= side2 + side3){
            throw new TriangleException();
        }
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            throw new TriangleException();
        }
        this.side1 = Double.valueOf(side1);
        this.side2 = Double.valueOf(side2);
        this.side3 = Double.valueOf(side3);
    }

    boolean isEquilateral() {
        return ((this.side1 == this.side2) && (this.side3 == this.side2)) ? true : false;
    }

    boolean isIsosceles() {
        return ((this.side1 == this.side2)||(this.side1==this.side3)||this.side2==this.side3) ? true:false;
    }

    boolean isScalene() {
        return (this.side1 != this.side2 && this.side2 != this.side3 && this.side1 != this.side3) ? true : false;
    }

}
