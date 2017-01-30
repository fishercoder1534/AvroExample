package avro;

import com.abc.xyz.XyzDto;

import java.io.*;

/**
 * Created by stevesun on 1/30/17.
 */
public class XyzServiceAvroObjectSerializer {
    public static byte[] xyzServiceToByteArray(XyzDto xyzDto) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try (ObjectOutput output = new ObjectOutputStream(stream)
        ) {
            xyzDto.writeExternal(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stream.toByteArray();
    }

    public static XyzDto deserializeToXyz(byte[] buffer) {
        XyzDto xyzDto = new XyzDto();
        try (ByteArrayInputStream stream = new ByteArrayInputStream(buffer);
             ObjectInput input = new ObjectInputStream(stream)
        ) {
            xyzDto.readExternal(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return xyzDto;
    }
}
