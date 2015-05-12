package note.io.bytes2types;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Bytes2TypesUtils {
	public static byte[] intToByteLe(int mInt) {
		return ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(mInt).array();
	}

	public static byte[] intToByteBe(int mInt) {
		return ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(mInt).array();
	}

	public static byte[] shortToByteBe(short mShort) {
		return ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN).putShort(mShort).array();
	}

	public static byte[] shortToByteLe(short mShort) {
		return ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort(mShort).array();
	}

	public static int byteToIntLe(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getInt();
	}

	public static int byteToIntBe(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.BIG_ENDIAN).getInt();
	}

	public static short byteToShortBe(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.BIG_ENDIAN).getShort();
	}

	public static short byteToShortLe(byte[] bytes) {
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getShort();
	}
	
}
