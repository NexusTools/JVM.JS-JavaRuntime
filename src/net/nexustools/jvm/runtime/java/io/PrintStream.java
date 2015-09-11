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
package net.nexustools.jvm.runtime.java.io;

/**
 *
 * @author kate
 */
public class PrintStream extends java.io.FilterOutputStream {

    public PrintStream(java.io.OutputStream out) {
        super(out);
    }
    
    public void print(char c) throws java.io.IOException {
        out.write(c);
    }
    
    public void print(String string) throws java.io.IOException {
        out.write(string.getBytes());
    }
    
    public void println(String string) throws java.io.IOException {
        print(string);
        println();
    }
    
    public void println() throws java.io.IOException {
        print('\n');
    }
    
    public boolean checkError() {
        return false;
    }
    
}
