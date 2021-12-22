package com.cunyu.controller;

import com.cunyu.ConsumerFeignClient;
import com.cunyu.ConsumerVO;
import com.cunyu.ProducerFeignClient;
import com.cunyu.ProducerVO;
import com.cunyu.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu.controller
 * @className : ConsumerController
 * @createTime : 2021/12/22 15:42
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@RestController
public class ConsumerController implements ConsumerFeignClient {
    @Autowired
    private ConsumerService consumerService;

    @Override
    public ConsumerVO findConsumerById(Long consumerId, Long producerId) {
        return consumerService.findConsumerById(consumerId, producerId);
    }
}
