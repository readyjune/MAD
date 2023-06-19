package curtin.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        EditText input1 = findViewById(R.id.firstNumber);
        EditText input2 = findViewById(R.id.secondNumber);
        TextView result = findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(String.valueOf(input1.getText()));
                int j = Integer.parseInt(String.valueOf(input2.getText()));
                int r = i+j;
                result.setText(String.valueOf(r));
            }
        });

    }
}