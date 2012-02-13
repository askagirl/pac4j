/*
  Copyright 2012 Jérôme Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.test.util;

import java.util.HashMap;
import java.util.Map;

import org.scribe.up.session.UserSession;

/**
 * This class is a single user session provided by a map.
 * 
 * @author Jérôme Leleu
 * @since 1.0.0
 */
public class SingleUserSession implements UserSession {
    
    private Map<String, Object> session = new HashMap<String, Object>();
    
    public void setAttribute(String key, Object value) {
        session.put(key, value);
    }
    
    public Object getAttribute(String key) {
        return session.get(key);
    }
}