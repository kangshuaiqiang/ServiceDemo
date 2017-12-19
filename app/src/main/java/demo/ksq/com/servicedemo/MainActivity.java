package demo.ksq.com.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void osatrt(View view) {
        Intent startIntent = new Intent(this, MyService.class);
        startService(startIntent);
    }

    public void ostop(View view) {
        Intent stopIntent = new Intent(this, MyService.class);
        stopService(stopIntent);
    }

}
