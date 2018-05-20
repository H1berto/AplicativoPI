package com.example.rickt.fam;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerAtividadesActivity extends AppCompatActivity {

	private Button buttonSim;
	private Button buttonNao;
	private Dialog dialog;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_ver_atividades);

		buttonNao = (Button) findViewById (R.id.btnNao);
		buttonSim = (Button) findViewById (R.id.btnSim);

		buttonSim.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v){

				Intent intent = new Intent (VerAtividadesActivity.this, AulasActivity.class);
				startActivity (intent);

				showNotification ();
			}
		});
		buttonNao.setOnClickListener (new View.OnClickListener () {
			@Override
			public void onClick (View v) {
				showDialog ();

				dialog.findViewById (R.id.btnNopeDialog).setOnClickListener (new View.OnClickListener () {
					@Override
					public void onClick (View v) {
						dialog.dismiss ();
						Intent intent = new Intent (VerAtividadesActivity.this, AulasActivity.class);
						startActivity (intent);
					}
				});

			}
		});
	}

	private void showDialog(){
		dialog = new Dialog (this);
		dialog.setContentView (R.layout.custom_dialog);
		dialog.setCancelable (false);
		dialog.show ();
	}

	private void showNotification(){
		Intent intent = new Intent(VerAtividadesActivity.this, AulasActivity.class);
		PendingIntent contentIntent = PendingIntent.getActivity(getApplicationContext (), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

		NotificationCompat.Builder b = new NotificationCompat.Builder(getApplicationContext ());
		b.setAutoCancel(true)
				.setDefaults(Notification.DEFAULT_ALL)
				.setWhen(System.currentTimeMillis())
				.setSmallIcon(R.drawable.ic_notification)
				.setTicker("Hearty365")
				.setContentTitle("Você será lembrado sobre:")
				.setContentText("Apresentação de PI - Prof°Cid andrande - Valor: 1.0.")
				.setDefaults(Notification.DEFAULT_LIGHTS| Notification.DEFAULT_SOUND)
				.setContentIntent(contentIntent)
				.setContentInfo("Info");


		NotificationManager notificationManager = (NotificationManager) getApplicationContext ().getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.notify(1, b.build());
	}

}


