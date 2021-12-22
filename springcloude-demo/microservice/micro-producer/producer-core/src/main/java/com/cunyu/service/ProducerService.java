package com.cunyu.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu.service
 * @className : ProducerService
 * @createTime : 2021/12/22 15:19
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

import com.cunyu.ProducerVO;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    public ProducerVO findProducerById(Long producerId) {
        System.out.println("查询生产者信息");
        ProducerVO producerVO = new ProducerVO();
        producerVO.setProducerId(1L);
        producerVO.setProducerName("Producer No.1");
        producerVO.setDescription("生产者 1 号");
        return producerVO;
    }
}
