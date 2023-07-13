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
/**
 * This package contains a configuration for Hibernate and JPA.
 *
 * @author graemerocher
 * @since 1.0
 */
@Configuration
@Requires(property = "jpa.enabled", value = StringUtils.TRUE, defaultValue = StringUtils.TRUE)
@Requires(classes = {SessionFactory.class, Entity.class})
package io.micronaut.configuration.hibernate.jpa;

import io.micronaut.context.annotation.Configuration;
import io.micronaut.context.annotation.Requires;
import io.micronaut.core.util.StringUtils;
import org.hibernate.SessionFactory;

import jakarta.persistence.Entity;
