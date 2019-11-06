package com.liyuyao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyuyao.dao.ArticleMapper;
import com.liyuyao.dao.CommentMapper;
import com.liyuyao.entity.Comment;
import com.liyuyao.service.CommentService;


@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentMapper commentMapper; 
	
	@Autowired
	ArticleMapper articleMapper; 

	@Override
	public int post(Comment commnet) {
		// TODO Auto-generated method stub
		if( commentMapper.add(commnet)>0){
			articleMapper.increaseCommentCnt(commnet.getArticleId());
		}
		return 1;
			
	}
/*
	@Override
	public int delete(Integer cid) {
		// TODO Auto-generated method stub
		return commentMapper.delete(cid);
	}*/

	@Override
	public PageInfo<Comment> getCommentsByArticle(Integer articleId,
			Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo(commentMapper.listByArticle(articleId));
		
		
	}

	@Override
	public PageInfo<Comment> getCommentsByUser(Integer userId, Integer page,
			Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,pageSize);
		return new PageInfo(commentMapper.listByUser(userId));
	}

	@Override
	public int del(Integer userId, Integer cid) {
		// TODO Auto-generated method stub
		return commentMapper.delete(userId,cid);
	}

}
