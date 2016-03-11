package com.schematical.os.ir;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by user1a on 2/29/16.
 */
public class SClusterHelper {
    public static SClusterResult parseFrame(byte[] bitmapdata){
        Bitmap bitmap = BitmapFactory.decodeByteArray(bitmapdata, 0, bitmapdata.length);
        SClusterResult result = new SClusterResult();
        return result;
    }
}
