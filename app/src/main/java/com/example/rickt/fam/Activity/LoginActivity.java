package com.example.rickt.fam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class LoginActivity extends AppCompatActivity {

	private EditText editTextRA;
	private EditText editTextSenha;
	private Button btnLogin;
	private TextView tvErro;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_login);

		editTextRA = (EditText) findViewById (R.id.etRA);
		editTextSenha = (EditText) findViewById (R.id.etSenha);
		btnLogin = (Button) findViewById (R.id.btnLogin);
		tvErro = (TextView) findViewById (R.id.tvMensagemErro);

		btnLogin.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
			doLogin ();
			}
		});

	}

	private void doLogin (){
		if (editTextRA.getText ().toString().equals ("022228") && editTextSenha.getText().toString().equals ("102030")){
			Intent intent = new Intent (LoginActivity.this, MainActivity.class);
			startActivity (intent);
		} else { tvErro.setVisibility (View.VISIBLE);
			tvErro.setText ("Acesso negado.");}
	}

}


