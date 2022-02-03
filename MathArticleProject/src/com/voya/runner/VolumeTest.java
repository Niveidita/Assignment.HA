package com.voya.runner;

import com.HA.volume.*;

public class VolumeTest {

	public static void main(String[] args) {
		Volume obj1 =new Volume();
		
		obj1.volumeOfASphere(15.5);
		System.out.println(obj1.volumeOfASphere(15.5)); 
		
		obj1.volumeOfACuboid(20,20.5,65.20);
		System.out.println(obj1.volumeOfACuboid(20,20.5,65.20));
		
		

	}

}
