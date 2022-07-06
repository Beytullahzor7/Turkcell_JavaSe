package com.turkcell;

import java.io.Serializable;
import java.util.Objects;

public class _68_OOP_x2_BEAN implements Serializable {
	
	// BEAN = Nesne degiskenleri + getter + setter + constructor + serializable +
	// toString()
	
	// seriazable: Javaya burada diyoruz ki bütün isleri sana veriyoruz.
	// sen kendi serialVersionUID olustur
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	
	public _68_OOP_x2_BEAN() {
		
	}
	
	public _68_OOP_x2_BEAN(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "_68_OOP_x2_BEAN [name=" + name + ", surname=" + surname + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_68_OOP_x2_BEAN other = (_68_OOP_x2_BEAN) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	
}
