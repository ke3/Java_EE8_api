package bean;

public class BmiBean implements java.io.Serializable {

	private double height;
	private double weight;
	private double bmi;
	private String mes;

	public void setHeight(String h) throws Exception {
		this.height = Double.parseDouble(h);
		if(this.height<0){
			Exception ex = new Exception();
			throw ex;
		}
	}
	public void setWeight(String w) throws Exception {
		this.weight = Double.parseDouble(w);
		if(this.weight<0){
			Exception ex = new Exception();
			throw ex;
		}
	}
	
	public void setBmi(){
		this.bmi = this.weight / (this.height/100) / (this.height/100);
	}
	
	public void setMes(){
		if(bmi<=17.6){
			mes ="痩せすぎ";
		}else if(bmi>17.6 && bmi<=19.8){
			mes ="痩せ気味";
		}else if(bmi>19.8 && bmi<24.2){
			mes ="理想的";
		}else if(bmi>=24.2 && bmi<26.4){
			mes ="過体重";
		}else if(bmi>=26.4){
			mes ="肥満";
		}
	}
	
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getBmi() {
		return bmi;
	}
	public String getMes() {
		return mes;
	}

}

/*
*/