/**
 * Copyright © 2010-2011 Nokia
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
package com.github.restdriver.serverdriver.http.exception;

/**
 * Exception thrown when HTTP response bodies cannot be mapped to Java Objects as expected.
 * 
 * User: mjg
 * Date: 25/04/11
 * Time: 21:56
 */
public class RuntimeMappingException extends RuntimeException {
    
    private static final long serialVersionUID = 123456789L;
    
    /**
     * Create a new exception.
     * 
     * @param message an explanation of the error.
     * @param e The parent exception.
     */
    public RuntimeMappingException(String message, Exception e) {
        super(message, e);
    }
    
}
