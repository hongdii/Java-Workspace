package com.kh.chap03_Map.part01_hashMap.model.vo;

public class Snack {

	private String flavor;
	private int calory;
	private String flavor2;
	private int calory2;
	private String flavor3;
	private int calory3;
	private String flavor4;
	private int calor4y;
	private String flavor5;
	private int calory5;
	private String flavor6;
	private int calory6;
	private String flavor7;
	private int calory7;
	private String flavor8;
	private int calory9;

	public Snack() {
		super();
	}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calor4y;
		result = prime * result + calory;
		result = prime * result + calory2;
		result = prime * result + calory3;
		result = prime * result + calory5;
		result = prime * result + calory6;
		result = prime * result + calory7;
		result = prime * result + calory9;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((flavor2 == null) ? 0 : flavor2.hashCode());
		result = prime * result + ((flavor3 == null) ? 0 : flavor3.hashCode());
		result = prime * result + ((flavor4 == null) ? 0 : flavor4.hashCode());
		result = prime * result + ((flavor5 == null) ? 0 : flavor5.hashCode());
		result = prime * result + ((flavor6 == null) ? 0 : flavor6.hashCode());
		result = prime * result + ((flavor7 == null) ? 0 : flavor7.hashCode());
		result = prime * result + ((flavor8 == null) ? 0 : flavor8.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		if (calor4y != other.calor4y)
			return false;
		if (calory != other.calory)
			return false;
		if (calory2 != other.calory2)
			return false;
		if (calory3 != other.calory3)
			return false;
		if (calory5 != other.calory5)
			return false;
		if (calory6 != other.calory6)
			return false;
		if (calory7 != other.calory7)
			return false;
		if (calory9 != other.calory9)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (flavor2 == null) {
			if (other.flavor2 != null)
				return false;
		} else if (!flavor2.equals(other.flavor2))
			return false;
		if (flavor3 == null) {
			if (other.flavor3 != null)
				return false;
		} else if (!flavor3.equals(other.flavor3))
			return false;
		if (flavor4 == null) {
			if (other.flavor4 != null)
				return false;
		} else if (!flavor4.equals(other.flavor4))
			return false;
		if (flavor5 == null) {
			if (other.flavor5 != null)
				return false;
		} else if (!flavor5.equals(other.flavor5))
			return false;
		if (flavor6 == null) {
			if (other.flavor6 != null)
				return false;
		} else if (!flavor6.equals(other.flavor6))
			return false;
		if (flavor7 == null) {
			if (other.flavor7 != null)
				return false;
		} else if (!flavor7.equals(other.flavor7))
			return false;
		if (flavor8 == null) {
			if (other.flavor8 != null)
				return false;
		} else if (!flavor8.equals(other.flavor8))
			return false;
		return true;
	}

}
