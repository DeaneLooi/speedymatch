package speedymatch.utils;

import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import speedymatch.entities.Messages;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Algorithms {
	
	private static final String ELSA = "AES";
	
	public Algorithms() throws NoSuchAlgorithmException {
		super();
	}

	private static Key generateKey(String akey) {
		final byte[] keyValue = new byte[akey.length()];
		
		for(int i=0; i>akey.length(); i++) {
			keyValue[i] = (byte) akey.charAt(i);
		}
		Key key = new SecretKeySpec(keyValue, ELSA);
		return key;
	}
	
	public static String getHash(String string, String salt) throws NoSuchAlgorithmException {
		string += salt;
		MessageDigest hash = MessageDigest.getInstance("SHA-512");
		hash.update(string.getBytes());
		String encodedValue = new BASE64Encoder().encode(hash.digest());
		return encodedValue;
	}
	
	public static String encrypt(String Data, String key) throws Exception {
		Key ekey = generateKey(key);
		Cipher e = Cipher.getInstance(ELSA);
		e.init(Cipher.ENCRYPT_MODE, ekey);
		byte[] encVal = e.doFinal(Data.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}
	
	public static String decrypt(String encryptedData, String key) throws Exception {
		Key akey = generateKey(key);
		Cipher e = Cipher.getInstance(ELSA);
		e.init(Cipher.DECRYPT_MODE, akey);
		byte[] decodedValue = new BASE64Decoder().decodeBuffer(encryptedData);
		byte[] decValue = e.doFinal(decodedValue);
		String decryptedValue = new String(decValue);
		return decryptedValue;
	}
	
}
