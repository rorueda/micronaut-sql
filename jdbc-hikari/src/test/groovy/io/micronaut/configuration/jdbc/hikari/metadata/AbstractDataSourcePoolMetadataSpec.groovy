/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.configuration.jdbc.hikari.metadata

import spock.lang.Shared
import spock.lang.Specification

class AbstractDataSourcePoolMetadataSpec extends Specification {

    @Shared
    def metricNames = [
    'hikaricp.connections.idle',
    'hikaricp.connections.pending',
    'hikaricp.connections',
    'hikaricp.connections.active',
    'hikaricp.connections.creation' ,
    'hikaricp.connections.max',
    'hikaricp.connections.min',
    'hikaricp.connections.usage',
    'hikaricp.connections.timeout',
    'hikaricp.connections.acquire'
    ]

}
