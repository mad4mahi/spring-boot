/*
 * Copyright 2012-2017 the original author or authors.
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

package org.springframework.boot.web.reactive.context;

import org.springframework.context.ApplicationContext;

/**
 * Interface to provide configuration for a reactive web application.
 *
 * @author Stephane Nicoll
 * @since 2.0.0
 */
public interface ReactiveWebApplicationContext extends ApplicationContext {

	/**
	 * Set the namespace for this reactive web application context.
	 * @param namespace the namespace for the context
	 */
	void setNamespace(String namespace);

	/**
	 * Return the namespace for this reactive web application context, if any.
	 * @return the namespace or {@code null}
	 */
	String getNamespace();

}
