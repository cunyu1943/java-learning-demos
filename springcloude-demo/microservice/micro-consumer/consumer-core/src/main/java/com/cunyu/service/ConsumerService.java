package com.cunyu.service;

import com.cunyu.ConsumerVO;
import com.cunyu.ProducerFeignClient;
import com.cunyu.ProducerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu.service
 * @className : ConsumerService
 * @createTime : 2021/12/22 15:42
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@Service
public class ConsumerService {
    @Autowired
    private ProducerFeignClient producerFeignClient;

    public ConsumerVO findConsumerById(Long consumerId, Long producerId) {
        System.out.println("查询消费者信息");
        ConsumerVO consumerVO = new ConsumerVO();
        consumerVO.setConsumerId(1L);
        consumerVO.setConsumerName("Consumer No.1");
        ProducerVO producerVO = new ProducerVO();
        producerVO = producerFeignClient.findProducerById(producerId);
        List<ProducerVO> producerList = new ArrayList<>();
        producerList.add(producerVO);
        consumerVO.setProducerList(producerList);
        return consumerVO;
    }
}
