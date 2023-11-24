/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.foreign.*;

/**
 * {@snippet : * int (*SSL_CTX_set_cert_verify_callback$cb)(X509_STORE_CTX*,void*);
 * }
 */
public interface SSL_CTX_set_cert_verify_callback$cb {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);

    static MemorySegment allocate(SSL_CTX_set_cert_verify_callback$cb fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$20.const$2, fi, constants$12.const$2, scope);
    }

    static SSL_CTX_set_cert_verify_callback$cb ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                return (int) constants$20.const$3.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

