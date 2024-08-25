package com.example.techdemo.interview2024;

import org.springframework.util.StringUtils;


import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// Deepcopy example
class RedressClone  implements Cloneable{
    int i;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Redress {
    public static String truncateStringToGivenNumberOfBytes(int dbFieldLenth, String inputString)
    {
        //if the object is null then return null
        if(StringUtils.isEmpty(inputString))
        {
            return null;
        }
        try
        {
            if (inputString.getBytes().length <= dbFieldLenth)
            {
                return inputString;
            }
            else
            {
                Charset utf8Charset = StandardCharsets.UTF_8;
                CharsetDecoder cd = utf8Charset.newDecoder();
                byte[] sba = inputString.getBytes(utf8Charset.displayName());
                // Ensure truncating by having byte buffer = dbFieldLenth
                ByteBuffer bb = ByteBuffer.wrap(sba, 0, dbFieldLenth); // len in [B]
                CharBuffer cb = CharBuffer.allocate(dbFieldLenth); // len in [char] <= # [B]
                // Ignore an incomplete character
                cd.onMalformedInput(CodingErrorAction.IGNORE);
                cd.decode(bb, cb, true);
                cd.flush(cb);
                return new String(cb.array(), 0, cb.position());
            }
        }
        catch (Exception e)
        {

        }
        return inputString;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        RedressClone ob1=new RedressClone();
        System.out.println(ob1.clone());
        System.out.println(truncateStringToGivenNumberOfBytes(9,"878.89797978797"));;
    }

}
