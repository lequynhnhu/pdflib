/*
 * ImpossibleBusinessRuleException.java
 *
 * Created on August 14, 2007, 3:02 PM
 *
 * Copyright (c) 2007, Pat Farrell. All rights reserved.
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

package  com.pfarrell.exceptions;

import java.sql.SQLException;

/**
 * The <code>ImpossibleBusinessRuleException</code> class implements
 * an exception that indicates that a fundamental business rule or database
 * consitancy rule has been violated.
 *
 * @author pfarrell
 */
public class ImpossibleBusinessRuleException  extends SQLException {
	private static final long serialVersionUID = 32L;

    /** Creates a new instance of ImpossibleBusinessRuleException */
    public ImpossibleBusinessRuleException() {
    }
    /**
     * Creates a new instance of ImpossibleBusinessRuleException
     * @param message error string
     */
    public ImpossibleBusinessRuleException(String message)    {
        super(message);
    }
}
