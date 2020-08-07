package com.maxkkk.entity;

import lombok.Data;

@Data
public class Result<T> {
	private boolean flag;// 是否成功
	private Integer code;// 返回码
	private String message;// 返回消息
	private T data;// 返回数据

	public Result(boolean flag, Integer code, String message) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
	}

	public Result(boolean flag, Integer code, String message, T data) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
		this.data = data;
	}

}
