package com.project;
import java.util.ArrayList;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		
		ArrayList<Studentdetails> stdetail =new ArrayList<Studentdetails>();
		    Studentdetails sd1=new Studentdetails(1,"Sam",55,"Eng",45,"Mat",78,"Sci");
			Studentdetails sd2=new Studentdetails(2,"Ram",70,"Eng",60,"Mat",50,"Sci");
			Studentdetails sd3=new Studentdetails(3,"Tom",98,"Eng",90,"Mat",50,"Sci");
			Studentdetails sd4=new Studentdetails(4,"Jhon",67,"Eng",65,"Mat",54,"Sci");
			
        stdetail.add(sd1);      
        stdetail.add(sd2);
        stdetail.add(sd3);
        stdetail.add(sd4);
    
        	 for(Studentdetails k1: stdetail) {
        		 System.out.println("Studentid:"+k1.id + " "+"Studentname: " + k1.stname+" "+k1.m1 +" in "+k1.sub1+ " "+ k1.m2+" in "+k1.sub2+" "+k1.m3+" in "+k1.sub3);
			
        	 }
        	 
        	 System.out.println("Sorting by name");  
        	  
        	 Collections.sort(stdetail,new NameComparator());
        	 for(Studentdetails com: stdetail) {
        		System.out.println("Studentid:"+com.id + " "+"Studentname: " + com.stname+" "+com.m1 +" in "+com.sub1+ " "+ com.m2+" in "+com.sub2+" "+com.m3+" in "+com.sub3);
 
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
		public Studentdetails(int id, String stname, int m1, String sub1, int m2, String sub2, int m3, String sub3) {
			super();
			this.id = id;
			this.stname = stname;
			this.m1 = m1;
			this.sub1 = sub1;
			this.m2 = m2;
			this.sub2 = sub2;
			this.m3 = m3;
			this.sub3 = sub3;
		}
	    
		

}

	





