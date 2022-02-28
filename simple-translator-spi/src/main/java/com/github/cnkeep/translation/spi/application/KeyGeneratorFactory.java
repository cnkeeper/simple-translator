/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.spi.application;

import com.github.cnkeep.translation.spi.application.annotation.TranslateKey;
import java.util.Optional;

/**
 * KeyGeneratorFactory
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/17
 */
public interface KeyGeneratorFactory {
    Optional<KeyGenerator> lookup(TranslateKey.TranslateKeyStrategy strategy);
}
