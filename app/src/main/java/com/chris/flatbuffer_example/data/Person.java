// automatically generated by the FlatBuffers compiler, do not modify

package com.chris.flatbuffer_example.data;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Person extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_11_1(); }
  public static Person getRootAsPerson(ByteBuffer _bb) { return getRootAsPerson(_bb, new Person()); }
  public static Person getRootAsPerson(ByteBuffer _bb, Person obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Person __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int bloodVolume() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public double speed() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean canFly() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public com.chris.flatbuffer_example.data.Bag bag() { return bag(new com.chris.flatbuffer_example.data.Bag()); }
  public com.chris.flatbuffer_example.data.Bag bag(com.chris.flatbuffer_example.data.Bag obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public com.chris.flatbuffer_example.data.Weapon weapons(int j) { return weapons(new com.chris.flatbuffer_example.data.Weapon(), j); }
  public com.chris.flatbuffer_example.data.Weapon weapons(com.chris.flatbuffer_example.data.Weapon obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int weaponsLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public com.chris.flatbuffer_example.data.Weapon.Vector weaponsVector() { return weaponsVector(new com.chris.flatbuffer_example.data.Weapon.Vector()); }
  public com.chris.flatbuffer_example.data.Weapon.Vector weaponsVector(com.chris.flatbuffer_example.data.Weapon.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String accessories(int j) { int o = __offset(16); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int accessoriesLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public StringVector accessoriesVector() { return accessoriesVector(new StringVector()); }
  public StringVector accessoriesVector(StringVector obj) { int o = __offset(16); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createPerson(FlatBufferBuilder builder,
      int nameOffset,
      int bloodVolume,
      double speed,
      boolean canFly,
      int bagOffset,
      int weaponsOffset,
      int accessoriesOffset) {
    builder.startTable(7);
    Person.addSpeed(builder, speed);
    Person.addAccessories(builder, accessoriesOffset);
    Person.addWeapons(builder, weaponsOffset);
    Person.addBag(builder, bagOffset);
    Person.addBloodVolume(builder, bloodVolume);
    Person.addName(builder, nameOffset);
    Person.addCanFly(builder, canFly);
    return Person.endPerson(builder);
  }

  public static void startPerson(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addBloodVolume(FlatBufferBuilder builder, int bloodVolume) { builder.addInt(1, bloodVolume, 0); }
  public static void addSpeed(FlatBufferBuilder builder, double speed) { builder.addDouble(2, speed, 0.0); }
  public static void addCanFly(FlatBufferBuilder builder, boolean canFly) { builder.addBoolean(3, canFly, false); }
  public static void addBag(FlatBufferBuilder builder, int bagOffset) { builder.addOffset(4, bagOffset, 0); }
  public static void addWeapons(FlatBufferBuilder builder, int weaponsOffset) { builder.addOffset(5, weaponsOffset, 0); }
  public static int createWeaponsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startWeaponsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addAccessories(FlatBufferBuilder builder, int accessoriesOffset) { builder.addOffset(6, accessoriesOffset, 0); }
  public static int createAccessoriesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAccessoriesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPerson(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishPersonBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedPersonBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Person get(int j) { return get(new Person(), j); }
    public Person get(Person obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

