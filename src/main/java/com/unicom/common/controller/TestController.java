package com.unicom.common.controller;

import com.unicom.common.util.BaseResponse;
import com.unicom.common.util.ResponseEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haojintao
 * @since 2021-5-29
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public BaseResponse test() {
        ResponseEnum.NULL_EXCEPTION.assertNotNull(null,"附加1", "附加2");
        return BaseResponse.success();
    }
}
