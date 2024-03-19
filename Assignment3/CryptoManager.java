/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Assignment #3
 * Description: (Write a Java program to encrypt and decrypt a phrase using two similar approaches, each insecure by modern standards.  )
 * Due: 3/18/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;
	
	
	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	
	private static final String ERROR_MESSAGE = "The selected string is not in bounds, Try again.";
	public static boolean isStringInBounds (String plainText) {
	
		boolean stringInBounds = true;
			
		for(int i = 0; i < plainText.length(); i++) {
				if(plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) < LOWER_RANGE) {
					stringInBounds = false;
					break;
				}
			}
			return stringInBounds;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		/*
		 * This method is called to adjust the key to be between the range of chars we want to consider
		 * If the key is already within range, it does nothing and key remains the same
		 */
		key = adjustKey(key);
		
		//assemble final encrypted string
		StringBuilder caesarEncrypted = new StringBuilder();
		
		//handle wrapping of chars
		int newKey;
		
		//proceed if string is in bounds
		if(isStringInBounds(plainText) == true) {
			for (int i = 0; i < plainText.length(); i++) {
				/*
				 * Wrap character to lower range if it exceeds upper range after adding key.
				 */
					if(plainText.charAt(i) + key > UPPER_RANGE) {
						newKey = plainText.charAt(i) + key - UPPER_RANGE - 1;
						caesarEncrypted.append((char)(LOWER_RANGE + newKey));
					}
					
					//else add the char at plainText + key to the encrypted string
					else {
						caesarEncrypted.append((char)(plainText.charAt(i) + key));
					}
				}
			return (caesarEncrypted.toString());
		//reject if out of bounds
		}
		else {
			return(ERROR_MESSAGE);
		}
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		/*
		 * Adjusts bellasoStr length to match plainText, extending or trimming as needed.
		 */
		bellasoStr = adjustKey(plainText, bellasoStr);
		StringBuilder bellasoEncrypted = new StringBuilder();
		
		//string builder
		int modifiedASCII;
		
		//encrypt if string is in bounds
		if(isStringInBounds(plainText)) {
			for(int i = 0; i < plainText.length(); i++) {
				
				//If plainText + bellasoStr is higher than upper range, subtract range
				if(plainText.charAt(i) + bellasoStr.charAt(i) > UPPER_RANGE) {
					modifiedASCII = (plainText.charAt(i) + bellasoStr.charAt(i));
					while(modifiedASCII > UPPER_RANGE) {
						modifiedASCII -= RANGE;
					}
					bellasoEncrypted.append((char)modifiedASCII);
				}
				//else, just add chars
				else {
					bellasoEncrypted.append((char)(plainText.charAt(i) + bellasoStr.charAt(i)));
				}
			}
			return (bellasoEncrypted.toString());
		}
		//reject if out of bounds
		else {
			return(ERROR_MESSAGE);
		}
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		/*
		 * This method is called to adjust the key to be between the range of chars we want to consider
		 * If the key is already within range, it does nothing and key remains the same
		 */
		key = adjustKey(key);
		//Used to assemble final decrypted string
		StringBuilder ceaserDecrypted = new StringBuilder();
		//Used to handle wrapping of chars
		int newKey;
		//Only decrypt if the original string was in bounds
		if(!(encryptedText.equalsIgnoreCase(ERROR_MESSAGE))) {
			for (int i = 0; i < encryptedText.length(); i++) {
				/*
				 * If the character of encrypted text - key is lower than the lower acceptable range,
				 * wrap around and subtract the remainder of key from the upper acceptable range
				 */
				if(encryptedText.charAt(i) - key < LOWER_RANGE) {
					newKey = key - (encryptedText.charAt(i) - LOWER_RANGE + 1);
					ceaserDecrypted.append((char)(UPPER_RANGE - newKey));
				}
				//Otherwise just add the character - the key to the decrypted text
				else {
					ceaserDecrypted.append((char)(encryptedText.charAt(i) - key));
				}
			}
			return (ceaserDecrypted.toString());
		}
		//If the original string was not in bounds, give an error message
		else {
			return (ERROR_MESSAGE);
		}
	}
	//}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		
		/*
		 * Adjusts bellasoStr to match encryptedText length by extending or trimming.
		 */
		bellasoStr = adjustKey(encryptedText, bellasoStr);
		
		//assemble final decrypted string
		StringBuilder bellasoDecrypted = new StringBuilder();
		
		//int since negative ASCII values don't work well in JAVA
		int modifiedASCII;
		if(!(encryptedText.equalsIgnoreCase(ERROR_MESSAGE))) {
			for(int i = 0; i < encryptedText.length(); i++) {
				
				//if encryptedText - bellasoStr is less than lower range, wrap around
				if(encryptedText.charAt(i) - bellasoStr.charAt(i) < LOWER_RANGE) {
					modifiedASCII = (encryptedText.charAt(i) - bellasoStr.charAt(i));
					while (modifiedASCII < LOWER_RANGE) {
						modifiedASCII += RANGE;
					}
					bellasoDecrypted.append((char)modifiedASCII);
				}
				//else, just append encryptedText - bellasoStr
				else {
					bellasoDecrypted.append((char)(encryptedText.charAt(i) - bellasoStr.charAt(i)));
				}
			}
			return(bellasoDecrypted.toString());
		}
		else {
			return ERROR_MESSAGE;
		}
	}
	
	/**
	 * Adjusts a key to be within the acceptable range of characters. If a key is too high, the range (64) is
	 * subtracted from the key until it is within range (32-95). If a key is too low, the range (64) is added
	 * to the key until it is within range (32 - 95).
	 * @param key The key to be adjusted
	 * @return A key that is between 32 and 95 (inclusive)
	 */
	private static int adjustKey(int key) {
		//If key is lower than acceptable range, add to key until it reaches range
		while (key < RANGE) {
			key += RANGE;
		}
		//If key is higher than acceptable range, subtract from key until it reaches range
		while(key > RANGE) {
			key -= RANGE;
		}
		return key;
	}
	
	/**
	 * Modifies the key to match the length of the given text by duplicating or trimming it.
	 */

	private static String adjustKey(String str, String key) {
		
		//final key to return
		StringBuilder keyAdjust = new StringBuilder();
		
		//for keys that are shorter than passed
		for(int i = 0; str.length() > keyAdjust.length(); i++) {
			if(i >= key.length()) {
				i = 0;
			}
			keyAdjust.append(key.charAt(i));
		}
		
		//for keys keys that are longer than passed
		for(int i = 0; str.length() < keyAdjust.length(); i++) {
			if(i >= key.length()) {
				i = 0;
			}
			keyAdjust.append(key.charAt(i));
		}
		
		//Return adjusted key
		return (keyAdjust.toString());
	}
}