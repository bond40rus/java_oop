package calc;

public class ComplexNumbers extends ValuesNumber {
    public ComplexNumbers(double x, double y) {
        super.x = x;
        super.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumbers compleNum = (ComplexNumbers) obj;
        return super.x == compleNum.x && super.y == compleNum.y;

    
    }

    @Override
    public String toString() {
        return "ComplexNumbers [" +
                "x=" + x +
                ", y=" + y + "]"
                ;
    }
    
    
}
