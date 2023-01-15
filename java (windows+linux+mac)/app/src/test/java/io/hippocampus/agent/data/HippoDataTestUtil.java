/**
 * Copyright (c) p-it
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hippocampus.agent.data;

import io.hippocampus.agent.model.Hippo;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Utility class for hippo data tests
 *
 * @author Patrick-4488
 */
public class HippoDataTestUtil {

    public static final String HIPPO_DEFAULT = "mock";
    public static final String HIPPO_NOT_DEFAULT = "mockerd";

    private static final String FIRST_TAG = "tag1";
    private static final String SECOND_TAG = "tag2";

    private HippoDataTestUtil() {
    }

    public static Hippo getHippo(final long id, final String hippo, final int daysToAdd) {
        return new Hippo(id, hippo, LocalDateTime.now().plusDays(daysToAdd), List.of(FIRST_TAG, SECOND_TAG));
    }
}
