package emu.grasscutter.utils;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

import emu.grasscutter.Grasscutter;

public final class Crypto {

	public static byte[] DISPATCH_KEY;
	public static byte[] DISPATCH_SEED;

	public static PrivateKey CUR_OSCB_ENCRYPT_PRIVATEKEY;
	public static PrivateKey CUR_OSCN_ENCRYPT_PRIVATEKEY;

	public static PrivateKey CUR_SIGNING_KEY;

	public static void loadKeys() {
		DISPATCH_KEY = FileUtils.readResource("/keys/dispatchKey.bin");
		DISPATCH_SEED = FileUtils.readResource("/keys/dispatchSeed.bin");

		try {
			//These should be loaded from ChannelConfig_whatever.json
			CUR_SIGNING_KEY = KeyFactory.getInstance("RSA")
					.generatePrivate(new PKCS8EncodedKeySpec(FileUtils.readResource("/keys/SigningKey.der")));

			CUR_OSCB_ENCRYPT_PRIVATEKEY = KeyFactory.getInstance("RSA")
					.generatePrivate(new PKCS8EncodedKeySpec(FileUtils.readResource("/keys/OSCB_Pri.der")));

			CUR_OSCN_ENCRYPT_PRIVATEKEY = KeyFactory.getInstance("RSA")
					.generatePrivate(new PKCS8EncodedKeySpec(FileUtils.readResource("/keys/OSCN_Pri.der")));
		}
		catch (Exception e) {
			Grasscutter.getLogger().error("An error occurred while loading keys.", e);
		}
	}

	public static void xor(byte[] packet, byte[] key, boolean skip_enc) {
		if(!skip_enc) {
			try {
				for (int i = 0; i < packet.length; i++) {
					packet[i] ^= key[i % key.length];
				}
			} catch (Exception e) {
				Grasscutter.getLogger().error("Crypto error.", e);
			}
		}
	}

	public static PrivateKey getPriKey(int keyId) {
		return switch (keyId) {
			case 5 -> Crypto.CUR_OSCB_ENCRYPT_PRIVATEKEY;
			case 4 -> Crypto.CUR_OSCN_ENCRYPT_PRIVATEKEY;
			default -> Crypto.CUR_OSCN_ENCRYPT_PRIVATEKEY;
		};
	}
}
