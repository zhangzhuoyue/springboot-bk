package com.zzy.springbootbk.mapper;

import com.zzy.springbootbk.po.BokePo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ze666
 * @desc
 * @date 2021/1/22 8:55
 */
@Mapper
public interface BokeDao {

    List<BokePo> selectArticle();
}
