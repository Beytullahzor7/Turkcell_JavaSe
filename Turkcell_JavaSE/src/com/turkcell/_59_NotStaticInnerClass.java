package com.turkcell;

public class _59_NotStaticInnerClass {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	public static void main(String[] args) {
		_59_NotStaticInnerClass ulke = new _59_NotStaticInnerClass();
		ulke.setUlkeAdi("Turkey");
		
		_59_NotStaticInnerClass.Il il = new _59_NotStaticInnerClass().new Il();
		il.setIlAdi("Samsun");
		
	}
	
	// нч Class (нl)
	public class Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// нч Class
		public class Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
		}
	}
	
}
