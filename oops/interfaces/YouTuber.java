package oops.interfaces;

public abstract interface YouTuber extends VedioEditor {		//Interface can be use in abstraction like a class
	
	abstract void makeVideo();
	
	default void uploadVideo() {				//it doesn't needs to be implemented in person class, but now it is 
												//prone to the diamond problem
		
		System.out.println("Upload the video");
	}

}
