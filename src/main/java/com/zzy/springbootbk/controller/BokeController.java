package com.zzy.springbootbk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzy.springbootbk.mapper.BokeDao;
import com.zzy.springbootbk.po.BokePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ze666
 * @desc 控制器
 * @date 2021/1/21 22:33
 */
@Controller
@RequestMapping("/boke")
public class BokeController {
    //@Autowired注入失败
    @Resource
    private BokeDao bokeDao;

    @RequestMapping("/query")
    public String pageQuery(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,2);
        List<BokePo> bokePoList = bokeDao.selectArticle();
        PageInfo<BokePo> pageInfo = new PageInfo<BokePo>(bokePoList);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

}
