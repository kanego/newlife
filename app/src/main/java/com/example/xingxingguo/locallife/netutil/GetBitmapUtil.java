package com.example.xingxingguo.locallife.netutil;

import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by xingxingguo on 2015/11/3.
 *
 */

public class GetBitmapUtil {

	public static Bitmap getBitmapByUrl(String url){
		Bitmap bitmap = null;
		try {
			URL url2=new URL(url);
			HttpURLConnection httpURLConnection=(HttpURLConnection) url2.openConnection();
		    httpURLConnection.setReadTimeout(3000);
		    int code=httpURLConnection.getResponseCode();
		    if(code==200){
		    	bitmap=BitmapFactory.decodeStream(httpURLConnection.getInputStream());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bitmap;
	}
}
