package oops;
public class Complexnumber {
	int real;
	int imaginary;
	public void print(){
		System.out.print(this.real+" + i"+this.imaginary);
	}
	public Complexnumber(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
    public void plus( Complexnumber c){
      this.real+=c.real;
	  this.imaginary+=c.imaginary;
	}
	public void multiply(Complexnumber c){
		 int newREALreal=((this.real)*(c.real))-(this.imaginary*c.imaginary);
		 int newIMAG=((this.imaginary)*(c.real))+(this.imaginary*c.real);
		 this.real=newREALreal;
		 this.imaginary=newIMAG;
	}
}