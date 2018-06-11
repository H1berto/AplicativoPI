package com.example.rickt.fam.Activity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rickt.fam.R;

public class AgendamentoActivity extends AppCompatActivity {

	private Spinner spinnerHorario;
	private Spinner spinnerTurma;
	private Spinner spinnerEquipamento;
	private Spinner spinnerLocal;
	private Button agendamento;
	private Button agendar;

	private Dialog dialog;

	private TextView tvHorario;
	private TextView cancelarAgendamento;
	private TextView tvTurma;
	private TextView tvLocal;
	private TextView tvEquipamento;

	private String horarios;
	private String equipamentos;
	private String local;
	private String turma;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_agendamento);

		tvHorario = (TextView) findViewById (R.id.horarioAgendamento);
		cancelarAgendamento = (TextView) findViewById (R.id.cancelarAgendamento);
		tvLocal = (TextView) findViewById (R.id.localAgendamento);
		tvTurma = (TextView) findViewById (R.id.turmaAgendamento);
		tvEquipamento = (TextView) findViewById (R.id.equipamentoAgendamento);
		agendar = (Button) findViewById (R.id.buttonAgendamento);

		spinnerHorario = (Spinner) findViewById (R.id.spinnerHorarios);
		spinnerTurma = (Spinner) findViewById (R.id.spinnerTurma);
		spinnerEquipamento = (Spinner) findViewById (R.id.spinnerEquipamento);
		spinnerLocal = (Spinner) findViewById (R.id.spinnerLocal);
		agendamento = (Button) findViewById (R.id.buttonConfirmarAgendamento);

		ArrayAdapter<CharSequence> adapterHorario = ArrayAdapter.createFromResource(this,
				R.array.horarios_array, android.R.layout.simple_spinner_item);
		adapterHorario.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerHorario.setAdapter(adapterHorario);

		spinnerHorario.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				horarios = spinnerHorario.getSelectedItem ().toString ();

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

		ArrayAdapter<CharSequence> adapterEquip = ArrayAdapter.createFromResource(this,
				R.array.equipamento_array, android.R.layout.simple_spinner_item);
		adapterEquip.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerEquipamento.setAdapter(adapterEquip);

		spinnerEquipamento.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				equipamentos = spinnerEquipamento.getSelectedItem ().toString ();

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

		ArrayAdapter<CharSequence> adapterLocal = ArrayAdapter.createFromResource(this,
				R.array.local_array, android.R.layout.simple_spinner_item);
		adapterLocal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerLocal.setAdapter(adapterLocal);

		spinnerLocal.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				local = spinnerLocal.getSelectedItem ().toString ();

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

		ArrayAdapter<CharSequence> adapterTurma = ArrayAdapter.createFromResource(this,
				R.array.turmas_array, android.R.layout.simple_spinner_item);
		adapterTurma.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerTurma.setAdapter(adapterTurma);

		spinnerTurma.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
			@Override
			public void onItemSelected (AdapterView<?> parent, View view, int position, long id) {

				turma = spinnerTurma.getSelectedItem ().toString ();

			}

			@Override
			public void onNothingSelected (AdapterView<?> parent) {

			}
		});

		agendamento.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				spinnerEquipamento.setVisibility (View.GONE);
				spinnerTurma.setVisibility (View.GONE);
				spinnerLocal.setVisibility (View.GONE);
				spinnerHorario.setVisibility (View.GONE);
				agendamento.setVisibility (View.GONE);
				agendar.setVisibility (View.VISIBLE);
				cancelarAgendamento.setVisibility (View.VISIBLE);

			tvEquipamento.setText (equipamentos);
			tvHorario.setText (horarios);
			tvLocal.setText (local);
			tvTurma.setText (turma);

			}
		});

		agendar.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				showDialog();

			}
		});

		cancelarAgendamento.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {

				spinnerEquipamento.setVisibility (View.VISIBLE);
				spinnerTurma.setVisibility (View.VISIBLE);
				spinnerLocal.setVisibility (View.VISIBLE);
				spinnerHorario.setVisibility (View.VISIBLE);
				agendamento.setVisibility (View.VISIBLE);
				agendar.setVisibility (View.GONE);
				cancelarAgendamento.setVisibility (View.GONE);

				tvEquipamento.setText ("Equipamentos:");
				tvHorario.setText ("Horários:");
				tvLocal.setText ("Local:");
				tvTurma.setText ("Turma:");

			}
		});

	}

	private void showDialog(){
		dialog = new Dialog (this);

		dialog.setContentView (R.layout.custom_dialog_sucess);

		dialog.findViewById (R.id.buttonOKsucesso).setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				dialog.dismiss ();
			}
		});
		dialog.setCancelable (false);
		dialog.show ();

	}
}
