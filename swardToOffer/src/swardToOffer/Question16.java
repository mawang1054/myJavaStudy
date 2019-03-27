package swardToOffer;

public class Question16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;
        double num = 1;
        if(exponent < 0){
        	Double Base = Double.valueOf(base);
            if(Base.equals(0.0))
                return 0;
            else{
                exponent = -exponent;
                for(int i = 0; i < exponent; ++i){
                    num *= base;
                }
                return 1/num;
            }
        }
        else{
            for(int i = 0; i < exponent; ++i){
                num *= base;
            }
            return num;
        }
  }

}
