package com.github.arashiq.service;

import com.github.arashiq.dao.CouponDao;
import com.github.arashiq.model.CouponInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arashiQ on 2016/04/26.
 */
@Service
public class CouponMatchService {
    @Autowired
    CouponDao couponDao;

    public List<CouponInfo> CouponList(){
        return couponDao.ListAll();
    };


}
