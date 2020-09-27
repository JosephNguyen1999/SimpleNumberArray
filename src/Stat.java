/*
 * Stat.java
 * Author:  Joseph Nguyen 
 * Submission Date:  4/10/2020
 *
 * Purpose: The purpose of this program is to make a stat class with methods and constructors that create and store an array
 * and find out certain aspects of the array.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class Stat {

	private double[] data;

	//creates double array of 0.0
	public Stat () {
		double[] array1 = {0.0};
		data = new double[1];
		data[0] = array1[0];
	}

	//creates a new double array of d and assigns data to the new array
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;

	}

	//creates a new array equal to data and returns the new array
	public double[] getData() {
		double[] newArray = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}
		return newArray;
	}

	//creates new array based on d and assigns data to the new array
	public void setData(double[] d) {
		double[] newD = d;
		data = newD;
	}

	//sees if both arrays have the same values in the same order or not
	public boolean equals(Stat s) {
		for(int i = 0; i < data.length; i++) {
			if (data[i] != s.data[i])
				return false;
		}
		return true;
	}

	//returns the array in String form
	public String toString() {
		String toString;
		toString = "[";
		for(int i = 0; i < data.length; i++) {
			toString += data[i];
			if (!(i == data.length - 1)) {
				toString += ", ";
			}
		}
		toString += "]";
		return toString;
	}

	//returns the minimum value in the array
	public double min() {
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	//returns the maximum value in the array
	public double max() {
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	//returns the average of the array
	public double average() {
		double sum = 0;
		double average = 0;
		for (double value : data) {
			sum += value;
		}
		if (data.length != 0) {
			average = sum / data.length;
		}
		return average;
	}

	//returns the mode of the array (most frequent number if any)
	public double mode() {
		double mode1 = 0;
		int numberOfTimes1 = 1;
		double mode2 = 0;
		int numberOfTimes2 = 1;
		for (int i = 0; i < data.length; i++) {
			mode1 = data[i];
			numberOfTimes1 = 1;
			if (data.length == 1) {
				return mode1;
			}
			for (int a = i + 1; a < data.length; a++) {
				if (mode1 == data[a]) {
					numberOfTimes1++;
				}
			}
			if (numberOfTimes1 > numberOfTimes2) {
				mode2 = mode1;
				numberOfTimes2 = numberOfTimes1;
			}
			else if (numberOfTimes1 == numberOfTimes2) {
				mode2 = Double.NaN;
			}
		}
		return mode2;

	}




}
