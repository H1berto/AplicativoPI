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
	private TextView tvCadastro;

	private String varRA = "022228";
	private String varSenha = "123456";
	private String varEmail = "";
	private String varNome = "";
	private Boolean isAluno;


	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_login);

		Intent it = getIntent ();

		varSenha = it.getStringExtra ("senhaUser");
		varRA = it.getStringExtra ("raUser");
		varEmail = it.getStringExtra ("emailUser");
		varNome = it.getStringExtra ("nomeUser");
		isAluno = it.getBooleanExtra ("isAluno", false);

		editTextRA = (EditText) findViewById (R.id.etRA);
		editTextSenha = (EditText) findViewById (R.id.etSenha);
		btnLogin = (Button) findViewById (R.id.btnLogin);
		tvErro = (TextView) findViewById (R.id.tvMensagemErro);
		tvCadastro = (TextView) findViewById (R.id.tvCadastroNovoUser);

		btnLogin.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
			doLogin ();
			}
		});

		tvCadastro.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				Intent intent = new Intent (getApplicationContext (), CadastroUsuarioActivity.class);
				startActivity (intent);
				finish ();

			}
		});



	}

	private void doLogin (){
		if (editTextRA.getText ().toString().equals (varRA) && editTextSenha.getText().toString().equals (varSenha)){
			Intent intent = new Intent (LoginActivity.this, MainActivity.class);
			intent.putExtra ("nomeUser", varNome);
			intent.putExtra ("emailUser", varEmail);
			intent.putExtra ("raUser", varRA);
			intent.putExtra ("isAluno", isAluno);
			startActivity (intent);
		} else { tvErro.setVisibility (View.VISIBLE);
			tvErro.setText ("Acesso negado.");}
	}

}


