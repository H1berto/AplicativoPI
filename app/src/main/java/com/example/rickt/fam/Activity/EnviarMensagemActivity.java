package com.example.rickt.fam.Activity;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class EnviarMensagemActivity extends AppCompatActivity {

	private Spinner spinner_turma;
	private Spinner spinner_turma_alunos;
	private Button buttonEnviarMensagem;
	private TextView who;

	private CountDownTimer countDownTimer;

	private String aux1;
	private String aux2;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_enviar_mensagem);

		spinner_turma = (Spinner) findViewById (R.id.mandarMensagemTurma);
		spinner_turma_alunos = (Spinner) findViewById (R.id.mandarMensagemAluno);
		buttonEnviarMensagem = (Button) findViewById (R.id.enviarMensagem);
		who = (TextView) findViewById (R.id.mensagemParaQuem);

		ArrayAdapter<CharSequence> adapterMensagemTurma = ArrayAdapter.createFromResource(this,
				R.array.turma_mensagem_array, android.R.layout.simple_spinner_item);
		adapterMensagemTurma.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner_turma.setAdapter(adapterMensagemTurma);

		spinner_turma.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				aux1 = spinner_turma.getSelectedItem ().toString ();

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

		ArrayAdapter<CharSequence> adapterAlunomensagem = ArrayAdapter.createFromResource(this,
				R.array.turma_alunos_array, android.R.layout.simple_spinner_item);
		adapterAlunomensagem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner_turma_alunos.setAdapter(adapterAlunomensagem);

		spinner_turma_alunos.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				aux2 = spinner_turma_alunos.getSelectedItem ().toString ();

				countDownTimer = new CountDownTimer (3000, 1000) {
					@Override
					public void onTick (long millisUntilFinished) {

					}

					@Override
					public void onFinish () {

						who.setText ("Sua mensagem será enviada para:" + aux1 + aux2);

					}
				};

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

	}
}
