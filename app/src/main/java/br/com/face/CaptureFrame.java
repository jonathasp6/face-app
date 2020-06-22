package br.com.face;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Process;

public class CaptureFrame implements Runnable {
    private byte[] jpegData;
    private DataAnalyse data;
    private String TAG = "CaptureFrame";

    public CaptureFrame(byte[] jpegData, DataAnalyse data) {
        this.jpegData = jpegData;
        this.data = data;
    }

    @Override
    public void run() {
        Process.setThreadPriority(Process.THREAD_PRIORITY_VIDEO + Process.THREAD_PRIORITY_MORE_FAVORABLE + Process.THREAD_PRIORITY_MORE_FAVORABLE);
        Bitmap bitmap = BitmapFactory.decodeByteArray(jpegData,0, jpegData.length );
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(270);

        final Bitmap newBitmap = Bitmap.createBitmap(bitmap,0 ,0, width, height, matrix, true);
        synchronized (data) {
            data.addParameterBuffer(newBitmap, jpegData);
        }
    }
}
