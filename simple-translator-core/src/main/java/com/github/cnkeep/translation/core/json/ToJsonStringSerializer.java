/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.IOException;

/**
 * ToJsonStringSerializer: 字段序列化时转换为json 字符串格式
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/11
 */
public class ToJsonStringSerializer extends ToStringSerializer {
    public ToJsonStringSerializer() {
        super(Object.class);
    }

    public ToJsonStringSerializer(Class<?> handledType) {
        super(handledType);
    }

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(JacksonUtil.toJsonString(value));
    }
}
