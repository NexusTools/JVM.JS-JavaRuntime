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
package net.nexustools.jvm.console;

import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author kate
 */
public class JSConsoleWriter {
    public JSConsoleWriter(String type) {
        init(type);
    }

    private native void init(String type);
    
    public native void append(String line);

    public final class Stream extends OutputStream {
        private String buffer = "";

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            buffer += new String(b, off, len);

            int pos;
            while((pos = buffer.indexOf('\n')) != -1) {
                append(buffer.substring(0, pos));
                buffer = buffer.substring(pos+1);
            }
        }

        @Override
        public void write(int b) throws IOException {
            write(new byte[]{(byte)b});
        }
    };
}
