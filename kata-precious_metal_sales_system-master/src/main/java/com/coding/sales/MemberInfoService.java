package com.coding.sales;

import java.io.File;

import net.sf.json.JSONObject;

import com.coding.sales.bo.MemberInfo;

public class MemberInfoService {
	
	final String ORDERCOMMAND = FileUtils.readFromFile(getResourceFilePath("memberInfo.json"));
	
	JSONObject mapObject = JSONObject.fromObject(ORDERCOMMAND);
	
	private String getResourceFilePath(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file.getAbsolutePath();
	}
	
	
	public MemberInfo getByMemberId(String memberId) {
		
		MemberInfo info = (MemberInfo) JSONObject.toBean( mapObject.getJSONObject(memberId), MemberInfo.class);
		
		return info;
	}
}
