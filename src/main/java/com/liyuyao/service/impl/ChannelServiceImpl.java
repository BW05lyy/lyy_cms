package com.liyuyao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyuyao.dao.ChannelMapper;
import com.liyuyao.entity.Channel;
import com.liyuyao.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelMapper.getChannels();
	}
	

}
