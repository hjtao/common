package com.unicom.common.util;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @author haojintao
 * @since 2021-5-29
 * 分页查询--统一响应封装
 */
public class BasePageResponse<T> extends BaseResponse<T> {

    private List<T> records;
    private Integer pageNum;
    private Integer pageSize;
    private Integer total;

    public BasePageResponse(String code, String msg) {
        super(code, msg, null);
    }

    public BasePageResponse(ResponseEnum responseEnum) {
        super(responseEnum, null);
    }

    public BasePageResponse(ResponseEnum responseEnum, String message) {
        super(responseEnum.getCode(), message, null);
    }

    public BasePageResponse(IPage<T> iPage) {
        super(ResponseEnum.SUCCESS, null);
        pageNum = (int) iPage.getPages();
        pageSize = (int) iPage.getSize();
        total = (int) iPage.getTotal();
        records = iPage.getRecords();
    }

    public static BasePageResponse success(IPage iPage){
        return new BasePageResponse(iPage);
    }

    public static BasePageResponse error(ResponseEnum responseEnum){
        return new BasePageResponse(responseEnum);
    }

    public static BasePageResponse error(ResponseEnum responseEnum, String message){
        return new BasePageResponse(responseEnum, message);
    }

    public static BasePageResponse error(String message){
        return new BasePageResponse(ResponseEnum.EXCEPTION, message);
    }

}
