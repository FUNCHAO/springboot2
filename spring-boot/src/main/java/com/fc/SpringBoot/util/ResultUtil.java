package com.fc.SpringBoot.util;

import com.fc.SpringBoot.vo.Result;

public class ResultUtil {
	public static<T> Result<T>  success(T object){
		Result<T> result=new Result<T>();
		result.setCode(0);
		result.setMsg("成功");
		result.setData(object);
		return result;
	}
	public static <T>Result<T>  success(){
	
		return success(null);
	}
	public static <T>Result<T>  error(Integer code,String msg){
		Result<T> result=new Result<T>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
