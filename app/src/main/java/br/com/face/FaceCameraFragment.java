package br.com.face;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;

import br.com.face.facelibrary.CameraFragment;

public class FaceCameraFragment extends CameraFragment implements IFaceCamera {

    private Handler captureFrameFaceHandler;
    private DataAnalyse encodingData = new DataAnalyse(2);

    public FaceCameraFragment(int textureId, int layoutId) {
        super(textureId, layoutId);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void captureFrame(byte[] jpegData) {
        CaptureFrame captureFrame = new CaptureFrame(jpegData, encodingData);
        try {
            postCaptureFrameThread(captureFrame);
        } catch (IllegalStateException e) {
            Log.d("CameraFragment", "Thread already dead! Operation canceled very fast!");
        }
    }

    private void postCaptureFrameThread(CaptureFrame captureFrame) {
        captureFrameFaceHandler.post(captureFrame);
    }

    @Override
    public void processFrame(byte[] jpegData) {
        captureFrame(jpegData);
    }

    @Override
    public void startOthersThreads() {
        startCaptureThread();
        startAnalyseThread();
    }

    private void startCaptureThread() {
        HandlerThread captureFrameThread = new HandlerThread("Capture frame");
        captureFrameThread.start();
        captureFrameFaceHandler = new Handler(captureFrameThread.getLooper());
    }

    private void startAnalyseThread() {
        HandlerThread analyseFaceThread = new HandlerThread("Extractor parameter");
        analyseFaceThread.start();
        Handler analyseFaceHandler = new Handler(analyseFaceThread.getLooper());
        FaceEncoding encodingThread = new FaceEncoding(encodingData);
        analyseFaceHandler.post(encodingThread);
    }
}
