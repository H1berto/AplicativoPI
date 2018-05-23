package com.example.rickt.fam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Turma1Activity extends AppCompatActivity {

	@Override
	protected void onCreate (Bundle savedInstanceState) {

		RecyclerView mRecyclerView = null;
		RecyclerAdapterCadastro recyclerAdapterCadastro;

		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_turma1);

		LinearLayoutManager layoutManager = new LinearLayoutManager (this);
		mRecyclerView.setLayoutManager (layoutManager);

		recyclerAdapterCadastro = new RecyclerAdapterCadastro (new ArrayList<CadastroAluno> (0));
		mRecyclerView.setAdapter (recyclerAdapterCadastro);

		mRecyclerView.addItemDecoration (new DividerItemDecoration (this,DividerItemDecoration.VERTICAL));

	}
}
