package sun.misc;

public abstract class Unsafe {
    public abstract int arrayBaseOffset(Class<?> clazz);

    public abstract int arrayIndexScale(Class<?> clazz);

    public abstract boolean compareAndSwapInt(Object obj, long offset,
                                              int expectedValue, int newValue);

    public abstract boolean compareAndSwapLong(Object obj, long offset,
                                               long expectedValue, long newValue);

    public abstract boolean compareAndSwapObject(Object obj, long offset,
                                                 Object expectedValue, Object newValue);

    public abstract int getIntVolatile(Object obj, long offset);

    public abstract void putIntVolatile(Object obj, long offset, int newValue);

    public abstract long getLongVolatile(Object obj, long offset);

    public abstract void putLongVolatile(Object obj, long offset, long newValue);

    public abstract Object getObjectVolatile(Object obj, long offset);

    public abstract void putObjectVolatile(Object obj, long offset, Object newValue);

    public abstract int getInt(Object obj, long offset);

    public abstract void putInt(Object obj, long offset, int newValue);

    public abstract long getLong(Object obj, long offset);

    public abstract void putLong(Object obj, long offset, long newValue);

    public abstract Object getObject(Object obj, long offset);

    public abstract void putObject(Object obj, long offset, Object newValue);

    public abstract boolean getBoolean(Object obj, long offset);

    public abstract void putBoolean(Object obj, long offset, boolean newValue);

    public abstract byte getByte(Object obj, long offset);

    public abstract void putByte(Object obj, long offset, byte newValue);

    public abstract char getChar(Object obj, long offset);

    public abstract void putChar(Object obj, long offset, char newValue);

    public abstract short getShort(Object obj, long offset);

    public abstract void putShort(Object obj, long offset, short newValue);

    public abstract float getFloat(Object obj, long offset);

    public abstract void putFloat(Object obj, long offset, float newValue);

    public abstract double getDouble(Object obj, long offset);

    public abstract void putDouble(Object obj, long offset, double newValue);

    public abstract void park(boolean absolute, long time);

    public abstract void unpark(Object obj);

    public abstract Object allocateInstance(Class<?> c);

    public abstract int addressSize();

    public abstract int pageSize();

    public abstract long allocateMemory(long bytes);

    public abstract void freeMemory(long address);

    public abstract void setMemory(long address, long bytes, byte value);

    public abstract byte getByte(long address);

    public abstract void putByte(long address, byte x);

    public abstract short getShort(long address);

    public abstract void putShort(long address, short x);

    public abstract char getChar(long address);

    public abstract void putChar(long address, char x);

    public abstract int getInt(long address);

    public abstract void putInt(long address, int x);

    public abstract long getLong(long address);

    public abstract void putLong(long address, long x);

    public abstract float getFloat(long address);

    public abstract void putFloat(long address, float x);

    public abstract double getDouble(long address);

    public abstract void putDouble(long address, double x);

    public abstract void copyMemoryToPrimitiveArray(long srcAddr, Object dst,
                                                    long dstOffset, long bytes);

    public abstract void copyMemoryFromPrimitiveArray(Object src, long srcOffset,
                                                      long dstAddr, long bytes);

    public abstract void copyMemory(long srcAddr, long dstAddr, long bytes);

    public abstract int getAndAddInt(Object obj, long offset, int delta);

    public abstract long getAndAddLong(Object obj, long offset, long delta);

    public abstract int getAndSetInt(Object obj, long offset, int newValue);

    public abstract long getAndSetLong(Object obj, long offset, long newValue);

    public abstract Object getAndSetObject(Object obj, long offset, Object newValue);

    public abstract void loadFence();

    public abstract void storeFence();

    public abstract void fullFence();
}
