package com.offcn.springbootdemo.servcie.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.springbootdemo.servcie.GoodsService;
//正在使用dubbo与springboot结合，所以使用@service是dubbo包中的service可以被远程调用
@Service
public class GoodsServiceImpl implements GoodsService {
}
