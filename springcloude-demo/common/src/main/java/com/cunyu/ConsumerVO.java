package com.cunyu;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu
 * @className : ConsumerVO
 * @createTime : 2021/12/22 14:49
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */
@Setter
@Getter
public class ConsumerVO {
    private Long consumerId;
    private String consumerName;
    private List<ProducerVO> producerList;
}
