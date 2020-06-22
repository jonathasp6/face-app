package br.com.face;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        String modelPath = getAppPath()+"/dlib_face_recognition_resnet_model_v1.dat";
        String landmark5Path = getAppPath()+"/shape_predictor_5_face_landmarks.dat";
        String faceDetector = getAppPath()+"/haarcascade_frontalface_alt.xml";
        File f = new File(modelPath);
        if (f.exists()) {
            FaceTool.getInstance().start(modelPath, landmark5Path, faceDetector);
        }

        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new FaceCameraFragment(R.id.texture2, R.layout.activity_camera))
                    .commit();
        }
    }

    private String getAppPath() {
        File path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        return path.getPath();
    }
}
