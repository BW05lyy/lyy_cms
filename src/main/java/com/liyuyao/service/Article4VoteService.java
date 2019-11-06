package com.liyuyao.service;

import java.util.List;

import com.liyuyao.entity.Article4Vote;
import com.liyuyao.entity.VoteStatic;

public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
