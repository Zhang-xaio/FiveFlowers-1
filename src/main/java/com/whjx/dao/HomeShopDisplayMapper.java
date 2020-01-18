package com.whjx.dao;

import com.whjx.pojo.Img;
import com.whjx.pojo.PrimaryCategories;
import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HomeShopDisplayMapper {
    List<Spu> selectAllByPrimaryCategories(@Param("id") int pcid);
    List<Spu> selectAllRecommend();
    List<PrimaryCategories> selectAll();
    List<Img> selectImg();
}