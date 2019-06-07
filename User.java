package com.pluralsight.oop;

public class User {
	
	public int id =1;
	public String userType = "user";
	
	public User(){
		System.out.println("user constructor");
	}
	public void printUserType(){
		System.out.println("User");
		
	}
	public void saveWebLink() {
		   System.out.println("User: saveWebLink");
		  // postAReview();
	   }
	   public Review postAReview(String reviewText) {
		   System.out.println("User: postAReview");
		   
		   Review review = new Review(reviewText);
		   return review;
	   }
	   
	   public static void staticMethod(){
	  
	   }
	   
	   public void displayUserInfo(){
		   System.out.println(this);
	   }
	   
	   @Override
	   public String toString(){
		   return "\nPrinting user info:" + "\nid:" +id +"\nusertype:" +userType;
	   }
	   
	
}
