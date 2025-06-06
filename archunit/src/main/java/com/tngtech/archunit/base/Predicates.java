/*
 * Copyright 2014-2025 TNG Technology Consulting GmbH
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
package com.tngtech.archunit.base;

import java.util.function.Predicate;

import com.tngtech.archunit.PublicAPI;

import static com.tngtech.archunit.PublicAPI.Usage.ACCESS;

@PublicAPI(usage = ACCESS)
public final class Predicates {
    private Predicates() {
    }

    @PublicAPI(usage = ACCESS)
    @SuppressWarnings("unchecked")
    public static <T> Predicate<T> alwaysTrue() {
        return (Predicate<T>) ALWAYS_TRUE;
    }

    @PublicAPI(usage = ACCESS)
    @SuppressWarnings("unchecked")
    public static <T> Predicate<T> alwaysFalse() {
        return (Predicate<T>) ALWAYS_FALSE;
    }

    private static final Predicate<Object> ALWAYS_TRUE = input -> true;

    private static final Predicate<Object> ALWAYS_FALSE = input -> false;
}
