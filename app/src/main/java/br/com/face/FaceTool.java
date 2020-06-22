package br.com.face;

public class FaceTool {
    private FaceTool(){}

    private static FaceToolJNI faceToolJNI;

    public static FaceToolJNI getInstance() {
        if (faceToolJNI == null) {
            faceToolJNI = new FaceToolJNI();
        }
        return faceToolJNI;
    }
}
