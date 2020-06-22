package br.com.face;

import android.graphics.Bitmap;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DataAnalyse {
    private String TAG = "DataAnalyse";
    private List<Bitmap> buffer = new ArrayList<Bitmap>();
    private List<byte[]> bytesBuffer = new ArrayList<>();

    private int indexBuffer = 0;
    private int sizeBuffer;

    public DataAnalyse(int maxSizeBuffer) {
        sizeBuffer = maxSizeBuffer;
    }


    synchronized public void addParameterBuffer(Bitmap bitmap, byte[] bytes) {
        if (indexBuffer < sizeBuffer) {
            this.buffer.add(bitmap);
            this.bytesBuffer.add(bytes);
            indexBuffer++;
        }
        notify();
    }

    synchronized public Bitmap getBuffer(int i) {
        Bitmap bitmap = null;
        try {
            while (buffer.size() == 0 || buffer.size() <= i) {
                wait();
            }
            bitmap = buffer.get(i);
        }
        catch (Exception e) {
            Log.e(TAG, "Buffer is empty");
        }
        return bitmap;
    }

    synchronized public byte[] getBufferBytes(int i) {
        byte[] bytes = null;
        try {
            while (bytesBuffer.size() == 0 || bytesBuffer.size() <= i) {
                wait();
            }
            bytes = bytesBuffer.get(i);
        }
        catch (Exception e) {
            Log.e(TAG, "Buffer is empty");
        }
        return bytes;
    }

    synchronized public void cleanBuffer() {
        buffer.clear();
        indexBuffer = 0;
        bytesBuffer.clear();
        notify();
    }

    public int getSizeBuffer() {
        return sizeBuffer;
    }

    public boolean isBufferFull() {
        return indexBuffer>=sizeBuffer;
    }
}
