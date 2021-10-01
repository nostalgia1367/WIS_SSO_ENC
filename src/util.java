import java.io.UnsupportedEncodingException;

public class util {
	
	public static String decode(String hex, String charset) {
	    byte[] bytes = new byte[hex.length()/3];
	    int len = hex.length();
	    for(int i = 0 ; i < len ;) {
	        int pos = hex.substring(i).indexOf("%");
	        if(pos == 0) {
	            String hex_code = hex.substring(i+1, i+3);
	            bytes[i/3] = (byte)Integer.parseInt(hex_code, 16);
	            i += 3;
	        } else {
	            i += pos;
	        }
	    }
	    try {
	        return new String(bytes, charset);
	    } catch(UnsupportedEncodingException e) { }//Exception
	    return "";
	}
	
}
