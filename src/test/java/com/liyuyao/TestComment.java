package com.liyuyao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liyuyao.entity.Comment;
import com.liyuyao.service.CommentService;


public class TestComment   extends TestBase{
	
	@Autowired
	CommentService commentService;
	
	@Test
	public void testInsert(){
		
		Comment comment = new Comment();
		comment.setArticleId(20);
		comment.setContent("这是对我的单元测试");
		comment.setUserId(37);
		commentService.post(comment);
		
	}

}
