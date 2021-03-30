package com.project;
import java.util.Comparator;
class Idcomparator implements Comparator<Studentdetails> {
	  
	public int compare(Studentdetails o1,Studentdetails o2){  
		Studentdetails s1=(Studentdetails)o1;  
	 	Studentdetails s2=(Studentdetails)o2;  
	if(s1.id==s2.id)  
	return 0;  
	else if(s1.id>s2.id)  
	return 1;  
	else  
	return -1;  
	}  

}

