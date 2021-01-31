package bean;

public class EnzanBean implements java.io.Serializable {

	private double v1;
	private double v2;
	private String ezs;
	private String equ = "=";
	private double result = 0;

	public void setV1(String value){
		this.v1 = Double.parseDouble(value);
	}
	
	public void setV2(String value){
		this.v2 = Double.parseDouble(value);
	}
	
	public void setEzs(String e) throws IllegalArgumentException {
		if(	e.equalsIgnoreCase("+")==false
		&&	e.equalsIgnoreCase("-")==false
		&&	e.equalsIgnoreCase("*")==false
		&&	e.equalsIgnoreCase("/")==false ){
			IllegalArgumentException ill = new IllegalArgumentException();
			throw ill;
		}else {
			this.ezs = e;
		}
	}
	public void setResult() throws ArithmeticException {
		if( ezs.equalsIgnoreCase("+")==true ){
			result = v1+v2;
		}else if( ezs.equalsIgnoreCase("-")==true ){
			result = v1-v2;
		}else if( ezs.equalsIgnoreCase("*")==true ){
			result = v1*v2;
		}else if( ezs.equalsIgnoreCase("/")==true ){
			if(this.v2==0){
				ArithmeticException ex = new ArithmeticException();
				throw ex;
			}else {
				result = v1/v2;
			}
		}
	}
	
	public double getV1() {
		return v1;
	}
	public double getV2() {
		return v2;
	}
	public String getEzs() {
		return ezs;
	}
	public String getEqu() {
		return equ;
	}
	public double getResult() {
		return result;
	}

}

/*
*/