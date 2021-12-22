package com.cunyu.controller;

import com.cunyu.ProducerFeignClient;
import com.cunyu.ProducerVO;
import com.cunyu.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu.controller
 * @className : ProducerController
 * @createTime : 2021/12/22 15:22
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@RestController
public class ProducerController implements ProducerFeignClient {
    @Autowired
    private ProducerService producerService;

    @Override
    public ProducerVO findProducerById(Long producerId) {
        return producerService.findProducerById(producerId);
    }
}
