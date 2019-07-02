package com.coding.sales;

import java.io.File;
import java.util.List;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.coding.sales.bo.NobleMetalInfo;

public class NobleMetalInfoTest {

	@Test
	public void noble_metal_info_to_bean (){
		
		String noblemetalinfo = FileUtils.readFromFile(getResourceFilePath("nobleMetalInfo.json"));
		JSONObject jsonObject = JSONObject.fromObject(noblemetalinfo);
		List<NobleMetalInfo> nobleMetalList = (List<NobleMetalInfo>) JSONObject.toBean(jsonObject, NobleMetalInfo.class);
		
		System.out.println(nobleMetalList);
//		assertEquals();
	}
	
	
	
	private String getResourceFilePath(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file.getAbsolutePath();
	}
	


}
