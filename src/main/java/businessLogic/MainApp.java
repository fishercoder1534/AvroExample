package businessLogic;

import avro.XyzServiceAvroObjectSerializer;
import com.abc.xyz.VendorItemInfo;
import com.abc.xyz.XyzDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stevesun on 1/30/17.
 */
public class MainApp {
    public static void main(String... args){
        VendorItemInfo vendorItemInfo1 = new VendorItemInfo("1000", 1000L, "FREE");
        VendorItemInfo vendorItemInfo2 = new VendorItemInfo("2345", 1234L, "CONDITIONAL");
        List<VendorItemInfo> vendorItemInfoList = new ArrayList<>();
        vendorItemInfoList.add(vendorItemInfo1);
        vendorItemInfoList.add(vendorItemInfo2);
        XyzDto xyzDto = new XyzDto();
        xyzDto.setVendorItemInfos(vendorItemInfoList);
        System.out.println("xyzDto : " + xyzDto);
        byte[] result = XyzServiceAvroObjectSerializer.xyzServiceToByteArray(xyzDto);
//        for (byte oneByte : result){
//            System.out.println("oneByte : " + oneByte);
//        }

        XyzDto output = XyzServiceAvroObjectSerializer.deserializeToXyz(result);
        System.out.println("output : " + output);

        System.out.println("Finished.");
    }
}
