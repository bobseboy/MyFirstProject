package dk.cbs.mh.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    private TextView txtOutput;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.getAnonymousLogger().info(" --> onCreate() ");

        txtOutput = (TextView) findViewById(R.id.textView);
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        Logger.getAnonymousLogger().info("--> onSaveInstanceState()");
        savedInstanceState.putString("myInfo", "Welcome Back");
    }

    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        Logger.getAnonymousLogger().info("--> onSaveInstanceState()");
        String msg = savedInstanceState.getString("myInfo");
    }

    public void onStart(){
        super.onStart();
        Logger.getAnonymousLogger().info(" --> onStart() ");
    }

    public void onResume(){
        super.onResume();
        Logger.getAnonymousLogger().info(" --> onResume() ");
    }

    public void onPause(){
        super.onPause();
        Logger.getAnonymousLogger().info(" --> onPause() ");
    }

    public void onStop(){
        super.onStop();
        Logger.getAnonymousLogger().info(" --> onStop() ");
    }

    public void onDestroy(){
        super.onDestroy();
        Logger.getAnonymousLogger().info(" --> onDestroy() ");
    }

    public void initViews(){
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);


    }
}
