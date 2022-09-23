package Classes_and_objects;

class employee extends person{
	double LPA;
	int Year;
	String Insurance;
	public double getLPA() {
		return LPA;
	}
	public void setLPA(double lPA) {
		LPA = lPA;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getInsurance() {
		return Insurance;
	}
	public void setInsurance(String insurance) {
		Insurance = insurance;
	}
}
