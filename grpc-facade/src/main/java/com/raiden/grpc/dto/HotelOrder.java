//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.raiden.grpc.dto;

import com.google.protobuf.*;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HotelOrder {
    private static final Descriptor internal_static_Order_descriptor;
    private static final FieldAccessorTable internal_static_Order_fieldAccessorTable;
    private static final Descriptor internal_static_OrderDetail_descriptor;
    private static final FieldAccessorTable internal_static_OrderDetail_fieldAccessorTable;
    private static FileDescriptor descriptor;

    private HotelOrder() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        String[] descriptorData = new String[]{"\n\u000bmodel.proto\"\u0084\u0001\n\u0005Order\u0012\u0011\n\tserialize\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007orderId\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005resNo\u0018\u0003 \u0001(\t\u0012\u0010\n\buserName\u0018\u0004 \u0001(\t\u0012\u0012\n\ncreateDate\u0018\u0005 \u0001(\t\u0012\"\n\forderDetails\u0018\u0006 \u0003(\u000b2\f.OrderDetail\"N\n\u000bOrderDetail\u0012\r\n\u0005resNo\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007hotelId\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007roomNos\u0018\u0003 \u0003(\t\u0012\u000e\n\u0006amount\u0018\u0004 \u0001(\u0001B\"\n\u0012com.anoyi.grpc.dtoB\nHotelOrderP\u0000b\u0006proto3"};
        InternalDescriptorAssigner assigner = new InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(FileDescriptor root) {
                HotelOrder.descriptor = root;
                return null;
            }
        };
        FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0], assigner);
        internal_static_Order_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
        internal_static_Order_fieldAccessorTable = new FieldAccessorTable(internal_static_Order_descriptor, new String[]{"Serialize", "OrderId", "ResNo", "UserName", "CreateDate", "OrderDetails"});
        internal_static_OrderDetail_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
        internal_static_OrderDetail_fieldAccessorTable = new FieldAccessorTable(internal_static_OrderDetail_descriptor, new String[]{"ResNo", "HotelId", "RoomNos", "Amount"});
    }

    public static final class OrderDetail extends GeneratedMessageV3 implements HotelOrder.OrderDetailOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int RESNO_FIELD_NUMBER = 1;
        private volatile Object resNo_;
        public static final int HOTELID_FIELD_NUMBER = 2;
        private volatile Object hotelId_;
        public static final int ROOMNOS_FIELD_NUMBER = 3;
        private LazyStringList roomNos_;
        public static final int AMOUNT_FIELD_NUMBER = 4;
        private double amount_;
        private byte memoizedIsInitialized;
        private static final HotelOrder.OrderDetail DEFAULT_INSTANCE = new HotelOrder.OrderDetail();
        private static final Parser<OrderDetail> PARSER = new AbstractParser<OrderDetail>() {
            public HotelOrder.OrderDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new HotelOrder.OrderDetail(input, extensionRegistry);
            }
        };

        private OrderDetail(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private OrderDetail() {
            this.memoizedIsInitialized = -1;
            this.resNo_ = "";
            this.hotelId_ = "";
            this.roomNos_ = new LazyStringArrayList();
            this.amount_ = 0.0D;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OrderDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                int mutable_bitField0_ = 0;
                UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        String s;
                        switch(tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            s = input.readStringRequireUtf8();
                            this.resNo_ = s;
                            break;
                        case 18:
                            s = input.readStringRequireUtf8();
                            this.hotelId_ = s;
                            break;
                        case 26:
                            s = input.readStringRequireUtf8();
                            if ((mutable_bitField0_ & 4) != 4) {
                                this.roomNos_ = new LazyStringArrayList();
                                mutable_bitField0_ |= 4;
                            }

                            this.roomNos_.add(s);
                            break;
                        case 33:
                            this.amount_ = input.readDouble();
                            break;
                        default:
                            if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException var12) {
                    throw var12.setUnfinishedMessage(this);
                } catch (IOException var13) {
                    throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
                } finally {
                    if ((mutable_bitField0_ & 4) == 4) {
                        this.roomNos_ = this.roomNos_.getUnmodifiableView();
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static final Descriptor getDescriptor() {
            return HotelOrder.internal_static_OrderDetail_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HotelOrder.internal_static_OrderDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(HotelOrder.OrderDetail.class, HotelOrder.OrderDetail.Builder.class);
        }

        public String getResNo() {
            Object ref = this.resNo_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.resNo_ = s;
                return s;
            }
        }

        public ByteString getResNoBytes() {
            Object ref = this.resNo_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.resNo_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public String getHotelId() {
            Object ref = this.hotelId_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.hotelId_ = s;
                return s;
            }
        }

        public ByteString getHotelIdBytes() {
            Object ref = this.hotelId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.hotelId_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public ProtocolStringList getRoomNosList() {
            return this.roomNos_;
        }

        public int getRoomNosCount() {
            return this.roomNos_.size();
        }

        public String getRoomNos(int index) {
            return (String)this.roomNos_.get(index);
        }

        public ByteString getRoomNosBytes(int index) {
            return this.roomNos_.getByteString(index);
        }

        public double getAmount() {
            return this.amount_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if (!this.getResNoBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.resNo_);
            }

            if (!this.getHotelIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.hotelId_);
            }

            for(int i = 0; i < this.roomNos_.size(); ++i) {
                GeneratedMessageV3.writeString(output, 3, this.roomNos_.getRaw(i));
            }

            if (this.amount_ != 0.0D) {
                output.writeDouble(4, this.amount_);
            }

            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (!this.getResNoBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.resNo_);
                }

                if (!this.getHotelIdBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.hotelId_);
                }

                int dataSize = 0;

                for(int i = 0; i < this.roomNos_.size(); ++i) {
                    dataSize += computeStringSizeNoTag(this.roomNos_.getRaw(i));
                }

                size += dataSize;
                size += 1 * this.getRoomNosList().size();
                if (this.amount_ != 0.0D) {
                    size += CodedOutputStream.computeDoubleSize(4, this.amount_);
                }

                size += this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof HotelOrder.OrderDetail)) {
                return super.equals(obj);
            } else {
                HotelOrder.OrderDetail other = (HotelOrder.OrderDetail)obj;
                boolean result = true;
                result = result && this.getResNo().equals(other.getResNo());
                result = result && this.getHotelId().equals(other.getHotelId());
                result = result && this.getRoomNosList().equals(other.getRoomNosList());
                result = result && Double.doubleToLongBits(this.getAmount()) == Double.doubleToLongBits(other.getAmount());
                result = result && this.unknownFields.equals(other.unknownFields);
                return result;
            }
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash1 = 41;
                int hash = 19 * hash1 + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getResNo().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getHotelId().hashCode();
                if (this.getRoomNosCount() > 0) {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + this.getRoomNosList().hashCode();
                }

                hash = 37 * hash + 4;
                hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getAmount()));
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static HotelOrder.OrderDetail parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data);
        }

        public static HotelOrder.OrderDetail parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.OrderDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data);
        }

        public static HotelOrder.OrderDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.OrderDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data);
        }

        public static HotelOrder.OrderDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.OrderDetail)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.OrderDetail parseFrom(InputStream input) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HotelOrder.OrderDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static HotelOrder.OrderDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static HotelOrder.OrderDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static HotelOrder.OrderDetail parseFrom(CodedInputStream input) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HotelOrder.OrderDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.OrderDetail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public HotelOrder.OrderDetail.Builder newBuilderForType() {
            return newBuilder();
        }

        public static HotelOrder.OrderDetail.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HotelOrder.OrderDetail.Builder newBuilder(HotelOrder.OrderDetail prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public HotelOrder.OrderDetail.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new HotelOrder.OrderDetail.Builder() : (new HotelOrder.OrderDetail.Builder()).mergeFrom(this);
        }

        protected HotelOrder.OrderDetail.Builder newBuilderForType(BuilderParent parent) {
            HotelOrder.OrderDetail.Builder builder = new HotelOrder.OrderDetail.Builder(parent);
            return builder;
        }

        public static HotelOrder.OrderDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OrderDetail> parser() {
            return PARSER;
        }

        public Parser<OrderDetail> getParserForType() {
            return PARSER;
        }

        public HotelOrder.OrderDetail getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HotelOrder.OrderDetailOrBuilder {
            private int bitField0_;
            private Object resNo_;
            private Object hotelId_;
            private LazyStringList roomNos_;
            private double amount_;

            public static final Descriptor getDescriptor() {
                return HotelOrder.internal_static_OrderDetail_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HotelOrder.internal_static_OrderDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(HotelOrder.OrderDetail.class, HotelOrder.OrderDetail.Builder.class);
            }

            private Builder() {
                this.resNo_ = "";
                this.hotelId_ = "";
                this.roomNos_ = LazyStringArrayList.EMPTY;
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.resNo_ = "";
                this.hotelId_ = "";
                this.roomNos_ = LazyStringArrayList.EMPTY;
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (HotelOrder.OrderDetail.alwaysUseFieldBuilders) {
                }

            }

            public HotelOrder.OrderDetail.Builder clear() {
                super.clear();
                this.resNo_ = "";
                this.hotelId_ = "";
                this.roomNos_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.amount_ = 0.0D;
                return this;
            }

            public Descriptor getDescriptorForType() {
                return HotelOrder.internal_static_OrderDetail_descriptor;
            }

            public HotelOrder.OrderDetail getDefaultInstanceForType() {
                return HotelOrder.OrderDetail.getDefaultInstance();
            }

            public HotelOrder.OrderDetail build() {
                HotelOrder.OrderDetail result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public HotelOrder.OrderDetail buildPartial() {
                HotelOrder.OrderDetail result = new HotelOrder.OrderDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                result.resNo_ = this.resNo_;
                result.hotelId_ = this.hotelId_;
                if ((this.bitField0_ & 4) == 4) {
                    this.roomNos_ = this.roomNos_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }

                result.roomNos_ = this.roomNos_;
                result.amount_ = this.amount_;
                result.bitField0_ = to_bitField0_;
                this.onBuilt();
                return result;
            }

            public HotelOrder.OrderDetail.Builder clone() {
                return (HotelOrder.OrderDetail.Builder)super.clone();
            }

            public HotelOrder.OrderDetail.Builder setField(FieldDescriptor field, Object value) {
                return (HotelOrder.OrderDetail.Builder)super.setField(field, value);
            }

            public HotelOrder.OrderDetail.Builder clearField(FieldDescriptor field) {
                return (HotelOrder.OrderDetail.Builder)super.clearField(field);
            }

            public HotelOrder.OrderDetail.Builder clearOneof(OneofDescriptor oneof) {
                return (HotelOrder.OrderDetail.Builder)super.clearOneof(oneof);
            }

            public HotelOrder.OrderDetail.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
                return (HotelOrder.OrderDetail.Builder)super.setRepeatedField(field, index, value);
            }

            public HotelOrder.OrderDetail.Builder addRepeatedField(FieldDescriptor field, Object value) {
                return (HotelOrder.OrderDetail.Builder)super.addRepeatedField(field, value);
            }

            public HotelOrder.OrderDetail.Builder mergeFrom(Message other) {
                if (other instanceof HotelOrder.OrderDetail) {
                    return this.mergeFrom((HotelOrder.OrderDetail)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public HotelOrder.OrderDetail.Builder mergeFrom(HotelOrder.OrderDetail other) {
                if (other == HotelOrder.OrderDetail.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getResNo().isEmpty()) {
                        this.resNo_ = other.resNo_;
                        this.onChanged();
                    }

                    if (!other.getHotelId().isEmpty()) {
                        this.hotelId_ = other.hotelId_;
                        this.onChanged();
                    }

                    if (!other.roomNos_.isEmpty()) {
                        if (this.roomNos_.isEmpty()) {
                            this.roomNos_ = other.roomNos_;
                            this.bitField0_ &= -5;
                        } else {
                            this.ensureRoomNosIsMutable();
                            this.roomNos_.addAll(other.roomNos_);
                        }

                        this.onChanged();
                    }

                    if (other.getAmount() != 0.0D) {
                        this.setAmount(other.getAmount());
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public HotelOrder.OrderDetail.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                HotelOrder.OrderDetail parsedMessage = null;

                try {
                    parsedMessage = (HotelOrder.OrderDetail)HotelOrder.OrderDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (HotelOrder.OrderDetail)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public String getResNo() {
                Object ref = this.resNo_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.resNo_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getResNoBytes() {
                Object ref = this.resNo_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.resNo_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HotelOrder.OrderDetail.Builder setResNo(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.resNo_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.OrderDetail.Builder clearResNo() {
                this.resNo_ = HotelOrder.OrderDetail.getDefaultInstance().getResNo();
                this.onChanged();
                return this;
            }

            public HotelOrder.OrderDetail.Builder setResNoBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.OrderDetail.checkByteStringIsUtf8(value);
                    this.resNo_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public String getHotelId() {
                Object ref = this.hotelId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.hotelId_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getHotelIdBytes() {
                Object ref = this.hotelId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.hotelId_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HotelOrder.OrderDetail.Builder setHotelId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.hotelId_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.OrderDetail.Builder clearHotelId() {
                this.hotelId_ = HotelOrder.OrderDetail.getDefaultInstance().getHotelId();
                this.onChanged();
                return this;
            }

            public HotelOrder.OrderDetail.Builder setHotelIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.OrderDetail.checkByteStringIsUtf8(value);
                    this.hotelId_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureRoomNosIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.roomNos_ = new LazyStringArrayList(this.roomNos_);
                    this.bitField0_ |= 4;
                }

            }

            public ProtocolStringList getRoomNosList() {
                return this.roomNos_.getUnmodifiableView();
            }

            public int getRoomNosCount() {
                return this.roomNos_.size();
            }

            public String getRoomNos(int index) {
                return (String)this.roomNos_.get(index);
            }

            public ByteString getRoomNosBytes(int index) {
                return this.roomNos_.getByteString(index);
            }

            public HotelOrder.OrderDetail.Builder setRoomNos(int index, String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.ensureRoomNosIsMutable();
                    this.roomNos_.set(index, value);
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.OrderDetail.Builder addRoomNos(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.ensureRoomNosIsMutable();
                    this.roomNos_.add(value);
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.OrderDetail.Builder addAllRoomNos(Iterable<String> values) {
                this.ensureRoomNosIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.roomNos_);
                this.onChanged();
                return this;
            }

            public HotelOrder.OrderDetail.Builder clearRoomNos() {
                this.roomNos_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.onChanged();
                return this;
            }

            public HotelOrder.OrderDetail.Builder addRoomNosBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.OrderDetail.checkByteStringIsUtf8(value);
                    this.ensureRoomNosIsMutable();
                    this.roomNos_.add(value);
                    this.onChanged();
                    return this;
                }
            }

            public double getAmount() {
                return this.amount_;
            }

            public HotelOrder.OrderDetail.Builder setAmount(double value) {
                this.amount_ = value;
                this.onChanged();
                return this;
            }

            public HotelOrder.OrderDetail.Builder clearAmount() {
                this.amount_ = 0.0D;
                this.onChanged();
                return this;
            }

            public final HotelOrder.OrderDetail.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (HotelOrder.OrderDetail.Builder)super.setUnknownFieldsProto3(unknownFields);
            }

            public final HotelOrder.OrderDetail.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (HotelOrder.OrderDetail.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public interface OrderDetailOrBuilder extends MessageOrBuilder {
        String getResNo();

        ByteString getResNoBytes();

        String getHotelId();

        ByteString getHotelIdBytes();

        List<String> getRoomNosList();

        int getRoomNosCount();

        String getRoomNos(int var1);

        ByteString getRoomNosBytes(int var1);

        double getAmount();
    }

    public static final class Order extends GeneratedMessageV3 implements HotelOrder.OrderOrBuilder {
        private static final long serialVersionUID = 0L;
        private int bitField0_;
        public static final int SERIALIZE_FIELD_NUMBER = 1;
        private int serialize_;
        public static final int ORDERID_FIELD_NUMBER = 2;
        private int orderId_;
        public static final int RESNO_FIELD_NUMBER = 3;
        private volatile Object resNo_;
        public static final int USERNAME_FIELD_NUMBER = 4;
        private volatile Object userName_;
        public static final int CREATEDATE_FIELD_NUMBER = 5;
        private volatile Object createDate_;
        public static final int ORDERDETAILS_FIELD_NUMBER = 6;
        private List<OrderDetail> orderDetails_;
        private byte memoizedIsInitialized;
        private static final HotelOrder.Order DEFAULT_INSTANCE = new HotelOrder.Order();
        private static final Parser<Order> PARSER = new AbstractParser<Order>() {
            public HotelOrder.Order parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new HotelOrder.Order(input, extensionRegistry);
            }
        };

        private Order(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Order() {
            this.memoizedIsInitialized = -1;
            this.serialize_ = 0;
            this.orderId_ = 0;
            this.resNo_ = "";
            this.userName_ = "";
            this.createDate_ = "";
            this.orderDetails_ = new ArrayList<>();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Order(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            } else {
                int mutable_bitField0_ = 0;
                UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

                try {
                    boolean done = false;

                    while(!done) {
                        int tag = input.readTag();
                        String s;
                        switch(tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.serialize_ = input.readInt32();
                            break;
                        case 16:
                            this.orderId_ = input.readInt32();
                            break;
                        case 26:
                            s = input.readStringRequireUtf8();
                            this.resNo_ = s;
                            break;
                        case 34:
                            s = input.readStringRequireUtf8();
                            this.userName_ = s;
                            break;
                        case 42:
                            s = input.readStringRequireUtf8();
                            this.createDate_ = s;
                            break;
                        case 50:
                            if ((mutable_bitField0_ & 32) != 32) {
                                this.orderDetails_ = new ArrayList();
                                mutable_bitField0_ |= 32;
                            }

                            this.orderDetails_.add(input.readMessage(HotelOrder.OrderDetail.parser(), extensionRegistry));
                            break;
                        default:
                            if (!this.parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                        }
                    }
                } catch (InvalidProtocolBufferException var12) {
                    throw var12.setUnfinishedMessage(this);
                } catch (IOException var13) {
                    throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
                } finally {
                    if ((mutable_bitField0_ & 32) == 32) {
                        this.orderDetails_ = Collections.unmodifiableList(this.orderDetails_);
                    }

                    this.unknownFields = unknownFields.build();
                    this.makeExtensionsImmutable();
                }

            }
        }

        public static final Descriptor getDescriptor() {
            return HotelOrder.internal_static_Order_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HotelOrder.internal_static_Order_fieldAccessorTable.ensureFieldAccessorsInitialized(HotelOrder.Order.class, HotelOrder.Order.Builder.class);
        }

        public int getSerialize() {
            return this.serialize_;
        }

        public int getOrderId() {
            return this.orderId_;
        }

        public String getResNo() {
            Object ref = this.resNo_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.resNo_ = s;
                return s;
            }
        }

        public ByteString getResNoBytes() {
            Object ref = this.resNo_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.resNo_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public String getUserName() {
            Object ref = this.userName_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.userName_ = s;
                return s;
            }
        }

        public ByteString getUserNameBytes() {
            Object ref = this.userName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.userName_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public String getCreateDate() {
            Object ref = this.createDate_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.createDate_ = s;
                return s;
            }
        }

        public ByteString getCreateDateBytes() {
            Object ref = this.createDate_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.createDate_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public List<OrderDetail> getOrderDetailsList() {
            return this.orderDetails_;
        }

        public List<? extends OrderDetailOrBuilder> getOrderDetailsOrBuilderList() {
            return this.orderDetails_;
        }

        public int getOrderDetailsCount() {
            return this.orderDetails_.size();
        }

        public HotelOrder.OrderDetail getOrderDetails(int index) {
            return (HotelOrder.OrderDetail)this.orderDetails_.get(index);
        }

        public HotelOrder.OrderDetailOrBuilder getOrderDetailsOrBuilder(int index) {
            return (HotelOrder.OrderDetailOrBuilder)this.orderDetails_.get(index);
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if (this.serialize_ != 0) {
                output.writeInt32(1, this.serialize_);
            }

            if (this.orderId_ != 0) {
                output.writeInt32(2, this.orderId_);
            }

            if (!this.getResNoBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.resNo_);
            }

            if (!this.getUserNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 4, this.userName_);
            }

            if (!this.getCreateDateBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 5, this.createDate_);
            }

            for(int i = 0; i < this.orderDetails_.size(); ++i) {
                output.writeMessage(6, (MessageLite)this.orderDetails_.get(i));
            }

            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (this.serialize_ != 0) {
                    size += CodedOutputStream.computeInt32Size(1, this.serialize_);
                }

                if (this.orderId_ != 0) {
                    size += CodedOutputStream.computeInt32Size(2, this.orderId_);
                }

                if (!this.getResNoBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.resNo_);
                }

                if (!this.getUserNameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(4, this.userName_);
                }

                if (!this.getCreateDateBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(5, this.createDate_);
                }

                for(int i = 0; i < this.orderDetails_.size(); ++i) {
                    size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.orderDetails_.get(i));
                }

                size += this.unknownFields.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof HotelOrder.Order)) {
                return super.equals(obj);
            } else {
                HotelOrder.Order other = (HotelOrder.Order)obj;
                boolean result = true;
                result = result && this.getSerialize() == other.getSerialize();
                result = result && this.getOrderId() == other.getOrderId();
                result = result && this.getResNo().equals(other.getResNo());
                result = result && this.getUserName().equals(other.getUserName());
                result = result && this.getCreateDate().equals(other.getCreateDate());
                result = result && this.getOrderDetailsList().equals(other.getOrderDetailsList());
                result = result && this.unknownFields.equals(other.unknownFields);
                return result;
            }
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash1 = 41;
                int hash = 19 * hash1 + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getSerialize();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getOrderId();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getResNo().hashCode();
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getUserName().hashCode();
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getCreateDate().hashCode();
                if (this.getOrderDetailsCount() > 0) {
                    hash = 37 * hash + 6;
                    hash = 53 * hash + this.getOrderDetailsList().hashCode();
                }

                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static HotelOrder.Order parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data);
        }

        public static HotelOrder.Order parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.Order parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data);
        }

        public static HotelOrder.Order parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.Order parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data);
        }

        public static HotelOrder.Order parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HotelOrder.Order)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HotelOrder.Order parseFrom(InputStream input) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HotelOrder.Order parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static HotelOrder.Order parseDelimitedFrom(InputStream input) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static HotelOrder.Order parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static HotelOrder.Order parseFrom(CodedInputStream input) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HotelOrder.Order parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HotelOrder.Order)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public HotelOrder.Order.Builder newBuilderForType() {
            return newBuilder();
        }

        public static HotelOrder.Order.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HotelOrder.Order.Builder newBuilder(HotelOrder.Order prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public HotelOrder.Order.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new HotelOrder.Order.Builder() : (new HotelOrder.Order.Builder()).mergeFrom(this);
        }

        protected HotelOrder.Order.Builder newBuilderForType(BuilderParent parent) {
            HotelOrder.Order.Builder builder = new HotelOrder.Order.Builder(parent);
            return builder;
        }

        public static HotelOrder.Order getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Order> parser() {
            return PARSER;
        }

        public Parser<Order> getParserForType() {
            return PARSER;
        }

        public HotelOrder.Order getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HotelOrder.OrderOrBuilder {
            private int bitField0_;
            private int serialize_;
            private int orderId_;
            private Object resNo_;
            private Object userName_;
            private Object createDate_;
            private List<OrderDetail> orderDetails_;
            private RepeatedFieldBuilderV3<OrderDetail, OrderDetail.Builder, OrderDetailOrBuilder> orderDetailsBuilder_;

            public static final Descriptor getDescriptor() {
                return HotelOrder.internal_static_Order_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HotelOrder.internal_static_Order_fieldAccessorTable.ensureFieldAccessorsInitialized(HotelOrder.Order.class, HotelOrder.Order.Builder.class);
            }

            private Builder() {
                this.resNo_ = "";
                this.userName_ = "";
                this.createDate_ = "";
                this.orderDetails_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.resNo_ = "";
                this.userName_ = "";
                this.createDate_ = "";
                this.orderDetails_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (HotelOrder.Order.alwaysUseFieldBuilders) {
                    this.getOrderDetailsFieldBuilder();
                }

            }

            public HotelOrder.Order.Builder clear() {
                super.clear();
                this.serialize_ = 0;
                this.orderId_ = 0;
                this.resNo_ = "";
                this.userName_ = "";
                this.createDate_ = "";
                if (this.orderDetailsBuilder_ == null) {
                    this.orderDetails_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    this.orderDetailsBuilder_.clear();
                }

                return this;
            }

            public Descriptor getDescriptorForType() {
                return HotelOrder.internal_static_Order_descriptor;
            }

            public HotelOrder.Order getDefaultInstanceForType() {
                return HotelOrder.Order.getDefaultInstance();
            }

            public HotelOrder.Order build() {
                HotelOrder.Order result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public HotelOrder.Order buildPartial() {
                HotelOrder.Order result = new HotelOrder.Order(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                result.serialize_ = this.serialize_;
                result.orderId_ = this.orderId_;
                result.resNo_ = this.resNo_;
                result.userName_ = this.userName_;
                result.createDate_ = this.createDate_;
                if (this.orderDetailsBuilder_ == null) {
                    if ((this.bitField0_ & 32) == 32) {
                        this.orderDetails_ = Collections.unmodifiableList(this.orderDetails_);
                        this.bitField0_ &= -33;
                    }

                    result.orderDetails_ = this.orderDetails_;
                } else {
                    result.orderDetails_ = this.orderDetailsBuilder_.build();
                }

                result.bitField0_ = to_bitField0_;
                this.onBuilt();
                return result;
            }

            public HotelOrder.Order.Builder clone() {
                return (HotelOrder.Order.Builder)super.clone();
            }

            public HotelOrder.Order.Builder setField(FieldDescriptor field, Object value) {
                return (HotelOrder.Order.Builder)super.setField(field, value);
            }

            public HotelOrder.Order.Builder clearField(FieldDescriptor field) {
                return (HotelOrder.Order.Builder)super.clearField(field);
            }

            public HotelOrder.Order.Builder clearOneof(OneofDescriptor oneof) {
                return (HotelOrder.Order.Builder)super.clearOneof(oneof);
            }

            public HotelOrder.Order.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
                return (HotelOrder.Order.Builder)super.setRepeatedField(field, index, value);
            }

            public HotelOrder.Order.Builder addRepeatedField(FieldDescriptor field, Object value) {
                return (HotelOrder.Order.Builder)super.addRepeatedField(field, value);
            }

            public HotelOrder.Order.Builder mergeFrom(Message other) {
                if (other instanceof HotelOrder.Order) {
                    return this.mergeFrom((HotelOrder.Order)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public HotelOrder.Order.Builder mergeFrom(HotelOrder.Order other) {
                if (other == HotelOrder.Order.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getSerialize() != 0) {
                        this.setSerialize(other.getSerialize());
                    }

                    if (other.getOrderId() != 0) {
                        this.setOrderId(other.getOrderId());
                    }

                    if (!other.getResNo().isEmpty()) {
                        this.resNo_ = other.resNo_;
                        this.onChanged();
                    }

                    if (!other.getUserName().isEmpty()) {
                        this.userName_ = other.userName_;
                        this.onChanged();
                    }

                    if (!other.getCreateDate().isEmpty()) {
                        this.createDate_ = other.createDate_;
                        this.onChanged();
                    }

                    if (this.orderDetailsBuilder_ == null) {
                        if (!other.orderDetails_.isEmpty()) {
                            if (this.orderDetails_.isEmpty()) {
                                this.orderDetails_ = other.orderDetails_;
                                this.bitField0_ &= -33;
                            } else {
                                this.ensureOrderDetailsIsMutable();
                                this.orderDetails_.addAll(other.orderDetails_);
                            }

                            this.onChanged();
                        }
                    } else if (!other.orderDetails_.isEmpty()) {
                        if (this.orderDetailsBuilder_.isEmpty()) {
                            this.orderDetailsBuilder_.dispose();
                            this.orderDetailsBuilder_ = null;
                            this.orderDetails_ = other.orderDetails_;
                            this.bitField0_ &= -33;
                            this.orderDetailsBuilder_ = HotelOrder.Order.alwaysUseFieldBuilders ? this.getOrderDetailsFieldBuilder() : null;
                        } else {
                            this.orderDetailsBuilder_.addAllMessages(other.orderDetails_);
                        }
                    }

                    this.mergeUnknownFields(other.unknownFields);
                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public HotelOrder.Order.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                HotelOrder.Order parsedMessage = null;

                try {
                    parsedMessage = (HotelOrder.Order)HotelOrder.Order.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (HotelOrder.Order)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getSerialize() {
                return this.serialize_;
            }

            public HotelOrder.Order.Builder setSerialize(int value) {
                this.serialize_ = value;
                this.onChanged();
                return this;
            }

            public HotelOrder.Order.Builder clearSerialize() {
                this.serialize_ = 0;
                this.onChanged();
                return this;
            }

            public int getOrderId() {
                return this.orderId_;
            }

            public HotelOrder.Order.Builder setOrderId(int value) {
                this.orderId_ = value;
                this.onChanged();
                return this;
            }

            public HotelOrder.Order.Builder clearOrderId() {
                this.orderId_ = 0;
                this.onChanged();
                return this;
            }

            public String getResNo() {
                Object ref = this.resNo_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.resNo_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getResNoBytes() {
                Object ref = this.resNo_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.resNo_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HotelOrder.Order.Builder setResNo(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.resNo_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.Order.Builder clearResNo() {
                this.resNo_ = HotelOrder.Order.getDefaultInstance().getResNo();
                this.onChanged();
                return this;
            }

            public HotelOrder.Order.Builder setResNoBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.Order.checkByteStringIsUtf8(value);
                    this.resNo_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public String getUserName() {
                Object ref = this.userName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.userName_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getUserNameBytes() {
                Object ref = this.userName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.userName_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HotelOrder.Order.Builder setUserName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.userName_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.Order.Builder clearUserName() {
                this.userName_ = HotelOrder.Order.getDefaultInstance().getUserName();
                this.onChanged();
                return this;
            }

            public HotelOrder.Order.Builder setUserNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.Order.checkByteStringIsUtf8(value);
                    this.userName_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public String getCreateDate() {
                Object ref = this.createDate_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.createDate_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getCreateDateBytes() {
                Object ref = this.createDate_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.createDate_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HotelOrder.Order.Builder setCreateDate(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.createDate_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HotelOrder.Order.Builder clearCreateDate() {
                this.createDate_ = HotelOrder.Order.getDefaultInstance().getCreateDate();
                this.onChanged();
                return this;
            }

            public HotelOrder.Order.Builder setCreateDateBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HotelOrder.Order.checkByteStringIsUtf8(value);
                    this.createDate_ = value;
                    this.onChanged();
                    return this;
                }
            }

            private void ensureOrderDetailsIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.orderDetails_ = new ArrayList(this.orderDetails_);
                    this.bitField0_ |= 32;
                }

            }

            public List<OrderDetail> getOrderDetailsList() {
                return this.orderDetailsBuilder_ == null ? Collections.unmodifiableList(this.orderDetails_) : this.orderDetailsBuilder_.getMessageList();
            }

            public int getOrderDetailsCount() {
                return this.orderDetailsBuilder_ == null ? this.orderDetails_.size() : this.orderDetailsBuilder_.getCount();
            }

            public HotelOrder.OrderDetail getOrderDetails(int index) {
                return this.orderDetailsBuilder_ == null ? (HotelOrder.OrderDetail)this.orderDetails_.get(index) : (HotelOrder.OrderDetail)this.orderDetailsBuilder_.getMessage(index);
            }

            public HotelOrder.Order.Builder setOrderDetails(int index, HotelOrder.OrderDetail value) {
                if (this.orderDetailsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.set(index, value);
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.setMessage(index, value);
                }

                return this;
            }

            public HotelOrder.Order.Builder setOrderDetails(int index, HotelOrder.OrderDetail.Builder builderForValue) {
                if (this.orderDetailsBuilder_ == null) {
                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.set(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.setMessage(index, builderForValue.build());
                }

                return this;
            }

            public HotelOrder.Order.Builder addOrderDetails(HotelOrder.OrderDetail value) {
                if (this.orderDetailsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.add(value);
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.addMessage(value);
                }

                return this;
            }

            public HotelOrder.Order.Builder addOrderDetails(int index, HotelOrder.OrderDetail value) {
                if (this.orderDetailsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.add(index, value);
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.addMessage(index, value);
                }

                return this;
            }

            public HotelOrder.Order.Builder addOrderDetails(HotelOrder.OrderDetail.Builder builderForValue) {
                if (this.orderDetailsBuilder_ == null) {
                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.add(builderForValue.build());
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.addMessage(builderForValue.build());
                }

                return this;
            }

            public HotelOrder.Order.Builder addOrderDetails(int index, HotelOrder.OrderDetail.Builder builderForValue) {
                if (this.orderDetailsBuilder_ == null) {
                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.add(index, builderForValue.build());
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.addMessage(index, builderForValue.build());
                }

                return this;
            }

            public HotelOrder.Order.Builder addAllOrderDetails(Iterable<? extends OrderDetail> values) {
                if (this.orderDetailsBuilder_ == null) {
                    this.ensureOrderDetailsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.orderDetails_);
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.addAllMessages(values);
                }

                return this;
            }

            public HotelOrder.Order.Builder clearOrderDetails() {
                if (this.orderDetailsBuilder_ == null) {
                    this.orderDetails_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.clear();
                }

                return this;
            }

            public HotelOrder.Order.Builder removeOrderDetails(int index) {
                if (this.orderDetailsBuilder_ == null) {
                    this.ensureOrderDetailsIsMutable();
                    this.orderDetails_.remove(index);
                    this.onChanged();
                } else {
                    this.orderDetailsBuilder_.remove(index);
                }

                return this;
            }

            public HotelOrder.OrderDetail.Builder getOrderDetailsBuilder(int index) {
                return (HotelOrder.OrderDetail.Builder)this.getOrderDetailsFieldBuilder().getBuilder(index);
            }

            public HotelOrder.OrderDetailOrBuilder getOrderDetailsOrBuilder(int index) {
                return this.orderDetailsBuilder_ == null ? (HotelOrder.OrderDetailOrBuilder)this.orderDetails_.get(index) : (HotelOrder.OrderDetailOrBuilder)this.orderDetailsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends OrderDetailOrBuilder> getOrderDetailsOrBuilderList() {
                return this.orderDetailsBuilder_ != null ? this.orderDetailsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.orderDetails_);
            }

            public HotelOrder.OrderDetail.Builder addOrderDetailsBuilder() {
                return (HotelOrder.OrderDetail.Builder)this.getOrderDetailsFieldBuilder().addBuilder(HotelOrder.OrderDetail.getDefaultInstance());
            }

            public HotelOrder.OrderDetail.Builder addOrderDetailsBuilder(int index) {
                return (HotelOrder.OrderDetail.Builder)this.getOrderDetailsFieldBuilder().addBuilder(index, HotelOrder.OrderDetail.getDefaultInstance());
            }

            public List<OrderDetail.Builder> getOrderDetailsBuilderList() {
                return this.getOrderDetailsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<OrderDetail, OrderDetail.Builder, OrderDetailOrBuilder> getOrderDetailsFieldBuilder() {
                if (this.orderDetailsBuilder_ == null) {
                    this.orderDetailsBuilder_ = new RepeatedFieldBuilderV3(this.orderDetails_, (this.bitField0_ & 32) == 32, this.getParentForChildren(), this.isClean());
                    this.orderDetails_ = null;
                }

                return this.orderDetailsBuilder_;
            }

            public final HotelOrder.Order.Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (HotelOrder.Order.Builder)super.setUnknownFieldsProto3(unknownFields);
            }

            public final HotelOrder.Order.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (HotelOrder.Order.Builder)super.mergeUnknownFields(unknownFields);
            }
        }
    }

    public interface OrderOrBuilder extends MessageOrBuilder {
        int getSerialize();

        int getOrderId();

        String getResNo();

        ByteString getResNoBytes();

        String getUserName();

        ByteString getUserNameBytes();

        String getCreateDate();

        ByteString getCreateDateBytes();

        List<OrderDetail> getOrderDetailsList();

        HotelOrder.OrderDetail getOrderDetails(int var1);

        int getOrderDetailsCount();

        List<? extends OrderDetailOrBuilder> getOrderDetailsOrBuilderList();

        HotelOrder.OrderDetailOrBuilder getOrderDetailsOrBuilder(int var1);
    }
}
