package phase1.constructor.assgn3;

public class Percentage {
    String name;
    int age;
    char section;
    char gender;
    int sub1;
    int sub2;
    int sub3;
    
    Percentage(int s1, int s2, int s3)
    {
    	this.sub1 = s1;
    	this.sub2 = s2;
    	this.sub3 = s3;
    	this.section = '1';
    }
    
    Percentage (int s2, int s3, char section)
    {
    	this.sub2 = s2;
    	this.sub3 = s3;
    	this.section = section;
    }
	
    public void percentcalculate()
    {
    	double percentage;
    	if(this.section == '1')
    		percentage = (this.sub1+this.sub2+this.sub3)/3;
    	else
    		percentage = (this.sub2+this.sub3)/2;
    		System.out.println("Percentage is"+ percentage);
    }
	
	public static void main(String[] args)
	{
		Percentage s1 = new Percentage(70,80,75);
		Percentage s2 = new Percentage(80,55,'2');
		Percentage s3 =  new Percentage(10,20,50);
		Percentage s4 = new Percentage(40,50,'3');
		s1.percentcalculate();
		s2.percentcalculate();
		s3.percentcalculate();
		s4.percentcalculate();
	}
}
