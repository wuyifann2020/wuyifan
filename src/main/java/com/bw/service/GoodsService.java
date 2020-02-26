package com.bw.service;

import java.util.List;

import com.bw.entity.Goods;
import com.bw.vo.GoodsVO;

public interface GoodsService {
	List<Goods> list(GoodsVO vo);

	void add(Goods goods);
}
