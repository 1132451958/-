package com.quanxiaoha.xiaohashu.auth.enums;

import com.quanxiaoha.framework.common.exception.BaseExceptionInterface;
import lombok.*;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum  implements BaseExceptionInterface {
    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("AUTH-10000","出错啦，后台小哥正在努力修复中..."),
    PARAM_NOT_VALID("AUTH-10001", "参数错误"),
    ;
    private final String errorCode;
    private final String errorMessage;
}
