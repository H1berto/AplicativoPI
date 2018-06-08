package com.example.rickt.fam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class CadastroDeAlunoActivity extends AppCompatActivity {

	private Button buttonTelaCadastroCadastrarAluno;
	private EditText editTextNomeAluno;
	private EditText editTextRAAluno;
	private EditText editTextEmailAluno;
	private TextView mensagemErro;

	private String nome;
	private String email;
	private String ra;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_cadastro_de_aluno);

		buttonTelaCadastroCadastrarAluno = (Button) findViewById (R.id.btnCadastrarNovoAlunoTelaAluno);
		editTextNomeAluno = (EditText) findViewById (R.id.etNomeCadastroAluno);
		editTextRAAluno = (EditText) findViewById (R.id.etRACadastroAluno);
		editTextEmailAluno = (EditText) findViewById (R.id.etEmailCadastroAluno);
		mensagemErro = (TextView) findViewById (R.id.msgErroTelaCadastroAluno);

		buttonTelaCadastroCadastrarAluno.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				validaInfoAndSave();
				passaInfo ();
				finish ();
			}
		});
	}

	private void validaInfoAndSave(){
		if (editTextEmailAluno == null || editTextNomeAluno == null || editTextRAAluno == null){
			mensagemErro.setVisibility (View.VISIBLE);
		} else {
			nome = editTextNomeAluno.getText ().toString ();
			email = editTextEmailAluno.getText ().toString ();
			ra= editTextRAAluno.getText ().toString ();
		}
	}

	private void passaInfo(){

		Intent intent = new Intent(CadastroDeAlunoActivity.this, Turma1Activity.class);
		intent.putExtra ("nomeAluno", nome);
		intent.putExtra ("emailAluno", email);
		intent.putExtra ("raAluno", ra);
		startActivity(intent);

	}

}
