package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = (EditText) findViewById(R.id.inputValue);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (inputField.getText().length() == 0) {
                    Toast.makeText(this,
                            "Please Enter a Valid Number",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue = Float.parseFloat(inputField.getText().toString());
                if (celsiusButton.isChecked()) {
                    inputField.setText(
                            String.valueOf(
                                    ConverterUtil.convertFahrenheitToCelsius(inputValue)
                            )
                    );
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                } else {
                    inputField.setText(
                            String.valueOf(
                                    ConverterUtil.convertCelsiusToFahrenheit(inputValue)
                            )
                    );
                    celsiusButton.setChecked(true);
                    fahrenheitButton.setChecked(false);
                }
                break;
        }
    }
}
