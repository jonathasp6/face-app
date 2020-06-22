package br.com.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Environment;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.File;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4ClassRunner.class)
public class FaceToolTest {

    String result = "-0.114875 -0.004090 0.011427 -0.019178 -0.062924 -0.049807 0.066540 -0.098739 0.114195 -0.078940 0.159040 -0.082641 -0.193195 -0.049863 -0.015302 0.129637 -0.232382 -0.078139 -0.014639 -0.036744 0.074893 -0.000627 0.066989 0.069741 -0.141201 -0.381986 -0.134400 -0.122841 0.046238 -0.056205 0.025176 -0.012697 -0.191808 -0.017035 -0.011942 0.043713 -0.008116 -0.070028 0.194498 0.048728 -0.157540 -0.047214 -0.017908 0.316867 0.122085 0.030626 -0.034863 0.018711 0.086927 -0.277502 0.117810 0.087817 0.042355 0.029932 0.012537 -0.055393 0.049954 0.158676 -0.300551 0.097533 0.085599 -0.090570 0.036246 -0.008341 0.192169 0.138777 -0.127648 -0.069134 0.078310 -0.189890 0.030865 -0.091207 -0.083672 -0.208446 -0.317847 0.054584 0.365671 0.162136 -0.130182 -0.011895 -0.095120 0.001077 0.147108 0.080354 -0.039711 0.024161 -0.115451 0.062176 0.091870 -0.037403 -0.049660 0.279070 -0.084741 -0.028536 0.042095 0.051919 -0.135329 0.023602 -0.050670 0.048344 0.047521 -0.113547 0.047119 0.108164 -0.199509 0.162771 -0.029273 -0.041494 0.022895 -0.034619 -0.170027 -0.071325 0.118199 -0.244081 0.181124 0.201896 -0.016409 0.203663 0.007761 0.038365 -0.032107 -0.005134 -0.157398 -0.002328 0.055461 0.009252 0.054943 0.030338";

    @Test
    public void recognizeOne() {
        byte[] byteArray = loadImage(R.drawable.test);
        String parameter = FaceTool.getInstance().captureParameters(byteArray, byteArray.length);
        parameter = parameter.trim();
        assertEquals(result, parameter);
    }

    @Test
    public void recognizeMany() {
        long limit = 6; //seconds
        byte[] byteArray = loadImage(R.drawable.test);

        int amount = 10;
        double[] times = new double[amount];
        double time = 0, mean;
        for (int i = 0; i < amount; i++) {
            long startTime = System.currentTimeMillis();
            String parameter = FaceTool.getInstance().captureParameters(byteArray, byteArray.length);
            parameter = parameter.trim();
            long endTime = System.currentTimeMillis();
            times[i] = endTime - startTime;
            time += (endTime - startTime);
            assertEquals(result, parameter);
        }

        mean = time/amount*0.001;
        assertTrue(mean < limit);
    }

    @Test
    public void recognizeManyDifferent() {
        long limit = 6; //seconds
        byte[] byteArray = loadImage(R.drawable.test);
        byte[] byteArray2 = loadImage(R.drawable.test);
        byte[] byteArray3 = loadImage(R.drawable.test);

        int amount = 10;
        double time = 0, mean = 0;
        for (int i = 0; i < amount; i++) {
            long startTime = System.currentTimeMillis();
            FaceTool.getInstance().captureParameters(byteArray, byteArray.length);
            long endTime = System.currentTimeMillis();
            time += (endTime - startTime);
            startTime = System.currentTimeMillis();
            FaceTool.getInstance().captureParameters(byteArray2, byteArray2.length);
            endTime = System.currentTimeMillis();
            time += (endTime - startTime);
            startTime = System.currentTimeMillis();
            FaceTool.getInstance().captureParameters(byteArray3, byteArray3.length);
            endTime = System.currentTimeMillis();
            time += (endTime - startTime);
            mean += time/3f;
            time = 0;
        }

        mean = mean/amount*0.001;
        assertTrue(mean < limit);
    }

    @Test
    public void positionTest() {
    }



    private byte[] loadImage(int id) {
        Context appContext =  InstrumentationRegistry.getInstrumentation().getTargetContext();
        Bitmap bitmap = BitmapFactory.decodeResource(appContext.getResources(), id);
        Matrix matrix = new Matrix();
        matrix.postRotate(90);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        final Bitmap newBitmap = Bitmap.createBitmap(bitmap,0 ,0, width, height, matrix, true);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        newBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        return stream.toByteArray();
    }

    private String getAppPath() {
        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        return path.getPath();
    }

    @Before
    public void InitializeRecognizer() {
        String modelPath = getAppPath()+"/dlib_face_recognition_resnet_model_v1.dat";
        String landmark5Path = getAppPath()+"/shape_predictor_5_face_landmarks.dat";
        String faceDetector = getAppPath()+"/haarcascade_frontalface_alt.xml";
        FaceTool.getInstance().start(modelPath, landmark5Path, faceDetector);
    }

}
