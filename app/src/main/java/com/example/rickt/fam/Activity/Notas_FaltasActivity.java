package com.example.rickt.fam.Activity;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rickt.fam.R;

public class Notas_FaltasActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

	private Spinner spinner;
	private TextView textView;
	private LinearLayout linearLayout;
	private LinearLayout linearLayout2;
	private ProgressBar progressBar;

	private CountDownTimer countDownTimer;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_notas__faltas);

		spinner = (Spinner) findViewById (R.id.spinnerSemestre);
		textView = (TextView) findViewById (R.id.textViewSemestre);
		linearLayout = (LinearLayout) findViewById (R.id.linearDesc);
		linearLayout2 = (LinearLayout) findViewById (R.id.linearNotas);
		progressBar = (ProgressBar) findViewById (R.id.progressBar);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
				R.array.semestre_array, android.R.layout.simple_spinner_item);

		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				if(position == 2){

					countDownTimer = new CountDownTimer (3000,1000) {
						@Override
						public void onTick (long millisUntilFinished) {
							progressBar.setVisibility (View.VISIBLE);
						}

						@Override
						public void onFinish () {

							progressBar.setVisibility (View.GONE);
							textView.setVisibility (View.VISIBLE);
							linearLayout.setVisibility (View.VISIBLE);
							linearLayout2.setVisibility (View.VISIBLE);


						}
					};

					countDownTimer.start ();

				}

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

	}

	@Override
	public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

	}

	@Override
	public void onNothingSelected (AdapterView<?> parent) {

	}
}
