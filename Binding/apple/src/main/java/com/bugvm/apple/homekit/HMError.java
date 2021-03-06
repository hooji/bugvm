/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package com.bugvm.apple.homekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected HMError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(HMError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    private NSErrorUserInfo userInfo;
    
    /* Convenience methods */
    private NSErrorUserInfo getCachedUserInfo() {
        if (userInfo == null) {
            userInfo = getUserInfo();
        }
        return userInfo;
    }
    
    @Override
    public HMErrorCode getErrorCode() {
        HMErrorCode code = null;
        try {
            code = HMErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    
    @SuppressWarnings("unchecked")
    public NSDictionary<NSUUID, NSError> getFailedAccessories() {
        if (getCachedUserInfo().has(HMErrorUserInfoKey.FailedAccessories)) {
            NSDictionary<NSUUID, NSError> val = (NSDictionary<NSUUID, NSError>) getCachedUserInfo().get(HMErrorUserInfoKey.FailedAccessories);
            return val;
        }
        return null;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="HMErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
