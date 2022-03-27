/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des1;
import java.util.*;

public class DES1 {

    /**
     * @param args the command line arguments
     */
    



	private static class DES {
		// CONSTANTS
		// Initial Permutation Table
		int[] IP = { 58, 50, 42, 34, 26, 18,
					10, 2, 60, 52, 44, 36, 28, 20,
					12, 4, 62, 54, 46, 38,
					30, 22, 14, 6, 64, 56,
					48, 40, 32, 24, 16, 8,
					57, 49, 41, 33, 25, 17,
					9, 1, 59, 51, 43, 35, 27,
					19, 11, 3, 61, 53, 45,
					37, 29, 21, 13, 5, 63, 55,
					47, 39, 31, 23, 15, 7 };

		
				// hexadecimal to binary conversion
		String hextoBin(String input)
		{
			int n = input.length() * 4;
			input = Long.toBinaryString(
				Long.parseUnsignedLong(input, 16));
			while (input.length() < n)
				input = "0" + input;
			return input;
		}

		// binary to hexadecimal conversion
		String binToHex(String input)
		{
			int n = (int)input.length() / 4;
			input = Long.toHexString(
				Long.parseUnsignedLong(input, 2));
			while (input.length() < n)
				input = "0" + input;
			return input;
		}

		// per-mutate input hexadecimal
		// according to specified sequence
		String permutation(int[] sequence, String input)
		{
			String output = "";
			input = hextoBin(input);
			for (int i = 0; i < sequence.length; i++)
				output += input.charAt(sequence[i] - 1);
			output = binToHex(output);
			return output;
		}

		// xor 2 hexadecimal strings
		
		
		

		String encrypt(String plainText, String key)
		{
			int i;
			

			// initial permutation
			plainText = permutation(IP, plainText);
			System.out.println(
				"After initial permutation: "
				+ plainText.toUpperCase());
			System.out.println(
				"After splitting: L0="
				+ plainText.substring(0, 8).toUpperCase()
				+ " R0="
				+ plainText.substring(8, 16).toUpperCase() + "\n");

			
			return plainText;
		}

		
	}
	public static void main(String args[])
	{
		String text = "123456ABCD132536";
		String key = "AABB09182736CCDD";

		DES cipher = new DES();
		System.out.println("Encryption:\n");
		text = cipher.encrypt(text, key);
		
		
	}
}


    
    

