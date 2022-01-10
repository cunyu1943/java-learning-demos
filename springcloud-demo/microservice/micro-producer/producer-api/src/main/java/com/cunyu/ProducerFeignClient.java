package com.cunyu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu
 * @className : ProducerFeignClient
 * @createTime : 2021/12/22 15:11
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@FeignClient("producerService")
public interface ProducerFeignClient {
    /**
     * 根据生产者 id 查询生产者信息
     *
     * @param producerId
     * @return
     */
    @RequestMapping("producer/{producerId}")
    ProducerVO findProducerById(@PathVariable("producerId") Long producerId);
}
