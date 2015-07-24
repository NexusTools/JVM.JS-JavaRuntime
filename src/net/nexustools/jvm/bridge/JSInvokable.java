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

/**
 *
 * @author kate
 */
public interface JSInvokable {
    public void invoke(JSObjectRef... args);
}
