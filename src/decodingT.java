

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.xml.bind.DatatypeConverter;


public class decodingT {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String dept = "SVTsp4Dsm5DrtoA=?=";
		String display_name = "7J2866+8SQ==?=";
		
		String target = "일민I";
        byte[] targetBytes = target.getBytes("UTF-8");
        
        // Base64 인코딩 ///////////////////////////////////////////////////
        Encoder encoder = Base64.getEncoder();
        
        // Encoder#encode(byte[] src) :: 바이트배열로 반환
        byte[] encodedBytes = encoder.encode(targetBytes);
        System.out.println("byte를 String 변환: "+new String(encodedBytes));
        
        // Encoder#encodeToString(byte[] src) :: 문자열로 반환
        String encodedString = encoder.encodeToString(targetBytes);
        System.out.println(encodedString);
        
        // Base64 디코딩 ///////////////////////////////////////////////////
        Decoder decoder = Base64.getDecoder();
        
        // Decoder#decode(bytes[] src) 
        byte[] decodedBytes1 = decoder.decode(encodedBytes);
        // Decoder#decode(String src)
        byte[] decodedBytes2 = decoder.decode(encodedString);
        
        // 디코딩한 문자열을 표시
        String decodedString = new String(decodedBytes1, "UTF-8");
        System.out.println(decodedString);
        
        System.out.println(new String(decodedBytes2, "UTF-8"));

        
            
	
		
        byte[] decoded = DatatypeConverter.parseBase64Binary(dept);
        byte[] decoded2 = DatatypeConverter.parseBase64Binary(display_name);
        
        System.out.println(new String(decoded, "UTF-8"));
        System.out.println(new String(decoded2, "UTF-8"));
        
		
	}
}
