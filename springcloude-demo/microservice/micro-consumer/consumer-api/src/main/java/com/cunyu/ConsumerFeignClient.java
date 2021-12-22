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
 * @className : ConsumerFeignClient
 * @createTime : 2021/12/22 15:30
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@FeignClient("consumerService")
public interface ConsumerFeignClient {
    /**
     * 根据生产者 id 和 消费者 id 查询消费者信息
     *
     * @param consumerId
     * @param producerId
     * @return
     */
    @RequestMapping("consumer/{consumerId}/{producerId}")
    ConsumerVO findConsumerById(@PathVariable("consumerId") Long consumerId, @PathVariable("producerId") Long producerId);

}
