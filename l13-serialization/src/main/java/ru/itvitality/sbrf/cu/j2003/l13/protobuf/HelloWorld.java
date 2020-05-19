// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloWorld.proto

package ru.itvitality.sbrf.cu.j2003.l13.protobuf;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HelloMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    java.util.List<java.lang.Integer> getArrayIntDataList();
    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    int getArrayIntDataCount();
    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    int getArrayIntData(int index);
  }
  /**
   * Protobuf type {@code ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage}
   */
  public  static final class HelloMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage)
      HelloMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HelloMessage.newBuilder() to construct.
    private HelloMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HelloMessage() {
      message_ = "";
      arrayIntData_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HelloMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HelloMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                arrayIntData_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              arrayIntData_.addInt(input.readInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                arrayIntData_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                arrayIntData_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          arrayIntData_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.class, ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ARRAYINTDATA_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList arrayIntData_;
    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getArrayIntDataList() {
      return arrayIntData_;
    }
    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    public int getArrayIntDataCount() {
      return arrayIntData_.size();
    }
    /**
     * <code>repeated int32 arrayIntData = 2;</code>
     */
    public int getArrayIntData(int index) {
      return arrayIntData_.getInt(index);
    }
    private int arrayIntDataMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      if (getArrayIntDataList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(arrayIntDataMemoizedSerializedSize);
      }
      for (int i = 0; i < arrayIntData_.size(); i++) {
        output.writeInt32NoTag(arrayIntData_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < arrayIntData_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(arrayIntData_.getInt(i));
        }
        size += dataSize;
        if (!getArrayIntDataList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        arrayIntDataMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage)) {
        return super.equals(obj);
      }
      ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage other = (ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage) obj;

      if (!getMessage()
          .equals(other.getMessage())) return false;
      if (!getArrayIntDataList()
          .equals(other.getArrayIntDataList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      if (getArrayIntDataCount() > 0) {
        hash = (37 * hash) + ARRAYINTDATA_FIELD_NUMBER;
        hash = (53 * hash) + getArrayIntDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage)
        ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.class, ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.Builder.class);
      }

      // Construct using ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        message_ = "";

        arrayIntData_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor;
      }

      @java.lang.Override
      public ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage getDefaultInstanceForType() {
        return ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.getDefaultInstance();
      }

      @java.lang.Override
      public ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage build() {
        ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage buildPartial() {
        ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage result = new ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage(this);
        int from_bitField0_ = bitField0_;
        result.message_ = message_;
        if (((bitField0_ & 0x00000001) != 0)) {
          arrayIntData_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.arrayIntData_ = arrayIntData_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage) {
          return mergeFrom((ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage other) {
        if (other == ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (!other.arrayIntData_.isEmpty()) {
          if (arrayIntData_.isEmpty()) {
            arrayIntData_ = other.arrayIntData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArrayIntDataIsMutable();
            arrayIntData_.addAll(other.arrayIntData_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList arrayIntData_ = emptyIntList();
      private void ensureArrayIntDataIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          arrayIntData_ = mutableCopy(arrayIntData_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public java.util.List<java.lang.Integer>
          getArrayIntDataList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(arrayIntData_) : arrayIntData_;
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public int getArrayIntDataCount() {
        return arrayIntData_.size();
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public int getArrayIntData(int index) {
        return arrayIntData_.getInt(index);
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public Builder setArrayIntData(
          int index, int value) {
        ensureArrayIntDataIsMutable();
        arrayIntData_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public Builder addArrayIntData(int value) {
        ensureArrayIntDataIsMutable();
        arrayIntData_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public Builder addAllArrayIntData(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureArrayIntDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arrayIntData_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 arrayIntData = 2;</code>
       */
      public Builder clearArrayIntData() {
        arrayIntData_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage)
    }

    // @@protoc_insertion_point(class_scope:ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloMessage)
    private static final ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage();
    }

    public static ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloMessage>
        PARSER = new com.google.protobuf.AbstractParser<HelloMessage>() {
      @java.lang.Override
      public HelloMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HelloMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HelloMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ru.itvitality.sbrf.cu.j2003.l13.protobuf.HelloWorld.HelloMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloWorld.proto\022(ru.itvitality.sbrf.c" +
      "u.j2003.l13.protobuf\"5\n\014HelloMessage\022\017\n\007" +
      "message\030\001 \001(\t\022\024\n\014arrayIntData\030\002 \003(\005B\014B\nH" +
      "elloWorldb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ru_itvitality_sbrf_cu_j2003_l13_protobuf_HelloMessage_descriptor,
        new java.lang.String[] { "Message", "ArrayIntData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
