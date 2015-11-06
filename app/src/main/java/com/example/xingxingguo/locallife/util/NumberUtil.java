package com.example.xingxingguo.locallife.util;

public class NumberUtil {

	public static Integer parseInt(String str){
		if(str==null||str.equals("")){
			return null;
		}else{
			try{
				return Integer.parseInt(str);
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
	}
	public static Integer parseInt(String str,int defaultValue){
		if(str==null||str.equals("")){
			return defaultValue;
		}else{
			try{
				return Integer.parseInt(str);
			}catch(Exception e){
				e.printStackTrace();
				return defaultValue;
			}
		}
	}

	public static Double parseDouble(String str){
		if(str==null||str.equals("")){
			return null;
		}else{
			try{
				return Double.parseDouble(str);
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
	}

	public static Double parseDoubleZero(String str){
		return parseDouble(str, 0.0);
	}

	public static Double parseDouble(String str,Double defaultNumber){
		if(str==null||str.equals("")){
			return defaultNumber;
		}else{
			try{
				return Double.parseDouble(str);
			}catch(Exception e){
				e.printStackTrace();
				return defaultNumber;
			}
		}
	}

	public static Double parseDoubleZeroToOne(String str){
		if(parseDoubleZero(str)==0){
			return 1.0;
		}else{
			return parseDouble(str, 1.0);
		}
	}

	public static Integer parseIntZero(String str){
		if(str==null||str.equals("")){
			return 0;
		}else{
			try{
				return parseInt(str);
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}
		}
	}

	public static boolean idSmallThan(String str,float large){
		if(parseDoubleZero(str)<large){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isAllEmptyOrZero(String... strs){
		for(String string:strs){
			if(parseDoubleZero(string)!=0){
				return false;
			}
		}
		return true;
	}
}
