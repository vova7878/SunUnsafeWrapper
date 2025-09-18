/*
 * Copyright (c) 2023 - 2025 Vladimir Kozelkov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.v7878.sun.unsafe;

import com.v7878.r8.annotations.AlwaysInline;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

// sun.misc.Unsafe "as is"
@SuppressWarnings({"JavaReflectionMemberAccess", "DiscouragedPrivateApi"})
public final class SunUnsafe {
    public static final Unsafe INSTANCE;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            INSTANCE = (Unsafe) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @AlwaysInline
    public static Class<?> getUnsafeClass() {
        return Unsafe.class;
    }

    @AlwaysInline
    public static int arrayBaseOffset(Class<?> clazz) {
        return INSTANCE.arrayBaseOffset(clazz);
    }

    @AlwaysInline
    public static int arrayIndexScale(Class<?> clazz) {
        return INSTANCE.arrayIndexScale(clazz);
    }

    @AlwaysInline
    public static boolean compareAndSwapInt(Object obj, long offset,
                                            int expectedValue, int value) {
        return INSTANCE.compareAndSwapInt(obj, offset, expectedValue, value);
    }

    @AlwaysInline
    public static boolean compareAndSwapLong(Object obj, long offset,
                                             long expectedValue, long value) {
        return INSTANCE.compareAndSwapLong(obj, offset, expectedValue, value);
    }

    @AlwaysInline
    public static boolean compareAndSwapObject(Object obj, long offset,
                                               Object expectedValue, Object value) {
        return INSTANCE.compareAndSwapObject(obj, offset, expectedValue, value);
    }

    @AlwaysInline
    public static int getIntVolatile(Object obj, long offset) {
        return INSTANCE.getIntVolatile(obj, offset);
    }

    @AlwaysInline
    public static void putIntVolatile(Object obj, long offset, int value) {
        INSTANCE.putIntVolatile(obj, offset, value);
    }

    @AlwaysInline
    public static long getLongVolatile(Object obj, long offset) {
        return INSTANCE.getLongVolatile(obj, offset);
    }

    @AlwaysInline
    public static void putLongVolatile(Object obj, long offset, long value) {
        INSTANCE.putLongVolatile(obj, offset, value);
    }

    @AlwaysInline
    public static Object getObjectVolatile(Object obj, long offset) {
        return INSTANCE.getObjectVolatile(obj, offset);
    }

    @AlwaysInline
    public static void putObjectVolatile(Object obj, long offset, Object value) {
        INSTANCE.putObjectVolatile(obj, offset, value);
    }

    @AlwaysInline
    public static int getInt(Object obj, long offset) {
        return INSTANCE.getInt(obj, offset);
    }

    @AlwaysInline
    public static void putInt(Object obj, long offset, int value) {
        INSTANCE.putInt(obj, offset, value);
    }

    @AlwaysInline
    public static long getLong(Object obj, long offset) {
        return INSTANCE.getLong(obj, offset);
    }

    @AlwaysInline
    public static void putLong(Object obj, long offset, long value) {
        INSTANCE.putLong(obj, offset, value);
    }

    @AlwaysInline
    public static Object getObject(Object obj, long offset) {
        return INSTANCE.getObject(obj, offset);
    }

    @AlwaysInline
    public static void putObject(Object obj, long offset, Object value) {
        INSTANCE.putObject(obj, offset, value);
    }

    @AlwaysInline
    public static void park(boolean absolute, long time) {
        INSTANCE.park(absolute, time);
    }

    @AlwaysInline
    public static void unpark(Object obj) {
        INSTANCE.unpark(obj);
    }

    @AlwaysInline
    public static Object allocateInstance(Class<?> clazz) {
        return INSTANCE.allocateInstance(clazz);
    }

    @AlwaysInline
    public static int addressSize() {
        return INSTANCE.addressSize();
    }

    @AlwaysInline
    public static int pageSize() {
        return INSTANCE.pageSize();
    }

    @AlwaysInline
    public static long allocateMemory(long bytes) {
        return INSTANCE.allocateMemory(bytes);
    }

    @AlwaysInline
    public static void freeMemory(long address) {
        INSTANCE.freeMemory(address);
    }

    @AlwaysInline
    public static void setMemory(long address, long bytes, byte value) {
        INSTANCE.setMemory(address, bytes, value);
    }

    @AlwaysInline
    public static boolean getBoolean(Object obj, long offset) {
        return INSTANCE.getByte(obj, offset) != 0;
    }

    @AlwaysInline
    public static void putBoolean(Object obj, long offset, boolean value) {
        INSTANCE.putByte(obj, offset, (byte) (value ? 1 : 0));
    }

    @AlwaysInline
    public static byte getByte(Object obj, long offset) {
        return INSTANCE.getByte(obj, offset);
    }

    @AlwaysInline
    public static void putByte(Object obj, long offset, byte value) {
        INSTANCE.putByte(obj, offset, value);
    }

    @AlwaysInline
    public static char getChar(Object obj, long offset) {
        return INSTANCE.getChar(obj, offset);
    }

    @AlwaysInline
    public static void putChar(Object obj, long offset, char value) {
        INSTANCE.putChar(obj, offset, value);
    }

    @AlwaysInline
    public static short getShort(Object obj, long offset) {
        return INSTANCE.getShort(obj, offset);
    }

    @AlwaysInline
    public static void putShort(Object obj, long offset, short value) {
        INSTANCE.putShort(obj, offset, value);
    }

    @AlwaysInline
    public static float getFloat(Object obj, long offset) {
        return INSTANCE.getFloat(obj, offset);
    }

    @AlwaysInline
    public static void putFloat(Object obj, long offset, float value) {
        INSTANCE.putFloat(obj, offset, value);
    }

    @AlwaysInline
    public static double getDouble(Object obj, long offset) {
        return INSTANCE.getDouble(obj, offset);
    }

    @AlwaysInline
    public static void putDouble(Object obj, long offset, double value) {
        INSTANCE.putDouble(obj, offset, value);
    }

    @AlwaysInline
    public static boolean getBoolean(long address) {
        return INSTANCE.getByte(address) != 0;
    }

    @AlwaysInline
    public static void putBoolean(long address, boolean value) {
        INSTANCE.putByte(address, (byte) (value ? 1 : 0));
    }

    @AlwaysInline
    public static byte getByte(long address) {
        return INSTANCE.getByte(address);
    }

    @AlwaysInline
    public static void putByte(long address, byte value) {
        INSTANCE.putByte(address, value);
    }

    @AlwaysInline
    public static short getShort(long address) {
        return INSTANCE.getShort(address);
    }

    @AlwaysInline
    public static void putShort(long address, short value) {
        INSTANCE.putShort(address, value);
    }

    @AlwaysInline
    public static char getChar(long address) {
        return INSTANCE.getChar(address);
    }

    @AlwaysInline
    public static void putChar(long address, char value) {
        INSTANCE.putChar(address, value);
    }

    @AlwaysInline
    public static int getInt(long address) {
        return INSTANCE.getInt(address);
    }

    @AlwaysInline
    public static void putInt(long address, int value) {
        INSTANCE.putInt(address, value);
    }

    @AlwaysInline
    public static long getLong(long address) {
        return INSTANCE.getLong(address);
    }

    @AlwaysInline
    public static void putLong(long address, long value) {
        INSTANCE.putLong(address, value);
    }

    @AlwaysInline
    public static float getFloat(long address) {
        return INSTANCE.getFloat(address);
    }

    @AlwaysInline
    public static void putFloat(long address, float value) {
        INSTANCE.putFloat(address, value);
    }

    @AlwaysInline
    public static double getDouble(long address) {
        return INSTANCE.getDouble(address);
    }

    @AlwaysInline
    public static void putDouble(long address, double value) {
        INSTANCE.putDouble(address, value);
    }

    @AlwaysInline
    public static void copyMemory(long srcAddr, long dstAddr, long bytes) {
        INSTANCE.copyMemory(srcAddr, dstAddr, bytes);
    }

    @AlwaysInline
    public static void copyMemoryToPrimitiveArray(long srcAddr, Object dst, long dstOffset, long bytes) {
        INSTANCE.copyMemoryToPrimitiveArray(srcAddr, dst, dstOffset, bytes);
    }

    @AlwaysInline
    public static void copyMemoryFromPrimitiveArray(Object src, long srcOffset, long dstAddr, long bytes) {
        INSTANCE.copyMemoryFromPrimitiveArray(src, srcOffset, dstAddr, bytes);
    }

    @AlwaysInline
    public static int getAndAddInt(Object obj, long offset, int delta) {
        return INSTANCE.getAndAddInt(obj, offset, delta);
    }

    @AlwaysInline
    public static long getAndAddLong(Object obj, long offset, long delta) {
        return INSTANCE.getAndAddLong(obj, offset, delta);
    }

    @AlwaysInline
    public static int getAndSetInt(Object obj, long offset, int newValue) {
        return INSTANCE.getAndSetInt(obj, offset, newValue);
    }

    @AlwaysInline
    public static long getAndSetLong(Object obj, long offset, long newValue) {
        return INSTANCE.getAndSetLong(obj, offset, newValue);
    }

    @AlwaysInline
    public static Object getAndSetObject(Object obj, long offset, Object newValue) {
        return INSTANCE.getAndSetObject(obj, offset, newValue);
    }

    @AlwaysInline
    public static void loadFence() {
        INSTANCE.loadFence();
    }

    @AlwaysInline
    public static void storeFence() {
        INSTANCE.storeFence();
    }

    @AlwaysInline
    public static void fullFence() {
        INSTANCE.fullFence();
    }
}
