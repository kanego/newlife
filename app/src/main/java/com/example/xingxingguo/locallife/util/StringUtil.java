package com.example.xingxingguo.locallife.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {

	public static String changeEncoding(String str,String encoding){
		try {
			String returnStr = new String(str.getBytes(), encoding);
			return returnStr;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

}
