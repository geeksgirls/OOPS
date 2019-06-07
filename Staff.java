package com.pluralsight.oop;

public class Staff extends User {
	public int id =2;
	public Staff() {
		userType ="staff";
		System.out.println(userType + "Staff constructor 1");
	}
	
	public Staff(int id){
		this();
		this.id =id;
		System.out.println("Staff constructor 2");
	}
	public void printUserType(){
		System.out.println("Staff");
		
	}
	public Review postAReview(String reviewText) {
		   System.out.println("Staff: postAReview");
		   
		   Review review = super.postAReview(reviewText);
		   
		   review.setApprove(true);
		   return review;
	   }
	
}
