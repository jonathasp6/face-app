package br.com.face;
import android.util.Log;

public class FaceEncoding implements Runnable{

    private DataAnalyse data;
    private FaceToolJNI mFaceDet = FaceTool.getInstance();

    private String TAG = "FaceEncoding";


    public FaceEncoding(DataAnalyse data) {
        this.data = data;
    }

    @Override
    public void run() {
        int sizeBuffer = data.getSizeBuffer();
        while(true) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < sizeBuffer; i++) {
                byte[] imgBytes;
                synchronized (data) {
                    imgBytes = data.getBufferBytes(i);
                }

                if (imgBytes == null) {
                    return;
                }
                try {
                    String parameters = mFaceDet.captureParameters(imgBytes, imgBytes.length);
                    Log.d("FaceTool", parameters);
                } catch (Exception e) {
                }
            }
            long endTime = System.currentTimeMillis();
            Log.e(TAG, "Time cost: " + (endTime - startTime) / 1000f + " sec");
            data.cleanBuffer();
        }
    }
}
