package br.com.face;

import br.com.face.facelibrary.ToolBridge;
public class FaceToolJNI {

    public String captureParameters(byte[] bytes, int size) {
        return ToolBridge.analyzeFaceParameter(bytes, size);
    }

    public void start(String modelPath, String landmark5Path, String faceDetector) {
        ToolBridge.startTool(modelPath, landmark5Path, faceDetector);
    }

    public void finish() {
        ToolBridge.finishTool();
    }

}

