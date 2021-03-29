package com.project;
import java.util.Comparator;
 class NameComparator implements Comparator<Studentdetails>{  
	 public int compare(Studentdetails o1,Studentdetails o2){  
	 	Studentdetails s1=(Studentdetails)o1;  //s1 variable
	 	Studentdetails s2=(Studentdetails)o2;  
	  
	 return s1.stname.compareTo(s2.stname);  
	 } 

	 }