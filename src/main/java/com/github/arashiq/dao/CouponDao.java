package com.github.arashiq.dao;

import com.github.arashiq.model.CouponInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by arashiQ on 2016/03/22.
 */
@Repository
public interface CouponDao {

    @Select("SELECT * FROM m_coupon_info")
    @Results(value = {
            @Result(property = "name", column = "name"),
            @Result(property = "title", column = "title"),
            @Result(property = "image", column = "image"),
            @Result(property = "price", column = "price"),
            @Result(property = "discount", column = "discount"),
            @Result(property = "url", column = "url"),
            @Result(property = "extraFee", column = "extra_fee"),
            @Result(property = "lat", column = "lat"),
            @Result(property = "lon", column = "lon")
    })
    public List<CouponInfo> ListAll();

}
