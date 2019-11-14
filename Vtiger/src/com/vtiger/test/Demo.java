package com.vtiger.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.vtiger.generic.FileLib;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		FileLib f=new FileLib();	
		System.out.println(f.getPropertyFile("url"));
	}

}
