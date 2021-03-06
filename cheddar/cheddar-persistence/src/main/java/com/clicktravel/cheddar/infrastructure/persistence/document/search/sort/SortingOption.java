/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.cheddar.infrastructure.persistence.document.search.sort;

public class SortingOption {

    public enum Direction {
        ASCENDING,
        DESCENDING;
    }

    private final String key;
    private final Direction direction;

    public SortingOption(final String key) {
        this.key = key;
        direction = Direction.ASCENDING;
    }

    public SortingOption(final String key, final Direction direction) {
        this.key = key;
        this.direction = direction;
    }

    public String key() {
        return key;
    }

    public Direction direction() {
        return direction;
    }
}