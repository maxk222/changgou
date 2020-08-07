package com.maxkkk.entity;

import java.util.List;

import lombok.Data;

@Data
public class PageResult<T> {
	private Long total;// 总记录数
	private List<T> rows;// 记录
}
