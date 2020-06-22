package br.com.face.facelibrary;

public class ToolBridge {

    static {
        System.loadLibrary("face");
    }

    public native static void startTool(String a, String b, String c);

    public native static void finishTool();

    public native static String analyzeFaceParameter(byte[] bytes, int size);

}
