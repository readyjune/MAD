package curtin.edu.lecture_3_different_layouts;

import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView time;
    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.timeView);

        if(savedInstanceState==null) {

            DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
            date = df.format(Calendar.getInstance().getTime());

        }
        else{
            date = savedInstanceState.getString("time");
        }

        time.setText(date);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence("time", date);
    }
}