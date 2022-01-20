
package com.github.cnkeep.translation.spi;

import java.util.Objects;

/**
 * LangEnum
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/31
 */
public enum LangEnum {
    //中文
    ZHS("ZHS"),
    //英文
    US("US"),

    //日语
    JA("JA"),

    //俄语
    RU("RU"),

    ;

    String code;

    LangEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static LangEnum lookup(String code, LangEnum defaultV) {
        for (LangEnum langEnum : LangEnum.values()) {
            if(Objects.equals(code,langEnum.code)){
                return langEnum;
            }
        }
        return defaultV;
    }
}
