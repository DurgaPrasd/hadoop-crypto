/*
 * Copyright 2016 Palantir Technologies, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.crypto;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.junit.Test;

public final class KeySerializerV2Test extends KeySerializerTest {

    @Override
    public KeySerializer getSerializer() {
        return KeySerializerV2.INSTANCE;
    }

    @Test
    public void testWrapAndUnwrap() {
        Set<Integer> symmetricKeySizes = ImmutableSet.of(128, 256);
        Set<Integer> wrappingKeySizes = ImmutableSet.of(1024, 2048);
        testWrapAndUnwrap(symmetricKeySizes, wrappingKeySizes);
    }

}