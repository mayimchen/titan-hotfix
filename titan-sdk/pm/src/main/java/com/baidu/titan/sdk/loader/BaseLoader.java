/*
 * Copyright (C) Baidu Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.titan.sdk.loader;

/**
 * Loader基类
 *
 * @author zhangdi07@baidu.com
 * @since 2017/4/26
 */

public abstract class BaseLoader {

    /**
     * 应用补丁
     */
    public abstract void apply();

    /**
     * just-in-time策略下应用补丁
     */
    public abstract void applyInTime();
}
