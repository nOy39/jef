/*
 * Copyright (c) 2021, IOT-Hub.RU and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is dual-licensed: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License Version 3 as
 * published by the Free Software Foundation. For the terms of this
 * license, see <http://www.gnu.org/licenses/>.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public
 * License Version 3 for more details (a copy is included in the LICENSE
 * file that accompanied this code).
 *
 * You should have received a copy of the GNU Affero General Public License
 * version 3 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact support@iot-hub.ru or visit www.iot-hub.ru if you need
 * additional information or have any questions.
 *
 * You can be released from the requirements of the license by purchasing
 * a Java Embedded Framework Commercial License. Buying such a license is
 * mandatory as soon as you develop commercial activities involving the
 * Java Embedded Framework software without disclosing the source code of
 * your own applications.
 *
 * Please contact sales@iot-hub.ru if you have any question.
 */

package ru.iothub.jef.linux.core.io;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DynamicByteBuffer implements Comparable<ByteBuffer> {
    private ByteBuffer byteBuffer;
    private float expandFactor = 1.5F;

    public DynamicByteBuffer(int initialCapacity, float expandFactor) {
        setExpandFactor(expandFactor);
        this.byteBuffer = ByteBuffer.allocate(initialCapacity);
        this.expandFactor = expandFactor;
    }

    public DynamicByteBuffer(int initialCapacity) {
        this(initialCapacity, 2);
    }

    public int capacity() {
        return byteBuffer.capacity();
    }

    public void clear() {
        byteBuffer.clear();
    }

    public Buffer flip() {
        return byteBuffer.flip();
    }

    public boolean hasRemaining() {
        return byteBuffer.hasRemaining();
    }

    public boolean isReadOnly() {
        return byteBuffer.isReadOnly();
    }

    public int limit() {
        return byteBuffer.limit();
    }

    public Buffer limit(int newLimit) {
        return byteBuffer.limit(newLimit);
    }

    public Buffer mark() {
        return byteBuffer.mark();
    }

    public int position() {
        return byteBuffer.position();
    }

    public Buffer position(int newPosition) {
        return byteBuffer.position(newPosition);
    }

    public int remaining() {
        return byteBuffer.remaining();
    }

    public Buffer reset() {
        return byteBuffer.reset();
    }

    public Buffer rewind() {
        return byteBuffer.rewind();
    }

    public byte[] array() {
        return byteBuffer.array();
    }

    public int arrayOffset() {
        return byteBuffer.arrayOffset();
    }

    public ByteBuffer compact() {
        return byteBuffer.compact();
    }

    public int compareTo(ByteBuffer that) {
        return byteBuffer.compareTo(that);
    }

    public ByteBuffer duplicate() {
        return byteBuffer.duplicate();
    }

    public boolean equals(Object ob) {
        return byteBuffer.equals(ob);
    }

    public byte get() {
        return byteBuffer.get();
    }

    public ByteBuffer get(byte[] dst) {
        return byteBuffer.get(dst);
    }

    public ByteBuffer get(byte[] dst, int offset, int length) {
        return byteBuffer.get(dst, offset, length);
    }

    public byte get(int index) {
        return byteBuffer.get(index);
    }

    public char getChar() {
        return byteBuffer.getChar();
    }

    public char getChar(int index) {
        return byteBuffer.getChar(index);
    }

    public double getDouble() {
        return byteBuffer.getDouble();
    }

    public double getDouble(int index) {
        return byteBuffer.getDouble(index);
    }

    public float getFloat() {
        return byteBuffer.getFloat();
    }

    public float getFloat(int index) {
        return byteBuffer.getFloat(index);
    }

    public int getInt() {
        return byteBuffer.getInt();
    }

    public int getInt(int index) {
        return byteBuffer.getInt(index);
    }

    public long getLong() {
        return byteBuffer.getLong();
    }

    public long getLong(int index) {
        return byteBuffer.getLong(index);
    }

    public short getShort() {
        return byteBuffer.getShort();
    }

    public short getShort(int index) {
        return byteBuffer.getShort(index);
    }

    public boolean hasArray() {
        return byteBuffer.hasArray();
    }

    public boolean isDirect() {
        return byteBuffer.isDirect();
    }

    public ByteOrder order() {
        return byteBuffer.order();
    }

    public ByteBuffer order(ByteOrder bo) {
        return byteBuffer.order(bo);
    }

    public ByteBuffer put(byte b) {
        ensureSpace(1);
        return byteBuffer.put(b);
    }

    public ByteBuffer put(byte[] src) {
        ensureSpace(src.length);
        return byteBuffer.put(src);
    }

    public ByteBuffer put(byte[] src, int offset, int length) {
        ensureSpace(length);
        return byteBuffer.put(src, offset, length);
    }

    public ByteBuffer put(ByteBuffer src) {
        ensureSpace(src.remaining());
        return byteBuffer.put(src);
    }

    public ByteBuffer put(int index, byte b) {
        ensureSpace(1);
        return byteBuffer.put(index, b);
    }

    public ByteBuffer putChar(char value) {
        ensureSpace(2);
        return byteBuffer.putChar(value);
    }

    public ByteBuffer putChar(int index, char value) {
        ensureSpace(2);
        return byteBuffer.putChar(index, value);
    }

    public ByteBuffer putDouble(double value) {
        ensureSpace(8);
        return byteBuffer.putDouble(value);
    }

    public ByteBuffer putDouble(int index, double value) {
        ensureSpace(8);
        return byteBuffer.putDouble(index, value);
    }

    public ByteBuffer putFloat(float value) {
        ensureSpace(4);
        return byteBuffer.putFloat(value);
    }

    public ByteBuffer putFloat(int index, float value) {
        ensureSpace(4);
        return byteBuffer.putFloat(index, value);
    }

    public ByteBuffer putInt(int value) {
        ensureSpace(4);
        return byteBuffer.putInt(value);
    }

    public ByteBuffer putInt(int index, int value) {
        ensureSpace(4);
        return byteBuffer.putInt(index, value);
    }

    public ByteBuffer putLong(int index, long value) {
        ensureSpace(8);
        return byteBuffer.putLong(index, value);
    }

    public ByteBuffer putLong(long value) {
        ensureSpace(8);
        return byteBuffer.putLong(value);
    }

    public ByteBuffer putShort(int index, short value) {
        ensureSpace(2);
        return byteBuffer.putShort(index, value);
    }

    public ByteBuffer putShort(short value) {
        ensureSpace(2);
        return byteBuffer.putShort(value);
    }

    public ByteBuffer slice() {
        return byteBuffer.slice();
    }

    @Override
    public int hashCode() {
        return byteBuffer.hashCode();
    }

    @Override
    public String toString() {
        return byteBuffer.toString();
    }

    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public void setExpandFactor(float expandFactor) {
        if (expandFactor < 1) {
            throw new IllegalArgumentException(
                    "The expand factor must be greater or equal to 1!");
        }
        this.expandFactor = expandFactor;
    }

    public float getExpandFactor() {
        return expandFactor;
    }

    private void ensureSpace(int needed) {
        if (remaining() >= needed) {
            return;
        }
        int newCapacity = (int) (byteBuffer.capacity() * expandFactor);
        while (newCapacity < (byteBuffer.capacity() + needed)) {
            newCapacity *= expandFactor;
        }
        ByteBuffer expanded = ByteBuffer.allocate(newCapacity);
        expanded.order(byteBuffer.order());
        expanded.put(byteBuffer);
        byteBuffer = expanded;
    }
}
