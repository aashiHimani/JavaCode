package com.interfaces;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

interface Encryptable{
	String  encrypt (String data);
	String  decrypt (String encryptedData);
}

class AES implements Encryptable{
	private static final String AESAlgorithm="AES";
	private SecretKey secretKey;
	public AES() {
		try {
			KeyGenerator gen=KeyGenerator.getInstance(AESAlgorithm);
			gen.init(128);
			secretKey=gen.generateKey();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String encrypt(String data) {
		try {
			Cipher cipher=Cipher.getInstance(AESAlgorithm);
			cipher.init(cipher.ENCRYPT_MODE, secretKey);
			byte[] encryptedBytes=cipher.doFinal(data.getBytes());
			return Base64.getEncoder().encodeToString(encryptedBytes);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String decrypt(String encryptedData) {
		try{
			byte[] encryptedBytes=Base64.getDecoder().decode(encryptedData);
			 Cipher cipher=Cipher.getInstance(AESAlgorithm);
			 cipher.init(cipher.DECRYPT_MODE, secretKey);
			 byte[] decryptedBytes=cipher.doFinal(encryptedBytes);
			 return new String(decryptedBytes);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

class RSA implements Encryptable{
	private static final String RSAAlgorithm="RSA";
	private KeyPair keyPair;
	public RSA() {
		try {
			KeyPairGenerator gen=KeyPairGenerator.getInstance(RSAAlgorithm);
			gen.initialize(2048);
			keyPair=gen.generateKeyPair();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public String encrypt(String data) {
		try {
			PublicKey publicKey=keyPair.getPublic();
			Cipher cipher=Cipher.getInstance(RSAAlgorithm);
			cipher.init(cipher.ENCRYPT_MODE, publicKey);
			byte[] encryptedBytes=cipher.doFinal(data.getBytes());
			return Base64.getEncoder().encodeToString(encryptedBytes);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String decrypt(String encryptedData) {
		try{
			PrivateKey privateKey=keyPair.getPrivate();
			byte[] encryptedBytes=Base64.getDecoder().decode(encryptedData);
			 Cipher cipher=Cipher.getInstance(RSAAlgorithm);
			 cipher.init(cipher.DECRYPT_MODE, privateKey);
			 byte[] decryptedBytes=cipher.doFinal(encryptedBytes);
			 return new String(decryptedBytes);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryptable aes=new AES();
		String encryptedDataAES=aes.encrypt("Java interface");
		System.out.println("AES encrypted:"+encryptedDataAES);
		String decryptedDataAES=aes.encrypt("Java interface");
		System.out.println("AES decrypted:"+decryptedDataAES);
		
		Encryptable rsa=new RSA();
		String encryptedDataRSA=aes.encrypt("Java interface");
		System.out.println("RSA encrypted:"+encryptedDataRSA);
		String decryptedDataRSA=aes.encrypt("Java interface");
		System.out.println("RSA decrypted:"+decryptedDataRSA);
	}

}
