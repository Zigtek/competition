package com.coding.sales;

import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.coding.sales.bo.MemberInfo;

public class MemberInfoTest {
	
	@Test
    public void member_json_to_bean() {
		
        String orderCommand = FileUtils.readFromFile(getResourceFilePath("memberInfo.json"));
        
        MemberInfo info = getMemberInfoByKey("6236609999",orderCommand);

        MemberInfo meber = new MemberInfo();
        meber.setName("马丁");
        meber.setLevel("普卡");
        meber.setCardNo("6236609999");
        meber.setIntegral(9860);

        assertEquals(info.toString(), meber.toString());
    }
	
	
    private MemberInfo getMemberInfoByKey(String string, String orderCommand) {
    	JSONObject mapObject = JSONObject.fromObject(orderCommand);
    	MemberInfo info = (MemberInfo) JSONObject.toBean( mapObject.getJSONObject(string), MemberInfo.class);
    	return info;
	}


	private String getResourceFilePath(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file.getAbsolutePath();
    }
}
