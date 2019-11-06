package com.liyuyao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuyao.entity.Article;
import com.liyuyao.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class ESTest {
	
	@Autowired
	private ArticleService articleService;
	
	@Resource
	private ElasticsearchTemplate elasticsearchTemplate;
	
	/**
	 * elasticsearch 导入文件
	  * @param  
	  * @return
	 */
	
	@Test
	public void testAdd() {
		List<Article> list = articleService.findAllElastic();
		for (Article article : list) {
			IndexQuery query = new IndexQuery();
			query.setId(article.getId().toString());
			query.setObject(article);
			elasticsearchTemplate.index(query);
		}
	}
}
