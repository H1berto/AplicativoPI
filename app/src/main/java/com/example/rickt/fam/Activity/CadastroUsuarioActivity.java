package com.example.rickt.fam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.rickt.fam.R;

public class CadastroUsuarioActivity extends AppCompatActivity {

	private EditText novoUserNome;
	private EditText novoUserRA;
	private EditText novoUserEmail;
	private EditText novoUserSenha;
	private Button buttonCadastroUser;

	private RadioGroup radioGroupAlunoProfessor;
	private RadioButton radioButtonAluno;
	private RadioButton radioButtonProfessor;

	private String nomeNovoUser;
	private String RANovoUser;
	private String EmailNovoUser;
	private String SenhaNovoUser;
	private Boolean isAluno = false;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_cadastro_usuario);

		novoUserNome = (EditText) findViewById (R.id.editTextNomeCadastroNewUser);
		novoUserRA = (EditText) findViewById (R.id.editTextRACadastroNewUser);
		novoUserEmail = (EditText) findViewById (R.id.editTextEmailCadastroNewUser);
		novoUserSenha = (EditText) findViewById (R.id.editTextSenhaCadastroNewUser);
		buttonCadastroUser = (Button) findViewById (R.id.buttonCadastroNovoUser);

		radioGroupAlunoProfessor = (RadioGroup) findViewById (R.id.radioGroupCadastro);
		radioButtonAluno = (RadioButton) findViewById (R.id.radioButtonAluno);
		radioButtonProfessor = (RadioButton) findViewById (R.id.radioButtonProfessor);

		buttonCadastroUser.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				getInfo ();
				Intent intent = new Intent(CadastroUsuarioActivity.this, LoginActivity.class);
				intent.putExtra ("nomeUser", nomeNovoUser);
				intent.putExtra ("emailUser", EmailNovoUser);
				intent.putExtra ("raUser", RANovoUser);
				intent.putExtra ("senhaUser", SenhaNovoUser);
				intent.putExtra ("isAluno", isAluno);
				startActivity(intent);
				finish ();
			}
		});

	}

	private void getInfo(){

		nomeNovoUser = novoUserNome.getText ().toString ();
		RANovoUser = novoUserRA.getText ().toString ();
		EmailNovoUser = novoUserEmail.getText ().toString ();
		SenhaNovoUser = novoUserSenha.getText ().toString ();

		if (radioButtonAluno.isChecked ()){

			isAluno = true;

		}else if (radioButtonProfessor.isChecked ()){

			isAluno = false;

		}

	}

}
