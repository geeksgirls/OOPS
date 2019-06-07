package com.pluralsight.oop;

public class Review  {
	
	private String reviewText;
	private boolean isApprove;
	
	public Review(String reviewText) {
		// TODO Auto-generated constructor stub
		
		this.reviewText = reviewText;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public boolean isApprove() {
		return isApprove;
	}
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}
	
	
	
}
