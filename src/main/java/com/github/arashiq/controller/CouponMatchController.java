package com.github.arashiq.controller;

import com.github.arashiq.model.CouponInfo;
import com.github.arashiq.service.CouponMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by arashiQ on 2016/04/26.
 */
@RestController
@RequestMapping(value = "coupon")
public class CouponMatchController {

    @Autowired
    CouponMatchService couponMatchService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<CouponInfo>> CouponList(){
        return new ResponseEntity<List<CouponInfo>>(couponMatchService.CouponList(), HttpStatus.OK);
    }


}
