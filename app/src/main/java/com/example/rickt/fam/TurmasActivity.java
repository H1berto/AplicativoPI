package com.example.rickt.fam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurmasActivity extends AppCompatActivity {

	private Button buttonNext;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_turmas);

		buttonNext = (Button) findViewById (R.id.btnTurma1);

		buttonNext.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				Intent intent = new Intent (TurmasActivity.this, Turma1Activity.class);
				startActivity (intent);


			}
		});

	}
}
