package com.liyuyao;

import org.junit.Test;

import com.liyuyao.utils.PageUtil;

/**
 * @作者:lyy
 * @日期:2019年10月26日
 * @功能:
 * 
 *
 */
public class MyPageTest {
	
	@Test
	public void set() {
		String page2 = PageUtil.page2(1, 2, "/artic", 5, 1);
		System.out.println(page2);
	}

}
