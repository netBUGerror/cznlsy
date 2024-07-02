package com.aaa.util;

import java.util.List;

public class CommonResult{
	private int code;
	private String msg;
	private int count;
	private Object data;
	
	public static final CommonResult RESULT_SUCCESS = new CommonResult(0,"处理成功");
	public static final CommonResult RESULT_ERROR = new CommonResult(1,"处理失败");
	
	public CommonResult(){
		
	}
	
	public CommonResult(int code,String msg){
		this.code=code;
		this.msg=msg;
	}
	
	public CommonResult(int count,Object data){
		this(0,"",count,data);
	}
	
	public CommonResult(int code,String msg,int count,Object data){
		this.code=code;
		this.msg=msg;
		this.count=count;
		this.data=data;
	}
	
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
