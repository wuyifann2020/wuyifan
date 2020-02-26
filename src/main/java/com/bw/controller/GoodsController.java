package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.bw.vo.GoodsVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	@RequestMapping("list")
	public String list(Model model,GoodsVO vo ,@RequestParam(defaultValue = "1") int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsService.list(vo);	
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("vo", vo);
		return "list";
	}
	@RequestMapping("add.do")
	public String add(Goods goods,@RequestParam("f")MultipartFile file) throws Exception {
		if(file.getSize()>0) {
			String path="D:\\Photo";
			String filename = file.getOriginalFilename();
			File file2 = new File(path, filename);
			file.transferTo(file2);
			goods.setPic(filename);
		}
		goodsService.add(goods);
		return "redirect:list";
	}

	
	
}
