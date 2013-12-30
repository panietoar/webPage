package co.com.primalwow.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Encriptador {

	public static String encriptarClave(String usuario, String clave) {

		String sinEnc = usuario + ":" + clave;
		
		String code = DigestUtils.shaHex(sinEnc.toUpperCase());
		
		return code.toLowerCase();
	}

}
