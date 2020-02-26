package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.bw.entity.Goods;
import com.bw.vo.GoodsVO;

public interface GoodsMapper {
	List<Goods> list(GoodsVO vo);
	@Insert("insert into sp(pic) values(#{pic})")
	void add(Goods goods);
}
