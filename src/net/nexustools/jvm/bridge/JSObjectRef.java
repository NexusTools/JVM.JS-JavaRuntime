/*
 * This file is part of JVM.JS-JavaRuntime.
 * 
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  To comply with Oracle this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 * 
 * JVM.JS-JavaRuntime is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JVM.JS-JavaRuntime.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.nexustools.jvm.bridge;

import java.util.List;
import java.util.Map;

/**
 *
 * @author kate
 */
public class JSObjectRef {
    public static interface Controller {
        public JSObjectRef getRef();
    }
    public static class NativeController implements Controller {
        @Override
        public final native JSObjectRef getRef();
    }
    
    public JSObjectRef() {}
    public JSObjectRef(Runnable value) {
        set(value);
    }
    public JSObjectRef(JSInvokable value) {
        set(value);
    }
    public JSObjectRef(String value) {
        set(value);
    }
    public JSObjectRef(boolean value) {
        set(value);
    }
    public JSObjectRef(double value) {
        set(value);
    }
    
    public final native void setNewArray();
    public final native void setNewObject();
    public final native void setUndefined();
    public final native void setNull();
    
    public final native void set(String value);
    public final native void set(Runnable function);
    public final native void set(JSInvokable function);
    public final native void set(boolean value);
    public final native void set(double value);
    
    public final native boolean isString();
    public final native boolean isObject();
    public final native boolean isArray();
    public final native boolean isBoolean();
    public final native boolean isNumeric();
    public final native boolean isUndefined();
    public final native boolean isFunction();
    public final native boolean isFalse();
    public final native boolean isTrue();
    public final native boolean isNull();
    public final native boolean isNaN();
    
    // Start Object Methods
    public final native String[] getKeys();
    
    public final native boolean contains(String key);
    
    public final native JSObjectRef get(String key);
    public final native double getNumber(String key);
    public final native String getString(String key);
    public final native boolean getBoolean(String key);
    
    public final native void set(String key, JSObjectRef ref);
    public final native void set(String key, String string);
    public final native void set(String key, double number);
    public final native void set(String key, boolean bool);
    // End Object Methods
    
    // Start Array Methods
    public final native JSObjectRef get(int index);
    public final native String getString(int index);
    public final native String getBoolean(int index);
    public final native String getNumber(int index);
    
    public final native int length();
    // End Array Methods
    
    public final native JSObjectRef invoke(JSObjectRef... args);
    public final native JSObjectRef invokeNew(JSObjectRef... args);
    
    public final native double toNumber();

    public final native boolean equals(JSObjectRef ref); // == 
    public final native boolean exactly(JSObjectRef ref); // === 
    
    public final <I> List<I> wrapList() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public final <I> Map<String, JSObjectRef> wrapMap() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public final Runnable wrapInvoke() {
        return new Runnable() {
            @Override
            public void run() {
                invoke();
            }
        };
    }
    
    @Override
    public final native String toString();
    
    public static native JSObjectRef getGlobal(String key);
    
    public static JSObjectRef valueOf(Map<String, ?> map) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
