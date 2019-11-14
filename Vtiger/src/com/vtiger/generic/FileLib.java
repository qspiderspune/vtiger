package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String getPropertyFile(String key) throws Exception {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
public String getExcelData(String sheet,int row,int column) throws Exception {
	FileInputStream fis=new FileInputStream("./data/input.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(column).toString();
	return data;
}

}
