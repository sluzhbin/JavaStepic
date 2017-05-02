/**Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() 
 * сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы 
 * согласованным с реализацией equals().
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, 
 * засчитана не будет.
 * 
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(im);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(re);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
    public boolean equals(Object otherComplex){
    	if(this == otherComplex) return true;
    	if(otherComplex == null) return false;
    	if(getClass() != otherComplex.getClass()) return false;
    	ComplexNumber other = (ComplexNumber) otherComplex;
    	return Double.compare(re, other.re) == 0 && Double.compare(im, other.im) == 0;
    }
    
    
}
