/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.obd.lib.models;

import java.util.List;

/**
 * Data model to hold data on all pids.
 *
 * author Brad Barnhill
 */
public class pidsModel {

    public List<Element> PIDElement;

    /**
     * Holder for a single pids data
     *
     * @author Brad Barnhill
     */
    public class Element {
        public String Mode;
        public String PID;
        public String Bytes;
        public String Description;
        public String Min;
        public String Max;
        public String Units;
        public String Formula;
        public Byte[] Data;
    }
}
