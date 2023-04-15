package calc;
public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {

    public CalculateComplex(double x, double y) {
        super(x,y);
    }


    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers((x-y),(w-z));
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers((x-y),(w-z));
    }

    @Override
    public ComplexNumbers mult() {
        return new ComplexNumbers((x*y + x*z), w*y - y*z);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x + w) , (y + z));

    }
    
    
}
