package com.pluralsight.oop;

public class UserTest {
	public void printUserType(User u){
		u.printUserType();
	}
	public void approveReview(Staff s){
		if(s instanceof Editor){
		((Editor)s).approveReview();
	}
		else{
			System.out.println("invalid obj passed");
			
		}
	}
	
	
	public static void main(String[] args){
	User user = new User();
	User staff = new Staff();
	User editor = new Editor();
	
	staff.staticMethod();
	
	UserTest ut = new UserTest();
	ut.printUserType(user);
	
	staff.postAReview("");
	//ut.approveReview(new Staff()); //runtime exception classcast
	ut.approveReview(new Editor());
	editor.saveWebLink();
	
	//System.out.println(staff.toString());
	System.out.println(staff.hashCode());
	staff.displayUserInfo();
	
	User staff1 = new Staff(3);
	}
}
