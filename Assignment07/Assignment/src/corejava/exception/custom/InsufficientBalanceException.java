package corejava.exception.custom;

import java.util.*;

import org.omg.IOP.ExceptionDetailMessage;

public class InsufficientBalanceException extends Exception {

	private String message;
	
	public InsufficientBalanceException(){
		this.message="";
	}
	
	public InsufficientBalanceException(String message){
		this.message=message;
	}
	
	public String toString(){
		return "Insufficient Balance. Balance is "+message;
	}
}
