package com.cunyu;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 村雨遥
 * @version : 1.0
 * @project : springcloude-demo
 * @package : com.cunyu
 * @className : ProducerVO
 * @createTime : 2021/12/22 14:46
 * @email : 747731461@qq.com
 * @微信 : cunyu1024
 * @公众号 : 村雨遥
 * @网站 : https://cunyu1943.github.io
 * @description :
 */

@Setter
@Getter
public class ProducerVO {
    private Long producerId;
    private String producerName;
    private String description;
}
