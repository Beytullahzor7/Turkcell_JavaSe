package com.examples.relations.a1_association;

public class AssociationMainClass {
	
	public static void main(String[] args) {
		Market market = new Market();
		market.setMarketAdi("Migros");
		
		Person person = new Person();
		person.setInsanAdi("Beytullah");
		
		System.out.println("Association " + market.getMarketAdi() + " " + person.getInsanAdi());
		
	}
	
}
