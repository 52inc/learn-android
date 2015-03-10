package com.ftinc.letslearn;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflates the layout
        setContentView(R.layout.activity_main);

        final TextView title = (TextView) findViewById(R.id.title);
        final EditText input = (EditText) findViewById(R.id.input);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get the text from the input field
                String text = input.getText().toString();

                // Set this text to the Title 'TextView'
                title.setText(text);
                // title.setText(R.string.special_title);
                // title.setText(R.string.format_title, 3, "bacon"); i.e. "Some text: %d, %s"

            }
        });

        input.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

    }
}
