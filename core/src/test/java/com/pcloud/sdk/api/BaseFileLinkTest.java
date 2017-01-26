/*
 * Copyright (c) 2017 pCloud AG
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
 *
 */

package com.pcloud.sdk.api;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class BaseFileLinkTest extends BaseRemoteDataTest {

    private FileLink testInstance;

    @Override
    protected FileLink testInstance() {
        return testInstance;
    }

    protected void testInstance(FileLink testInstance) {
        this.testInstance = testInstance;
        testInstance((RemoteData) testInstance);
    }

    @Test
    public void getExpirationDate_IsNonNull() throws Exception {
        assertNotNull(testInstance.getExpirationDate());
    }

    @Test
    public void getUrls_IsNonNull() throws Exception {
        assertNotNull(testInstance.getUrls());
    }

    @Test
    public void getUrls_IsNotEmpty() throws Exception {
        assertFalse(testInstance.getUrls().isEmpty());
    }

    @Test
    public void getUrls_ContainsBestUrl() throws Exception {
        assertTrue(testInstance.getUrls().contains(testInstance.getBestUrl()));
    }

    @Test
    public void getBestUrl_IsNonNull() throws Exception {
        assertNotNull(testInstance.getBestUrl());
    }
}