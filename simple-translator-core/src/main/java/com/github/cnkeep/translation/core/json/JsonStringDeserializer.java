/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * JsonStringDeserializer: 从json数据反序列化出对象
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/11
 */
public class JsonStringDeserializer extends StdScalarDeserializer<Object> {

    public JsonStringDeserializer() {
        super(Object.class);
    }

    protected JsonStringDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Object deserialize(JsonParser jp, DeserializationContext context) {
        String value = null;
        try {
            value = jp.getText();
            Field field = findField(jp.getCurrentName(), jp.getCurrentValue().getClass());
            Class<?> javaType = field.getType();
            return JacksonUtil.parseToObject(value, javaType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Field findField(String name, Class<?> c) {
        for (; c != null; c = c.getSuperclass()) {
            for (Field field : c.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                if (field.getName().equals(name)) {
                    return field;
                }
            }
        }
        return null;
    }

    @Override
    public Object getEmptyValue(DeserializationContext context) throws JsonMappingException {
        return null;
    }
}
