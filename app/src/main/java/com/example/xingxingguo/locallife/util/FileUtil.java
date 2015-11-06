package com.example.xingxingguo.locallife.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.os.Environment;
import android.os.StatFs;


public class FileUtil {

	/**
	 * 向/sdcard/apmt 路径下添加文本
	 * @param text 文本信息
	 */
	public static void addFile(String text){
		addFile(text,Environment.getExternalStorageDirectory().getPath()+"/apmt/","a.txt");
	}

	/**
	 * 向/sdcard/apmt 路径下添加文本
	 * @param text 文本消息
	 * @param path 路径
	 */
	public static void addFile(String text,String path,String fileName){
		File file = new File(path+fileName);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}

		FileWriter fileWriter = null;
		try {
			fileWriter =new FileWriter(path+fileName);
			fileWriter.write(text);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fileWriter!=null){
					fileWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 清空文件
	 * @param file
	 */
	public static void delete(File file) {  
		if (file.isFile()) {  
			file.delete();  
			return;  
		}  
		if(file.isDirectory()){  
			File[] childFiles = file.listFiles();  
			if (childFiles == null || childFiles.length == 0) {  
				file.delete();  
				return;  
			}  

			for (int i = 0; i < childFiles.length; i++) {  
				delete(childFiles[i]);  
			}  
			file.delete();  
		}
	} 
	/**
	 * 获取手机sd卡剩余内存
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static long getSDFreeSize(){
		//
		File path = Environment.getExternalStorageDirectory(); 
		StatFs sf = new StatFs(path.getPath());
		long blockSize = sf.getBlockSize();
		long freeBlocks = sf.getAvailableBlocks();
		//return freeBlocks * blockSize;  //Byte
		//return (freeBlocks * blockSize)/1024;   //KB
		return (freeBlocks * blockSize)/1024 /1024; //MB
	}	
}
