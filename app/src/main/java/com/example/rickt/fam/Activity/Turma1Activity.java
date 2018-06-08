package com.example.rickt.fam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.rickt.fam.CadastroAluno;
import com.example.rickt.fam.R;
import com.example.rickt.fam.Adapter.RecyclerAdapterCadastro;

import java.util.ArrayList;

public class Turma1Activity extends AppCompatActivity {

	private RecyclerView mRecyclerView = null;
	private RecyclerAdapterCadastro recyclerAdapterCadastro;
	private Button buttonCadastrar;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_turma1);

		buttonCadastrar = (Button) findViewById (R.id.btnCadastrarNovoAluno);

		buttonCadastrar.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				Intent intent = new Intent (Turma1Activity.this, CadastroDeAlunoActivity.class);
				startActivity (intent);
			}
		});

		mRecyclerView = findViewById (R.id.reciclerView_aluno);
		LinearLayoutManager layoutManager = new LinearLayoutManager (this);
		mRecyclerView.setLayoutManager (layoutManager);

		recyclerAdapterCadastro = new RecyclerAdapterCadastro (new ArrayList<CadastroAluno> (0));
		mRecyclerView.setAdapter (recyclerAdapterCadastro);

		mRecyclerView.addItemDecoration (new DividerItemDecoration (this,DividerItemDecoration.VERTICAL));

		recyclerAdapterCadastro.addAluno (new CadastroAluno ("Aluno","Email@aluno.com.br","000000"));

	}
}
