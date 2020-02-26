package com.bw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.dao.GoodsMapper;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.bw.vo.GoodsVO;
@Service
public class GoodsServiceImpl implements GoodsService{
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> list(GoodsVO vo) {
		// TODO Auto-generated method stub
		return goodsMapper.list(vo);
	}

	@Override
	public void add(Goods goods) {
		goodsMapper.add(goods);
	}
	
}
