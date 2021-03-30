package com.project;
import java.util.ArrayList;
import java.util.Collections;
public class Student {
	public static void main(String[] args) {
		
		ArrayList<Studentdetails> stdetail =new ArrayList<Studentdetails>();
		    Studentdetails sd1=new Studentdetails(1,"Sam",55,"Eng",45,"Mat",78,"Sci",Studentdetails.Status.PASS);
			Studentdetails sd2=new Studentdetails(4,"Ram",70,"Eng",60,"Mat",50,"Sci",Studentdetails.Status.PASS);
			Studentdetails sd3=new Studentdetails(3,"Tom",98,"Eng",90,"Mat",50,"Sci",Studentdetails.Status.PASS);
			Studentdetails sd4=new Studentdetails(2,"Jhon",25,"Eng",65,"Mat",41,"Sci",Studentdetails.Status.FAIL);
			
        stdetail.add(sd1);      
        stdetail.add(sd2);
        stdetail.add(sd3);
        stdetail.add(sd4);
        
        System.out.println("Report card: ");
        	 for(Studentdetails k1: stdetail) {
        		 System.out.println("Studentid:"+k1.id + " "+"Studentname: " + k1.stname+" "+k1.m1 +" in "+k1.sub1+ " "+ k1.m2+" in "+k1.sub2+" "+k1.m3+" in "+k1.sub3+" "+k1.status);
			
        	 }
        	 
        	 System.out.println("Sorting by name");  
        	  
        	 Collections.sort(stdetail,new NameComparator());
        	 for(Studentdetails com: stdetail) {
        		System.out.println("Studentid:"+com.id + " "+"Studentname: " + com.stname+" "+com.m1 +" in "+com.sub1+ " "+ com.m2+" in "+com.sub2+" "+com.m3+" in "+com.sub3+" "+com.status);
 
        	 }
        	 
        	 System.out.println("Sorted by studentid:");  
        	 
				Collections.sort(stdetail,new Idcomparator());
				for(Studentdetails com1: stdetail) {
					System.out.println("Studentid:"+com1.id + " "+"Studentname: " + com1.stname+" "+com1.m1 +" in "+com1.sub1+ " "+ com1.m2+" in "+com1.sub2+" "+com1.m3+" in "+com1.sub3+" "+com1.status);
				}
}
}

class Studentdetails
{	
	    int id;
	    String stname;
	    int m1;
	    String sub1;
	    int m2;
	    String sub2;
	    int m3;
	    String sub3;
	    Status status;
	    enum Status{
	    	PASS,FAIL;
	    }
		public Studentdetails(int id, String stname, int m1, String sub1, int m2, String sub2, int m3, String sub3,
				Status status) {
			super();
			this.id = id;
			this.stname = stname;
			this.m1 = m1;
			this.sub1 = sub1;
			this.m2 = m2;
			this.sub2 = sub2;
			this.m3 = m3;
			this.sub3 = sub3;
			this.status = status;
		}
	
	   
}

	





