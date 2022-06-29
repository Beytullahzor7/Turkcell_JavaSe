package com.turkcell;

public class _58_InnerClassUlke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	public static void main(String[] args) {
		
	}
	
	// нч Class (нl)
	public static class Il {
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// нч Class
		public static class Ilce {
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
		}
	}
}
