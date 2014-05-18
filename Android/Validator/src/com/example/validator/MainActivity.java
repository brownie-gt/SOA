package com.example.validator;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText textEmail = (EditText) findViewById(R.id.textEmail);
		final TextView textValidEmail = (TextView) findViewById(R.id.textValidEmail);

		textEmail.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				if (s.length() > 0
						&& textEmail.getText().toString()
								.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
					textValidEmail.setText("Correo valido");
				} else {
					textValidEmail.setText("Correo invalido");
				}
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub

			}
		});
	}
}
