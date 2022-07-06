package com.turkcell.abstractx;

public class Asus extends Computer {
	
	private String voiceRecognition;
	
	public Asus() {
		
	}
	
	public Asus(String cpu, String ram, String smartMainBoard, String port, String voiceRecognition) {
		super(cpu, ram, smartMainBoard, port);
		this.voiceRecognition = voiceRecognition;
	}
	
	@Override
	public void govdesizMethod(String name) {
		System.out.println("Govdesiz Method: " + name);
		
	}
	
	@Override
	public void commonMethod() {
		System.out.println("Asus Common Method");
	}
	
	@Override
	public String toString() {
		return "Asus [voiceRecognition=" + voiceRecognition + "]";
	}
	
	public String getVoiceRecognition() {
		return voiceRecognition;
	}
	
	public void setVoiceRecognition(String voiceRecognition) {
		this.voiceRecognition = voiceRecognition;
	}
	
}
